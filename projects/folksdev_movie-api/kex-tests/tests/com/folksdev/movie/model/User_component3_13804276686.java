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
     Object term28318;

    public User_component3_13804276686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28345 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28346 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28347 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28348 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28349 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28346, term28346.getClass(), "userId", null);
        setField(term28346, term28346.getClass(), "reviewId", null);
        setField(term28345, term28345.getClass(), "userReviewId", term28346);
        setField(term28347, term28347.getClass(), "id", null);
        setField(term28347, term28347.getClass(), "name", null);
        setField(term28347, term28347.getClass(), "userReviews", null);
        setField(term28345, term28345.getClass(), "user", term28347);
        setField(term28348, term28348.getClass(), "id", null);
        setField(term28348, term28348.getClass(), "review", null);
        setField(term28348, term28348.getClass(), "userReviews", null);
        setField(term28345, term28345.getClass(), "review", term28348);
        setField(term28349, term28349.getClass(), "date", null);
        setField(term28349, term28349.getClass(), "time", null);
        setField(term28345, term28345.getClass(), "date", term28349);
        Object term28350 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28351 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28352 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28353 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28354 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28351, term28351.getClass(), "userId", null);
        setField(term28351, term28351.getClass(), "reviewId", null);
        setField(term28350, term28350.getClass(), "userReviewId", term28351);
        setField(term28352, term28352.getClass(), "id", null);
        setField(term28352, term28352.getClass(), "name", null);
        setField(term28352, term28352.getClass(), "userReviews", null);
        setField(term28350, term28350.getClass(), "user", term28352);
        setField(term28353, term28353.getClass(), "id", null);
        setField(term28353, term28353.getClass(), "review", null);
        setField(term28353, term28353.getClass(), "userReviews", null);
        setField(term28350, term28350.getClass(), "review", term28353);
        setField(term28354, term28354.getClass(), "date", null);
        setField(term28354, term28354.getClass(), "time", null);
        setField(term28350, term28350.getClass(), "date", term28354);
        Object term28355 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28356 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28357 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28358 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28359 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28356, term28356.getClass(), "userId", null);
        setField(term28356, term28356.getClass(), "reviewId", null);
        setField(term28355, term28355.getClass(), "userReviewId", term28356);
        setField(term28357, term28357.getClass(), "id", null);
        setField(term28357, term28357.getClass(), "name", null);
        setField(term28357, term28357.getClass(), "userReviews", null);
        setField(term28355, term28355.getClass(), "user", term28357);
        setField(term28358, term28358.getClass(), "id", null);
        setField(term28358, term28358.getClass(), "review", null);
        setField(term28358, term28358.getClass(), "userReviews", null);
        setField(term28355, term28355.getClass(), "review", term28358);
        setField(term28359, term28359.getClass(), "date", null);
        setField(term28359, term28359.getClass(), "time", null);
        setField(term28355, term28355.getClass(), "date", term28359);
        Object term28360 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28361 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28362 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28363 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28364 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28361, term28361.getClass(), "userId", null);
        setField(term28361, term28361.getClass(), "reviewId", null);
        setField(term28360, term28360.getClass(), "userReviewId", term28361);
        setField(term28362, term28362.getClass(), "id", null);
        setField(term28362, term28362.getClass(), "name", null);
        setField(term28362, term28362.getClass(), "userReviews", null);
        setField(term28360, term28360.getClass(), "user", term28362);
        setField(term28363, term28363.getClass(), "id", null);
        setField(term28363, term28363.getClass(), "review", null);
        setField(term28363, term28363.getClass(), "userReviews", null);
        setField(term28360, term28360.getClass(), "review", term28363);
        setField(term28364, term28364.getClass(), "date", null);
        setField(term28364, term28364.getClass(), "time", null);
        setField(term28360, term28360.getClass(), "date", term28364);
        ArrayList term28343 = new ArrayList();
        ((ArrayList) term28343).add(term28345);
        ((ArrayList) term28343).add(term28350);
        ((ArrayList) term28343).add(term28355);
        ((ArrayList) term28343).add(term28360);
        term28318 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28318, term28318.getClass(), "id", "CFojehEtAR");
        setField(term28318, term28318.getClass(), "name", "EYeLeoxDrM");
        setField(term28318, term28318.getClass(), "userReviews", term28343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term28318, args);
    }

};


