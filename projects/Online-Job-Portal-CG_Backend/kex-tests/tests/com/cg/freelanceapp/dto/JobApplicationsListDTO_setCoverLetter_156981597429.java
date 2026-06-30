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

public class JobApplicationsListDTO_setCoverLetter_156981597429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5734;

    public JobApplicationsListDTO_setCoverLetter_156981597429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5734 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term5734, term5734.getClass(), "id", null);
        setField(term5734, term5734.getClass(), "jobId", null);
        setField(term5734, term5734.getClass(), "jobTitle", null);
        setField(term5734, term5734.getClass(), "coverLetter", null);
        setField(term5734, term5734.getClass(), "freelancerId", null);
        setField(term5734, term5734.getClass(), "freelancerName", null);
        setField(term5734, term5734.getClass(), "freelancerUName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCoverLetter", argTypes, term5734, args);
    }

};


