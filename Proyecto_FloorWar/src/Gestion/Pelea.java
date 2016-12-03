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
		
		public int francdañado(int daño){
			franco.hp=franco.hp-daño;
			if(franco.hp<=0){
				
			}
			return franco.hp;
			
		}
		
		public int ingenierodañado(int daño){
			ing.hp=ing.hp-daño;
			if(ing.hp<=0){
				
			}
			return ing.hp;
			
		}
		public int medicodañado(int daño){
			med.hp=med.hp-daño;
			if(franco.hp<=0){
				
			}
			return med.hp;
			
		}
		public int MMalosdañado(int daño){
			mm.hp=mm.hp-daño;
			if(mm.hp<=0){
				
			}
			return mm.hp;
			
		}
		
	}
