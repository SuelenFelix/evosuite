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

public class User_setLastName_9568111945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7843;

    public User_setLastName_9568111945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7843 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        setLongField(term7843, term7843.getClass(), "id", 0L);
        setField(term7843, term7843.getClass(), "username", null);
        setField(term7843, term7843.getClass(), "email", null);
        setField(term7843, term7843.getClass(), "password", null);
        setField(term7843, term7843.getClass(), "passwordConfirm", null);
        setField(term7843, term7843.getClass(), "firstName", null);
        setField(term7843, term7843.getClass(), "lastName", null);
        setIntField(term7843, term7843.getClass(), "age", 0);
        setField(term7843, term7843.getClass(), "city", null);
        setField(term7843, term7843.getClass(), "gender", null);
        setField(term7843, term7843.getClass(), "balance", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastName", argTypes, term7843, args);
    }

};


