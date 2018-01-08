package com.zxy.sample.server.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseServer<T, ID extends Serializable>  {
    //********************** 增 *********************
    /**
     * 插入单个对象
     * @param t 对象
     * @return 影响的行数
     */
    public int insert(T t);

    /**
     * 批量插入对象
     * @param t 对象集合
     * @return 影响的行数
     */
    public int insertBatch(List<T> t);

    //********************** 删 *********************
    /**
     * 根据id删除
     * @param id
     * @return 返回影响的行数
     */
    public int deleteById(ID id);

    /**
     * 批量删除
     * @param ids
     * @return 返回影响的行数
     */
    public int deleteBatchById(List<ID> ids);

    //********************** 差 *********************
    /**
     * 根据id查询对象
     * @param id
     * @return 返回查询的对象
     */
    public T findById(ID id);

    /**
     * 根据名称查询
     * @param cloumnNname
     * @return
     */
    public T findByName(String cloumnNname);

    /**
     * 根据参数查询对象
     * @param parameter
     * @return
     */
    public T findByMapPara(Map<String, Object> parameter);

    /**
     * 根据参数查询全部对象
     * @param parameter
     * @return 返回查询的对象集合
     */
    public List<T> queryListAll(Map<String, Object> parameter);

    /**
     * 根据分页参数查询对象
     * @param parameter
     * @return 返回查询的对象集合
     */
    public List<T> queryListByPage(Map<String, Object> parameter);

    /**
     * 根据参数查询对象总条数
     * @param parameter
     * @return
     */
    int count(Map<String, Object> parameter);

    //********************** 改 *********************
    /**
     * 更新对象
     * @param t
     * @return
     */
    public int update(T t);
}
