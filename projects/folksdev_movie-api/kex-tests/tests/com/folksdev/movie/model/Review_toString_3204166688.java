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
import java.util.ArrayList;
import java.lang.Object;

public class Review_toString_3204166688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29403;

    public Review_toString_3204166688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29430 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29431 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29432 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29433 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29434 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29431, term29431.getClass(), "userId", null);
        setField(term29431, term29431.getClass(), "reviewId", null);
        setField(term29430, term29430.getClass(), "userReviewId", term29431);
        setField(term29432, term29432.getClass(), "id", null);
        setField(term29432, term29432.getClass(), "name", null);
        setField(term29432, term29432.getClass(), "userReviews", null);
        setField(term29430, term29430.getClass(), "user", term29432);
        setField(term29433, term29433.getClass(), "id", null);
        setField(term29433, term29433.getClass(), "review", null);
        setField(term29433, term29433.getClass(), "userReviews", null);
        setField(term29430, term29430.getClass(), "review", term29433);
        setField(term29434, term29434.getClass(), "date", null);
        setField(term29434, term29434.getClass(), "time", null);
        setField(term29430, term29430.getClass(), "date", term29434);
        Object term29435 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29436 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29437 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29438 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29436, term29436.getClass(), "userId", null);
        setField(term29436, term29436.getClass(), "reviewId", null);
        setField(term29435, term29435.getClass(), "userReviewId", term29436);
        setField(term29437, term29437.getClass(), "id", null);
        setField(term29437, term29437.getClass(), "name", null);
        setField(term29437, term29437.getClass(), "userReviews", null);
        setField(term29435, term29435.getClass(), "user", term29437);
        setField(term29435, term29435.getClass(), "review", term29433);
        setField(term29438, term29438.getClass(), "date", null);
        setField(term29438, term29438.getClass(), "time", null);
        setField(term29435, term29435.getClass(), "date", term29438);
        ArrayList term29428 = new ArrayList();
        ((ArrayList) term29428).add(term29430);
        ((ArrayList) term29428).add(term29435);
        term29403 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29403, term29403.getClass(), "id", "lqucbHOiHE");
        setField(term29403, term29403.getClass(), "review", "AtnEadrVWF");
        setField(term29403, term29403.getClass(), "userReviews", term29428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29403, args);
    }

};


