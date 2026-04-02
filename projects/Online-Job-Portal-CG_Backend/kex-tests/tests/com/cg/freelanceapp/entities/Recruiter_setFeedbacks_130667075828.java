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

public class Recruiter_setFeedbacks_130667075828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18704;

    public Recruiter_setFeedbacks_130667075828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18704 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term18704, term18704.getClass(), "id", null);
        setField(term18704, term18704.getClass(), "userName", null);
        setField(term18704, term18704.getClass(), "firstName", null);
        setField(term18704, term18704.getClass(), "lastName", null);
        setField(term18704, term18704.getClass(), "password", null);
        setField(term18704, term18704.getClass(), "postedJobs", null);
        setField(term18704, term18704.getClass(), "feedbacks", null);
        setField(term18704, term18704.getClass(), "freelancers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFeedbacks", argTypes, term18704, args);
    }

};


