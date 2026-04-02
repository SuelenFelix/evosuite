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

public class Device_getRemoteAddress_107484504020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2779;

    public Device_getRemoteAddress_107484504020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2779 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        setField(term2779, term2779.getClass(), "user", null);
        setField(term2779, term2779.getClass(), "refreshToken", null);
        setField(term2779, term2779.getClass(), "refreshTokenExpirationDate", null);
        setField(term2779, term2779.getClass(), "remoteAddress", null);
        setField(term2779, term2779.getClass(), "type", null);
        setField(term2779, term2779.getClass(), "os", null);
        setField(term2779, term2779.getClass(), "id", null);
        setBooleanField(term2779, term2779.getClass(), "enabled", false);
        setField(term2779, term2779.getClass(), "created", null);
        setField(term2779, term2779.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRemoteAddress", argTypes, term2779, args);
    }

};


