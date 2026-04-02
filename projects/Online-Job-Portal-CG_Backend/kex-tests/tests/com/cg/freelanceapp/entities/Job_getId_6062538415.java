package com.cg.freelanceapp.entities;

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
import static com.cg.freelanceapp.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Job_getId_6062538415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4779;

    public Job_getId_6062538415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4779 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        setField(term4779, term4779.getClass(), "id", null);
        setField(term4779, term4779.getClass(), "jobTitle", null);
        setField(term4779, term4779.getClass(), "jobDescription", null);
        setField(term4779, term4779.getClass(), "skill", null);
        setField(term4779, term4779.getClass(), "postedBy", null);
        setField(term4779, term4779.getClass(), "postedDate", null);
        setField(term4779, term4779.getClass(), "awardedTo", null);
        setField(term4779, term4779.getClass(), "jobApplications", null);
        setField(term4779, term4779.getClass(), "active", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4779, args);
    }

};


