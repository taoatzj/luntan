package com.youmeek.ssm.module.user.controller;

import com.tool.excel.ExcelUtils;
import com.tool.excel.JsGridReportBase;
import com.tool.excel.TableData;
import com.youmeek.ssm.module.user.pojo.SysUser;
import com.youmeek.ssm.module.user.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/sysUserController")
public class SysUserController {
	
	private static final Logger LOG = LoggerFactory.getLogger(SysUserController.class);
	
	@Resource
	private SysUserService sysUserService;
	
	@RequestMapping("/showUserToJspById/{userId}")
	public String showUser(Model model,@PathVariable("userId") Long userId){
		SysUser user = this.sysUserService.getById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/showUserToJSONById/{userId}")
	@ResponseBody
	public SysUser showUser(@PathVariable("userId") Long userId){
		SysUser user = sysUserService.getById(userId);
		return user;
	}
	
	
	@RequestMapping("/test-logback")
	@ResponseBody
	public Date testLogback(){
		LOG.trace("-----------------------------------trace");
		LOG.debug("-----------------------------------debug");
		LOG.info("-----------------------------------info");
		LOG.warn("-----------------------------------warn");
		LOG.error("-----------------------------------error");
		return new Date();
	}

	@RequestMapping("/test-excel")
    public void testExcel(HttpServletRequest request, HttpServletResponse response){
         System.out.println("12356g");
		 String[] str=new String[1];
		 str[0] = "aa333";
		 List<String[]> aaa = new ArrayList<String[]>();
		 aaa.add(str);
		 aaa.add(str);
		 String title = "测试";
		 String[] hearders = new String[] {"测试header"};

		 TableData td = ExcelUtils.createTableData(aaa, ExcelUtils.createTableHeader(hearders),null);

		 try {
			 JsGridReportBase report = new JsGridReportBase(request, response);
			 report.exportToExcel(title, "admin", td);
		  } catch (Exception e) {
			   e.printStackTrace();
		  }
	}


}
