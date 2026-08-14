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

public class User_hashCode_125661613411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1459;

    public User_hashCode_125661613411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1459 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1496 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1459, term1459.getClass(), "login", "ffYhPOzlUs");
        setField(term1459, term1459.getClass(), "name", "MLqYREekMl");
        setField(term1459, term1459.getClass(), "email", "ytSBIKXogI");
        setIntField(term1496, term1496.getClass(), "year", 2020);
        setShortField(term1496, term1496.getClass(), "month", (short) 5);
        setShortField(term1496, term1496.getClass(), "day", (short) 14);
        setField(term1459, term1459.getClass(), "birthday", term1496);
        setLongField(term1459, term1459.getClass(), "id", 3825396310311739952L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1459, args);
    }

};


