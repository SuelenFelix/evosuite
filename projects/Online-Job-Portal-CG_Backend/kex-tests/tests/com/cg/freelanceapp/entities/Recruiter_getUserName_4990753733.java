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

public class Recruiter_getUserName_4990753733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15557;

    public Recruiter_getUserName_4990753733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15557 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term15557, term15557.getClass(), "id", null);
        setField(term15557, term15557.getClass(), "userName", null);
        setField(term15557, term15557.getClass(), "firstName", null);
        setField(term15557, term15557.getClass(), "lastName", null);
        setField(term15557, term15557.getClass(), "password", null);
        setField(term15557, term15557.getClass(), "postedJobs", null);
        setField(term15557, term15557.getClass(), "feedbacks", null);
        setField(term15557, term15557.getClass(), "freelancers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term15557, args);
    }

};


