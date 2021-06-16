package datos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;


import entidades.Persona;

/**
 * Session Bean implementation class DatosPersona
 */
@Singleton
@LocalBean
public class DatosPersona implements DatosPersonaLocal {

	private List<Persona> personas = new ArrayList<>();


    public DatosPersona() {
        // TODO Auto-generated constructor stub
    	this.personaInit();
    }
    
    @Override
    public Persona buscarPersona(int ci) {
    	Persona retorno = null;
    	for(Persona p: this.personas) {
    		if(p.getCi() == ci) {
    			retorno = new Persona (p.getCi(), p.getFnac(), p.getTipo());
    		}
    	}
		return retorno;
    }
    @Override
    public List<Persona> listarPersonas(){
    	return personas;
    }
    
    
    private void personaInit() {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	/* 
    	   Riesgo 
    	*/
    	Persona p1 = new Persona(87886895, LocalDate.parse("19-02-1930", formatter), "Riesgo");
    	this.personas.add(p1);
    	Persona p3 = new Persona(48778831, LocalDate.parse("04-02-1950", formatter), "Riesgo");
    	this.personas.add(p3);
    	Persona p4 = new Persona(76115029, LocalDate.parse("11-10-1956", formatter), "Riesgo");
    	this.personas.add(p4);
    	Persona p5 = new Persona(94529757, LocalDate.parse("11-10-1960", formatter), "Riesgo");
    	this.personas.add(p5);
    	Persona p6 = new Persona(54007698, LocalDate.parse("03-06-1969", formatter), "Riesgo");
    	this.personas.add(p6);
    	Persona p7 = new Persona(69120340, LocalDate.parse("14-01-1961", formatter), "Riesgo");
    	this.personas.add(p7);
    	Persona p8 = new Persona(40993582, LocalDate.parse("16-03-1963", formatter), "Riesgo");
    	this.personas.add(p8);
    	Persona p9 = new Persona(69199416, LocalDate.parse("25-12-1965", formatter), "Riesgo");
    	this.personas.add(p9);
    	Persona p10 = new Persona(67806748, LocalDate.parse("17-07-1969", formatter), "Riesgo");
    	this.personas.add(p10);
    	Persona p11 = new Persona(65504203, LocalDate.parse("04-02-1971", formatter), "Riesgo");
    	this.personas.add(p11);

    	/* 
    	    Salud
    	*/
    	Persona p12 = new Persona(2683926, LocalDate.parse("14-02-1980", formatter), "Salud");
    	this.personas.add(p12);
    	Persona p13 = new Persona(1693139, LocalDate.parse("07-08-1989", formatter), "Salud");
    	this.personas.add(p13);
    	Persona p14 = new Persona(2869954, LocalDate.parse("11-11-1998", formatter), "Salud");
    	this.personas.add(p14);
    	Persona p15 = new Persona(1849418, LocalDate.parse("26-03-1986", formatter), "Salud");
    	this.personas.add(p15);
    	Persona p16 = new Persona(2634046, LocalDate.parse("17-03-1999", formatter), "alud");
    	this.personas.add(p16);
    	Persona p17 = new Persona(2956258, LocalDate.parse("27-10-1990", formatter), "Salud");
    	this.personas.add(p17);
    	Persona p18 = new Persona(3291049, LocalDate.parse("16-03-1981", formatter), "Salud");
    	this.personas.add(p18);
    	Persona p19 = new Persona(1512103, LocalDate.parse("25-04-1997", formatter), "Salud");
    	this.personas.add(p19);
    	Persona p20 = new Persona(1913552, LocalDate.parse("14-03-1998", formatter), "Salud");
    	this.personas.add(p20);
    	Persona p21 = new Persona(4210009, LocalDate.parse("31-10-1972", formatter), "Salud");
    	this.personas.add(p21);

    	/* 
    	    Educacion
    	*/
    	Persona p22 = new Persona(15515040, LocalDate.parse("18-07-1988", formatter), "Educacion");
    	this.personas.add(p22);
    	Persona p23 = new Persona(68225363, LocalDate.parse("07-09-1962", formatter), "Educacion");
    	this.personas.add(p23);
    	Persona p24 = new Persona(99675048, LocalDate.parse("01-11-1970", formatter), "Educacion");
    	this.personas.add(p24);
    	Persona p25 = new Persona(60638039, LocalDate.parse("26-11-1987", formatter), "Educacion");
    	this.personas.add(p25);
    	Persona p26 = new Persona(50946076, LocalDate.parse("21-07-1991", formatter), "Educacion");
    	this.personas.add(p26);
    	Persona p27 = new Persona(45003811, LocalDate.parse("06-12-1962", formatter), "Educacion");
    	this.personas.add(p27);
    	Persona p28 = new Persona(26698069, LocalDate.parse("15-02-1993", formatter), "Educacion");
    	this.personas.add(p28);
    	Persona p29 = new Persona(17791828, LocalDate.parse("19-05-1997", formatter), "Educacion");
    	this.personas.add(p29);
    	Persona p30 = new Persona(49446760, LocalDate.parse("21-03-1975", formatter), "Educacion");
    	this.personas.add(p30);
    	Persona p31 = new Persona(33537402, LocalDate.parse("30-07-1979", formatter), "Educacion");
    	this.personas.add(p31);

    	/*
    	    Policia
    	*/
    	Persona p32 = new Persona(79022601, LocalDate.parse("10-08-1988", formatter), "Policia");
    	this.personas.add(p32);
    	Persona p33 = new Persona(77517355, LocalDate.parse("14-09-1963", formatter), "Policia");
    	this.personas.add(p33);
    	Persona p34 = new Persona(20178039, LocalDate.parse("25-04-1972", formatter), "Policia");
    	this.personas.add(p34);
    	Persona p35 = new Persona(35005811, LocalDate.parse("30-03-1967", formatter), "Policia");
    	this.personas.add(p35);

    	/*
    	    Adulto
    	*/
    	Persona p36 = new Persona(12711807, LocalDate.parse("18-07-1987", formatter), "Adulto");
    	this.personas.add(p36);
    	Persona p37 = new Persona(28548183, LocalDate.parse("07-09-1966", formatter), "Adulto");
    	this.personas.add(p37);
    	Persona p38 = new Persona(80787204, LocalDate.parse("01-11-1980", formatter), "Adulto");
    	this.personas.add(p38);
    	Persona p39 = new Persona(18699766, LocalDate.parse("26-11-1983", formatter), "Adulto");
    	this.personas.add(p39);
    	Persona p40 = new Persona(35862722, LocalDate.parse("21-07-1990", formatter), "Adulto");
    	this.personas.add(p40);
    	Persona p41 = new Persona(17917060, LocalDate.parse("06-12-1970", formatter), "Adulto");
    	this.personas.add(p41);
    	Persona p42 = new Persona(99068948, LocalDate.parse("15-02-1984", formatter), "Adulto");
    	this.personas.add(p42);
    	Persona p43 = new Persona(21228247, LocalDate.parse("19-05-1993", formatter), "Adulto");
    	this.personas.add(p43);
    	Persona p44 = new Persona(64097712, LocalDate.parse("21-03-1975", formatter), "Adulto");
    	this.personas.add(p44);
    	Persona p45 = new Persona(57475103, LocalDate.parse("30-07-1979", formatter), "Adulto");
    	this.personas.add(p45);

    	/*
    	    Joven
    	*/
    	Persona p46 = new Persona(41135725, LocalDate.parse("18-07-1990", formatter), "Joven");
    	this.personas.add(p46);
    	Persona p47 = new Persona(83511145, LocalDate.parse("07-09-1992", formatter), "Joven");
    	this.personas.add(p47);
    	Persona p48 = new Persona(56296954, LocalDate.parse("01-11-1991", formatter), "Joven");
    	this.personas.add(p48);
    	Persona p49 = new Persona(97041839, LocalDate.parse("26-11-1992", formatter), "Joven");
    	this.personas.add(p49);
    	Persona p50 = new Persona(63874587, LocalDate.parse("21-07-1997", formatter), "Joven");
    	this.personas.add(p50);
    	Persona p51 = new Persona(81165538, LocalDate.parse("06-12-1994", formatter), "Joven");
    	this.personas.add(p51);
    	Persona p52 = new Persona(44434827, LocalDate.parse("15-02-1999", formatter), "Joven");
    	this.personas.add(p52);
    	Persona p53 = new Persona(47952931, LocalDate.parse("19-05-2000", formatter), "Joven");
    	this.personas.add(p53);
    	Persona p54 = new Persona(75454317, LocalDate.parse("21-03-2001", formatter), "Joven");
    	this.personas.add(p54);
    	Persona p55 = new Persona(60412289, LocalDate.parse("30-07-1996", formatter), "Joven");
    	this.personas.add(p55);
    }

}
