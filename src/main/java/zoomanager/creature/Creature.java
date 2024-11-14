package zoomanager.creature;

import zoomanager.food.IFood;

import java.util.ArrayList;

public class Creature implements ICreature {

    private final String creatureName;
    private final String creatureType;
    private final String foodPreference;
    private ArrayList<IFood> creatureStomach;
    private boolean creatureIsHungry;
    private boolean creatureIsContained;

    public Creature(String name, String type, String foodPreference) {
        this.creatureName = name;
        this.creatureType = type;
        this.foodPreference = foodPreference; // TODO : 14/11/2024 foodPreference should probably be an array of Food items so creatures can have a selection
        this.creatureStomach = new ArrayList<>();
        this.creatureIsHungry = true; // TODO : 14/11/2024 Hunger likely requires a countdown of some kind to flip the boolean true/false over time, possible 'Metabolism' class to set rate of change per creature type
        this.creatureIsContained = false;
    }

    public String getCreatureName() {
        return this.creatureName;
    }

    public String getCreatureType() {
        return this.creatureType;
    }

    public int getStomachContentsCount() {
        return this.creatureStomach.size();
    }

    public Boolean getHungerState() {
        return this.creatureIsHungry;
    }

    public Boolean getContainmentState() {
        return this.creatureIsContained;
    }

    public void eat(IFood food) {
        
        this.creatureStomach.add(food);

        if (creatureStomach.size() > 0) {
            this.creatureIsHungry = false;
        }
    }

    public String getPreferences() {
        return this.foodPreference;
    }
}
