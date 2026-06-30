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

public class JobApplicationsListDTO_setFreelancerId_18632032208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4988;
     Object term5043;

    public JobApplicationsListDTO_setFreelancerId_18632032208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4989 = new Long(-8654565919063661957L);
        Long term4991 = new Long(-5248475803419977214L);
        Long term5017 = new Long(-6723783499250797216L);
        term4988 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term4988, term4988.getClass(), "id", term4989);
        setField(term4988, term4988.getClass(), "jobId", term4991);
        setField(term4988, term4988.getClass(), "jobTitle", "PCipZnmBOF");
        setField(term4988, term4988.getClass(), "coverLetter", "zcorEihhLK");
        setField(term4988, term4988.getClass(), "freelancerId", term5017);
        setField(term4988, term4988.getClass(), "freelancerName", "GrqozDKFOk");
        setField(term4988, term4988.getClass(), "freelancerUName", "CFyoseFGLF");
        term5043 = new Long(41775768178052008L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5043;
        callMethod(klass, "setFreelancerId", argTypes, term4988, args);
    }

};


