package InMemoryModel;

import ModelEliments.*;

import java.util.List;
import java.util.ArrayList;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changeObservers) throws Exception {
        this.changeObservers = changeObservers;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();
        this.Cameras = new ArrayList<>();

        List<Texture> Textures = new ArrayList<>();
        this.Models.add(new PoligonalModel(Textures));

        this.Flashes.add(new Flash());
        this.Cameras.add(new Camera());

        this.Scenes.add(new Scene(0, Models, Flashes, Cameras));

    }

    public Scene GetScena(int id){
        return Scenes.get(id);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
