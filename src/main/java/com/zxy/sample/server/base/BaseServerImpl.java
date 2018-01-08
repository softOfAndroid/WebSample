package com.zxy.sample.server.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class BaseServerImpl<T, ID extends Serializable> implements BaseServer<T,ID> {

    @Override
    public int insert(T t) {
        return 0;
    }

    @Override
    public int insertBatch(List<T> t) {
        return 0;
    }

    @Override
    public int deleteById(ID id) {
        return 0;
    }

    @Override
    public int deleteBatchById(List<ID> ids) {
        return 0;
    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public T findByName(String cloumnNname) {
        return null;
    }

    @Override
    public T findByMapPara(Map<String, Object> parameter) {
        return null;
    }

    @Override
    public List<T> queryListAll(Map<String, Object> parameter) {
        return null;
    }

    @Override
    public List<T> queryListByPage(Map<String, Object> parameter) {
        return null;
    }

    @Override
    public int count(Map<String, Object> parameter) {
        return 0;
    }

    @Override
    public int update(T t) {
        return 0;
    }
}
