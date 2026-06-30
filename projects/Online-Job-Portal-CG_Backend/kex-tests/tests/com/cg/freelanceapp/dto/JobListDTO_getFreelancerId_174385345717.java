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

public class JobListDTO_getFreelancerId_174385345717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12105;

    public JobListDTO_getFreelancerId_174385345717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12106 = new Long(-5951743062322506095L);
        Long term12108 = new Long(768144790810175653L);
        Long term12122 = new Long(-1497280900081695731L);
        Long term12136 = new Long(-3602825674339018793L);
        term12105 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12105, term12105.getClass(), "jobId", term12106);
        setField(term12105, term12105.getClass(), "freelancerId", term12108);
        setField(term12105, term12105.getClass(), "freelancerName", "DAujxZPHJC");
        setField(term12105, term12105.getClass(), "skillId", term12122);
        setField(term12105, term12105.getClass(), "skillName", "IlBhdrCvHq");
        setField(term12105, term12105.getClass(), "recruiterId", term12136);
        setField(term12105, term12105.getClass(), "recruiterName", "OirVUQhauU");
        setField(term12105, term12105.getClass(), "jobTitle", "GLbyDfbNZI");
        setField(term12105, term12105.getClass(), "jobDescription", "oNLcCYDAsO");
        setBooleanField(term12105, term12105.getClass(), "jobStatus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerId", argTypes, term12105, args);
    }

};


