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

public class JobDTO_setFreelancerid_9889199015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5989;
     Object term6017;

    public JobDTO_setFreelancerid_9889199015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5989 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term5989, term5989.getClass(), "freelancerid", 2L);
        setLongField(term5989, term5989.getClass(), "skillId", 6967924379644551255L);
        setLongField(term5989, term5989.getClass(), "recruiterId", -2813493605142626659L);
        setField(term5989, term5989.getClass(), "jobTitle", "WZzvmIHhzZ");
        setField(term5989, term5989.getClass(), "jobDescription", "doQLHkjpNm");
        term6017 = new Long(-8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6017;
        callMethod(klass, "setFreelancerid", argTypes, term5989, args);
    }

};


