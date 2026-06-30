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

public class JobListDTO_getJobTitle_143499964930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12607;

    public JobListDTO_getJobTitle_143499964930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12607 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12607, term12607.getClass(), "jobId", null);
        setField(term12607, term12607.getClass(), "freelancerId", null);
        setField(term12607, term12607.getClass(), "freelancerName", null);
        setField(term12607, term12607.getClass(), "skillId", null);
        setField(term12607, term12607.getClass(), "skillName", null);
        setField(term12607, term12607.getClass(), "recruiterId", null);
        setField(term12607, term12607.getClass(), "recruiterName", null);
        setField(term12607, term12607.getClass(), "jobTitle", null);
        setField(term12607, term12607.getClass(), "jobDescription", null);
        setBooleanField(term12607, term12607.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobTitle", argTypes, term12607, args);
    }

};


