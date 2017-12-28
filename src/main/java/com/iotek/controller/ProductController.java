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
//            ��������

            return "";


        } else if ("update".equals(oper)) {
//            ִ�и���
            return "";

        } else if ("delete".equals(oper)) {
//            ִ��ɾ��
            return "";
        } else {
//            ���û����ȷƥ���򷵻ص�ǰ��ҳ��
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
       * ͨ��ҵ���߼��㱣����Ʒ��Ϣ
       * */

        return "";
    }

    private void saveImage(String productName, ProductDetail productDetail, Map<String, MultipartFile> images) throws IOException {
//       ����ͼƬ�ĸ�Ŀ¼
        String basePath = context.getRealPath("/images/"); //��ø�Ŀ¼
        String imageID = ImageID.getImageID(productName); //����ͼƬ�ļ���id
        File dir = new File(basePath, imageID);
        dir.mkdir(); //ָ����Ʒ��ͼƬ�ļ���
        String fileBasePath = basePath + imageID; //�ļ������·��

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
