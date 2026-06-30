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

public class Recruiter_getUserName_49907537323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27357;

    public Recruiter_getUserName_49907537323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27357 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term27357, term27357.getClass(), "id", null);
        setField(term27357, term27357.getClass(), "userName", null);
        setField(term27357, term27357.getClass(), "firstName", null);
        setField(term27357, term27357.getClass(), "lastName", null);
        setField(term27357, term27357.getClass(), "password", null);
        setField(term27357, term27357.getClass(), "postedJobs", null);
        setField(term27357, term27357.getClass(), "feedbacks", null);
        setField(term27357, term27357.getClass(), "freelancers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term27357, args);
    }

};


