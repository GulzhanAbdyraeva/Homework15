package com.company;

public class Main {

    public static void main(String[] args) {
        Animal shark1 = new Shark("shark1");
        Animal shark2 = new Shark("shark2");
        Animal shark3 = new Shark("shark3");

        Animal turtle1 = new Turtle("turtle1");
        Animal turtle2 = new Turtle("turtle2");
        Animal turtle3 = new Turtle("turtle3");

        Animal eagle1 = new Eagle("eagles1");
        Animal eagle2 = new Eagle("eagles2");
        Animal eagle3 = new Eagle("eagles3");

        Animal[] animals = new Animal[]{shark1,shark2,shark3,turtle1,turtle2,turtle3,eagle1,eagle2,eagle3};

        Shark[] sharks = new Shark[3];
        int count1 = 0;
        for (Animal shark : animals) {
            if(shark.getClass().getName().equals("com.company.Shark")) {
                if(shark instanceof Shark) {
                    sharks[count1] = (Shark)shark;
                    shark.say();
                    ((Shark) shark).attack();
                    count1++;
                }
            }
        }

        System.out.println();

        Turtle[] turtles = new Turtle[3];
        int count2 = 0;
        for (Animal turtle : animals) {
            if(turtle.getClass().getName().equals("com.company.Turtle")) {
                if(turtle instanceof Turtle) {
                    turtles[count2] = (Turtle) turtle;
                    turtle.say();
                    ((Turtle) turtle).swim();
                    count1++;
                }
            }
        }

        System.out.println();

        Eagle[] eagles = new Eagle[3];
        int count3 = 0;
        for (Animal eagle : animals) {
            if(eagle.getClass().getName().equals("com.company.Eagle")) {
                if(eagle instanceof Eagle) {
                    eagles[count3] = (Eagle) eagle;
                    eagle.say();
                    ((Eagle) eagle).fly();
                    count3++;
                }
            }
        }


    }
}


//Animal деген класс тузунуз жана бир метод кошунуз.
//Анын 3 наследнигин тузунуз.
//
//Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
//Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
//кошунуз.
//instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
//чыгарыныз.
//Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
//болуп оз озунун массивине салыныз