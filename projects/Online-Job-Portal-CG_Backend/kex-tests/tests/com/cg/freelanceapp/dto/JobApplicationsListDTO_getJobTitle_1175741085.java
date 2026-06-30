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

public class JobApplicationsListDTO_getJobTitle_1175741085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4681;

    public JobApplicationsListDTO_getJobTitle_1175741085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4682 = new Long(5953383087795962419L);
        Long term4684 = new Long(7994303628307559416L);
        Long term4710 = new Long(2443640364875054177L);
        term4681 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO"));
        setField(term4681, term4681.getClass(), "id", term4682);
        setField(term4681, term4681.getClass(), "jobId", term4684);
        setField(term4681, term4681.getClass(), "jobTitle", "ZkMALXpEAZ");
        setField(term4681, term4681.getClass(), "coverLetter", "tXfQjSqDzN");
        setField(term4681, term4681.getClass(), "freelancerId", term4710);
        setField(term4681, term4681.getClass(), "freelancerName", "BjugTaMcxJ");
        setField(term4681, term4681.getClass(), "freelancerUName", "vGiuZVPJNH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationsListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobTitle", argTypes, term4681, args);
    }

};


