package comt.ifsc.tds;

public class Principal {

	public static void main(String[] args) {
		try {
			int resultado = Principal.divisao(2, 0);
			System.out.println(resultado);
		} catch (ArithmeticException e) {
			System.out.println("Erro de matemática: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Erro geral: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static int divisao(int a, int b) throws ArithmeticException  {
		if (b == 0) {
			throw new ArithmeticException("Divisor é zero.");
		}
		return a / b;
	}
}
