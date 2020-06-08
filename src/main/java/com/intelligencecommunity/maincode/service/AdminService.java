package com.intelligencecommunity.maincode.service;

import com.intelligencecommunity.maincode.entitys.TbOwner;
import org.apache.ibatis.annotations.Param;

public interface AdminService {
    /**
     * 根据业主id获取该业主所有信息
     * @param ownerID 业主id
     * @return 业主信息实体类
     */
    public TbOwner getOwnerMsgById(String ownerID);
    /**
     * 更改某业主的物业费余额，返回1代表修改成功
     * @param payMoney 充值金额，最终金额=余额+充值金额
     * @param ownerId 业主id
     * @return 修改行数
     */
    public int payAdministrative(@Param("payMoney")String payMoney, @Param("ownerId")String ownerId);

}
