package gameObjects;
import java.util.ArrayList;

public class TableroPosiciones {
	
	private ArrayList<FichaPosicion> listaPosiciones=new ArrayList<>();
	private FichaPosicion FichaPosicion;
	private int X,Y;
	
	public TableroPosiciones() {
		
		
		
	}
	
	public void BuscarPosicion(int id) {
		if(id>=0) {
			FichaPosicion=listaPosiciones.get(id-1);
		}
		X=FichaPosicion.getX();
		Y=FichaPosicion.getY();
	}
	
	public void inicializarPosiciones() {
		
		listaPosiciones.add(new FichaPosicion(250, 15));
		listaPosiciones.add(new FichaPosicion(299, 61));
		listaPosiciones.add(new FichaPosicion(340, 100));
		listaPosiciones.add(new FichaPosicion(375, 123));
		listaPosiciones.add(new FichaPosicion(403, 154));
		listaPosiciones.add(new FichaPosicion(443, 194));
		listaPosiciones.add(new FichaPosicion(487, 235));
		listaPosiciones.add(new FichaPosicion(537, 289));
		listaPosiciones.add(new FichaPosicion(581, 329));
		listaPosiciones.add(new FichaPosicion(628, 284));
		
		listaPosiciones.add(new FichaPosicion(674, 240));
		listaPosiciones.add(new FichaPosicion(721, 190));
		listaPosiciones.add(new FichaPosicion(581, 329));
		listaPosiciones.add(new FichaPosicion(628, 284));
		listaPosiciones.add(new FichaPosicion(674, 240));
		listaPosiciones.add(new FichaPosicion(721, 190));
		listaPosiciones.add(new FichaPosicion(766, 144));
		listaPosiciones.add(new FichaPosicion(800, 108));
		listaPosiciones.add(new FichaPosicion(830, 75));
		listaPosiciones.add(new FichaPosicion(860, 43));
		
		listaPosiciones.add(new FichaPosicion(904, 22));
		listaPosiciones.add(new FichaPosicion(950, 58));
		listaPosiciones.add(new FichaPosicion(908, 95));
		listaPosiciones.add(new FichaPosicion(889, 132));
		listaPosiciones.add(new FichaPosicion(854, 159));
		listaPosiciones.add(new FichaPosicion(810, 198));
		listaPosiciones.add(new FichaPosicion(769, 240));
		listaPosiciones.add(new FichaPosicion(721, 287));
		listaPosiciones.add(new FichaPosicion(671, 329));
		listaPosiciones.add(new FichaPosicion(622, 377));
		
		listaPosiciones.add(new FichaPosicion(671, 424));
		listaPosiciones.add(new FichaPosicion(714, 471));
		listaPosiciones.add(new FichaPosicion(764, 517));
		listaPosiciones.add(new FichaPosicion(808, 559));
		listaPosiciones.add(new FichaPosicion(842, 578));
		listaPosiciones.add(new FichaPosicion(865, 615));
		listaPosiciones.add(new FichaPosicion(903, 654));
		listaPosiciones.add(new FichaPosicion(950, 700));
		listaPosiciones.add(new FichaPosicion(903, 747));
		listaPosiciones.add(new FichaPosicion(855, 704));
		
		listaPosiciones.add(new FichaPosicion(820, 668));
		listaPosiciones.add(new FichaPosicion(785, 641));
		listaPosiciones.add(new FichaPosicion(764, 609));
		listaPosiciones.add(new FichaPosicion(717, 563));
		listaPosiciones.add(new FichaPosicion(672, 514));
		listaPosiciones.add(new FichaPosicion(625, 470));
		listaPosiciones.add(new FichaPosicion(578, 423));
		listaPosiciones.add(new FichaPosicion(532, 467));
		listaPosiciones.add(new FichaPosicion(485, 515));
		listaPosiciones.add(new FichaPosicion(436, 564));
		
		listaPosiciones.add(new FichaPosicion(393, 607));
		listaPosiciones.add(new FichaPosicion(349, 651));
		listaPosiciones.add(new FichaPosicion(331, 694));
		listaPosiciones.add(new FichaPosicion(295, 705));
		listaPosiciones.add(new FichaPosicion(252, 743));
		listaPosiciones.add(new FichaPosicion(217, 705));
		listaPosiciones.add(new FichaPosicion(250, 663));
		listaPosiciones.add(new FichaPosicion(278, 633));
		listaPosiciones.add(new FichaPosicion(312, 601));
		listaPosiciones.add(new FichaPosicion(350, 561));
		
		listaPosiciones.add(new FichaPosicion(395, 515));
		listaPosiciones.add(new FichaPosicion(442, 470));
		listaPosiciones.add(new FichaPosicion(486, 423));
		listaPosiciones.add(new FichaPosicion(533, 374));
		listaPosiciones.add(new FichaPosicion(489, 331));
		listaPosiciones.add(new FichaPosicion(441, 282));
		listaPosiciones.add(new FichaPosicion(391, 238));
		listaPosiciones.add(new FichaPosicion(354, 206));
		listaPosiciones.add(new FichaPosicion(315, 180));
		listaPosiciones.add(new FichaPosicion(295, 148));
		
		listaPosiciones.add(new FichaPosicion(247, 102));
		listaPosiciones.add(new FichaPosicion(210, 66));

	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
}
