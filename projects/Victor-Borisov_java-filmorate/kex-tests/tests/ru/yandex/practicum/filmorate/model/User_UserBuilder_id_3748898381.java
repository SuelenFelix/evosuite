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

public class User_UserBuilder_id_3748898381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1932;
     Object term1975;

    public User_UserBuilder_id_3748898381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1933 = new Integer(493620644);
        term1932 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term1971 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1932, term1932.getClass(), "id", term1933);
        setField(term1932, term1932.getClass(), "email", "KoyGrUJeJW");
        setField(term1932, term1932.getClass(), "login", "HqBOwkVqjD");
        setField(term1932, term1932.getClass(), "name", "MAcUBcBckh");
        setIntField(term1971, term1971.getClass(), "year", 2029);
        setShortField(term1971, term1971.getClass(), "month", (short) 8);
        setShortField(term1971, term1971.getClass(), "day", (short) 28);
        setField(term1932, term1932.getClass(), "birthday", term1971);
        term1975 = new Integer(1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1975;
        callMethod(klass, "id", argTypes, term1932, args);
    }

};


