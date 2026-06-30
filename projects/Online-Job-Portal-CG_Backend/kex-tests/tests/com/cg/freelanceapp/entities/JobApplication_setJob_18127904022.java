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

public class JobApplication_setJob_18127904022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25662;

    public JobApplication_setJob_18127904022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25662 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term25662, term25662.getClass(), "id", null);
        setField(term25662, term25662.getClass(), "job", null);
        setField(term25662, term25662.getClass(), "freelancer", null);
        setField(term25662, term25662.getClass(), "appliedDate", null);
        setField(term25662, term25662.getClass(), "coverLetter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Job");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setJob", argTypes, term25662, args);
    }

};


