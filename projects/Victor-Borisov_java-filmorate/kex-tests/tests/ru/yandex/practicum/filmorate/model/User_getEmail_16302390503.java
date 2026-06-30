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

public class User_getEmail_16302390503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term894;

    public User_getEmail_16302390503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term895 = new Integer(1876565163);
        term894 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term933 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term894, term894.getClass(), "id", term895);
        setField(term894, term894.getClass(), "email", "dWRymuLBtr");
        setField(term894, term894.getClass(), "login", "AijpHYOFuy");
        setField(term894, term894.getClass(), "name", "SbAoxhfrkn");
        setIntField(term933, term933.getClass(), "year", 2021);
        setShortField(term933, term933.getClass(), "month", (short) 1);
        setShortField(term933, term933.getClass(), "day", (short) 18);
        setField(term894, term894.getClass(), "birthday", term933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term894, args);
    }

};


