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

public class User_setName_133397527310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309;

    public User_setName_133397527310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1310 = new Long(6855071767938501807L);
        term1309 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1348 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1309, term1309.getClass(), "id", term1310);
        setField(term1309, term1309.getClass(), "email", "nGKItKLYNC");
        setField(term1309, term1309.getClass(), "login", "UiUYnPrcCi");
        setField(term1309, term1309.getClass(), "name", "UoYtihxVaS");
        setIntField(term1348, term1348.getClass(), "year", 2017);
        setShortField(term1348, term1348.getClass(), "month", (short) 7);
        setShortField(term1348, term1348.getClass(), "day", (short) 22);
        setField(term1309, term1309.getClass(), "birthday", term1348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDswTTCZHV";
        callMethod(klass, "setName", argTypes, term1309, args);
    }

};


