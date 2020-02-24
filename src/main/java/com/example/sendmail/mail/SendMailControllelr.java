package com.example.sendmail.mail;

import com.example.sendmail.mail.bean.MailBean;
import com.example.sendmail.mail.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author YangTao
 * @date 2020/2/24 16:30
 */
@RestController
public class SendMailControllelr {
    @Autowired
    private MailUtil mailUtil;

//    @Autowired
//    private TemplateEngine templateEngine;

    //接收人
    private static final String RECIPINET = "940702494@qq.com";



    @RequestMapping("/hello")
    public String toSayHello(){
        MailBean mailBean = new MailBean();
        mailBean.setRecipient(RECIPINET);
        mailBean.setSubject("Tao给你发送团队信息！");
        mailBean.setContent("请务必记得，明天早上9点记得打卡哦~");
        mailUtil.sendSimpleMail(mailBean);


        return "hello,tao! send mail seccessful!";
    }






}
