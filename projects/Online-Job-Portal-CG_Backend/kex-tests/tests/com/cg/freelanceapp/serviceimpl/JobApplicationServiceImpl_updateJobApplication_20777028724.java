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

public class JobApplicationServiceImpl_updateJobApplication_20777028724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715;
     Object term717;

    public JobApplicationServiceImpl_updateJobApplication_20777028724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715 = new Long(2486810210675247493L);
        Long term718 = new Long(7009926388951271268L);
        Long term732 = new Long(-7672528020740371001L);
        term717 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO"));
        setField(term717, term717.getClass(), "jobId", term718);
        setField(term717, term717.getClass(), "coverLetter", "IoAlmYsBwc");
        setField(term717, term717.getClass(), "freelancerId", term732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.serviceimpl.JobApplicationServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO");
        Object[] args = new Object[2];
        args[0] = term715;
        args[1] = term717;
        callMethod(klass, "updateJobApplication", argTypes, null, args);
    }

};


