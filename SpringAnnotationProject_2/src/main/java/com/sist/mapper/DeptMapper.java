package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.DeptVO;
/*
 *   @Select() : 단순한 SQL 
 *   <select> : 복잡한 SQL
 *   ---------------------- 실무에서는 병행 
 */
public interface DeptMapper {
   @Select("SELECT deptno,dname,loc "
		  +"FROM dept")
   public List<DeptVO> deptListData();
   //     resultType       id     parameterType => #{},${}
   /*
    *   SELECT ~
    *   FROM ~
    *   WHERE cno=#{cno} AND no=#{no} ==> VO 소속 => VO
    *                        hashmap
    *   display(int cno,int no) => 오류 
    *   display(@Param("cno") int cno,@Param("no") int no)
    *   
    *   
    */
}
