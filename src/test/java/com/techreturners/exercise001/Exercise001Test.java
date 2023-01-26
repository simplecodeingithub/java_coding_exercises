package com.techreturners.exercise001;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.techreturners.exercise001.Exercise001.countLinuxUsers;
import static org.junit.jupiter.api.Assertions.*;


public class Exercise001Test {

    @Test
    public void checkHello() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("Hello", ex001.capitalizeWord("hello"));
        assertEquals("The quick fox", ex001.capitalizeWord("the quick fox"));
        assertEquals("Oh no, bears!!!", ex001.capitalizeWord("oh no, bears!!!"));
    }

    @Test
    public void checkHelloAlreadyUppercase() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("Hello", ex001.capitalizeWord("Hello"));
    }

    @Test
    public void checkInitials() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("F.B", ex001.generateInitials("Frederic", "Bonneville"));
        assertEquals("K.M", ex001.generateInitials("Karl", "Marx"));
        assertEquals("L.H", ex001.generateInitials("Lewis", "Hamilton"));
    }

    @Test
    public void checkAddVat() {
        Exercise001 ex001 = new Exercise001();
        assertEquals(120, ex001.addVat(100, 20), 0.0);
        assertEquals(47, ex001.addVat(40, 17.5), 0.0);
        assertEquals(39.36, ex001.addVat(33.5, 17.5), 0.0);
        assertEquals(25, ex001.addVat(25, 0), 0.0);
    }

    @Test
    public void checkSentenceReverse() {
        Exercise001 ex001 = new Exercise001();
        assertEquals("oof", ex001.reverse("foo"));
        assertEquals("?siht od ot tnaw neve uoy dluow yhw", ex001.reverse("why would you even want to do this?"));
    }

    @Test
    public void checkLinuxUsers() {
        Exercise001 ex001 = new Exercise001();
        List<User> users=Arrays.asList(new User("Heather", "Windows 10", "Windows"),
                new User("Paul", "Windows 95", "Windows"));
        long linuxUserCount=ex001.countLinuxUsers(users);
        assertEquals(0,linuxUserCount);

        users=Arrays.asList(new User("Heather", "Windows 10", "Windows"),
                new User("Paul", "Windows 95", "Windows"),
                new User("Sheila", "CentOS 7", "Linux"),
                new User("Pedro", "Ubuntu 18.04", "Linux"));
         linuxUserCount=ex001.countLinuxUsers(users);
         assertEquals(2,linuxUserCount);
    }
}
