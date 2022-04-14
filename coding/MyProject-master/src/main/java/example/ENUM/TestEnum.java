package example.ENUM;

import java.time.DayOfWeek;

public enum TestEnum {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class test {
    TestEnum obj;

    public test(TestEnum testEnum) {
        this.obj = testEnum;
    }

    public void days() {
        switch (obj) {
            case SUNDAY:
                System.out.println("Today is sunday");
                break;
            case MONDAY:
                System.out.println("Today is monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tues");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednes");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Wrong Input");
                break;

        }
    }

    public static void main(String[] args) {
        test obj1 = new test(TestEnum.valueOf("MONDAY"));
        obj1.days();
    }


}
