package com.zhuma.demo.lock;

import com.zm.zhuma.commons.lock.annotation.EasyLock;
import com.zm.zhuma.commons.lock.model.LockType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class OrderCreateServiceImpl implements OrderCreateService {

	@Override
	public void create(String orderId) {
		log.info("order create start, orderId:{}", orderId);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("order create end, orderId:{}", orderId);
	}

}
