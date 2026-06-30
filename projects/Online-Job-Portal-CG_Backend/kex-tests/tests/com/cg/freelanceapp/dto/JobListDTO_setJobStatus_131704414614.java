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
import java.lang.Boolean;

public class JobListDTO_setJobStatus_131704414614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11741;
     Object term11811;

    public JobListDTO_setJobStatus_131704414614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11742 = new Long(4689907154423223972L);
        Long term11744 = new Long(8512025621149521819L);
        Long term11758 = new Long(2022482096970820459L);
        Long term11772 = new Long(6315101499811179240L);
        term11741 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobListDTO"));
        setField(term11741, term11741.getClass(), "jobId", term11742);
        setField(term11741, term11741.getClass(), "freelancerId", term11744);
        setField(term11741, term11741.getClass(), "freelancerName", "mwmFMNEzkK");
        setField(term11741, term11741.getClass(), "skillId", term11758);
        setField(term11741, term11741.getClass(), "skillName", "kVAmKknVln");
        setField(term11741, term11741.getClass(), "recruiterId", term11772);
        setField(term11741, term11741.getClass(), "recruiterName", "MRFLbEGYKG");
        setField(term11741, term11741.getClass(), "jobTitle", "BYrGukTyof");
        setField(term11741, term11741.getClass(), "jobDescription", "jiCGTTzKGB");
        setBooleanField(term11741, term11741.getClass(), "jobStatus", false);
        term11811 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11811;
        callMethod(klass, "setJobStatus", argTypes, term11741, args);
    }

};


