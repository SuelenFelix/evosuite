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
import java.lang.Long;
import java.lang.Object;

public class User_getLogin_3501207715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term898;

    public User_getLogin_3501207715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term899 = new Long(2486810210675247493L);
        term898 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term937 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term898, term898.getClass(), "id", term899);
        setField(term898, term898.getClass(), "email", "SbAoxhfrkn");
        setField(term898, term898.getClass(), "login", "kuTXqwMtDB");
        setField(term898, term898.getClass(), "name", "Ghbwtircqb");
        setIntField(term937, term937.getClass(), "year", 2015);
        setShortField(term937, term937.getClass(), "month", (short) 9);
        setShortField(term937, term937.getClass(), "day", (short) 19);
        setField(term898, term898.getClass(), "birthday", term937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term898, args);
    }

};


