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

public class JobApplicationsListDTO_setFreelancerUName_165375218612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5392;

    public JobApplicationsListDTO_setFreelancerUName_165375218612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5393 = new Long(-1983291584002806658L);
        Long term5395 = new Long(5946780097489996391L);
        Long term5421 = new Long(-8652538484981166496L);
        term5392 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term5392, term5392.getClass(), "id", term5393);
        setField(term5392, term5392.getClass(), "jobId", term5395);
        setField(term5392, term5392.getClass(), "jobTitle", "HBGNxdNURv");
        setField(term5392, term5392.getClass(), "coverLetter", "mfCpTPPQQm");
        setField(term5392, term5392.getClass(), "freelancerId", term5421);
        setField(term5392, term5392.getClass(), "freelancerName", "OcJCIDNIXA");
        setField(term5392, term5392.getClass(), "freelancerUName", "XfRABIFVEp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MHGKyEnwKc";
        callMethod(klass, "setFreelancerUName", argTypes, term5392, args);
    }

};


