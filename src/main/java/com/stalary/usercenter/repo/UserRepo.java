package com.stalary.usercenter.repo;

import com.stalary.usercenter.data.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Stalary
 * @description
 * @date 2018/3/25
 */
@Repository
public interface UserRepo extends BaseRepo<User, Long> {

    /**
     * 通过用户名和项目id查找一个用户
     * @param username
     * @param projectId
     * @param status
     * @return
     */
    User findByUsernameAndProjectIdAndStatusGreaterThanEqual(String username, Long projectId, Integer status);

    User findByPhoneAndProjectIdAndStatusGreaterThanEqual(String phone, Long projectId, Integer status);

    User findByEmailAndProjectIdAndStatusGreaterThanEqual(String email, Long projectId, Integer status);

    User findByIdAndStatusGreaterThanEqual(Long id, Integer status);

    List<User> findByProjectIdAndStatusGreaterThanEqual(Long projectId, Integer status);

    List<User> findByProjectIdAndRoleAndStatusGreaterThanEqual(Long projectId, Integer role, Integer status);
}
