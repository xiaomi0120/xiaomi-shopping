package com.iotek.service.impl;

import com.iotek.dao.AdminDao;
import com.iotek.po.Admin;
import com.iotek.service.AdminService;
import com.iotek.util.Validate;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiaohuang on 2017/12/18.
 */
@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao adminDao;

    @Override
    public boolean add(Admin admin) {
        return false;
    }

    @Override
    public boolean delete(Admin admin) {
        return false;
    }

    @Override
    public boolean update(Admin admin) {
        return false;
    }

    @Override
    public Admin query(Admin admin) {
        if (admin == null) {
            Validate.checkNull("管理员为空");

        }
        return adminDao.query(admin);
    }

    @Override
    public List<Admin> queryAll() {
        return null;
    }
}
