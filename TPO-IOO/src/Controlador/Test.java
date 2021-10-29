package Controlador;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

import Comercio.Odontologos;
import Comercio.Pacientes;

public class Test{

	public static void main(String[] args) {
		int matricula = 0;
		Odontologos o1 = new Odontologos("Sebastian", "Lopez", 23456);
		Pacientes p1 = new Pacientes("Luciano", "Leserre", "Nahuel 5080", 41327509);
		
		ODB odb = ODBFactory.open("D:\\Users\\lleserre\\Documents\\TPOiOO");
		
		odb.store(o1);
		odb.store(p1);
		
		odb.close();
	}

}
