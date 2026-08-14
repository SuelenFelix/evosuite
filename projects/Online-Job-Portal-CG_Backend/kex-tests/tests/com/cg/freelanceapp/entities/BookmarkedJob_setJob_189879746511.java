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

public class BookmarkedJob_setJob_189879746511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13016;

    public BookmarkedJob_setJob_189879746511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13016 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term13016, term13016.getClass(), "id", null);
        setField(term13016, term13016.getClass(), "skill", null);
        setField(term13016, term13016.getClass(), "job", null);
        setField(term13016, term13016.getClass(), "freelancer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.BookmarkedJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Job");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setJob", argTypes, term13016, args);
    }

};


