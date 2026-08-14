package com.zxl.dailypractice.project.entity;

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
import static com.zxl.dailypractice.project.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meetings_getContext_12553447433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;

    public Meetings_getContext_12553447433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term281 = new Integer(391863371);
        term280 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        Object term319 = newInstance(Class.forName("java.util.Date"));
        setField(term280, term280.getClass(), "id", term281);
        setField(term280, term280.getClass(), "people", "MxlszYVzRf");
        setField(term280, term280.getClass(), "subject", "LQFpaHEwXR");
        setField(term280, term280.getClass(), "context", "oVcInYnLWB");
        setLongField(term319, term319.getClass(), "fastTime", 1606045635837L);
        setField(term319, term319.getClass(), "cdate", null);
        setField(term280, term280.getClass(), "time", term319);
        setField(term280, term280.getClass(), "remark", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContext", argTypes, term280, args);
    }

};


