package clearminds.cuentas;

/**
 * CLASE BASICA PARA DEFINIR UNA CUENTA
 */
public class Cuenta {
	private String id;
	private String tipo = "A";
	private double saldo;

	public Cuenta(String id) {
		this.id = id;
		this.tipo = "A";
	}

	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}

	public void imprimir() {
		System.out.println("*****************");
		System.out.println("CUENTA");
		System.out.println("*****************");
		System.out.println("Número de Cuenta: " + this.id);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("*****************");
		System.out.println("\n");
	}

	public void imprimirConMiEstilo() {
		System.out.println("\n");
		System.out.println("*****************************");
		System.out.println("*                           *");
		System.out.println("*           CUENTA          *");
		System.out.println("*                           *");
		System.out.println("*****************************");
		System.out.println("\u25CF   Número de Cuenta: " + this.id);
		System.out.println("\u25CF               Tipo: " + this.tipo);
		System.out.println("\u25CF              Saldo: " + this.saldo);
		System.out.println("_____________________________");
	}

}
