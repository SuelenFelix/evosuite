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

public class Device_getOs_82214612624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2787;

    public Device_getOs_82214612624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2787 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Device"));
        setField(term2787, term2787.getClass(), "user", null);
        setField(term2787, term2787.getClass(), "refreshToken", null);
        setField(term2787, term2787.getClass(), "refreshTokenExpirationDate", null);
        setField(term2787, term2787.getClass(), "remoteAddress", null);
        setField(term2787, term2787.getClass(), "type", null);
        setField(term2787, term2787.getClass(), "os", null);
        setField(term2787, term2787.getClass(), "id", null);
        setBooleanField(term2787, term2787.getClass(), "enabled", false);
        setField(term2787, term2787.getClass(), "created", null);
        setField(term2787, term2787.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Device");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOs", argTypes, term2787, args);
    }

};


