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

public class User_UserBuilder_build_1656415996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3226;

    public User_UserBuilder_build_1656415996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3226 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term3264 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term3226, term3226.getClass(), "id", 1439298019805881866L);
        setField(term3226, term3226.getClass(), "email", "yGtHPyvYiQ");
        setField(term3226, term3226.getClass(), "login", "MvRIxilFMJ");
        setField(term3226, term3226.getClass(), "name", "iNwOJRBEjp");
        setIntField(term3264, term3264.getClass(), "year", 2017);
        setShortField(term3264, term3264.getClass(), "month", (short) 8);
        setShortField(term3264, term3264.getClass(), "day", (short) 7);
        setField(term3226, term3226.getClass(), "birthday", term3264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3226, args);
    }

};


