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

public class Meeting_setHost_115379894660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32463;

    public Meeting_setHost_115379894660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32463 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term32463, term32463.getClass(), "id", null);
        setField(term32463, term32463.getClass(), "createTime", null);
        setField(term32463, term32463.getClass(), "name", null);
        setField(term32463, term32463.getClass(), "link", null);
        setField(term32463, term32463.getClass(), "introduce", null);
        setField(term32463, term32463.getClass(), "updateTime", null);
        setField(term32463, term32463.getClass(), "meetingTime", null);
        setField(term32463, term32463.getClass(), "signTime", null);
        setField(term32463, term32463.getClass(), "signNumber", null);
        setField(term32463, term32463.getClass(), "userNumber", null);
        setField(term32463, term32463.getClass(), "fileUrl", null);
        setBooleanField(term32463, term32463.getClass(), "online", false);
        setField(term32463, term32463.getClass(), "deleted", null);
        setField(term32463, term32463.getClass(), "host", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHost", argTypes, term32463, args);
    }

};


