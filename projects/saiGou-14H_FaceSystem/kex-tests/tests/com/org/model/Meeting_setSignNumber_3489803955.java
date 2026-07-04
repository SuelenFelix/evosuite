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

public class Meeting_setSignNumber_3489803955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32451;

    public Meeting_setSignNumber_3489803955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32451 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term32451, term32451.getClass(), "id", null);
        setField(term32451, term32451.getClass(), "createTime", null);
        setField(term32451, term32451.getClass(), "name", null);
        setField(term32451, term32451.getClass(), "link", null);
        setField(term32451, term32451.getClass(), "introduce", null);
        setField(term32451, term32451.getClass(), "updateTime", null);
        setField(term32451, term32451.getClass(), "meetingTime", null);
        setField(term32451, term32451.getClass(), "signTime", null);
        setField(term32451, term32451.getClass(), "signNumber", null);
        setField(term32451, term32451.getClass(), "userNumber", null);
        setField(term32451, term32451.getClass(), "fileUrl", null);
        setBooleanField(term32451, term32451.getClass(), "online", false);
        setField(term32451, term32451.getClass(), "deleted", null);
        setField(term32451, term32451.getClass(), "host", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSignNumber", argTypes, term32451, args);
    }

};


