package org.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseActionSupport extends ActionSupport implements
		ServletRequestAware, ServletResponseAware {
	
	protected HttpServletResponse res;
	protected HttpServletRequest req;
	
	@Override
	public void setServletResponse(HttpServletResponse res) {
		// TODO Auto-generated method stub
		this.res = res;
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html");
	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		// TODO Auto-generated method stub
		this.req = req;
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void post(String jsonString) throws IOException{
		PrintWriter out = res.getWriter();
		out.print(jsonString);
		out.flush();
		out.close();
	}
}
