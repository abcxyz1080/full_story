//package com.demo.truyenfull.filter.config;
//
//import java.sql.Date;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
//import java.util.Timer;
//import java.util.TimerTask;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.demo.truyenfull.filter.controller.Account;
//import com.demo.truyenfull.filter.controller.ExpireUser;
//
//@Configuration
//public class ScheduleTask {
//	@Bean
//		public Timer pushNotificationToHearExpire() {
//			Calendar dayTime = Calendar.getInstance();
//			dayTime.set(Calendar.MINUTE,0);
//			dayTime.set(Calendar.SECOND,00);
//			dayTime.set(Calendar.MILLISECOND,0);
//			
//			Date daySchedual = dayTime.getTime();
//			long period = PERIOD;
//			
//			TimerTask dayTask = new TimerTask();
//			@Override
//			public void run () {
//				List<Account> users = ThriftClient.userServiceThriftClient.getHearExpireAccount();
//				List<ExpireUser> expireUser = new ArrayList<>();
//				for(Account user : users) {
//					ExpireUser expireUser = 
//				}
//			}		
//			Timer timer = new Timer();
//			timer.schedule(dayTask, daySchedule, period);
//			return timer;
//	}
//}
