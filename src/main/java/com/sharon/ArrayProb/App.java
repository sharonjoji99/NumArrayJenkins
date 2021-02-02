

package com.sharon.ArrayProb;

import java.util.HashMap;
/**
 * Hello world!
 *
 */
public class App 
{
	public int pairAndTripletCount (int[] num,int size ,int sum, boolean choice) {
		//if choice is 0 then display pair if 1 display triplet count 
	     if(size<2 && choice==false) {
	    	 throw new IllegalArgumentException("Min 2 elements required for pair");
	     }
	     if(choice==true && size<3) {
	    	 throw new IllegalArgumentException("Min 3 elements required for triplet");
	     }
	     
	     
		 HashMap<Integer,Integer> map = new HashMap<>();
		 for (int i = 0 ; i <size ; i++) {
			 if(map.containsKey(num[i])) {
				 map.put(num[i],map.get(num[i])+1);
				 }
				 else {
					 map.put(num[i], 1);
				 }
			 }
		 if(choice==false) {
		 int count1 = 0;
		 for (int i =0;i<size ;i++) {
			 if(map.containsKey(sum - num[i])) {
				count1+= map.get(sum-num[i]) ;
			 }
			 if(sum-num[i]==num[i]) {
				 --count1;
			 }
		 }
		 if(count1!=0) {
			 return 1;
		 }else {
			 return -1;
		 }
		  
		 }else {
			 
		 int count2=0;
		 for(int i =0;i<size-2;i++) {
			 for(int j =i+1;j<size-1;j++) {
				 for( int k =j+1;k<size;k++) {
					 if(num[i]+num[j]+num[k]==sum) {
						 ++count2;
					 }
				 }
			 }
		 }
		 if(count2!=0) {
			 return count2;
		 }else {
			 return -1;
		 }
		 }
		 
		 }
}
