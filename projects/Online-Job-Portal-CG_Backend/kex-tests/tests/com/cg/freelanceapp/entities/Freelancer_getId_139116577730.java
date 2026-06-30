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

public class Freelancer_getId_139116577730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28836;

    public Freelancer_getId_139116577730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28836 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term28836, term28836.getClass(), "id", null);
        setField(term28836, term28836.getClass(), "userName", null);
        setField(term28836, term28836.getClass(), "firstName", null);
        setField(term28836, term28836.getClass(), "lastName", null);
        setField(term28836, term28836.getClass(), "password", null);
        setField(term28836, term28836.getClass(), "appliedJobs", null);
        setField(term28836, term28836.getClass(), "feedbacks", null);
        setField(term28836, term28836.getClass(), "skills", null);
        setField(term28836, term28836.getClass(), "bookmarkedJobs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term28836, args);
    }

};


