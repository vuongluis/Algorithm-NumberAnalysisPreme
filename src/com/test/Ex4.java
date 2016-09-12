package com.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.exception.SoAmException;
import com.main.Number;

@SuppressWarnings("all")
public class Ex4 {
	public static void main(String[]args){
		boolean cont = false;
		do{
			try{
				System.out.print("Vui lòng nhập số: ");
				int n = Integer.parseInt(new Scanner(System.in).nextLine());
				int nn = n;
				if(n < 0){
					throw new SoAmException("Số âm không hợp lệ!");
				}
				ArrayList<Integer> list = new Number(28).getPrimeAnalys();
				String outString = "";
				for(int index = 0; index < list.size();index++){
					int i = list.get(index);
					while(n%i==0){
						outString += i;
						n = n/i;
					}
				}
				char[] numbers = outString.toCharArray();
				int xSum = 1;
				String result = "";
				for(int i = 0;i < numbers.length; i++){
					xSum *= Integer.parseInt(String.valueOf(numbers[i]).toString());					
					result += numbers[i]+"*"; 					
				}
				if(xSum == nn){
					System.out.print("Số "+nn+" = "+new String(result).substring(0,result.length()-1));
				}else{
					System.out.print("Không phân tích được thành thừa số nguyên tố");
				}
			}catch(NumberFormatException ex){
				System.out.print(ex.getMessage());
				cont = true;
			}catch(SoAmException exx){
				System.out.print(exx.getMessage());
				cont = true;
			}
			System.out.print("\n");
		}while(cont);
	}
}
