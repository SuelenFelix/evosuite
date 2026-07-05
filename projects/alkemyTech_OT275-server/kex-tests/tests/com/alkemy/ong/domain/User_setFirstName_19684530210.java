package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_setFirstName_19684530210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21275;

    public User_setFirstName_19684530210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21276 = new Long(-9079706905309751984L);
        Long term21339 = new Long(-2080067238602928154L);
        term21275 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term21338 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term21275, term21275.getClass(), "id", term21276);
        setField(term21275, term21275.getClass(), "firstName", "bLpZNCaWDB");
        setField(term21275, term21275.getClass(), "lastName", "knmwCEeMTY");
        setField(term21275, term21275.getClass(), "email", "qTiIgMQXbW");
        setField(term21275, term21275.getClass(), "password", "rARmHDyRHE");
        setField(term21275, term21275.getClass(), "imageUrl", "bvybTJUNMY");
        setField(term21338, term21338.getClass(), "id", term21339);
        setField(term21338, term21338.getClass(), "name", "MoGyMoOkMi");
        setField(term21338, term21338.getClass(), "description", "qDEvNqJeGg");
        setField(term21275, term21275.getClass(), "role", term21338);
        setField(term21275, term21275.getClass(), "token", "fUxWNxirZc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vHkrNjGRyv";
        callMethod(klass, "setFirstName", argTypes, term21275, args);
    }

};


