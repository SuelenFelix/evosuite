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

public class Freelancer_setFeedbacks_66275745435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28841;

    public Freelancer_setFeedbacks_66275745435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28841 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term28841, term28841.getClass(), "id", null);
        setField(term28841, term28841.getClass(), "userName", null);
        setField(term28841, term28841.getClass(), "firstName", null);
        setField(term28841, term28841.getClass(), "lastName", null);
        setField(term28841, term28841.getClass(), "password", null);
        setField(term28841, term28841.getClass(), "appliedJobs", null);
        setField(term28841, term28841.getClass(), "feedbacks", null);
        setField(term28841, term28841.getClass(), "skills", null);
        setField(term28841, term28841.getClass(), "bookmarkedJobs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFeedbacks", argTypes, term28841, args);
    }

};


