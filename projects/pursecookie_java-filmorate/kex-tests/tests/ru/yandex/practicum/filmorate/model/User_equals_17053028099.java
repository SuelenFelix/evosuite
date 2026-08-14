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

public class User_equals_17053028099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1313;
     Object term1355;

    public User_equals_17053028099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1313 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1350 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1313, term1313.getClass(), "login", "nGKItKLYNC");
        setField(term1313, term1313.getClass(), "name", "UiUYnPrcCi");
        setField(term1313, term1313.getClass(), "email", "UoYtihxVaS");
        setIntField(term1350, term1350.getClass(), "year", 2017);
        setShortField(term1350, term1350.getClass(), "month", (short) 7);
        setShortField(term1350, term1350.getClass(), "day", (short) 22);
        setField(term1313, term1313.getClass(), "birthday", term1350);
        setLongField(term1313, term1313.getClass(), "id", -1468719814009985452L);
        term1355 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1355;
        callMethod(klass, "equals", argTypes, term1313, args);
    }

};


