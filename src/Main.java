public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend =friend / 3;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var firstFiterWeight = 78.2;
        var secondFiterWeight = 82.7;
        var allFiterWeight = firstFiterWeight + secondFiterWeight;
        System.out.println("Общий вес двух бойцов" + allFiterWeight);
        var weightDifference = secondFiterWeight - firstFiterWeight;
        System.out.println("Разница в весе бойцов составляет" + weightDifference);
        var weightDifference1 = secondFiterWeight - firstFiterWeight;
        System.out.println("Разница в весе бойцов при рассчете первым способом" + weightDifference1);
        var weightDifference2 = secondFiterWeight % firstFiterWeight;
        System.out.println("Разница в весе бойцов при рассчете вторым способом" + weightDifference2);

        var weekWorkHours = 640;
        var personHours = 8;
        var person = weekWorkHours / personHours;
        System.out.println("Всего работников в компании - " + person + " человек");
        person = person + 94;
        weekWorkHours = person * personHours;
        System.out.println("Если в компании работает " + person + " человек, то всего  " + weekWorkHours + " часов работы может быть поделено между сотрудниками");

    }
}