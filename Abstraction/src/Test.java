
public class Test {
    public static void main(String args[]){
        
        eatSleep();
    }
    
    public static void eatSleep(){
        Dog d = new Dog();
        
        d.eat();        // Executed with overriding
        d.sleep();      // Executed without overriding
        return;
    }
}


abstract interface AnimalInterface{
    
    int age = 0;
    
    abstract void sleep();
    abstract void eat();
    
}

class Dog implements AnimalInterface
{
    @Override
    public void sleep(){
        System.out.println("Animal is sleeping...");
    }
    
    @Override
    public void eat(){
        System.out.println("Dog is eating...");
    }
}


