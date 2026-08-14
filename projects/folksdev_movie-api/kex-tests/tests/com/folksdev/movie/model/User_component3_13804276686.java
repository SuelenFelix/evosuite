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
     Object term28317;

    public User_component3_13804276686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28344 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28345 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28346 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28347 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28348 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28345, term28345.getClass(), "userId", null);
        setField(term28345, term28345.getClass(), "reviewId", null);
        setField(term28344, term28344.getClass(), "userReviewId", term28345);
        setField(term28346, term28346.getClass(), "id", null);
        setField(term28346, term28346.getClass(), "name", null);
        setField(term28346, term28346.getClass(), "userReviews", null);
        setField(term28344, term28344.getClass(), "user", term28346);
        setField(term28347, term28347.getClass(), "id", null);
        setField(term28347, term28347.getClass(), "review", null);
        setField(term28347, term28347.getClass(), "userReviews", null);
        setField(term28344, term28344.getClass(), "review", term28347);
        setField(term28348, term28348.getClass(), "date", null);
        setField(term28348, term28348.getClass(), "time", null);
        setField(term28344, term28344.getClass(), "date", term28348);
        Object term28349 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28350 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28351 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28352 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28353 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28350, term28350.getClass(), "userId", null);
        setField(term28350, term28350.getClass(), "reviewId", null);
        setField(term28349, term28349.getClass(), "userReviewId", term28350);
        setField(term28351, term28351.getClass(), "id", null);
        setField(term28351, term28351.getClass(), "name", null);
        setField(term28351, term28351.getClass(), "userReviews", null);
        setField(term28349, term28349.getClass(), "user", term28351);
        setField(term28352, term28352.getClass(), "id", null);
        setField(term28352, term28352.getClass(), "review", null);
        setField(term28352, term28352.getClass(), "userReviews", null);
        setField(term28349, term28349.getClass(), "review", term28352);
        setField(term28353, term28353.getClass(), "date", null);
        setField(term28353, term28353.getClass(), "time", null);
        setField(term28349, term28349.getClass(), "date", term28353);
        Object term28354 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28355 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28356 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28357 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28358 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28355, term28355.getClass(), "userId", null);
        setField(term28355, term28355.getClass(), "reviewId", null);
        setField(term28354, term28354.getClass(), "userReviewId", term28355);
        setField(term28356, term28356.getClass(), "id", null);
        setField(term28356, term28356.getClass(), "name", null);
        setField(term28356, term28356.getClass(), "userReviews", null);
        setField(term28354, term28354.getClass(), "user", term28356);
        setField(term28357, term28357.getClass(), "id", null);
        setField(term28357, term28357.getClass(), "review", null);
        setField(term28357, term28357.getClass(), "userReviews", null);
        setField(term28354, term28354.getClass(), "review", term28357);
        setField(term28358, term28358.getClass(), "date", null);
        setField(term28358, term28358.getClass(), "time", null);
        setField(term28354, term28354.getClass(), "date", term28358);
        Object term28359 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28360 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28361 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28362 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28363 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28360, term28360.getClass(), "userId", null);
        setField(term28360, term28360.getClass(), "reviewId", null);
        setField(term28359, term28359.getClass(), "userReviewId", term28360);
        setField(term28361, term28361.getClass(), "id", null);
        setField(term28361, term28361.getClass(), "name", null);
        setField(term28361, term28361.getClass(), "userReviews", null);
        setField(term28359, term28359.getClass(), "user", term28361);
        setField(term28362, term28362.getClass(), "id", null);
        setField(term28362, term28362.getClass(), "review", null);
        setField(term28362, term28362.getClass(), "userReviews", null);
        setField(term28359, term28359.getClass(), "review", term28362);
        setField(term28363, term28363.getClass(), "date", null);
        setField(term28363, term28363.getClass(), "time", null);
        setField(term28359, term28359.getClass(), "date", term28363);
        ArrayList term28342 = new ArrayList();
        ((ArrayList) term28342).add(term28344);
        ((ArrayList) term28342).add(term28349);
        ((ArrayList) term28342).add(term28354);
        ((ArrayList) term28342).add(term28359);
        term28317 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28317, term28317.getClass(), "id", "CFojehEtAR");
        setField(term28317, term28317.getClass(), "name", "EYeLeoxDrM");
        setField(term28317, term28317.getClass(), "userReviews", term28342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term28317, args);
    }

};


