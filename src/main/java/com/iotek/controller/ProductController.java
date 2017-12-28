package com.iotek.controller;

import com.iotek.po.Product;
import com.iotek.po.ProductDetail;
import com.iotek.po.ProductShelf;
import com.iotek.po.ProductStock;
import com.iotek.service.ProductService;
import com.iotek.util.ImageID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

import javax.servlet.ServletContext;
import java.util.*;

/**
 * Created by xiaohuang on 2017/12/26.
 */

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ServletContext context;
    @Autowired
    ProductService productService;


    @RequestMapping(value = "/manager/manager.view", method = RequestMethod.GET)
    public String getManagerView(Model model) {
        List<Product> productList = productService.queryAll();
        model.addAttribute("productList", productList);
        return "/product/manager";
    }

    @RequestMapping(value = "/manager/oper/{oper}/{productId}")
    public String operProduct(Model model, @PathVariable String oper, @PathVariable Long productId) {
        if ("detail".equals(oper)) {
//            返回详情

            return "";


        } else if ("update".equals(oper)) {
//            执行更新
            return "";

        } else if ("delete".equals(oper)) {
//            执行删除
            return "";
        } else {
//            如果没有正确匹配则返回当前的页面
            List<Product> productList = productService.queryAll();
            model.addAttribute("productList", productList);
            return "/product/manager";
        }

    }

    @RequestMapping(value = "/manager/add.view", method = RequestMethod.GET)
    public String addProductView() {
        return "/product/addProduct";

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addProduct(
            @ModelAttribute Product product,
            @ModelAttribute ProductDetail productDetail,
            @RequestParam("small_image") MultipartFile smallImage,
            @RequestParam("big_image") MultipartFile bigImage
    ) {
        Map<String, MultipartFile> images = new HashMap<String, MultipartFile>();
        images.put("smallImage", smallImage);
        images.put("bigImage", bigImage);
        try {
            saveImage(product.getProductName(), productDetail, images);
        } catch (IOException e) {

        }
       /*
       * 通过业务逻辑层保存商品信息
       * */

        return "";
    }

    private void saveImage(String productName, ProductDetail productDetail, Map<String, MultipartFile> images) throws IOException {
//       保存图片的根目录
        String basePath = context.getRealPath("/images/"); //获得根目录
        String imageID = ImageID.getImageID(productName); //产生图片文件夹id
        File dir = new File(basePath, imageID);
        dir.mkdir(); //指定商品的图片文件夹
        String fileBasePath = basePath + imageID; //文件保存的路径

        Set<Map.Entry<String, MultipartFile>> entries = images.entrySet();

        for (Map.Entry<String, MultipartFile> entry : entries) {


            String imageName = entry.getValue().getOriginalFilename();
            String filePath = fileBasePath + File.separator + imageName;
            File file = new File(filePath);
            FileCopyUtils.copy(entry.getValue().getBytes(), file);
            String saveImagePath = "/images" + File.separator + imageID + File.separator + imageName;


            if (entry.getKey().equals("smallImage")) {
                productDetail.setSmallImage(saveImagePath);
            }
            if (entry.getKey().equals("bigImage")) {
                productDetail.setBigImage(saveImagePath);
            }

        }


    }

}
