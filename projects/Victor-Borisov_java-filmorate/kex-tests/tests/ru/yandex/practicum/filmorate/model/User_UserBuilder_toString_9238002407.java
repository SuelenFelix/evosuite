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

public class User_UserBuilder_toString_9238002407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2919;

    public User_UserBuilder_toString_9238002407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2920 = new Integer(-1845499264);
        term2919 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2958 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term2919, term2919.getClass(), "id", term2920);
        setField(term2919, term2919.getClass(), "email", "pORebkoRdD");
        setField(term2919, term2919.getClass(), "login", "mXGCWJDOqA");
        setField(term2919, term2919.getClass(), "name", "dpNsDgfPso");
        setIntField(term2958, term2958.getClass(), "year", 2012);
        setShortField(term2958, term2958.getClass(), "month", (short) 2);
        setShortField(term2958, term2958.getClass(), "day", (short) 19);
        setField(term2919, term2919.getClass(), "birthday", term2958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2919, args);
    }

};


