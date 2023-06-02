package com.foronly.example;

import com.foronly.example.demo.Demo;
import com.foronly.example.onlycmd.Deploy;
import org.apache.log4j.Logger;

/**
 * <p>
 *
 * </p>
 *
 * @author li_cang_long
 * @since 2023/6/2 13:22
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("This is main class");
		Deploy deploy = new Deploy();
		deploy.print();
		Demo demo = new Demo();
		demo.print();
		Logger logger = Logger.getLogger(Main.class);
		logger.debug("this is log4j");

	}
}
