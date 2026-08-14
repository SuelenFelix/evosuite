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

public class User_getLogin_3501207711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667;

    public User_getLogin_3501207711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term704 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term667, term667.getClass(), "login", "eZFUvlxvGV");
        setField(term667, term667.getClass(), "name", "BYqFIqCKAV");
        setField(term667, term667.getClass(), "email", "vrQLuWIDJX");
        setIntField(term704, term704.getClass(), "year", 2012);
        setShortField(term704, term704.getClass(), "month", (short) 8);
        setShortField(term704, term704.getClass(), "day", (short) 25);
        setField(term667, term667.getClass(), "birthday", term704);
        setLongField(term667, term667.getClass(), "id", 4044358158040652353L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogin", argTypes, term667, args);
    }

};


