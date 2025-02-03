package com.wipro.oops;
/**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fileds
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
*/
 
//public class Animal {
//	
//	private String name;
//	private String species;
//	private float weight;
//
//	public Animal() {
//		// TODO Auto-generated constructor stub	
//	}
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getSpecies() {
//		return species;
//	}
//	
//	public void setSpecies(String species) {
//		this.species = species;
//	}
//	
//	public float getWeight() {
//		return weight;
//	}
//	
//	public void setWeight(float weight) {
//		this.weght = weight;
//	}
//	
//	public String toString() {
//		return"Animal [Name=" +name+",Species="+species +",Weight="+weight+"kg]";
//	}
//
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

public class Animal {

    private String name;
    private String species;
    private float weight;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be positive.");
        }
    }

    @Override
    public String toString() {
        return "Animal [Name=" + name + ", Species=" + species + ", Weight=" + weight + "kg]";
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Buddy");
        dog.setSpecies("pitbull");
        dog.setWeight(25.5f); 

        System.out.println(dog);

        dog.setWeight(-10f);
        System.out.println(dog);

        Animal cat = new Animal();
        cat.setName("jojo");
        cat.setSpecies("Indian");
        cat.setWeight(4.2f);
        System.out.println(cat);

    }
}
