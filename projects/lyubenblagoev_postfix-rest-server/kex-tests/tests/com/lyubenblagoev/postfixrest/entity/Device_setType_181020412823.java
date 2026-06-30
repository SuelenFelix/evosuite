package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Device_setType_181020412823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2785;

    public Device_setType_181020412823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2785 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        setField(term2785, term2785.getClass(), "user", null);
        setField(term2785, term2785.getClass(), "refreshToken", null);
        setField(term2785, term2785.getClass(), "refreshTokenExpirationDate", null);
        setField(term2785, term2785.getClass(), "remoteAddress", null);
        setField(term2785, term2785.getClass(), "type", null);
        setField(term2785, term2785.getClass(), "os", null);
        setField(term2785, term2785.getClass(), "id", null);
        setBooleanField(term2785, term2785.getClass(), "enabled", false);
        setField(term2785, term2785.getClass(), "created", null);
        setField(term2785, term2785.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term2785, args);
    }

};


