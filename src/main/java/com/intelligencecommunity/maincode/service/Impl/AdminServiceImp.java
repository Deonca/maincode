package com.intelligencecommunity.maincode.service.Impl;

import com.alibaba.fastjson.JSON;
import com.intelligencecommunity.maincode.entitys.TbOwner;
import com.intelligencecommunity.maincode.mapper.AdminMapper;
import com.intelligencecommunity.maincode.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("AdminServiceImp")
@Transactional
public class AdminServiceImp implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

//撒创价吧
    @Override
    public TbOwner getOwnerMsgById(String ownerID) {
        TbOwner tbOwner=adminMapper.getOwnerMsgById(ownerID);
        return tbOwner;
    }

    @Override
    public int payAdministrative(String payMoney, String ownerId) {
        int num=adminMapper.payAdministrative(payMoney,ownerId);
        return num;
    }

}
