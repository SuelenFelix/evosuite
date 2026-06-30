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
     Object term2292;
     Object term2335;

    public User_UserBuilder_birthday_1501601545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2293 = new Integer(-2095575670);
        term2292 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2331 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2292, term2292.getClass(), "id", term2293);
        setField(term2292, term2292.getClass(), "email", "PkWMRdJcBb");
        setField(term2292, term2292.getClass(), "login", "jSpAteRute");
        setField(term2292, term2292.getClass(), "name", "swZVeJAxjt");
        setIntField(term2331, term2331.getClass(), "year", 2019);
        setShortField(term2331, term2331.getClass(), "month", (short) 2);
        setShortField(term2331, term2331.getClass(), "day", (short) 20);
        setField(term2292, term2292.getClass(), "birthday", term2331);
        term2335 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2335, term2335.getClass(), "year", 2027);
        setShortField(term2335, term2335.getClass(), "month", (short) 3);
        setShortField(term2335, term2335.getClass(), "day", (short) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2335;
        callMethod(klass, "birthday", argTypes, term2292, args);
    }

};


