package com.evernote.accountservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AccountServiceApplication.class)
@WebAppConfiguration
public class AccountServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

}
