
package projectofmavean.demoproject;

class Dog {
    void left() {
        System.out.println("this is left");
    }

    void right() {
        System.out.println("this is right");
    }

    void up() {
        System.out.println("this is up");
    }

    void down() {
        System.out.println("this is down");
    }
}

class Cat {
    void left() {
        
    }

    void right() {
        System.out.println("this is right");
    }

    void up() {
        System.out.println("this is up");
    }

    void down() {
        System.out.println("this is down");
    }
}

class Bird {
    void left() {
        System.out.println("this is left");
    }

    void right() {
        System.out.println("this is right");
    }

    void up() {
        System.out.println("this is up");
    }

    void down() {
        System.out.println("this is down");
    }
}

class Monkey {
    private Bird obj;

    public Monkey(Bird bird) {
        this.obj = bird;
    }

    void runner() {
        obj.left();
        obj.right();
        obj.up();
        obj.down();
    }
}


public class DemoprojectApplication {
    public static void main(String[] args) {
        // SpringApplication.run(DemoprojectApplication.class, args);
        Bird obj4 = new Bird();
        Monkey obj1 = new Monkey(obj4);
        Cat obj2 = new Cat();
        Dog obj3 = new Dog();
        obj1.runner();
    }
}
