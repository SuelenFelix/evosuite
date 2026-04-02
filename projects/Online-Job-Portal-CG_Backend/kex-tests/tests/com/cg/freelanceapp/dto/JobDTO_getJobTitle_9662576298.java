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

public class JobDTO_getJobTitle_9662576298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6139;

    public JobDTO_getJobTitle_9662576298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6139 = newInstance(Class.forName("com.cg.freelanceapp.dto.JobDTO"));
        setLongField(term6139, term6139.getClass(), "freelancerid", 2L);
        setLongField(term6139, term6139.getClass(), "skillId", -6573104506744284592L);
        setLongField(term6139, term6139.getClass(), "recruiterId", -4920224193275732920L);
        setField(term6139, term6139.getClass(), "jobTitle", "ZKMLioamsY");
        setField(term6139, term6139.getClass(), "jobDescription", "WVbxuoDBcn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.JobDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJobTitle", argTypes, term6139, args);
    }

};


