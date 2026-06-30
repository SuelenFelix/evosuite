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

public class JobListDTO_getJobDescription_36083167511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11359;

    public JobListDTO_getJobDescription_36083167511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11360 = new Long(-6078481855513028760L);
        Long term11362 = new Long(-6985556670871089725L);
        Long term11376 = new Long(-8469818909085103606L);
        Long term11390 = new Long(11315815278355083L);
        term11359 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term11359, term11359.getClass(), "jobId", term11360);
        setField(term11359, term11359.getClass(), "freelancerId", term11362);
        setField(term11359, term11359.getClass(), "freelancerName", "RjNoEywJbC");
        setField(term11359, term11359.getClass(), "skillId", term11376);
        setField(term11359, term11359.getClass(), "skillName", "RTTvrwwhou");
        setField(term11359, term11359.getClass(), "recruiterId", term11390);
        setField(term11359, term11359.getClass(), "recruiterName", "lRORwXipuk");
        setField(term11359, term11359.getClass(), "jobTitle", "fVdTcjgHdw");
        setField(term11359, term11359.getClass(), "jobDescription", "wwAwLLcLPp");
        setBooleanField(term11359, term11359.getClass(), "jobStatus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobDescription", argTypes, term11359, args);
    }

};


