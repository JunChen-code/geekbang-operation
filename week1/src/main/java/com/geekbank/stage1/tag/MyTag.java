package com.geekbank.stage1.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author chenjun
 * @description MyTag
 * @date 2021/7/7 15:25
 */
public class MyTag  extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        PageContext page = (PageContext) getJspContext();
        JspWriter out = page.getOut();
        out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
