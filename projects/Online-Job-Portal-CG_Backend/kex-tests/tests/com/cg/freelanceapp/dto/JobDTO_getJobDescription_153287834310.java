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

public class JobDTO_getJobDescription_153287834310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6257;

    public JobDTO_getJobDescription_153287834310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6257 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term6257, term6257.getClass(), "freelancerid", 2L);
        setLongField(term6257, term6257.getClass(), "skillId", 8059786003080744426L);
        setLongField(term6257, term6257.getClass(), "recruiterId", -4365849114644724155L);
        setField(term6257, term6257.getClass(), "jobTitle", "onQLVONGuf");
        setField(term6257, term6257.getClass(), "jobDescription", "SOrEHbcbmn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobDescription", argTypes, term6257, args);
    }

};


