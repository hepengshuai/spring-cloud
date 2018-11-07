package com.hps.client;

import com.hps.client.bean.User;
import com.hps.client.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudClientApplicationTests {

    @Autowired
    private HelloService helloService;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setName("赵六");
        user.setAge(22);
        user.setEmail("zhaoliu@163.com");
        user = helloService.add(user);
        System.out.println(user);
    }

    @Test
    public void testList() {
        List<User> users = helloService.list();
        System.out.println(users);
    }

}
