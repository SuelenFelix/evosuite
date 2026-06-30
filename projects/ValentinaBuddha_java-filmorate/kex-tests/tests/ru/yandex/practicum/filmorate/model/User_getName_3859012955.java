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
import java.lang.Integer;
import java.lang.Object;

public class User_getName_3859012955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816;

    public User_getName_3859012955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term817 = new Integer(-1922583790);
        term816 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term855 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term816, term816.getClass(), "id", term817);
        setField(term816, term816.getClass(), "email", "AijpHYOFuy");
        setField(term816, term816.getClass(), "login", "SbAoxhfrkn");
        setField(term816, term816.getClass(), "name", "kuTXqwMtDB");
        setIntField(term855, term855.getClass(), "year", 2015);
        setShortField(term855, term855.getClass(), "month", (short) 9);
        setShortField(term855, term855.getClass(), "day", (short) 19);
        setField(term816, term816.getClass(), "birthday", term855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term816, args);
    }

};


