package com.sist.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 공통으로 사용되는 클래스 
@Aspect
@Component
/*
 *   JoinPoint => 시점 (어디서 호출) 
 *     @Before 
 *     @After
 *     @After-Returning 
 *     @Around
 *     @After-Throwing 
 *   PointCut => 어떤 메소드에 적용 
 *   ------------- Advice 
 *   
 *   public String display()
 *   {
 *       @Before 
 *       try
 *       {
 *          ---------------@Around => before
 *            => setAutoCommit(false)
 *            
 *            => commit()
 *            
 *            => 어떤 메소드 호출 => 시작 
 *               
 *            => 종료 ==> log 
 *          ---------------@Around => after
 *          로그 / 트랜잭션 => AOP 
 *       }catch(Exception e)
 *       {
 *          --------------> @After-Throwing : 에러 처리 
 *       }
 *       finally
 *       {
 *          -------- @After
 *       }
 *       
 *       return "값"  -----> @After-Returning  : 리턴값 받기
 *       
 *       
 *   }
 *   
 *   * com.sist.service.EmpServiceImpl.*())
 *   -- 리턴형              클래스        메소드 매개변수
 *                                          |모든 매개변수 없거나 여러개 포함
 *      | 모든 리턴형                    | 모든 메소드
 */
public class EmpAOP {
   @Before("execution(* com.sist.service.EmpServiceImpl.*(..))")
   public void before()
   {
	   System.out.println("메소드 진입전...");
   }
   @After("execution(* com.sist.service.EmpServiceImpl.*(..))")
   public void after()
   {
	   System.out.println("메소드 종료전...");
   }
   @Around("execution(* com.sist.service.EmpServiceImpl.*(..))")
   // 리팩토링 / 코드리뷰 
   public Object around(ProceedingJoinPoint jp)
   throws Throwable
   {
	   Object obj=null;
	   long start=System.currentTimeMillis();
	   System.out.println("호출된 메소드:"+jp.getSignature().getName());
	   // 메소드 호출 =>  수행
	   obj=jp.proceed();
	   
	   long end=System.currentTimeMillis();
	   System.out.println("걸린 시간:"+(end-start)+"MS");
	   return obj;
   }
}
