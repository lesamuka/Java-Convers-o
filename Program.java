package course;

public class Program {

	public static void main(String[] args) {
		//exemplos de conversão implícita e casting
		double a;
		float b;

		a = 5.0;
		b = (float) a;

		double c;
		int d;

		c = 5.5;
		d = (int) c;

		int e, f;
		double result;
		double teste;

		e = 5;
		f = 2;

		result = e / f;
		teste = (double) e / f;

		System.out.println(b);
		System.out.println(d);
		System.out.println(result);
		System.out.println(teste);

	}

}
