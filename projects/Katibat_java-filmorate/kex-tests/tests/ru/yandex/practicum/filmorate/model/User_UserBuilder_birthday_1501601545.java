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

public class User_UserBuilder_birthday_1501601545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2150;
     Object term2193;

    public User_UserBuilder_birthday_1501601545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2151 = new Long(-2068172595987555756L);
        term2150 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2189 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2150, term2150.getClass(), "id", term2151);
        setField(term2150, term2150.getClass(), "email", "cAPeiZHKGJ");
        setField(term2150, term2150.getClass(), "login", "LvJFtLBaxj");
        setField(term2150, term2150.getClass(), "name", "PHvxnGHptP");
        setIntField(term2189, term2189.getClass(), "year", 2019);
        setShortField(term2189, term2189.getClass(), "month", (short) 2);
        setShortField(term2189, term2189.getClass(), "day", (short) 20);
        setField(term2150, term2150.getClass(), "birthday", term2189);
        term2193 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2193, term2193.getClass(), "year", 2027);
        setShortField(term2193, term2193.getClass(), "month", (short) 3);
        setShortField(term2193, term2193.getClass(), "day", (short) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2193;
        callMethod(klass, "birthday", argTypes, term2150, args);
    }

};


