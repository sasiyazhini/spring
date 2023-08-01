package projectofmavean.demoproject;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface Alpha1 {
    void sum(int a, int b);
    void avg(int a, int b);
}
//@Primary
@Component("1")
class C implements Alpha1 {

    @Override
    public void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    @Override
    public void avg(int a, int b) {
        System.out.println("Average: " + 2 * (a + b) / 2);
    }
}

@Component("2")
class T implements Alpha1 {

    @Override
    public void sum(int a, int b) {
        System.out.println("Task 1 - Sum: " + (a + b));
    }

    @Override
    public void avg(int a, int b) {
        System.out.println("Task 1 - Average: " + 2 * (a + b) / 2);
    }
}
@Component
//@Primary
class Control1 {
    private Alpha1 info;

    @Autowired
    public Control1(@Qualifier("1") Alpha1 info) {
   // public Control( Alpha info) {
        this.info = info;
    }

    public void Work() {
        info.avg(10, 12);
        info.sum(11, 22);
    }
}