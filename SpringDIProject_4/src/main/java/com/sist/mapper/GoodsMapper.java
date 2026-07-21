package com.sist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.GoodsVO;
import com.sist.vo.SeoulVO;

public interface GoodsMapper {
	  @Select("SELECT no,goods_name,goods_price,goods_sub " 
			 +"FROM goods_all " 
			 +"ORDER BY no ASC " 
			 +"OFFSET #{start} ROWS FETCH NEXT 10 ROWS ONLY"
			 )
	   public List<GoodsVO> goodsListData(int start);
}
