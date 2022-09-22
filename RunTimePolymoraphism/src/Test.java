class A {
    // most super class method
    public void eat(){
        System.out.println("A eats food");
    }
}

class B extends A{
    // dynamic method dispatch happens to this method
    public void eat() {
        System.out.println("B eats meat");
    }
}

class C extends B{
    // dynamic method dispatch happens to this method
    public void eat() {
        System.out.println("C drinks milk");
    }
}

class Test{
    public static void main(String args[]){
        // create reference variables
        A a1, a2, a3;
        System.out.println("-----No Dynamic method dispatch-----");
        a1 = new A();
        a1.eat();
        System.out.println("-----Dynamic method dispatch-----");
        a2 = new B();
        a3 = new C();

        a2.eat();
        a3.eat();
    }
}
