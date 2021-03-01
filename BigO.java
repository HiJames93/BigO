package com.tuling.startj2se.data_std.time_complexity;

import java.awt.List;
import java.util.Map;

public class BigO {

	public static void main(String[] args) {
		// 1次O(1)   1表示是常数，所有能确定的数字我们都用O(1), O(1000)=>O(1)
		int a = 1;
		for (int i = 0; i < 3; i++) {  // 这里运行几次？4次
			a = a+i;		//这里运行几次？ 3次
		}

		
		// O(logn)
		int i = 1;
		int n = Integer.MAX_VALUE;  //表示N未知
		while (i <= n) {
			i = i * 2;
		}
		//另外一种写法
		while (i <= n) {
			i = i * 3;
		}
		//i的值：2，4，8，16，32, =>2^0,2^1,2^2,2^3,....2^n
		//==> 2^x=n =>求出x就是我们运行的次数 => x=log2n => 计算机忽略常数=> x=logn =>O(logn)
		
		// O(nlogn)
		for (int j = 0; j < n; j++) {  
			while (i <= n) {
				i = i * 2;
			}
		}
		//二分查找为什么是logn的算法？
		//1~100找69这个数
		//50:(1+100)/2=50
		
		
		//线性
		for(i=0; i<n; i++) {
			a +=1;				//运行了多少次？O(n) n一定是未知的；如果n是已知的，那么就是O(1)了
		}
		
		
		//O(n^2) 相关应用：冒泡排序
		for (int j = 0; j < n; j++) {// 乘法 n次
			for (int k = 0; k < n; k++) {			//n次
				a += 1;			//运行了多少次？			n*(n+1)/2=>O(n^2); => (n^2+n)/2 => 注意个规律，有加法的时候，找次数最多的那个
			}
		}
		
	}

}
