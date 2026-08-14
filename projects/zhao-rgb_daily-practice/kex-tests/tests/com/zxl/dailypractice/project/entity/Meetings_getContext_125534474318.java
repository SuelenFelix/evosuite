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

public class Meetings_getContext_125534474318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1397;

    public Meetings_getContext_125534474318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1397 = newInstance(Class.forName("com.zxl.dailypractice.project.entity.Meetings"));
        setField(term1397, term1397.getClass(), "id", null);
        setField(term1397, term1397.getClass(), "people", null);
        setField(term1397, term1397.getClass(), "subject", null);
        setField(term1397, term1397.getClass(), "context", null);
        setField(term1397, term1397.getClass(), "time", null);
        setField(term1397, term1397.getClass(), "remark", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.project.entity.Meetings");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContext", argTypes, term1397, args);
    }

};


