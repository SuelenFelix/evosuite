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

public class JobListDTO_getSkillName_19427639905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10573;

    public JobListDTO_getSkillName_19427639905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10574 = new Long(2209808079059619773L);
        Long term10576 = new Long(8403492202041709902L);
        Long term10590 = new Long(-113028659747841511L);
        Long term10604 = new Long(7271112616766426991L);
        term10573 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term10573, term10573.getClass(), "jobId", term10574);
        setField(term10573, term10573.getClass(), "freelancerId", term10576);
        setField(term10573, term10573.getClass(), "freelancerName", "XjDhvToxJy");
        setField(term10573, term10573.getClass(), "skillId", term10590);
        setField(term10573, term10573.getClass(), "skillName", "nxSTJflLQy");
        setField(term10573, term10573.getClass(), "recruiterId", term10604);
        setField(term10573, term10573.getClass(), "recruiterName", "FlHzxEfFzI");
        setField(term10573, term10573.getClass(), "jobTitle", "aSATgQUpoe");
        setField(term10573, term10573.getClass(), "jobDescription", "VkPSXewZfB");
        setBooleanField(term10573, term10573.getClass(), "jobStatus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillName", argTypes, term10573, args);
    }

};


