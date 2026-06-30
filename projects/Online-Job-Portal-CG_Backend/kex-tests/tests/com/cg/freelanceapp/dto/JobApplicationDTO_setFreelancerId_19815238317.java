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

public class JobApplicationDTO_setFreelancerId_19815238317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4140;
     Object term4157;

    public JobApplicationDTO_setFreelancerId_19815238317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4141 = new Long(-8708192233349544946L);
        Long term4155 = new Long(5907001541142728739L);
        term4140 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO"));
        setField(term4140, term4140.getClass(), "jobId", term4141);
        setField(term4140, term4140.getClass(), "coverLetter", "DyiXbeYIaN");
        setField(term4140, term4140.getClass(), "freelancerId", term4155);
        term4157 = new Long(4178434741742309755L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4157;
        callMethod(klass, "setFreelancerId", argTypes, term4140, args);
    }

};


