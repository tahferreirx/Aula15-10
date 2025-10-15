package agregacao;

public class PincipalCarro {
	
	public static void main(String[] args) {
		
		Motor motor = new Motor ("V8");
		Carro carro = new Carro ("Mustang", motor);
		
		System.out.println("Carro é: " + carro.getModelo() + " Motor: " + motor.getTipo());
	}
}
