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

public class Meeting_setCreateTime_172815733148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32437;

    public Meeting_setCreateTime_172815733148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32437 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term32437, term32437.getClass(), "id", null);
        setField(term32437, term32437.getClass(), "createTime", null);
        setField(term32437, term32437.getClass(), "name", null);
        setField(term32437, term32437.getClass(), "link", null);
        setField(term32437, term32437.getClass(), "introduce", null);
        setField(term32437, term32437.getClass(), "updateTime", null);
        setField(term32437, term32437.getClass(), "meetingTime", null);
        setField(term32437, term32437.getClass(), "signTime", null);
        setField(term32437, term32437.getClass(), "signNumber", null);
        setField(term32437, term32437.getClass(), "userNumber", null);
        setField(term32437, term32437.getClass(), "fileUrl", null);
        setBooleanField(term32437, term32437.getClass(), "online", false);
        setField(term32437, term32437.getClass(), "deleted", null);
        setField(term32437, term32437.getClass(), "host", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreateTime", argTypes, term32437, args);
    }

};


