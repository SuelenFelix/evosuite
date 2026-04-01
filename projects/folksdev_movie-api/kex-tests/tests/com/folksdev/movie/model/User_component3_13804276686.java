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

public class User_component3_13804276686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28316;

    public User_component3_13804276686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28343 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28344 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28345 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28346 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28347 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28344, term28344.getClass(), "userId", null);
        setField(term28344, term28344.getClass(), "reviewId", null);
        setField(term28343, term28343.getClass(), "userReviewId", term28344);
        setField(term28345, term28345.getClass(), "id", null);
        setField(term28345, term28345.getClass(), "name", null);
        setField(term28345, term28345.getClass(), "userReviews", null);
        setField(term28343, term28343.getClass(), "user", term28345);
        setField(term28346, term28346.getClass(), "id", null);
        setField(term28346, term28346.getClass(), "review", null);
        setField(term28346, term28346.getClass(), "userReviews", null);
        setField(term28343, term28343.getClass(), "review", term28346);
        setField(term28347, term28347.getClass(), "date", null);
        setField(term28347, term28347.getClass(), "time", null);
        setField(term28343, term28343.getClass(), "date", term28347);
        Object term28348 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28349 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28350 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28351 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28352 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28349, term28349.getClass(), "userId", null);
        setField(term28349, term28349.getClass(), "reviewId", null);
        setField(term28348, term28348.getClass(), "userReviewId", term28349);
        setField(term28350, term28350.getClass(), "id", null);
        setField(term28350, term28350.getClass(), "name", null);
        setField(term28350, term28350.getClass(), "userReviews", null);
        setField(term28348, term28348.getClass(), "user", term28350);
        setField(term28351, term28351.getClass(), "id", null);
        setField(term28351, term28351.getClass(), "review", null);
        setField(term28351, term28351.getClass(), "userReviews", null);
        setField(term28348, term28348.getClass(), "review", term28351);
        setField(term28352, term28352.getClass(), "date", null);
        setField(term28352, term28352.getClass(), "time", null);
        setField(term28348, term28348.getClass(), "date", term28352);
        Object term28353 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28354 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28355 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28356 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28357 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28354, term28354.getClass(), "userId", null);
        setField(term28354, term28354.getClass(), "reviewId", null);
        setField(term28353, term28353.getClass(), "userReviewId", term28354);
        setField(term28355, term28355.getClass(), "id", null);
        setField(term28355, term28355.getClass(), "name", null);
        setField(term28355, term28355.getClass(), "userReviews", null);
        setField(term28353, term28353.getClass(), "user", term28355);
        setField(term28356, term28356.getClass(), "id", null);
        setField(term28356, term28356.getClass(), "review", null);
        setField(term28356, term28356.getClass(), "userReviews", null);
        setField(term28353, term28353.getClass(), "review", term28356);
        setField(term28357, term28357.getClass(), "date", null);
        setField(term28357, term28357.getClass(), "time", null);
        setField(term28353, term28353.getClass(), "date", term28357);
        Object term28358 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28359 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28360 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28361 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28362 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28359, term28359.getClass(), "userId", null);
        setField(term28359, term28359.getClass(), "reviewId", null);
        setField(term28358, term28358.getClass(), "userReviewId", term28359);
        setField(term28360, term28360.getClass(), "id", null);
        setField(term28360, term28360.getClass(), "name", null);
        setField(term28360, term28360.getClass(), "userReviews", null);
        setField(term28358, term28358.getClass(), "user", term28360);
        setField(term28361, term28361.getClass(), "id", null);
        setField(term28361, term28361.getClass(), "review", null);
        setField(term28361, term28361.getClass(), "userReviews", null);
        setField(term28358, term28358.getClass(), "review", term28361);
        setField(term28362, term28362.getClass(), "date", null);
        setField(term28362, term28362.getClass(), "time", null);
        setField(term28358, term28358.getClass(), "date", term28362);
        ArrayList term28341 = new ArrayList();
        ((ArrayList) term28341).add(term28343);
        ((ArrayList) term28341).add(term28348);
        ((ArrayList) term28341).add(term28353);
        ((ArrayList) term28341).add(term28358);
        term28316 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28316, term28316.getClass(), "id", "CFojehEtAR");
        setField(term28316, term28316.getClass(), "name", "EYeLeoxDrM");
        setField(term28316, term28316.getClass(), "userReviews", term28341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term28316, args);
    }

};


