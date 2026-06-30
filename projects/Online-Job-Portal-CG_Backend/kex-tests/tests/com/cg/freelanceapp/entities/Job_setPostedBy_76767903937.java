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

public class Job_setPostedBy_76767903937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10027;

    public Job_setPostedBy_76767903937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10027 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        setField(term10027, term10027.getClass(), "id", null);
        setField(term10027, term10027.getClass(), "jobTitle", null);
        setField(term10027, term10027.getClass(), "jobDescription", null);
        setField(term10027, term10027.getClass(), "skill", null);
        setField(term10027, term10027.getClass(), "postedBy", null);
        setField(term10027, term10027.getClass(), "postedDate", null);
        setField(term10027, term10027.getClass(), "awardedTo", null);
        setField(term10027, term10027.getClass(), "jobApplications", null);
        setField(term10027, term10027.getClass(), "active", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Job");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPostedBy", argTypes, term10027, args);
    }

};


