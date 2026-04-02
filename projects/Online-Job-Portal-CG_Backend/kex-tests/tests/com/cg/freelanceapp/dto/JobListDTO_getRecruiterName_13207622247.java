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

public class JobListDTO_getRecruiterName_13207622247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10835;

    public JobListDTO_getRecruiterName_13207622247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10836 = new Long(-5656664340499957324L);
        Long term10838 = new Long(-5460517064177800852L);
        Long term10852 = new Long(-5242567610844514867L);
        Long term10866 = new Long(-2951854704066477061L);
        term10835 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term10835, term10835.getClass(), "jobId", term10836);
        setField(term10835, term10835.getClass(), "freelancerId", term10838);
        setField(term10835, term10835.getClass(), "freelancerName", "AyrEXuGrEj");
        setField(term10835, term10835.getClass(), "skillId", term10852);
        setField(term10835, term10835.getClass(), "skillName", "yevIIoVYHq");
        setField(term10835, term10835.getClass(), "recruiterId", term10866);
        setField(term10835, term10835.getClass(), "recruiterName", "UuYWMTqWTV");
        setField(term10835, term10835.getClass(), "jobTitle", "DSFGlcaXUb");
        setField(term10835, term10835.getClass(), "jobDescription", "sHMXNUzNeM");
        setBooleanField(term10835, term10835.getClass(), "jobStatus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecruiterName", argTypes, term10835, args);
    }

};


