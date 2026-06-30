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

public class JobApplication_setFreelancer_160498191216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45725;

    public JobApplication_setFreelancer_160498191216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45725 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term45725, term45725.getClass(), "id", null);
        setField(term45725, term45725.getClass(), "job", null);
        setField(term45725, term45725.getClass(), "freelancer", null);
        setField(term45725, term45725.getClass(), "appliedDate", null);
        setField(term45725, term45725.getClass(), "coverLetter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFreelancer", argTypes, term45725, args);
    }

};


