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

public class Department_setDepartments_157676533914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2822;

    public Department_setDepartments_157676533914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2822 = newInstance(Class.forName("com.org.model.Department"));
        setField(term2822, term2822.getClass(), "id", null);
        setField(term2822, term2822.getClass(), "partname", null);
        setField(term2822, term2822.getClass(), "addr", null);
        setField(term2822, term2822.getClass(), "introduce", null);
        setField(term2822, term2822.getClass(), "parentid", null);
        setField(term2822, term2822.getClass(), "departments", null);
        setField(term2822, term2822.getClass(), "users", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDepartments", argTypes, term2822, args);
    }

};


