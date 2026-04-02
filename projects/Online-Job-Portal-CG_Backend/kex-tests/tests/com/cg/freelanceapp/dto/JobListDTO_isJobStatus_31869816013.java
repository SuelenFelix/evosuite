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

public class JobListDTO_isJobStatus_31869816013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11621;

    public JobListDTO_isJobStatus_31869816013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11622 = new Long(7998051124369147543L);
        Long term11624 = new Long(-1481367303699139651L);
        Long term11638 = new Long(-7709317346333670618L);
        Long term11652 = new Long(-1964501434345816975L);
        term11621 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term11621, term11621.getClass(), "jobId", term11622);
        setField(term11621, term11621.getClass(), "freelancerId", term11624);
        setField(term11621, term11621.getClass(), "freelancerName", "JWodNQzjjV");
        setField(term11621, term11621.getClass(), "skillId", term11638);
        setField(term11621, term11621.getClass(), "skillName", "CAgxWjhxNf");
        setField(term11621, term11621.getClass(), "recruiterId", term11652);
        setField(term11621, term11621.getClass(), "recruiterName", "goAoCMhKBu");
        setField(term11621, term11621.getClass(), "jobTitle", "BWxJSgKHRT");
        setField(term11621, term11621.getClass(), "jobDescription", "AGXoIndFnm");
        setBooleanField(term11621, term11621.getClass(), "jobStatus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isJobStatus", argTypes, term11621, args);
    }

};


