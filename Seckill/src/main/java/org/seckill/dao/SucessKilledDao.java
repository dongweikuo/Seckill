package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SucessKilled;

public interface SucessKilledDao {
    /**
     * 插入购买明细
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSucessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据ID查询SuccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SucessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

}
