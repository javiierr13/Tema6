package ejemplo1;

public class Main {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		c1.matricula = "1111AAA";
		c1.conmbustible = "Gasolina";
		c1.kilometraje = 100;
		
		Coche c2 = new Coche();
		c2.matricula = "2222BBB";
		c2.conmbustible = "Diesel";
		c2.kilometraje = 200;
		
		Persona p = new Persona();
		p.nombre = "Curro";
		p.saludar();
		p.edad=18;
		p.estatura=175;
		
		System.out.println(p.edad);
		System.out.println(p.estatura);

		
		p.cumplirAnios();
		p.crecer();
		
		System.out.println(p.edad);
		System.out.println(p.estatura);
		
		

	}

}

