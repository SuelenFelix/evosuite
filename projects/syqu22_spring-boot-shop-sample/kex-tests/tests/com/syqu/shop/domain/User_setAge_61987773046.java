package com.syqu.shop.domain;

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
import static com.syqu.shop.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class User_setAge_61987773046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7846;
     Object term7849;

    public User_setAge_61987773046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7846 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        setLongField(term7846, term7846.getClass(), "id", 0L);
        setField(term7846, term7846.getClass(), "username", null);
        setField(term7846, term7846.getClass(), "email", null);
        setField(term7846, term7846.getClass(), "password", null);
        setField(term7846, term7846.getClass(), "passwordConfirm", null);
        setField(term7846, term7846.getClass(), "firstName", null);
        setField(term7846, term7846.getClass(), "lastName", null);
        setIntField(term7846, term7846.getClass(), "age", 0);
        setField(term7846, term7846.getClass(), "city", null);
        setField(term7846, term7846.getClass(), "gender", null);
        setField(term7846, term7846.getClass(), "balance", null);
        term7849 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7849;
        callMethod(klass, "setAge", argTypes, term7846, args);
    }

};


