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

public class Feedback_getComments_128162915717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3485;

    public Feedback_getComments_128162915717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3485 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term3485, term3485.getClass(), "id", null);
        setField(term3485, term3485.getClass(), "ranges", null);
        setField(term3485, term3485.getClass(), "comments", null);
        setField(term3485, term3485.getClass(), "createdBy", null);
        setField(term3485, term3485.getClass(), "createdFor", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Feedback");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComments", argTypes, term3485, args);
    }

};


