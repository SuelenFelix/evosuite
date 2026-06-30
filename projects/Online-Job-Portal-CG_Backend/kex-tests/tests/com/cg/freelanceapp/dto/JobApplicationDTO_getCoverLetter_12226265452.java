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

public class JobApplicationDTO_getCoverLetter_12226265452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3981;

    public JobApplicationDTO_getCoverLetter_12226265452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3982 = new Long(-4502405999831680926L);
        Long term3996 = new Long(1967728129628047933L);
        term3981 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO"));
        setField(term3981, term3981.getClass(), "jobId", term3982);
        setField(term3981, term3981.getClass(), "coverLetter", "xtftXXMbem");
        setField(term3981, term3981.getClass(), "freelancerId", term3996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobApplicationDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoverLetter", argTypes, term3981, args);
    }

};


