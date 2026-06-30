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

public class Freelancer_setSkills_140632840620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50617;

    public Freelancer_setSkills_140632840620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50617 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term50617, term50617.getClass(), "id", null);
        setField(term50617, term50617.getClass(), "userName", null);
        setField(term50617, term50617.getClass(), "firstName", null);
        setField(term50617, term50617.getClass(), "lastName", null);
        setField(term50617, term50617.getClass(), "password", null);
        setField(term50617, term50617.getClass(), "appliedJobs", null);
        setField(term50617, term50617.getClass(), "feedbacks", null);
        setField(term50617, term50617.getClass(), "skills", null);
        setField(term50617, term50617.getClass(), "bookmarkedJobs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSkills", argTypes, term50617, args);
    }

};


