package com.folksdev.movie.model;

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
import static com.folksdev.movie.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserReviewId_toString_151855585016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25552;

    public UserReviewId_toString_151855585016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25552 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        setField(term25552, term25552.getClass(), "userId", null);
        setField(term25552, term25552.getClass(), "reviewId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReviewId");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25552, args);
    }

};


