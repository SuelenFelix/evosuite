package com.cg.freelanceapp.serviceimpl;

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
import static com.cg.freelanceapp.serviceimpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JobServiceImpl_postJob_12147506334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public JobServiceImpl_postJob_12147506334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term237, term237.getClass(), "freelancerid", 2L);
        setLongField(term237, term237.getClass(), "skillId", 2442117782898005296L);
        setLongField(term237, term237.getClass(), "recruiterId", 6375119433582206027L);
        setField(term237, term237.getClass(), "jobTitle", "NRdvgJlhkX");
        setField(term237, term237.getClass(), "jobDescription", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.JobServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Object[] args = new Object[1];
        args[0] = term237;
        callMethod(klass, "postJob", argTypes, null, args);
    }

};


