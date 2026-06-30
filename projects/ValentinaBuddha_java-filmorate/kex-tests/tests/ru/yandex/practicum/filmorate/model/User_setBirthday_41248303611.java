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

public class User_setBirthday_41248303611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1322;
     Object term1365;

    public User_setBirthday_41248303611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1323 = new Integer(-522618178);
        term1322 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1361 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1322, term1322.getClass(), "id", term1323);
        setField(term1322, term1322.getClass(), "email", "JDswTTCZHV");
        setField(term1322, term1322.getClass(), "login", "onpbIeEKoi");
        setField(term1322, term1322.getClass(), "name", "YRHGsAkhxb");
        setIntField(term1361, term1361.getClass(), "year", 2026);
        setShortField(term1361, term1361.getClass(), "month", (short) 12);
        setShortField(term1361, term1361.getClass(), "day", (short) 13);
        setField(term1322, term1322.getClass(), "birthday", term1361);
        term1365 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1365, term1365.getClass(), "year", 2020);
        setShortField(term1365, term1365.getClass(), "month", (short) 5);
        setShortField(term1365, term1365.getClass(), "day", (short) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1365;
        callMethod(klass, "setBirthday", argTypes, term1322, args);
    }

};


