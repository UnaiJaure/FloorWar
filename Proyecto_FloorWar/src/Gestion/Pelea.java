package Gestion;

import Personajes.Francotirador;
import Personajes.Ingeniero;
import Personajes.MMaloso;
import Personajes.Medico;

public class Pelea {
		Francotirador franco = new Francotirador("Stuart",100);
		Ingeniero ing = new Ingeniero("Arturo",100,3);
		Medico med = new Medico("Tomas",100);
		MMaloso mm = new MMaloso("Fungecio",100);
		
		public Pelea() {
			/*Francotirador franco = new Francotirador("Stuart",100);
			Ingeniero ing = new Ingeniero("Arturo",100,3);
			Medico med = new Medico("Tomas",100);
			MMaloso mm = new MMaloso("Fungecio",100);*/
		}
		
		public int francda�ado(int da�o){
			franco.hp=franco.hp-da�o;
			if(franco.hp<=0){
				
			}
			return franco.hp;
			
		}
		
		public int ingenieroda�ado(int da�o){
			ing.hp=ing.hp-da�o;
			if(ing.hp<=0){
				
			}
			return ing.hp;
			
		}
		public int medicoda�ado(int da�o){
			med.hp=med.hp-da�o;
			if(franco.hp<=0){
				
			}
			return med.hp;
			
		}
		public int MMalosda�ado(int da�o){
			mm.hp=mm.hp-da�o;
			if(mm.hp<=0){
				
			}
			return mm.hp;
			
		}
		
	}
