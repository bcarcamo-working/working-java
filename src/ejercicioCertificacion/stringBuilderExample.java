package ejercicioCertificacion;

public class stringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		
		if(sb.equals(s)){
			System.out.println("Match 1");
		}else if(sb.toString().equals(s.toString())){
			System.out.println("Match 2");
		}else{
			System.out.println("No Match");
		}
		
	}

}
