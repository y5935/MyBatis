package cn.hl.test;

import org.apache.log4j.Logger;



public class TestLog {
	public static void main(String[] args) {
		//获取Logger对象
		Logger log = Logger.getLogger(TestLog.class);
		//记录log信息
		log.info("Log4j .... info");
		log.debug("log4j .... debug");
		log.warn("log4j .... warn");
		log.error("log4j .... error");		
	}
}
