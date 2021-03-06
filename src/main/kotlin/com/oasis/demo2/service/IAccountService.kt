package com.oasis.demo2.service

import com.baomidou.mybatisplus.extension.service.IService
import com.oasis.demo2.domain.bo.AccountBO
import com.oasis.demo2.domain.entity.AccountEntity

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author AsiaMa
 * @since 2021-04-27
 */
interface IAccountService : IService<AccountEntity> {
    /**
     * 根据用户id查询
     */
    fun findById(accountId: Int): AccountBO

    /**
     * 查询所有用户
     */
    fun getAccounts(): Collection<AccountEntity>

    /**
     * 添加新用户
     */
    fun addAccount(account: AccountEntity): AccountEntity

    /**
     * 更新用户
     */
    fun updateAccount(account: AccountEntity): AccountEntity

    /**
     * 删除用户
     */
    fun deleteAccount(accountId: Int)

    /**
     * 根据名字查询符合条件的用户（模糊查询）
     */
    fun findByName(name: String): Collection<AccountEntity>

    /**
     * 根据名字查询符合条件的用户（模糊查询）使用KtQueryWrapper
     */
    fun findByName2(name: String): Collection<AccountEntity>
}
