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

public class JobApplicationDTO_setCoverLetter_11195757294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4035;

    public JobApplicationDTO_setCoverLetter_11195757294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4036 = new Long(-5892135042702373494L);
        Long term4050 = new Long(5262507301787091109L);
        term4035 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO"));
        setField(term4035, term4035.getClass(), "jobId", term4036);
        setField(term4035, term4035.getClass(), "coverLetter", "lihXWlGDxk");
        setField(term4035, term4035.getClass(), "freelancerId", term4050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JmcmxoGhIK";
        callMethod(klass, "setCoverLetter", argTypes, term4035, args);
    }

};


