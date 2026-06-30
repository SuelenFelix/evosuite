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

public class JobListDTO_setJobTitle_15134279110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11217;

    public JobListDTO_setJobTitle_15134279110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11218 = new Long(24067105862153728L);
        Long term11220 = new Long(-8477368071089201577L);
        Long term11234 = new Long(-1526729287349763895L);
        Long term11248 = new Long(7017605765544766728L);
        term11217 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term11217, term11217.getClass(), "jobId", term11218);
        setField(term11217, term11217.getClass(), "freelancerId", term11220);
        setField(term11217, term11217.getClass(), "freelancerName", "vBnWPlsZMk");
        setField(term11217, term11217.getClass(), "skillId", term11234);
        setField(term11217, term11217.getClass(), "skillName", "fIZsWucfXz");
        setField(term11217, term11217.getClass(), "recruiterId", term11248);
        setField(term11217, term11217.getClass(), "recruiterName", "IApvtmfhnq");
        setField(term11217, term11217.getClass(), "jobTitle", "VSaNnhMpRc");
        setField(term11217, term11217.getClass(), "jobDescription", "QNjNTLlUaV");
        setBooleanField(term11217, term11217.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hIYsRyOZxk";
        callMethod(klass, "setJobTitle", argTypes, term11217, args);
    }

};


