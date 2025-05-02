//superclass: animal
class Animal{
    protected String name;

    public Animal(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println(name + " makes a sound.");
    }

    public String toString(){
        return "Animal: " + name;
    }
}

//subclass dog
class Dog extends Animal{
    private String breed;
    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    //override
    public void speak(){
        System.out.println(name + " barks. Breed: " + breed);
    }
    public String toString(){
        return "Dog. " + name + ", Breed: " + breed;
    }
}


//subclass cat
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void speak(){
        System.out.println(name + " meows.");
    }
    public String toString(){
        return "Cat: " + name;
    }
}


//main class
public class Inheritance{
    public static void main(String[] args){
        Animal myDog = new Dog("Buudy", "German Shepard");
        Animal myCat = new Cat("Snowball");
        

        //polymorphism
        myDog.speak();
        myCat.speak();

        //Hierarchy of inheritance and object superclass
        System.out.println(myDog);
        System.out.println(myCat);

        //Object superclass reference
        Object obj = new Dog("Light", "Golden Retriever");
        System.out.println(obj.toString());
    }
}