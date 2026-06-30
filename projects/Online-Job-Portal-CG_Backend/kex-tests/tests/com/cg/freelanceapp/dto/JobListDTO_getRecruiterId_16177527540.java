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

public class JobListDTO_getRecruiterId_16177527540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12629;

    public JobListDTO_getRecruiterId_16177527540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12629 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12629, term12629.getClass(), "jobId", null);
        setField(term12629, term12629.getClass(), "freelancerId", null);
        setField(term12629, term12629.getClass(), "freelancerName", null);
        setField(term12629, term12629.getClass(), "skillId", null);
        setField(term12629, term12629.getClass(), "skillName", null);
        setField(term12629, term12629.getClass(), "recruiterId", null);
        setField(term12629, term12629.getClass(), "recruiterName", null);
        setField(term12629, term12629.getClass(), "jobTitle", null);
        setField(term12629, term12629.getClass(), "jobDescription", null);
        setBooleanField(term12629, term12629.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecruiterId", argTypes, term12629, args);
    }

};


