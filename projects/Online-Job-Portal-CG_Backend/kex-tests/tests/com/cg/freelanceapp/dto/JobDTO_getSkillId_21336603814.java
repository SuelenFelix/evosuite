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

public class JobDTO_getSkillId_21336603814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5941;

    public JobDTO_getSkillId_21336603814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5941 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term5941, term5941.getClass(), "freelancerid", 2L);
        setLongField(term5941, term5941.getClass(), "skillId", 6811161968424632369L);
        setLongField(term5941, term5941.getClass(), "recruiterId", -7237588299778557629L);
        setField(term5941, term5941.getClass(), "jobTitle", "CKWpJaaaxX");
        setField(term5941, term5941.getClass(), "jobDescription", "UBRmXJmfrt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term5941, args);
    }

};


