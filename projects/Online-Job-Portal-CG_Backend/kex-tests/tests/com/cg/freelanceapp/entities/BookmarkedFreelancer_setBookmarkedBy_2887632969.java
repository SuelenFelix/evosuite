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

public class BookmarkedFreelancer_setBookmarkedBy_2887632969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14639;

    public BookmarkedFreelancer_setBookmarkedBy_2887632969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14639 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        setField(term14639, term14639.getClass(), "id", null);
        setField(term14639, term14639.getClass(), "freelancer", null);
        setField(term14639, term14639.getClass(), "bookmarkedBy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBookmarkedBy", argTypes, term14639, args);
    }

};


