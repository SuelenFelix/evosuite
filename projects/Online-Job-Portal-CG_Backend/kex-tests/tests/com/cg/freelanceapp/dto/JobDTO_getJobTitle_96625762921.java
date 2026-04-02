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

public class JobDTO_getJobTitle_96625762921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6459;

    public JobDTO_getJobTitle_96625762921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6459 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term6459, term6459.getClass(), "freelancerid", 0L);
        setLongField(term6459, term6459.getClass(), "skillId", 0L);
        setLongField(term6459, term6459.getClass(), "recruiterId", 0L);
        setField(term6459, term6459.getClass(), "jobTitle", null);
        setField(term6459, term6459.getClass(), "jobDescription", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobTitle", argTypes, term6459, args);
    }

};


