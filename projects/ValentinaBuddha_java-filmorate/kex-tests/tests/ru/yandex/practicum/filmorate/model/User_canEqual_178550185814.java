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

public class User_canEqual_178550185814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1968;
     Object term2011;

    public User_canEqual_178550185814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1969 = new Integer(1622346318);
        term1968 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term2007 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1968, term1968.getClass(), "id", term1969);
        setField(term1968, term1968.getClass(), "email", "MAcUBcBckh");
        setField(term1968, term1968.getClass(), "login", "oVgzLbrsFr");
        setField(term1968, term1968.getClass(), "name", "vQVyKLdtaz");
        setIntField(term2007, term2007.getClass(), "year", 2022);
        setShortField(term2007, term2007.getClass(), "month", (short) 11);
        setShortField(term2007, term2007.getClass(), "day", (short) 16);
        setField(term1968, term1968.getClass(), "birthday", term2007);
        term2011 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2011;
        callMethod(klass, "canEqual", argTypes, term1968, args);
    }

};


