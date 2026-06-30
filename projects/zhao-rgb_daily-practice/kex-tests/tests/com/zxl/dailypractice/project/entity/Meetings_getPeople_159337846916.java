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

public class Meetings_getPeople_159337846916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1395;

    public Meetings_getPeople_159337846916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1395 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        setField(term1395, term1395.getClass(), "id", null);
        setField(term1395, term1395.getClass(), "people", null);
        setField(term1395, term1395.getClass(), "subject", null);
        setField(term1395, term1395.getClass(), "context", null);
        setField(term1395, term1395.getClass(), "time", null);
        setField(term1395, term1395.getClass(), "remark", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPeople", argTypes, term1395, args);
    }

};


