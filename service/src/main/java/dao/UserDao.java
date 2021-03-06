package dao;

import entity.UserEntity;

import java.util.List;

/**
 * 用户接口
 *
 * @author Chao
 */
public interface UserDao {
    /**
     * 用户注册
     *
     * @author Chao
     */
    public int reg(UserEntity user);

    /**
     * 用户登录
     *
     * @author Chao
     */
    public UserEntity login(String account, String password);

    /**
     * 根据账号获得用户，主要用于找回密码
     *
     * @author Chao
     */
    public UserEntity getUser(String account);

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     */
    public int alter(UserEntity user);

    /**
     * 获得所有用户
     *
     * @author Chao
     */
    public List<UserEntity> getAll();

    /**
     * 是否存在此用户名
     *
     * @param username
     * @return
     */
    public boolean isHaveUsername(String username);

    /**
     * 是否存在此手机号
     */
    public boolean isHavePhone(String phone);

    /**
     * 是否存在此邮箱
     */
    public boolean isHaveEmail(String email);

    /**
     * 是否存在此账号
     */
    public boolean isHaveAccount(String account);

    /**
     * 根据用户id查询用户信息
     *
     * @param uid
     * @return
     */
    public UserEntity findByID(int uid);

    /**
     * 根据uid查询用户
     *
     * @param uid
     * @return
     */
    public UserEntity getByUid(int uid);

}
