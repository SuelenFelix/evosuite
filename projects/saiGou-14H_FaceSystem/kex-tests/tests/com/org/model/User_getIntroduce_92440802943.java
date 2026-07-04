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

public class User_getIntroduce_92440802943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26470;

    public User_getIntroduce_92440802943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26470 = newInstance(Class.forName("com.org.model.User"));
        setField(term26470, term26470.getClass(), "id", null);
        setField(term26470, term26470.getClass(), "email", null);
        setField(term26470, term26470.getClass(), "password", null);
        setField(term26470, term26470.getClass(), "username", null);
        setField(term26470, term26470.getClass(), "power", null);
        setField(term26470, term26470.getClass(), "nickname", null);
        setField(term26470, term26470.getClass(), "sex", null);
        setField(term26470, term26470.getClass(), "age", null);
        setField(term26470, term26470.getClass(), "phone", null);
        setField(term26470, term26470.getClass(), "faceUrl", null);
        setField(term26470, term26470.getClass(), "headUrl", null);
        setField(term26470, term26470.getClass(), "introduce", null);
        setField(term26470, term26470.getClass(), "ip", null);
        setField(term26470, term26470.getClass(), "meetings", null);
        setField(term26470, term26470.getClass(), "menus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntroduce", argTypes, term26470, args);
    }

};


