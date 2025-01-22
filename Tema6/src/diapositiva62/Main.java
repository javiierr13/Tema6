package diapositiva62;

public class Main {

	public static void main(String[] args) {
		Bombilla b1, b2;
		b1 = new Bombilla();
		b2 = new Bombilla();
		
		Bombilla.interruptorGeneral= true;

		b1.interruptor();
		b2.interruptor();

		b1.verEstado();
		b2.verEstado();
		
		b1.interruptor();

		b1.verEstado();
		b2.verEstado();
				

	}

}

