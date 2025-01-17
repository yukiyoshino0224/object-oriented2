package plactice6;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Sheep();
        animals[1] = new Horse();
        animals[2] = new Goat();
        animals[3] = new Monkey();    
        animals[4] = new Bear();

        for(int i = 0; i < animals.length; i++){
            animals[i].cry();;
        }
        
    }

}
