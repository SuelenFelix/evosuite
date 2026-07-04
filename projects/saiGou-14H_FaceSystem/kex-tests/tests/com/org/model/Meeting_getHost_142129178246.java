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

public class Meeting_getHost_142129178246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32433;

    public Meeting_getHost_142129178246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32433 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term32433, term32433.getClass(), "id", null);
        setField(term32433, term32433.getClass(), "createTime", null);
        setField(term32433, term32433.getClass(), "name", null);
        setField(term32433, term32433.getClass(), "link", null);
        setField(term32433, term32433.getClass(), "introduce", null);
        setField(term32433, term32433.getClass(), "updateTime", null);
        setField(term32433, term32433.getClass(), "meetingTime", null);
        setField(term32433, term32433.getClass(), "signTime", null);
        setField(term32433, term32433.getClass(), "signNumber", null);
        setField(term32433, term32433.getClass(), "userNumber", null);
        setField(term32433, term32433.getClass(), "fileUrl", null);
        setBooleanField(term32433, term32433.getClass(), "online", false);
        setField(term32433, term32433.getClass(), "deleted", null);
        setField(term32433, term32433.getClass(), "host", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term32433, args);
    }

};


