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

public class User_UserBuilder_id_10156222281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1790;
     Object term1833;

    public User_UserBuilder_id_10156222281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1791 = new Long(6617340557564669657L);
        term1790 = newInstance(Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder"));
        Object term1829 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1790, term1790.getClass(), "id", term1791);
        setField(term1790, term1790.getClass(), "email", "bLPjGVBhlX");
        setField(term1790, term1790.getClass(), "login", "whBvTVIIlC");
        setField(term1790, term1790.getClass(), "name", "IgRJUzaCwW");
        setIntField(term1829, term1829.getClass(), "year", 2029);
        setShortField(term1829, term1829.getClass(), "month", (short) 8);
        setShortField(term1829, term1829.getClass(), "day", (short) 28);
        setField(term1790, term1790.getClass(), "birthday", term1829);
        term1833 = new Long(1439298019805881866L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.yandex.practicum.filmorate.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1833;
        callMethod(klass, "id", argTypes, term1790, args);
    }

};


