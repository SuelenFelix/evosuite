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

public class User_getMenus_110380116746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26473;

    public User_getMenus_110380116746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26473 = newInstance(Class.forName("com.org.model.User"));
        setField(term26473, term26473.getClass(), "id", null);
        setField(term26473, term26473.getClass(), "email", null);
        setField(term26473, term26473.getClass(), "password", null);
        setField(term26473, term26473.getClass(), "username", null);
        setField(term26473, term26473.getClass(), "power", null);
        setField(term26473, term26473.getClass(), "nickname", null);
        setField(term26473, term26473.getClass(), "sex", null);
        setField(term26473, term26473.getClass(), "age", null);
        setField(term26473, term26473.getClass(), "phone", null);
        setField(term26473, term26473.getClass(), "faceUrl", null);
        setField(term26473, term26473.getClass(), "headUrl", null);
        setField(term26473, term26473.getClass(), "introduce", null);
        setField(term26473, term26473.getClass(), "ip", null);
        setField(term26473, term26473.getClass(), "meetings", null);
        setField(term26473, term26473.getClass(), "menus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMenus", argTypes, term26473, args);
    }

};


