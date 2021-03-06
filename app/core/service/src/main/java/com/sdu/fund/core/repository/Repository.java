package com.sdu.fund.core.repository;

import com.sdu.fund.common.result.Result;

/**
 * @program: fundproduct
 * @description: 仓储层基类
 * @author: anonymous
 * @create: 2019-11-29 17:55
 **/
public interface Repository<T,K> {

    public Result<T> get(K primaryKey);

    public Result add(T entity);

    public Result update(T entity);

    public Result delete(K primaryKey);
}
