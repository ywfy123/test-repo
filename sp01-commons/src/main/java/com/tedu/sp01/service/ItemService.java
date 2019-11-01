package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 1.通过订单id获取商品信息
	 * 2.减少库存list
	 */
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}
