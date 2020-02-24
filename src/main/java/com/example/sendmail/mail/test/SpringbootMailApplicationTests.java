package com.example.sendmail.mail.test;

import com.example.sendmail.mail.bean.MailBean;
import com.example.sendmail.mail.util.MailUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author YangTao
 * @date 2020/2/24 23:36
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMailApplicationTests {
    @Autowired
    private MailUtil mailUtil;

//    @Autowired
//    private TemplateEngine templateEngine;

    //接收人
    private static final String RECIPINET = "940702494@qq.com";

    /**
     * 发送文本邮件
     */
    @Test
    public void sendSimpleMail() {
        MailBean mailBean = new MailBean();
        mailBean.setRecipient(RECIPINET);
        mailBean.setSubject("SpringBootMail之这是一封文本的邮件");
        mailBean.setContent("SpringBootMail发送一个简单格式的邮件，时间为：" + new Date().toString());

        mailUtil.sendSimpleMail(mailBean);
    }



}
