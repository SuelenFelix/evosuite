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

public class Freelancer_setLastName_58773305838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28844;

    public Freelancer_setLastName_58773305838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28844 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term28844, term28844.getClass(), "id", null);
        setField(term28844, term28844.getClass(), "userName", null);
        setField(term28844, term28844.getClass(), "firstName", null);
        setField(term28844, term28844.getClass(), "lastName", null);
        setField(term28844, term28844.getClass(), "password", null);
        setField(term28844, term28844.getClass(), "appliedJobs", null);
        setField(term28844, term28844.getClass(), "feedbacks", null);
        setField(term28844, term28844.getClass(), "skills", null);
        setField(term28844, term28844.getClass(), "bookmarkedJobs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastName", argTypes, term28844, args);
    }

};


