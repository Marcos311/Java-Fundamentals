public class Main
{
	public static void main(String[] args) {
		
		System.out.println(Recursao.soma(5));
		
		int[] v = {1,2,3,4,5,6};
		System.out.println(Recursao.somaPar(v,v.length));
		
		int[] w = {1,2,3,4,5,6};
		System.out.println(Recursao.somaImpar(w, w.length));
	}
}
