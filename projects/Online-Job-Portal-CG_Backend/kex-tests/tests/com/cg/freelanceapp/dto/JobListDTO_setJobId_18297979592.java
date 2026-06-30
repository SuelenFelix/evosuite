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

public class JobListDTO_setJobId_18297979592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10189;
     Object term10259;

    public JobListDTO_setJobId_18297979592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10190 = new Long(-4714000263923324167L);
        Long term10192 = new Long(6906379511067694917L);
        Long term10206 = new Long(-9204303423581447271L);
        Long term10220 = new Long(6248239231585852341L);
        term10189 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term10189, term10189.getClass(), "jobId", term10190);
        setField(term10189, term10189.getClass(), "freelancerId", term10192);
        setField(term10189, term10189.getClass(), "freelancerName", "MnovcqFhCl");
        setField(term10189, term10189.getClass(), "skillId", term10206);
        setField(term10189, term10189.getClass(), "skillName", "qYtAeLzOhW");
        setField(term10189, term10189.getClass(), "recruiterId", term10220);
        setField(term10189, term10189.getClass(), "recruiterName", "tJzmOfcUnY");
        setField(term10189, term10189.getClass(), "jobTitle", "TKlccZUpjz");
        setField(term10189, term10189.getClass(), "jobDescription", "GGzwMoHZXC");
        setBooleanField(term10189, term10189.getClass(), "jobStatus", false);
        term10259 = new Long(-88538481937688851L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term10259;
        callMethod(klass, "setJobId", argTypes, term10189, args);
    }

};


