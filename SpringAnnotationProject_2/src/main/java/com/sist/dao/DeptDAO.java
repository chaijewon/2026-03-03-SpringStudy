package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sist.mapper.DeptMapper;
import com.sist.vo.DeptVO;

import java.util.*;
/*
 *     CONSTRUCTOR, METHOD, PARAMETER, FIELD, ANNOTATION_TYPE
 *     
 *     public class A
 *     {
 *        @Autowired  ==> FIELD
 *        private B b;
 *        
 *        @Autowired ==> CONSTRUCTOR
 *        public A(){}
 *         
 *        @Autowired ==> METHOD
 *        public void display(@Autowired B b){}
 *                                | PARAMETER
 *        @Autowired              
 *        @Qualifier ANNOTATION_TYPE
 *     }
 */
@Repository // 클래스 위에서만 사용이 가능 
public class DeptDAO {
   @Autowired 
   // 사용은 객체주소 
   
   private DeptMapper mapper;
   
   public List<DeptVO> deptListData()
   {
	   return mapper.deptListData();
   }
}
