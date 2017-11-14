public class Numeros {
	Numeros() {

	}

	int n1;
	int n2;

	public void validaNumeros() throws Exception {

		if (n1 == 0) {

			throw new Exception("o primeiro numero não pode ser zero.");

		} else if (n2 == 0) {
			throw new Exception("O segundo numero  não pode ser zero.");

		}

	}

	public double dividir() {

		return (n1 / n2);
	}

}
