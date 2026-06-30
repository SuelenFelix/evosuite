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

public class Device_getUser_199379470914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2767;

    public Device_getUser_199379470914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2767 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        setField(term2767, term2767.getClass(), "user", null);
        setField(term2767, term2767.getClass(), "refreshToken", null);
        setField(term2767, term2767.getClass(), "refreshTokenExpirationDate", null);
        setField(term2767, term2767.getClass(), "remoteAddress", null);
        setField(term2767, term2767.getClass(), "type", null);
        setField(term2767, term2767.getClass(), "os", null);
        setField(term2767, term2767.getClass(), "id", null);
        setBooleanField(term2767, term2767.getClass(), "enabled", false);
        setField(term2767, term2767.getClass(), "created", null);
        setField(term2767, term2767.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term2767, args);
    }

};


