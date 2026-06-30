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

public class JobDTO_getRecruiterId_18522801253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5893;

    public JobDTO_getRecruiterId_18522801253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5893 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term5893, term5893.getClass(), "freelancerid", 2L);
        setLongField(term5893, term5893.getClass(), "skillId", 7411271909051562686L);
        setLongField(term5893, term5893.getClass(), "recruiterId", 4872422362414183754L);
        setField(term5893, term5893.getClass(), "jobTitle", "qYzsiuXOgS");
        setField(term5893, term5893.getClass(), "jobDescription", "bxrCBbrrct");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRecruiterId", argTypes, term5893, args);
    }

};


