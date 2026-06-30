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

public class Job_getActive_160031833625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10015;

    public Job_getActive_160031833625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10015 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        setField(term10015, term10015.getClass(), "id", null);
        setField(term10015, term10015.getClass(), "jobTitle", null);
        setField(term10015, term10015.getClass(), "jobDescription", null);
        setField(term10015, term10015.getClass(), "skill", null);
        setField(term10015, term10015.getClass(), "postedBy", null);
        setField(term10015, term10015.getClass(), "postedDate", null);
        setField(term10015, term10015.getClass(), "awardedTo", null);
        setField(term10015, term10015.getClass(), "jobApplications", null);
        setField(term10015, term10015.getClass(), "active", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Job");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActive", argTypes, term10015, args);
    }

};


