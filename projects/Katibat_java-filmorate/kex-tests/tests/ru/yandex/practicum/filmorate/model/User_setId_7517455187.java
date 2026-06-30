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

public class User_setId_7517455187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1044;
     Object term1087;

    public User_setId_7517455187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1045 = new Long(-7672528020740371001L);
        term1044 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1083 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1044, term1044.getClass(), "id", term1045);
        setField(term1044, term1044.getClass(), "email", "aKnKipADSo");
        setField(term1044, term1044.getClass(), "login", "wSQxaModmm");
        setField(term1044, term1044.getClass(), "name", "UlajhuVLaP");
        setIntField(term1083, term1083.getClass(), "year", 2015);
        setShortField(term1083, term1083.getClass(), "month", (short) 4);
        setShortField(term1083, term1083.getClass(), "day", (short) 14);
        setField(term1044, term1044.getClass(), "birthday", term1083);
        term1087 = new Long(-4502405999831680926L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1087;
        callMethod(klass, "setId", argTypes, term1044, args);
    }

};


