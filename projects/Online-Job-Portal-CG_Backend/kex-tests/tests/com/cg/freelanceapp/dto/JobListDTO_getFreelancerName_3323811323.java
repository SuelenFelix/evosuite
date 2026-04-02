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

public class JobListDTO_getFreelancerName_3323811323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10311;

    public JobListDTO_getFreelancerName_3323811323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10312 = new Long(4069264186851023313L);
        Long term10314 = new Long(5184635470881147510L);
        Long term10328 = new Long(918397384129253729L);
        Long term10342 = new Long(-2187638136407967948L);
        term10311 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term10311, term10311.getClass(), "jobId", term10312);
        setField(term10311, term10311.getClass(), "freelancerId", term10314);
        setField(term10311, term10311.getClass(), "freelancerName", "IpmgwHTgnG");
        setField(term10311, term10311.getClass(), "skillId", term10328);
        setField(term10311, term10311.getClass(), "skillName", "tIpkeYIezR");
        setField(term10311, term10311.getClass(), "recruiterId", term10342);
        setField(term10311, term10311.getClass(), "recruiterName", "YkZtEtthvz");
        setField(term10311, term10311.getClass(), "jobTitle", "dwlZSxlXOo");
        setField(term10311, term10311.getClass(), "jobDescription", "lKrEAkypza");
        setBooleanField(term10311, term10311.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerName", argTypes, term10311, args);
    }

};


