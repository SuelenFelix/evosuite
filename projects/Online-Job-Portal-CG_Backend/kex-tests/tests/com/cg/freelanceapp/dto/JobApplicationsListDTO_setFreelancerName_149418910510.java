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

public class JobApplicationsListDTO_setFreelancerName_149418910510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5180;

    public JobApplicationsListDTO_setFreelancerName_149418910510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5181 = new Long(-5963439350418910964L);
        Long term5183 = new Long(9013624480170062917L);
        Long term5209 = new Long(7862575738391801707L);
        term5180 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term5180, term5180.getClass(), "id", term5181);
        setField(term5180, term5180.getClass(), "jobId", term5183);
        setField(term5180, term5180.getClass(), "jobTitle", "wKWbJssZuG");
        setField(term5180, term5180.getClass(), "coverLetter", "NzBMMhkhpT");
        setField(term5180, term5180.getClass(), "freelancerId", term5209);
        setField(term5180, term5180.getClass(), "freelancerName", "qCpEbQDHdF");
        setField(term5180, term5180.getClass(), "freelancerUName", "AHbZyFOmlo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TwfWVQGiIj";
        callMethod(klass, "setFreelancerName", argTypes, term5180, args);
    }

};


