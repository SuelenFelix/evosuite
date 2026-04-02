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

public class JobDTO_setRecruiterId_244655116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6039;
     Object term6067;

    public JobDTO_setRecruiterId_244655116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6039 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term6039, term6039.getClass(), "freelancerid", 2L);
        setLongField(term6039, term6039.getClass(), "skillId", -4325723315152823407L);
        setLongField(term6039, term6039.getClass(), "recruiterId", 2535595959091595249L);
        setField(term6039, term6039.getClass(), "jobTitle", "lCyLIcSuom");
        setField(term6039, term6039.getClass(), "jobDescription", "CGOpQSZZwI");
        term6067 = new Long(-5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6067;
        callMethod(klass, "setRecruiterId", argTypes, term6039, args);
    }

};


