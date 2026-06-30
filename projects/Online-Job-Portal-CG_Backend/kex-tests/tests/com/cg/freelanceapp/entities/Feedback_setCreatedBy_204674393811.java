package com.cg.freelanceapp.entities;

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
import static com.cg.freelanceapp.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Feedback_setCreatedBy_204674393811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2755;

    public Feedback_setCreatedBy_204674393811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2755 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term2755, term2755.getClass(), "id", null);
        setField(term2755, term2755.getClass(), "ranges", null);
        setField(term2755, term2755.getClass(), "comments", null);
        setField(term2755, term2755.getClass(), "createdBy", null);
        setField(term2755, term2755.getClass(), "createdFor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Feedback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatedBy", argTypes, term2755, args);
    }

};


