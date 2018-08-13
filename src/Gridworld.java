import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {

		World w = new World();
		Bug b1 = new Bug();
		Bug b2 = new Bug();
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		Flower F = new Flower();
		w.show();
		w.add(new Location(1, 1), b1);
		w.add(new Location(5, 5), b2);
		b2.setColor(new Color(0, 0, 250));
		b2.turn();
		b2.turn();
		w.add(new Location(5, 6), f1);
		w.add(new Location(5, 4), f2);
		for (int i = 0; i < 10; i++) {
			for (int r = 0; r < 10; r++) {

				w.add(new Location(i, r), F);
			}
		}

	}
}
