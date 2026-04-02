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

public class JobListDTO_getRecruiterName_132076222428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12603;

    public JobListDTO_getRecruiterName_132076222428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12603 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12603, term12603.getClass(), "jobId", null);
        setField(term12603, term12603.getClass(), "freelancerId", null);
        setField(term12603, term12603.getClass(), "freelancerName", null);
        setField(term12603, term12603.getClass(), "skillId", null);
        setField(term12603, term12603.getClass(), "skillName", null);
        setField(term12603, term12603.getClass(), "recruiterId", null);
        setField(term12603, term12603.getClass(), "recruiterName", null);
        setField(term12603, term12603.getClass(), "jobTitle", null);
        setField(term12603, term12603.getClass(), "jobDescription", null);
        setBooleanField(term12603, term12603.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecruiterName", argTypes, term12603, args);
    }

};


