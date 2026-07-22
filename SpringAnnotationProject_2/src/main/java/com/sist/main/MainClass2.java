package com.sist.main;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.service.*;
import com.sist.vo.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext app=
        		new ClassPathXmlApplicationContext("app.xml");
        EmpService service=(EmpService)app.getBean("eService");
        List<EmpVO> eList=service.empListData();
        List<DeptVO> dList=service.deptListData();
        
        for(EmpVO vo:eList)
        {
        	System.out.println(vo.getEmpno()+" "
        			+vo.getEname()+" "
        			+vo.getJob()+" "
        			+vo.getDbday());
        }
        System.out.println("==================================");
        for(DeptVO vo:dList)
        {
        	System.out.println(vo.getDeptno()+" "
        			+vo.getDname()+" "
        			+vo.getLoc());
        }
        
	}

}
