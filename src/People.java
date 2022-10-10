
public class People {
    public static void main(String[] args) {
        Human human = new Human("Julia", 19);
        human.setage(19);
        human.info();

        Human.Hand humanhand = human.new Hand();
        humanhand.move();
        humanhand.hold("ручку");

        Human.Leg humanleg = human.new Leg();
        humanleg.move();

        Human.Head humanhead = human.new Head();
        humanhead.think();
        humanhead.notthink();
    }
}


    class Human {
        private String name;
        private int age;

        Human(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Обьект Человек создан");
        }

        void info() {
            System.out.println("Имя человека: " + this.name + ", возраст: " + this.age);
        }


        String getname() {
            return this.name;
        }


        void setname(String name) {
            this.name = name;
        }


        int getage() {
            return this.age;
        }


        void setage(int age) {
            if (0 < age && age < 100) {
                this.age = age;
            }
        }

        public String toString() {
            return this.name;
        }

        class Head {
            void think() {
                System.out.println(name + " думает");
            }
            void notthink() {
                System.out.println(name + " не думает");
            }

        }

        class Leg {

            // Leg moving method
            void move() {
                System.out.println("Нога "+name +" двигается" );
            }
        }

        class Hand {
            private String item_in_hand;


            void move() {
                System.out.println("Рука " + name + " двигается");
            }


            void hold(String item) {
                this.item_in_hand = item;
                System.out.println(name + " держит " + this.item_in_hand);
            }


        }
    }



