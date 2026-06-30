package com.cg.freelanceapp.dto;

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
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JobDTO_setFreelancerid_98891990118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6441;
     Object term6445;

    public JobDTO_setFreelancerid_98891990118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6441 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term6441, term6441.getClass(), "freelancerid", 0L);
        setLongField(term6441, term6441.getClass(), "skillId", 0L);
        setLongField(term6441, term6441.getClass(), "recruiterId", 0L);
        setField(term6441, term6441.getClass(), "jobTitle", null);
        setField(term6441, term6441.getClass(), "jobDescription", null);
        term6445 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6445;
        callMethod(klass, "setFreelancerid", argTypes, term6441, args);
    }

};


