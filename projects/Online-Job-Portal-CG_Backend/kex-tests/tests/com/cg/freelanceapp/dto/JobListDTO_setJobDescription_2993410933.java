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

public class JobListDTO_setJobDescription_2993410933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12613;

    public JobListDTO_setJobDescription_2993410933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12613 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12613, term12613.getClass(), "jobId", null);
        setField(term12613, term12613.getClass(), "freelancerId", null);
        setField(term12613, term12613.getClass(), "freelancerName", null);
        setField(term12613, term12613.getClass(), "skillId", null);
        setField(term12613, term12613.getClass(), "skillName", null);
        setField(term12613, term12613.getClass(), "recruiterId", null);
        setField(term12613, term12613.getClass(), "recruiterName", null);
        setField(term12613, term12613.getClass(), "jobTitle", null);
        setField(term12613, term12613.getClass(), "jobDescription", null);
        setBooleanField(term12613, term12613.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setJobDescription", argTypes, term12613, args);
    }

};


