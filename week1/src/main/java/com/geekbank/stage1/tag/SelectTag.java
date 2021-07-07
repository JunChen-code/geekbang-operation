package com.geekbank.stage1.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

/**
 * @author chenjun
 * @description SelectTag
 * @date 2021/7/7 15:51
 */
public class SelectTag extends SimpleTagSupport {

    private final String ATTR = "%s=%s ";

    private final String OPTION = "<option value='%1$s'>%1$s</option>";

    private List options;

    private String name;

    private String size;




    @Override
    public void doTag() throws JspException, IOException {
        PageContext page = (PageContext) getJspContext();
        JspWriter out = page.getOut();
        out.print("<select ");
        out.print(String.format(ATTR,"name",this.name));
        out.print(String.format(ATTR,"size",this.size));
        out.print(">");
        for(Object x : options ){
            out.print(String.format(OPTION,x.toString()));
        };
        out.print(" </select>");
    }

    public List getOptions() {
        return options;
    }

    public void setOptions(List options) {
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
