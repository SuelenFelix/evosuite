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

public class JobDTO_setSkillId_5810395397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6089;
     Object term6117;

    public JobDTO_setSkillId_5810395397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6089 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term6089, term6089.getClass(), "freelancerid", 2L);
        setLongField(term6089, term6089.getClass(), "skillId", -872011222785455006L);
        setLongField(term6089, term6089.getClass(), "recruiterId", -316468845751588286L);
        setField(term6089, term6089.getClass(), "jobTitle", "ypEdrstygY");
        setField(term6089, term6089.getClass(), "jobDescription", "sNQFlATEeQ");
        term6117 = new Long(5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6117;
        callMethod(klass, "setSkillId", argTypes, term6089, args);
    }

};


