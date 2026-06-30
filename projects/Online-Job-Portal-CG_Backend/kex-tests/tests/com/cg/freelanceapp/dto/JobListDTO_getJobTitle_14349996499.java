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

public class JobListDTO_getJobTitle_14349996499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11097;

    public JobListDTO_getJobTitle_14349996499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11098 = new Long(-593735869267672817L);
        Long term11100 = new Long(6041374912351843923L);
        Long term11114 = new Long(2535970782317488741L);
        Long term11128 = new Long(-5258945362776941718L);
        term11097 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term11097, term11097.getClass(), "jobId", term11098);
        setField(term11097, term11097.getClass(), "freelancerId", term11100);
        setField(term11097, term11097.getClass(), "freelancerName", "QITgiBrmfj");
        setField(term11097, term11097.getClass(), "skillId", term11114);
        setField(term11097, term11097.getClass(), "skillName", "pXxkiXgQnq");
        setField(term11097, term11097.getClass(), "recruiterId", term11128);
        setField(term11097, term11097.getClass(), "recruiterName", "tKmrUDURku");
        setField(term11097, term11097.getClass(), "jobTitle", "JeZbrwZmsP");
        setField(term11097, term11097.getClass(), "jobDescription", "bxyfeicqrK");
        setBooleanField(term11097, term11097.getClass(), "jobStatus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobTitle", argTypes, term11097, args);
    }

};


