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
import java.lang.Long;

public class User_UserBuilder_id_12749521561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2794;
     Object term2836;

    public User_UserBuilder_id_12749521561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2794 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term2832 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2794, term2794.getClass(), "id", -5892135042702373494L);
        setField(term2794, term2794.getClass(), "email", "XqgfKFvPSD");
        setField(term2794, term2794.getClass(), "login", "JiVRgTZvKc");
        setField(term2794, term2794.getClass(), "name", "XPKmummaqg");
        setIntField(term2832, term2832.getClass(), "year", 2024);
        setShortField(term2832, term2832.getClass(), "month", (short) 8);
        setShortField(term2832, term2832.getClass(), "day", (short) 31);
        setField(term2794, term2794.getClass(), "birthday", term2832);
        term2836 = new Long(5262507301787091109L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2836;
        callMethod(klass, "id", argTypes, term2794, args);
    }

};


