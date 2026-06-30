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
import java.lang.Object;
import java.util.ArrayList;

public class UserReview_component1_18962675985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26402;

    public UserReview_component1_18962675985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26455 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26455, term26455.getClass(), "userReviewId", null);
        setField(term26455, term26455.getClass(), "user", null);
        setField(term26455, term26455.getClass(), "review", null);
        setField(term26455, term26455.getClass(), "date", null);
        Object term26456 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26456, term26456.getClass(), "userReviewId", null);
        setField(term26456, term26456.getClass(), "user", null);
        setField(term26456, term26456.getClass(), "review", null);
        setField(term26456, term26456.getClass(), "date", null);
        Object term26457 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26457, term26457.getClass(), "userReviewId", null);
        setField(term26457, term26457.getClass(), "user", null);
        setField(term26457, term26457.getClass(), "review", null);
        setField(term26457, term26457.getClass(), "date", null);
        Object term26458 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26458, term26458.getClass(), "userReviewId", null);
        setField(term26458, term26458.getClass(), "user", null);
        setField(term26458, term26458.getClass(), "review", null);
        setField(term26458, term26458.getClass(), "date", null);
        Object term26459 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26459, term26459.getClass(), "userReviewId", null);
        setField(term26459, term26459.getClass(), "user", null);
        setField(term26459, term26459.getClass(), "review", null);
        setField(term26459, term26459.getClass(), "date", null);
        ArrayList term26453 = new ArrayList();
        ((ArrayList) term26453).add(term26455);
        ((ArrayList) term26453).add(term26456);
        ((ArrayList) term26453).add(term26457);
        ((ArrayList) term26453).add(term26458);
        ((ArrayList) term26453).add(term26458);
        ((ArrayList) term26453).add(term26455);
        ((ArrayList) term26453).add(term26459);
        Object term26489 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26489, term26489.getClass(), "userReviewId", null);
        setField(term26489, term26489.getClass(), "user", null);
        setField(term26489, term26489.getClass(), "review", null);
        setField(term26489, term26489.getClass(), "date", null);
        Object term26490 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26490, term26490.getClass(), "userReviewId", null);
        setField(term26490, term26490.getClass(), "user", null);
        setField(term26490, term26490.getClass(), "review", null);
        setField(term26490, term26490.getClass(), "date", null);
        Object term26491 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26491, term26491.getClass(), "userReviewId", null);
        setField(term26491, term26491.getClass(), "user", null);
        setField(term26491, term26491.getClass(), "review", null);
        setField(term26491, term26491.getClass(), "date", null);
        ArrayList term26487 = new ArrayList();
        ((ArrayList) term26487).add(term26459);
        ((ArrayList) term26487).add(term26489);
        ((ArrayList) term26487).add(term26456);
        ((ArrayList) term26487).add(term26490);
        ((ArrayList) term26487).add(term26459);
        ((ArrayList) term26487).add(term26491);
        term26402 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26403 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26428 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26462 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26499 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26403, term26403.getClass(), "userId", "pPxivEPfHY");
        setField(term26403, term26403.getClass(), "reviewId", "BiitfiJmRW");
        setField(term26402, term26402.getClass(), "userReviewId", term26403);
        setField(term26428, term26428.getClass(), "id", "ILHarzuGbn");
        setField(term26428, term26428.getClass(), "name", "uNGHHAwCFL");
        setField(term26428, term26428.getClass(), "userReviews", term26453);
        setField(term26402, term26402.getClass(), "user", term26428);
        setField(term26462, term26462.getClass(), "id", "LAOkeXXkDr");
        setField(term26462, term26462.getClass(), "review", "YkZqFgrgVM");
        setField(term26462, term26462.getClass(), "userReviews", term26487);
        setField(term26402, term26402.getClass(), "review", term26462);
        setIntField(term26495, term26495.getClass(), "year", 2012);
        setShortField(term26495, term26495.getClass(), "month", (short) 4);
        setShortField(term26495, term26495.getClass(), "day", (short) 25);
        setField(term26494, term26494.getClass(), "date", term26495);
        setByteField(term26499, term26499.getClass(), "hour", (byte) 21);
        setByteField(term26499, term26499.getClass(), "minute", (byte) 14);
        setByteField(term26499, term26499.getClass(), "second", (byte) 15);
        setIntField(term26499, term26499.getClass(), "nano", 561700934);
        setField(term26494, term26494.getClass(), "time", term26499);
        setField(term26402, term26402.getClass(), "date", term26494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term26402, args);
    }

};


