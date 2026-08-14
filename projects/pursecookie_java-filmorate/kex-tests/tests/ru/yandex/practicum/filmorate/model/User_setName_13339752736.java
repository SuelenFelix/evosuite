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

public class User_setName_13339752736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049;

    public User_setName_13339752736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1086 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1049, term1049.getClass(), "login", "aKnKipADSo");
        setField(term1049, term1049.getClass(), "name", "wSQxaModmm");
        setField(term1049, term1049.getClass(), "email", "UlajhuVLaP");
        setIntField(term1086, term1086.getClass(), "year", 2018);
        setShortField(term1086, term1086.getClass(), "month", (short) 1);
        setShortField(term1086, term1086.getClass(), "day", (short) 13);
        setField(term1049, term1049.getClass(), "birthday", term1086);
        setLongField(term1049, term1049.getClass(), "id", -1154553077993834885L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        callMethod(klass, "setName", argTypes, term1049, args);
    }

};


