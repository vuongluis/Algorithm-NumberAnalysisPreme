package com.main;

import java.io.ObjectInputStream.GetField;

@SuppressWarnings("all")
public class USBC {
	private int USCLN;
	private int BSCNN;
	public USBC(int a,int b){
		if(a > b){
			for(int i=1;i<b;i++){
				if(a%i==0 && b%i==0){
					USCLN = i;
				}				
			}
			int j = a;
			while((j%a == 0) && (j%b==0)){
				BSCNN = j;
				j++;
			}
		}else if(a < b){
			for(int i=1;i<a;i++){
				if(a%i==0 && b%i==0){
					USCLN = i;
				}				
			}
			int j = b;
			while((j%a == 0) && (j%b==0)){
				BSCNN = j;
				j++;
			}
		}else{
			USCLN = a;
			BSCNN = a;
		}
	}
	public int getUSCLN(){
		return USCLN;
	}
	public int getBSCNN(){
		return BSCNN;
	}
}
