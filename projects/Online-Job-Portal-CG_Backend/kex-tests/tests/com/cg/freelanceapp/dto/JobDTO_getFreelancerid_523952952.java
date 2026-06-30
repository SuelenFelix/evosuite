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

public class JobDTO_getFreelancerid_523952952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5845;

    public JobDTO_getFreelancerid_523952952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5845 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term5845, term5845.getClass(), "freelancerid", 2L);
        setLongField(term5845, term5845.getClass(), "skillId", -8400487765614892086L);
        setLongField(term5845, term5845.getClass(), "recruiterId", 5270370404989704783L);
        setField(term5845, term5845.getClass(), "jobTitle", "vOuMEpOQAg");
        setField(term5845, term5845.getClass(), "jobDescription", "SIODFGaQhr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancerid", argTypes, term5845, args);
    }

};


