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
     Object term29405;

    public Review_toString_3204166688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29432 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29433 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29434 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29435 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29436 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29433, term29433.getClass(), "userId", null);
        setField(term29433, term29433.getClass(), "reviewId", null);
        setField(term29432, term29432.getClass(), "userReviewId", term29433);
        setField(term29434, term29434.getClass(), "id", null);
        setField(term29434, term29434.getClass(), "name", null);
        setField(term29434, term29434.getClass(), "userReviews", null);
        setField(term29432, term29432.getClass(), "user", term29434);
        setField(term29435, term29435.getClass(), "id", null);
        setField(term29435, term29435.getClass(), "review", null);
        setField(term29435, term29435.getClass(), "userReviews", null);
        setField(term29432, term29432.getClass(), "review", term29435);
        setField(term29436, term29436.getClass(), "date", null);
        setField(term29436, term29436.getClass(), "time", null);
        setField(term29432, term29432.getClass(), "date", term29436);
        Object term29437 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29438 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29439 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29440 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29438, term29438.getClass(), "userId", null);
        setField(term29438, term29438.getClass(), "reviewId", null);
        setField(term29437, term29437.getClass(), "userReviewId", term29438);
        setField(term29439, term29439.getClass(), "id", null);
        setField(term29439, term29439.getClass(), "name", null);
        setField(term29439, term29439.getClass(), "userReviews", null);
        setField(term29437, term29437.getClass(), "user", term29439);
        setField(term29437, term29437.getClass(), "review", term29435);
        setField(term29440, term29440.getClass(), "date", null);
        setField(term29440, term29440.getClass(), "time", null);
        setField(term29437, term29437.getClass(), "date", term29440);
        ArrayList term29430 = new ArrayList();
        ((ArrayList) term29430).add(term29432);
        ((ArrayList) term29430).add(term29437);
        term29405 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29405, term29405.getClass(), "id", "lqucbHOiHE");
        setField(term29405, term29405.getClass(), "review", "AtnEadrVWF");
        setField(term29405, term29405.getClass(), "userReviews", term29430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29405, args);
    }

};


