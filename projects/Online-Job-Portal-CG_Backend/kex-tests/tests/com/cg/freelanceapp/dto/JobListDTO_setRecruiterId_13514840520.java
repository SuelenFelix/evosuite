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

public class JobListDTO_setRecruiterId_13514840520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12467;
     Object term12537;

    public JobListDTO_setRecruiterId_13514840520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12468 = new Long(5319740127125920367L);
        Long term12470 = new Long(6465987664600701876L);
        Long term12484 = new Long(-136372844051852955L);
        Long term12498 = new Long(-7632759764262745126L);
        term12467 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term12467, term12467.getClass(), "jobId", term12468);
        setField(term12467, term12467.getClass(), "freelancerId", term12470);
        setField(term12467, term12467.getClass(), "freelancerName", "ZUdnQXfzCI");
        setField(term12467, term12467.getClass(), "skillId", term12484);
        setField(term12467, term12467.getClass(), "skillName", "EULDrUNQvw");
        setField(term12467, term12467.getClass(), "recruiterId", term12498);
        setField(term12467, term12467.getClass(), "recruiterName", "BtvAvsJSei");
        setField(term12467, term12467.getClass(), "jobTitle", "vqnBkkxoIa");
        setField(term12467, term12467.getClass(), "jobDescription", "bycpZjxXFn");
        setBooleanField(term12467, term12467.getClass(), "jobStatus", true);
        term12537 = new Long(3746481521207337771L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12537;
        callMethod(klass, "setRecruiterId", argTypes, term12467, args);
    }

};


