package ejercicioCertificacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;




public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
		
		    List<Integer> givenList = Arrays.asList(1, 2, 3, 4, 5, 6);
		    Collections.shuffle(givenList);
		 
		    int randomSeriesLength = 3;
		 
		    List<Integer> randomSeries = givenList.subList(0, randomSeriesLength);
		    System.out.println("random " + randomSeries);
		    */
		   
		    Random rand = new Random();
			
			int min = 1;
			int max = 9;
			
			int num = max - min + 1 + min;

	 
			Integer randomNum = rand.nextInt((max - min) + 1) + min;
			System.out.println("numero" + num);
			System.out.println("numero ramdon :" + randomNum);
	}

	private int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


}
