package com.sist.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class MyController {
   @GetMapping("board/update.do")
   public Map board_update()
   {
	   Map map=new HashMap();
	   map.put("a", "ȫ�浿");
	   map.put("b", "ȫ�浿");
	   map.put("c", "ȫ�浿");
	   return map;
   }
}
