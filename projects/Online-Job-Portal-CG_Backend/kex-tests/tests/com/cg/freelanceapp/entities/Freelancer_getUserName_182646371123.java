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

public class Freelancer_getUserName_182646371123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50618;

    public Freelancer_getUserName_182646371123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50618 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term50618, term50618.getClass(), "id", null);
        setField(term50618, term50618.getClass(), "userName", null);
        setField(term50618, term50618.getClass(), "firstName", null);
        setField(term50618, term50618.getClass(), "lastName", null);
        setField(term50618, term50618.getClass(), "password", null);
        setField(term50618, term50618.getClass(), "appliedJobs", null);
        setField(term50618, term50618.getClass(), "feedbacks", null);
        setField(term50618, term50618.getClass(), "skills", null);
        setField(term50618, term50618.getClass(), "bookmarkedJobs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term50618, args);
    }

};


