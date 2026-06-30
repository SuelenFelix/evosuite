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

public class User_init_12880570020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749;
     Object term787;

    public User_init_12880570020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749 = new Integer(-602026508);
        term787 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term787, term787.getClass(), "year", 2012);
        setShortField(term787, term787.getClass(), "month", (short) 8);
        setShortField(term787, term787.getClass(), "day", (short) 25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Integer");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[5];
        args[0] = term749;
        args[1] = "vrQLuWIDJX";
        args[2] = "flxyYxBRtu";
        args[3] = "OclPbYPkcH";
        args[4] = term787;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


