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
import java.lang.Boolean;

public class Meeting_setOnline_136523451458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32457;
     Object term32459;

    public Meeting_setOnline_136523451458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32457 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term32457, term32457.getClass(), "id", null);
        setField(term32457, term32457.getClass(), "createTime", null);
        setField(term32457, term32457.getClass(), "name", null);
        setField(term32457, term32457.getClass(), "link", null);
        setField(term32457, term32457.getClass(), "introduce", null);
        setField(term32457, term32457.getClass(), "updateTime", null);
        setField(term32457, term32457.getClass(), "meetingTime", null);
        setField(term32457, term32457.getClass(), "signTime", null);
        setField(term32457, term32457.getClass(), "signNumber", null);
        setField(term32457, term32457.getClass(), "userNumber", null);
        setField(term32457, term32457.getClass(), "fileUrl", null);
        setBooleanField(term32457, term32457.getClass(), "online", false);
        setField(term32457, term32457.getClass(), "deleted", null);
        setField(term32457, term32457.getClass(), "host", null);
        term32459 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term32459;
        callMethod(klass, "setOnline", argTypes, term32457, args);
    }

};


