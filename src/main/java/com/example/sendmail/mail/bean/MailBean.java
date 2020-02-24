package com.example.sendmail.mail.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @author YangTao
 * @date 2020/2/24 23:31
 */
public class MailBean {

    private static final long serialVersionUID = -2116367492649751914L;

    @Setter
    @Getter
    private String recipient;//邮件接收人

    @Setter
    @Getter
    private String subject; //邮件主题

    @Setter
    @Getter
    private String content; //邮件内容





}
