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
     Object term26400;

    public UserReview_component1_18962675985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26453 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26453, term26453.getClass(), "userReviewId", null);
        setField(term26453, term26453.getClass(), "user", null);
        setField(term26453, term26453.getClass(), "review", null);
        setField(term26453, term26453.getClass(), "date", null);
        Object term26454 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26454, term26454.getClass(), "userReviewId", null);
        setField(term26454, term26454.getClass(), "user", null);
        setField(term26454, term26454.getClass(), "review", null);
        setField(term26454, term26454.getClass(), "date", null);
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
        ArrayList term26451 = new ArrayList();
        ((ArrayList) term26451).add(term26453);
        ((ArrayList) term26451).add(term26454);
        ((ArrayList) term26451).add(term26455);
        ((ArrayList) term26451).add(term26456);
        ((ArrayList) term26451).add(term26456);
        ((ArrayList) term26451).add(term26453);
        ((ArrayList) term26451).add(term26457);
        Object term26487 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26487, term26487.getClass(), "userReviewId", null);
        setField(term26487, term26487.getClass(), "user", null);
        setField(term26487, term26487.getClass(), "review", null);
        setField(term26487, term26487.getClass(), "date", null);
        Object term26488 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26488, term26488.getClass(), "userReviewId", null);
        setField(term26488, term26488.getClass(), "user", null);
        setField(term26488, term26488.getClass(), "review", null);
        setField(term26488, term26488.getClass(), "date", null);
        Object term26489 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26489, term26489.getClass(), "userReviewId", null);
        setField(term26489, term26489.getClass(), "user", null);
        setField(term26489, term26489.getClass(), "review", null);
        setField(term26489, term26489.getClass(), "date", null);
        ArrayList term26485 = new ArrayList();
        ((ArrayList) term26485).add(term26457);
        ((ArrayList) term26485).add(term26487);
        ((ArrayList) term26485).add(term26454);
        ((ArrayList) term26485).add(term26488);
        ((ArrayList) term26485).add(term26457);
        ((ArrayList) term26485).add(term26489);
        term26400 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26401 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26426 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26460 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26492 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26493 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26497 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26401, term26401.getClass(), "userId", "pPxivEPfHY");
        setField(term26401, term26401.getClass(), "reviewId", "BiitfiJmRW");
        setField(term26400, term26400.getClass(), "userReviewId", term26401);
        setField(term26426, term26426.getClass(), "id", "ILHarzuGbn");
        setField(term26426, term26426.getClass(), "name", "uNGHHAwCFL");
        setField(term26426, term26426.getClass(), "userReviews", term26451);
        setField(term26400, term26400.getClass(), "user", term26426);
        setField(term26460, term26460.getClass(), "id", "LAOkeXXkDr");
        setField(term26460, term26460.getClass(), "review", "YkZqFgrgVM");
        setField(term26460, term26460.getClass(), "userReviews", term26485);
        setField(term26400, term26400.getClass(), "review", term26460);
        setIntField(term26493, term26493.getClass(), "year", 2012);
        setShortField(term26493, term26493.getClass(), "month", (short) 4);
        setShortField(term26493, term26493.getClass(), "day", (short) 25);
        setField(term26492, term26492.getClass(), "date", term26493);
        setByteField(term26497, term26497.getClass(), "hour", (byte) 21);
        setByteField(term26497, term26497.getClass(), "minute", (byte) 14);
        setByteField(term26497, term26497.getClass(), "second", (byte) 15);
        setIntField(term26497, term26497.getClass(), "nano", 561700934);
        setField(term26492, term26492.getClass(), "time", term26497);
        setField(term26400, term26400.getClass(), "date", term26492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term26400, args);
    }

};


