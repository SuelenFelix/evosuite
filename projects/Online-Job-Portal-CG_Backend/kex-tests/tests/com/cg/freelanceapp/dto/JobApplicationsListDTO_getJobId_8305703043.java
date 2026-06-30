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

public class JobApplicationsListDTO_getJobId_8305703043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4489;

    public JobApplicationsListDTO_getJobId_8305703043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4490 = new Long(-2850532706972744550L);
        Long term4492 = new Long(-2644215923136513282L);
        Long term4518 = new Long(-1468719814009985452L);
        term4489 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term4489, term4489.getClass(), "id", term4490);
        setField(term4489, term4489.getClass(), "jobId", term4492);
        setField(term4489, term4489.getClass(), "jobTitle", "DhjNLmRMCu");
        setField(term4489, term4489.getClass(), "coverLetter", "PgPzMSEjjX");
        setField(term4489, term4489.getClass(), "freelancerId", term4518);
        setField(term4489, term4489.getClass(), "freelancerName", "wzsPSPcRdj");
        setField(term4489, term4489.getClass(), "freelancerUName", "kGMQdqJYyB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobId", argTypes, term4489, args);
    }

};


