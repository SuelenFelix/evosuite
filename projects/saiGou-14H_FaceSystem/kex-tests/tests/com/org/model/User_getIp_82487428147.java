package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_getIp_82487428147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26499;

    public User_getIp_82487428147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26499 = newInstance(Class.forName("com.org.model.User"));
        setField(term26499, term26499.getClass(), "id", null);
        setField(term26499, term26499.getClass(), "email", null);
        setField(term26499, term26499.getClass(), "password", null);
        setField(term26499, term26499.getClass(), "username", null);
        setField(term26499, term26499.getClass(), "power", null);
        setField(term26499, term26499.getClass(), "nickname", null);
        setField(term26499, term26499.getClass(), "sex", null);
        setField(term26499, term26499.getClass(), "age", null);
        setField(term26499, term26499.getClass(), "phone", null);
        setField(term26499, term26499.getClass(), "faceUrl", null);
        setField(term26499, term26499.getClass(), "headUrl", null);
        setField(term26499, term26499.getClass(), "introduce", null);
        setField(term26499, term26499.getClass(), "ip", null);
        setField(term26499, term26499.getClass(), "meetings", null);
        setField(term26499, term26499.getClass(), "menus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIp", argTypes, term26499, args);
    }

};


