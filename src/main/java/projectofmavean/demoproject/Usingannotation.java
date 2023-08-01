package projectofmavean.demoproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
class Usingannotation {
    void add() {
        System.out.println("This is Usingannotation");
    }

    @Component
    class Moon {
        void sub() {
            System.out.println("This is Moon class");
        }
    }

    @Component
    @Primary
    class Vini {
        private Moon mo;

        @Autowired
        Vini(Moon no) {
            this.mo = no;
        }

        public void sai() {
            System.out.println("This is normal class");
            mo.sub();
        }
    }
}
