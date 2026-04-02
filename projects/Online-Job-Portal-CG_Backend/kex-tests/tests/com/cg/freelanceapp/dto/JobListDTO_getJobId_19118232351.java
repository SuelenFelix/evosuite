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

public class JobListDTO_getJobId_19118232351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10069;

    public JobListDTO_getJobId_19118232351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10070 = new Long(-67485388932970712L);
        Long term10072 = new Long(5806367330808555223L);
        Long term10086 = new Long(4576699120365923235L);
        Long term10100 = new Long(-1635471392209071620L);
        term10069 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term10069, term10069.getClass(), "jobId", term10070);
        setField(term10069, term10069.getClass(), "freelancerId", term10072);
        setField(term10069, term10069.getClass(), "freelancerName", "huVIXUWLtI");
        setField(term10069, term10069.getClass(), "skillId", term10086);
        setField(term10069, term10069.getClass(), "skillName", "vhKzFyKPOT");
        setField(term10069, term10069.getClass(), "recruiterId", term10100);
        setField(term10069, term10069.getClass(), "recruiterName", "nQhIgWXdRc");
        setField(term10069, term10069.getClass(), "jobTitle", "EusenEbIoF");
        setField(term10069, term10069.getClass(), "jobDescription", "SScVQYSvWH");
        setBooleanField(term10069, term10069.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term10069, args);
    }

};


