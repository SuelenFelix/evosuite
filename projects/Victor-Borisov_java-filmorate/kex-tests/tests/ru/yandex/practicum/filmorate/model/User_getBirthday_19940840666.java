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

public class User_getBirthday_19940840666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1113;

    public User_getBirthday_19940840666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1114 = new Integer(-1968847291);
        term1113 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User"));
        Object term1152 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1113, term1113.getClass(), "id", term1114);
        setField(term1113, term1113.getClass(), "email", "wSQxaModmm");
        setField(term1113, term1113.getClass(), "login", "UlajhuVLaP");
        setField(term1113, term1113.getClass(), "name", "gGSMzuGICf");
        setIntField(term1152, term1152.getClass(), "year", 2018);
        setShortField(term1152, term1152.getClass(), "month", (short) 1);
        setShortField(term1152, term1152.getClass(), "day", (short) 13);
        setField(term1113, term1113.getClass(), "birthday", term1152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBirthday", argTypes, term1113, args);
    }

};


