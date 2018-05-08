package com.roberthuang.ssm.utils;

import java.util.Arrays;


/**
 * 
  @Description：相近数小测试
 * **************************************************
 *
 * @author 黄标

 * @date  2018年5月8日下午5:29:01
 *  
 * **************************************************
 */
public class Test01 {

	public static void main(String[] args) {
	
		try {
			boolean flag = isSimilarNumber("d%我的AaAdD", "我%的ADADAD");
			System.out.println(flag?"是相近数":"不是相近数");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   
	/**
	 * 字符串转为数组 并排序
	 * @param num
	 * @return
	 */
	public static char [] stringTOChars(String num){
		char [] data = num.toLowerCase().toCharArray();
		Arrays.sort(data);
		return data;
	}
	
	/**
	 * 判空处理
	 * @param input
	 * @return
	 */
	public static boolean isEmpty(String input){
		
		if(null == input || "".equals(input))
			return true;
		return false;
		
	}
	
	public static boolean isSimilarNumber(String numA,String numB) throws Exception{
		/**
		 * 1: 参数校验
		 * 2：长度判断
		 * 3：对数据全部转为小写进行排序
		 * 4： 对元素逐个判断
		 */
		if( isEmpty(numA) || isEmpty(numA)){
			throw new Exception("参数不能为空!");
		}
		if(numA.length() != numB.length()){
			System.out.println("长度不相等");
			return false;
		}
		
		try {
			char[] charA = stringTOChars(numA);
			char[] charB = stringTOChars(numB);
			/**
			 * 长度一样，随便获取一个char数组的长度
			 */
			for(int i=0;i<charA.length;i++){
				if(charA[i] != charB[i]){
					System.out.println("有值不相等，直接跳出");
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}
