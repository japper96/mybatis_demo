package com.test.mybatis.dao;

import com.test.mybatis.pojo.Order;
import com.test.mybatis.pojo.OrderUser;
import com.test.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 登录（直接使用注解指定传入参数名称）
     * @param userName
     * @param password
     * @return
     */
    public User login(@Param("userName") String userName, @Param("password") String password);

    /**
     * 根据表名查询用户信息（直接使用注解指定传入参数名称）
     * @param tableName
     * @return
     */
    public List<User> queryUserByTableName(@Param("tableName") String tableName);

    /**
     * 查询所有用户，如果输入了姓名按照姓名进行模糊查询，如果输入年龄，按照年龄进行查询，如果两者都输入，两个条件都要成立
     * @param name
     * @param age
     * @return
     */
    List<User> queryUserListByNameAndAge(@Param("name") String name,@Param("age") Integer age);
    /**
     * 查询男性用户，如果输入了姓名，则按姓名查询
     * @param name
     * @return
     */
    List<User> queryUserList(@Param("name") String name);
    /**
     * 按多个Id查询
     * @param ids
     * @return
     */
    List<User> queryUserListByIds(@Param("ids") String[] ids);


    public interface OrderMapper {
        OrderUser queryOrderUserByOrderNumber(@Param("number") String number);
    }

    public User queryUserById(String id);
    public List<User> queryUserAll();
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(String id);
    /**
     * 根据id删除用户信息
     * @param id
     */
    public void deleteUserById(String id);


    /**
     * 根据订单号查询订单用户的信息及订单详情
     * @param number
     * @return
     */
    Order queryOrderWithUserAndDetailByOrderNumber(@Param("number") String number);

    /**
     * 根据订单号查询订单用户的信息及订单详情及订单详情对应的商品信息
     * @param number
     * @return
     */
    Order queryOrderWithUserAndDetailItemByOrderNumber(@Param("number") String number);
}
