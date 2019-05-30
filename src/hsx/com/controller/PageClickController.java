package hsx.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import hsx.com.service.PageClickService;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/pageclick")
public class PageClickController{

	@Resource
	private PageClickService pageClickService;
	
	@RequestMapping("/index")	
	public void indexclick(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer indexcount=Integer.parseInt(request.getParameter("indexcount"));
	    //System.out.println(indexcount);
		if(indexcount!=null) {
		pageClickService.indexcountset();//ˢ��ҳ��һ�Σ�ҳ������+1
		
		Integer count=pageClickService.readindexcountset();//����ҳ���ܵ����
	
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("count", count);
		out.println(resultJson);
		out.flush();
		out.close();
	    }
	}
	
	@RequestMapping("/website")	
	public void websiteclick(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer websitecount=Integer.parseInt(request.getParameter("websitecount"));
		//System.out.println(websitecount);
		if(websitecount!=null) {
		pageClickService.websitecountset();//ˢ��ҳ��һ�Σ�ҳ������+1
			
		Integer cnt=pageClickService.readwebsitecountset();//����ҳ���ܵ����
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		JSONObject resultJson=new JSONObject();
		resultJson.put("count", cnt);
		out.println(resultJson);
		out.flush();
		out.close();
		}		
	}
}

