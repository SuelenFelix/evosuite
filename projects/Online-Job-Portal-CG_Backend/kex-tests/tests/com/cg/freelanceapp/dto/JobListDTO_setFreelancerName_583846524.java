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

public class JobListDTO_setFreelancerName_583846524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10431;

    public JobListDTO_setFreelancerName_583846524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10432 = new Long(8708846223293804408L);
        Long term10434 = new Long(-2986201902216133814L);
        Long term10448 = new Long(4255811647459029682L);
        Long term10462 = new Long(8000844860910174690L);
        term10431 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term10431, term10431.getClass(), "jobId", term10432);
        setField(term10431, term10431.getClass(), "freelancerId", term10434);
        setField(term10431, term10431.getClass(), "freelancerName", "KtuuNAqGCQ");
        setField(term10431, term10431.getClass(), "skillId", term10448);
        setField(term10431, term10431.getClass(), "skillName", "OGQsfjmReM");
        setField(term10431, term10431.getClass(), "recruiterId", term10462);
        setField(term10431, term10431.getClass(), "recruiterName", "YsUtbngnRO");
        setField(term10431, term10431.getClass(), "jobTitle", "JisaWUxcNb");
        setField(term10431, term10431.getClass(), "jobDescription", "NxgmYPzWCI");
        setBooleanField(term10431, term10431.getClass(), "jobStatus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SqjyKmayBx";
        callMethod(klass, "setFreelancerName", argTypes, term10431, args);
    }

};


