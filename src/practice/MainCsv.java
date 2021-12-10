package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainCsv {
	public static void main(String[] args) {
		  ArrayList<String[]> listAddress = new ArrayList<String[]>();
		  ArrayList<String[]> listEnquate = new ArrayList<String[]>();
		  ArrayList<String[]> dataList = new ArrayList<String[]>();
		  String[] resultId;
		  BufferedReader br = null;
		  BufferedReader br2 = null;
		  //String file_name = "address.csv"; // 入力ファイル
		  try {
		  //File file = new File(file_name);
		  br = new BufferedReader(
			        new InputStreamReader(new FileInputStream("address.csv"), "SHIFT_JIS"));
		  br2 = new BufferedReader(
			        new InputStreamReader(new FileInputStream("enquate.csv"), "SHIFT_JIS"));
		  // readLineで一行ずつ読み込む
		  String line; // 読み込み行
		  String[] data; // 分割後のデータを保持する配列
		  String[] data2;
		  int count = 0;
		  while ((line = br.readLine()) != null) {
		  // lineをカンマで分割し、配列dataに設定
		  data = line.split(",", 0);
		  listAddress.add(data);
		  // 1行分の読み込みデータを表示（データ間にスペース）
//		  for (int i = 0; i < data.length; i++) {
//		  System.out.print(listAddress);
//		  }
//		  System.out.println();
		  }
		  while ((line = br2.readLine()) != null) {
		  // lineをカンマで分割し、配列dataに設定
		  data2 = line.split(",", 0);
		  listEnquate.add(data2);
		  for(String[] item : listAddress) {
			  for(String[] address : listEnquate) {
				  if(item[0].equals(address[0])) {
					System.out.println(count + " " +  item[0] + " " + item[1] + " " + item[2] + " " + address[1] + " " + address[2]);
				  System.out.println(dataList);;
			  }
			count++;
			  }
		  }
		  }
		  } catch (Exception e) {
		  System.out.println(e.getMessage());
		  } finally {
		  try {
		  br.close();
		  } catch (Exception e) {
		  System.out.println(e.getMessage());
		  }
		  }
	
		  }
}

