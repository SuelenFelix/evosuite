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

public class JobListDTO_setSkillName_210552143027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12601;

    public JobListDTO_setSkillName_210552143027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12601 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12601, term12601.getClass(), "jobId", null);
        setField(term12601, term12601.getClass(), "freelancerId", null);
        setField(term12601, term12601.getClass(), "freelancerName", null);
        setField(term12601, term12601.getClass(), "skillId", null);
        setField(term12601, term12601.getClass(), "skillName", null);
        setField(term12601, term12601.getClass(), "recruiterId", null);
        setField(term12601, term12601.getClass(), "recruiterName", null);
        setField(term12601, term12601.getClass(), "jobTitle", null);
        setField(term12601, term12601.getClass(), "jobDescription", null);
        setBooleanField(term12601, term12601.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSkillName", argTypes, term12601, args);
    }

};


