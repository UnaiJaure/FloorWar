package Personajes;

public class MiMuñeco {

	//Las posiciones de acceso, van con '-1' para acceder directamente al array.
	protected int miDireccionActual;
	protected int posx;
	protected int posy;
	
	public MiMuñeco(int entrada){
		switch(entrada){
			case 1: //Entrada superior
				this.posx = 16;
				this.posy = 0;
				this.miDireccionActual= 0;
				break;
			case 2: //Entrada derecha
				this.posx = 32;
				this.posy = 12;
				this.miDireccionActual= 0;
				break;
			case 3: //Entrada inferior
				this.posx = 16;
				this.posy = 24;
				this.miDireccionActual= 0;
				break;
			case 4: //Entrada izquierda
				this.posx = 0;
				this.posy = 12;
				this.miDireccionActual= 0;
				break;
		}
	}
	
	public int getDireccionActual(){
		return miDireccionActual;
	}
	
	public void setDireccionActual( int dir ){
		if(dir > 360) dir = dir - 360;
		miDireccionActual = dir;
	}

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}
	
	
}
