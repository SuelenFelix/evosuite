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

public class JobApplication_getAppliedDate_195095878018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45726;

    public JobApplication_getAppliedDate_195095878018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45726 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term45726, term45726.getClass(), "id", null);
        setField(term45726, term45726.getClass(), "job", null);
        setField(term45726, term45726.getClass(), "freelancer", null);
        setField(term45726, term45726.getClass(), "appliedDate", null);
        setField(term45726, term45726.getClass(), "coverLetter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppliedDate", argTypes, term45726, args);
    }

};


