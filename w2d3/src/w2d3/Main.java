package w2d3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.FileUtils;
	

public class Main {
	

	public static void main(String[] args) {
		

//		Es1 c1 = new Es1("*",5);
//		Es1 c2 = new Es1("#",10);
//		
//		Thread t1 = new Thread(c1);
//		Thread t2 = new Thread(c2);
//		t1.start();
//		t2.start();
		
		
		
//		Es2 s1 = new Es2(randomArr(),0,1000);
//		Es2 s2 = new Es2(randomArr(),1000,2000);
//		Es2 s3 = new Es2(randomArr(),2000,3000);
//		
//		Thread t1 = new Thread(s1);
//		Thread t2 = new Thread(s2);
//		Thread t3 = new Thread(s3);
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
//		
//		try {
//			t1.join();
//			t2.join();
//			t3.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		int somma = 0;
//		for(int i = 0; i < Es2.sommaArr.length; i++) {
//			somma += Es2.sommaArr[i];
//		}
//		System.out.print(somma);
		
		
		
		
	}



public static int[] randomArr() {
	int[] numbers = new int[3000];
	for(int i = 0; i<numbers.length; i++) {
		numbers[i] = ((int) (Math.random()*10));
	}
	return numbers;
	}
}
