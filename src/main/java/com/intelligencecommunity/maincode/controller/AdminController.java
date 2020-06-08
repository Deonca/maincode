package com.intelligencecommunity.maincode.controller;

import com.alibaba.fastjson.JSON;
import com.intelligencecommunity.maincode.entitys.TbOwner;
import com.intelligencecommunity.maincode.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/text")
    public String text(String text){
        return "参数："+text;
    }

    /**
     * 根据业主id获取该业主所有信息
     * @param ownerId 业主id
     * @return 业主信息实体类
     */
    @RequestMapping("/getOwnerMsgById")
    public String getOwnerMsgById(String ownerId){
        TbOwner tbOwner=adminService.getOwnerMsgById(ownerId);
        String str= JSON.toJSONString(tbOwner);
        return str;
    };

    /**
     * 更改某业主的物业费余额，返回1代表修改成功
     * @param payMoney 充值金额，最终金额=余额+充值金额
     * @param ownerId 业主id
     * @return 修改行数
     */
    @RequestMapping("/payAdministrative")
    public int payAdministrative(String payMoney,String ownerId){
        int num=adminService.payAdministrative(payMoney,ownerId);
        return num;
    }

}
