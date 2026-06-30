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

public class JobListDTO_setSkillId_47035664516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11983;
     Object term12053;

    public JobListDTO_setSkillId_47035664516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11984 = new Long(-5935517391653614345L);
        Long term11986 = new Long(-6521561238735301071L);
        Long term12000 = new Long(-6609679920238945303L);
        Long term12014 = new Long(-7296330380944173376L);
        term11983 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term11983, term11983.getClass(), "jobId", term11984);
        setField(term11983, term11983.getClass(), "freelancerId", term11986);
        setField(term11983, term11983.getClass(), "freelancerName", "vLTbaoAxBm");
        setField(term11983, term11983.getClass(), "skillId", term12000);
        setField(term11983, term11983.getClass(), "skillName", "BXTjEyEZxD");
        setField(term11983, term11983.getClass(), "recruiterId", term12014);
        setField(term11983, term11983.getClass(), "recruiterName", "oKhVzOKUFW");
        setField(term11983, term11983.getClass(), "jobTitle", "mNHyqmOAFy");
        setField(term11983, term11983.getClass(), "jobDescription", "UxgSdhxPCH");
        setBooleanField(term11983, term11983.getClass(), "jobStatus", true);
        term12053 = new Long(-8890284990655172580L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12053;
        callMethod(klass, "setSkillId", argTypes, term11983, args);
    }

};


