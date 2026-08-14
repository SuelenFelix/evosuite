package com.demo.bootcamp.model;

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
import static com.demo.bootcamp.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TestDetailResponse_setTestEntity_2277976552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term75;

    public TestDetailResponse_setTestEntity_2277976552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("com.demo.bootcamp.model.TestDetailResponse"));
        Object term49 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term49, term49.getClass(), "id", 1162663216);
        setField(term49, term49.getClass(), "name", "MuLcgQHgqz");
        setField(term49, term49.getClass(), "info", "xxtlPwDYFs");
        setField(term48, term48.getClass(), "testEntity", term49);
        term75 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term75, term75.getClass(), "id", 1484323161);
        setField(term75, term75.getClass(), "name", "jJCZpVmanW");
        setField(term75, term75.getClass(), "info", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.demo.bootcamp.model.TestDetailResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.demo.bootcamp.model.jpa.TestEntity");
        Object[] args = new Object[1];
        args[0] = term75;
        callMethod(klass, "setTestEntity", argTypes, term48, args);
    }

};


