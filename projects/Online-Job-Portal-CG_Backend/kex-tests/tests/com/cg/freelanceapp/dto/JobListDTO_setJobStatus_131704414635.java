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
import java.lang.Boolean;

public class JobListDTO_setJobStatus_131704414635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12617;
     Object term12619;

    public JobListDTO_setJobStatus_131704414635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12617 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12617, term12617.getClass(), "jobId", null);
        setField(term12617, term12617.getClass(), "freelancerId", null);
        setField(term12617, term12617.getClass(), "freelancerName", null);
        setField(term12617, term12617.getClass(), "skillId", null);
        setField(term12617, term12617.getClass(), "skillName", null);
        setField(term12617, term12617.getClass(), "recruiterId", null);
        setField(term12617, term12617.getClass(), "recruiterName", null);
        setField(term12617, term12617.getClass(), "jobTitle", null);
        setField(term12617, term12617.getClass(), "jobDescription", null);
        setBooleanField(term12617, term12617.getClass(), "jobStatus", false);
        term12619 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term12619;
        callMethod(klass, "setJobStatus", argTypes, term12617, args);
    }

};


