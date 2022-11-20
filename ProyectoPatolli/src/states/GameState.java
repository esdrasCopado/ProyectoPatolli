package states;

import java.awt.Graphics;

import gameObjects.Ficha;
import gameObjects.TableroPosiciones;
import graphics.Assets;
import math.Vector2D;

public class GameState {
	
	private Ficha ficha;
	private TableroPosiciones posicion;
	private int pos=1;
	public GameState() {
		
		
		
		
	}
	
	public void update() {
		ficha=new Ficha(new Vector2D(pos), Assets.player1);
	}
	public void draw(Graphics g) {
		ficha.draw(g);
	}
	
	public void setPos(int pos) {
		this.pos=pos;
	}
	
}
