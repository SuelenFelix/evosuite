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

public class Freelancer_getBookmarkedJobs_7646434757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26563;

    public Freelancer_getBookmarkedJobs_7646434757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26563 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term26563, term26563.getClass(), "id", null);
        setField(term26563, term26563.getClass(), "userName", null);
        setField(term26563, term26563.getClass(), "firstName", null);
        setField(term26563, term26563.getClass(), "lastName", null);
        setField(term26563, term26563.getClass(), "password", null);
        setField(term26563, term26563.getClass(), "appliedJobs", null);
        setField(term26563, term26563.getClass(), "feedbacks", null);
        setField(term26563, term26563.getClass(), "skills", null);
        setField(term26563, term26563.getClass(), "bookmarkedJobs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBookmarkedJobs", argTypes, term26563, args);
    }

};


