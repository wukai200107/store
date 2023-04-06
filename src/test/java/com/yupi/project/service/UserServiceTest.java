package com.yupi.project.service;

import com.yupi.project.model.entity.TStaff;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author yupi
 */
@SpringBootTest
class UserServiceTest {
@Resource
private TStaffService tStaffService;

    @Test
    void testgetStaff() {
        TStaff byId = tStaffService.getById(1);
        System.out.println(byId);
    }

}