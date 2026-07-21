package com.sist.dao;
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;
public class GoodsDAO {
    private GoodsMapper mapper;

	public void setMapper(GoodsMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<GoodsVO> goodsListData(int start)
	{
		return mapper.goodsListData(start);
	}
   
}
