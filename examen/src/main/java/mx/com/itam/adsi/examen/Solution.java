package mx.com.itam.adsi.examen;

public class Solution {
	
	public boolean problema(String s) {
		char primerCaracter = s.charAt(0);
		String subCadena = primerCaracter+"";
		int cont = 1;
		boolean isBuild = true;
		
		while(cont<s.length() && primerCaracter!= s.charAt(cont)) {
			subCadena = subCadena + s.charAt(cont);
			cont++;
		}
		
		s = s.replaceAll(subCadena, "");
		
		return s.equals("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.problema("abab"));

	}

}
