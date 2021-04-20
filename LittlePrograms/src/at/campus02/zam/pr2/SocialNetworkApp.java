package at.campus02.zam.pr2;

import java.time.LocalDateTime;

public class SocialNetworkApp {
    public static void main(String[] args) {
        MayBeInt age = new MayBeInt(23, 2);
        MayBeInt salary = new MayBeInt(2000, 1);

        System.out.println(age.print());
        System.out.println(salary.print());

        MayBe<String> name = new MayBe<String>("Hansi", 1);
        System.out.println(name.print());


        LocalDateTime localDateTime = LocalDateTime.now();
        MayBe<LocalDateTime> time = new MayBe<LocalDateTime>(localDateTime, 1);
        System.out.println(time.print());
    }
}
