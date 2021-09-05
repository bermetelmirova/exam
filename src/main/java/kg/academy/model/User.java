package kg.academy.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    Long id;
    Date requestDateTime;
    String name;
    int birtYear;
    boolean gender;

    @Override
    public String toString() {
        String str = "";
        String old = "";
        if (gender == true) {
            str += "Уважаемая \t";
        } else {
            str += "Уважаемый \t";
        }
        int age = 2021 - birtYear;

        if (age == 11 || age == 14) old = "\t лет";
        else if (age % 10 >= 2 && age % 10 <= 4) old = "\t года";
        else if (age % 10 == 1) old = "\t год";
        else old = " лет";

        return str += name + "\t ваш год рождения " + birtYear + "\t год,\t вам " + age + "\t" + old;
    }
}
