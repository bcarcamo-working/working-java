package ejercicioCertificacion;

public class arregloForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shirts[][] = new  String[2][2];
		shirts[0][0] = "red";
		shirts[0][1] = "blue";
		shirts[1][0] = "small";
		shirts[1][1] = "medium";
		
		for (int index = 0; index < 2; index++) {
			for (int idx = 0; idx < index; idx++) {
				System.out.println(shirts[index][idx] + ": ");
			}
		}
		
		int x =100;
		int a =x++;
		int b =++x;
		int c =x++;
		//int d = (a < b) ? (a < c) ? a: (b <c)? b: c;
		//System.out.println(d);
				
	}

}
