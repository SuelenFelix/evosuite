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

public class JobApplicationsListDTO_setFreelancerName_149418910525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5730;

    public JobApplicationsListDTO_setFreelancerName_149418910525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5730 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term5730, term5730.getClass(), "id", null);
        setField(term5730, term5730.getClass(), "jobId", null);
        setField(term5730, term5730.getClass(), "jobTitle", null);
        setField(term5730, term5730.getClass(), "coverLetter", null);
        setField(term5730, term5730.getClass(), "freelancerId", null);
        setField(term5730, term5730.getClass(), "freelancerName", null);
        setField(term5730, term5730.getClass(), "freelancerUName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFreelancerName", argTypes, term5730, args);
    }

};


