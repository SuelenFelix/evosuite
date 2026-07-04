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

public class Meeting_setName_99514649549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32439;

    public Meeting_setName_99514649549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32439 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term32439, term32439.getClass(), "id", null);
        setField(term32439, term32439.getClass(), "createTime", null);
        setField(term32439, term32439.getClass(), "name", null);
        setField(term32439, term32439.getClass(), "link", null);
        setField(term32439, term32439.getClass(), "introduce", null);
        setField(term32439, term32439.getClass(), "updateTime", null);
        setField(term32439, term32439.getClass(), "meetingTime", null);
        setField(term32439, term32439.getClass(), "signTime", null);
        setField(term32439, term32439.getClass(), "signNumber", null);
        setField(term32439, term32439.getClass(), "userNumber", null);
        setField(term32439, term32439.getClass(), "fileUrl", null);
        setBooleanField(term32439, term32439.getClass(), "online", false);
        setField(term32439, term32439.getClass(), "deleted", null);
        setField(term32439, term32439.getClass(), "host", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term32439, args);
    }

};


