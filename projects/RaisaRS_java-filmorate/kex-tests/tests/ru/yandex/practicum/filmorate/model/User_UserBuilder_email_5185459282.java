package ru.yandex.practicum.filmorate.model;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static ru.yandex.practicum.filmorate.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class User_UserBuilder_email_5185459282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2868;

    public User_UserBuilder_email_5185459282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2868 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2906 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2868, term2868.getClass(), "id", -6823727938421990489L);
        setField(term2868, term2868.getClass(), "email", "BKLfkLiZTH");
        setField(term2868, term2868.getClass(), "login", "SPpkrGcPRr");
        setField(term2868, term2868.getClass(), "name", "sEccwbJKYE");
        setIntField(term2906, term2906.getClass(), "year", 2019);
        setShortField(term2906, term2906.getClass(), "month", (short) 2);
        setShortField(term2906, term2906.getClass(), "day", (short) 20);
        setField(term2868, term2868.getClass(), "birthday", term2906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        callMethod(klass, "email", argTypes, term2868, args);
    }

};


