package com.atguigu.crud.controller.isrCustomer;


import com.atguigu.crud.bean.isrCustomer.IsrCustomer;
import com.atguigu.crud.service.isrCustomer.IsrCustomerService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.websocket.server.PathParam;

/**
 * <p>
 * 客户信息 前端控制器
 * </p>
 *
 * @author lilong
 * @since 2018-08-21
 */
@Controller
@RequestMapping("/isrCustomer")
public class IsrCustomerController {
    @Autowired
    private IsrCustomerService isrCustomerService;
    @GetMapping(value = "/user/{id}")
    public @ResponseBody
    IsrCustomer user(@PathVariable(value = "id") Integer userId) {
        IsrCustomer customer = isrCustomerService.selectById(userId);
        return customer;

    }

    @PostMapping(value = "/user")
    private @ResponseBody
    IsrCustomer getUser(@RequestBody IsrCustomer param) {
        IsrCustomer customer = isrCustomerService.selectOne(new EntityWrapper<>(param));
        return customer;
    }

}

