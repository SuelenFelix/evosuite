package com.cg.freelanceapp.serviceimpl;

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
import static com.cg.freelanceapp.serviceimpl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class JobApplicationServiceImpl_applyToJob_5687259981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686;

    public JobApplicationServiceImpl_applyToJob_5687259981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term687 = new Long(-2585684163342970173L);
        Long term701 = new Long(8059786003080744426L);
        term686 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO"));
        setField(term686, term686.getClass(), "jobId", term687);
        setField(term686, term686.getClass(), "coverLetter", "OclPbYPkcH");
        setField(term686, term686.getClass(), "freelancerId", term701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.JobApplicationServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO");
        Object[] args = new Object[1];
        args[0] = term686;
        callMethod(klass, "applyToJob", argTypes, null, args);
    }

};


