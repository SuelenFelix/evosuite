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

public class JobApplicationsListDTO_setJobId_2772242024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4584;
     Object term4639;

    public JobApplicationsListDTO_setJobId_2772242024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4585 = new Long(-7738503207562305297L);
        Long term4587 = new Long(3825396310311739952L);
        Long term4613 = new Long(-3838084482494604218L);
        term4584 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term4584, term4584.getClass(), "id", term4585);
        setField(term4584, term4584.getClass(), "jobId", term4587);
        setField(term4584, term4584.getClass(), "jobTitle", "XJJNClzHRf");
        setField(term4584, term4584.getClass(), "coverLetter", "HDaezxQfQR");
        setField(term4584, term4584.getClass(), "freelancerId", term4613);
        setField(term4584, term4584.getClass(), "freelancerName", "iikZEapDlu");
        setField(term4584, term4584.getClass(), "freelancerUName", "nhoHrZfnIN");
        term4639 = new Long(3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4639;
        callMethod(klass, "setJobId", argTypes, term4584, args);
    }

};


