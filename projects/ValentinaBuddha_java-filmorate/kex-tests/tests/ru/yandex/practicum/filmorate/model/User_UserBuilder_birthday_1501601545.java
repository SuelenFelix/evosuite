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

public class User_UserBuilder_birthday_1501601545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2068;
     Object term2111;

    public User_UserBuilder_birthday_1501601545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2069 = new Integer(-6029667);
        term2068 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2107 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2068, term2068.getClass(), "id", term2069);
        setField(term2068, term2068.getClass(), "email", "bWWfajKbEX");
        setField(term2068, term2068.getClass(), "login", "cAPeiZHKGJ");
        setField(term2068, term2068.getClass(), "name", "LvJFtLBaxj");
        setIntField(term2107, term2107.getClass(), "year", 2019);
        setShortField(term2107, term2107.getClass(), "month", (short) 2);
        setShortField(term2107, term2107.getClass(), "day", (short) 20);
        setField(term2068, term2068.getClass(), "birthday", term2107);
        term2111 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2111, term2111.getClass(), "year", 2027);
        setShortField(term2111, term2111.getClass(), "month", (short) 3);
        setShortField(term2111, term2111.getClass(), "day", (short) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2111;
        callMethod(klass, "birthday", argTypes, term2068, args);
    }

};


