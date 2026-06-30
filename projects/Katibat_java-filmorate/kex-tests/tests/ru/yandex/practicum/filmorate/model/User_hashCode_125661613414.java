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

public class User_hashCode_125661613414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1629;

    public User_hashCode_125661613414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1630 = new Long(-484994522244390100L);
        term1629 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1668 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1629, term1629.getClass(), "id", term1630);
        setField(term1629, term1629.getClass(), "email", "eqJfYWRaEL");
        setField(term1629, term1629.getClass(), "login", "fhkbdRViHi");
        setField(term1629, term1629.getClass(), "name", "uWHnvSvaPl");
        setIntField(term1668, term1668.getClass(), "year", 2024);
        setShortField(term1668, term1668.getClass(), "month", (short) 1);
        setShortField(term1668, term1668.getClass(), "day", (short) 24);
        setField(term1629, term1629.getClass(), "birthday", term1668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1629, args);
    }

};


