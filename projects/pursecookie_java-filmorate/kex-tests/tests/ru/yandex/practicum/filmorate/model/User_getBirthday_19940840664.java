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

public class User_getBirthday_19940840664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term883;

    public User_getBirthday_19940840664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term883 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term920 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term883, term883.getClass(), "login", "AijpHYOFuy");
        setField(term883, term883.getClass(), "name", "SbAoxhfrkn");
        setField(term883, term883.getClass(), "email", "kuTXqwMtDB");
        setIntField(term920, term920.getClass(), "year", 2020);
        setShortField(term920, term920.getClass(), "month", (short) 11);
        setShortField(term920, term920.getClass(), "day", (short) 22);
        setField(term883, term883.getClass(), "birthday", term920);
        setLongField(term883, term883.getClass(), "id", -5788180182343976541L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term883, args);
    }

};


