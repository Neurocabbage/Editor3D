package ModelEliments;

import Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> Textures;
    public List<Poligon> Poligons;

    public PoligonalModel(List<Texture> textures) {
        this.Textures = textures;
        this.Poligons = new ArrayList<>();

        this.Poligons.add(new Poligon(new Point3D()));
    }

}
