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

public class Meeting_setUpdateTime_74787209652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32445;

    public Meeting_setUpdateTime_74787209652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32445 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term32445, term32445.getClass(), "id", null);
        setField(term32445, term32445.getClass(), "createTime", null);
        setField(term32445, term32445.getClass(), "name", null);
        setField(term32445, term32445.getClass(), "link", null);
        setField(term32445, term32445.getClass(), "introduce", null);
        setField(term32445, term32445.getClass(), "updateTime", null);
        setField(term32445, term32445.getClass(), "meetingTime", null);
        setField(term32445, term32445.getClass(), "signTime", null);
        setField(term32445, term32445.getClass(), "signNumber", null);
        setField(term32445, term32445.getClass(), "userNumber", null);
        setField(term32445, term32445.getClass(), "fileUrl", null);
        setBooleanField(term32445, term32445.getClass(), "online", false);
        setField(term32445, term32445.getClass(), "deleted", null);
        setField(term32445, term32445.getClass(), "host", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpdateTime", argTypes, term32445, args);
    }

};


