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
     Object term26401;

    public UserReview_component1_18962675985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term26458 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26458, term26458.getClass(), "userReviewId", null);
        setField(term26458, term26458.getClass(), "user", null);
        setField(term26458, term26458.getClass(), "review", null);
        setField(term26458, term26458.getClass(), "date", null);
        ArrayList term26452 = new ArrayList();
        ((ArrayList) term26452).add(term26454);
        ((ArrayList) term26452).add(term26455);
        ((ArrayList) term26452).add(term26456);
        ((ArrayList) term26452).add(term26457);
        ((ArrayList) term26452).add(term26457);
        ((ArrayList) term26452).add(term26454);
        ((ArrayList) term26452).add(term26458);
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
        Object term26490 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26490, term26490.getClass(), "userReviewId", null);
        setField(term26490, term26490.getClass(), "user", null);
        setField(term26490, term26490.getClass(), "review", null);
        setField(term26490, term26490.getClass(), "date", null);
        ArrayList term26486 = new ArrayList();
        ((ArrayList) term26486).add(term26458);
        ((ArrayList) term26486).add(term26488);
        ((ArrayList) term26486).add(term26455);
        ((ArrayList) term26486).add(term26489);
        ((ArrayList) term26486).add(term26458);
        ((ArrayList) term26486).add(term26490);
        term26401 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26402 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26427 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26461 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26493 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26494 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26498 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26402, term26402.getClass(), "userId", "pPxivEPfHY");
        setField(term26402, term26402.getClass(), "reviewId", "BiitfiJmRW");
        setField(term26401, term26401.getClass(), "userReviewId", term26402);
        setField(term26427, term26427.getClass(), "id", "ILHarzuGbn");
        setField(term26427, term26427.getClass(), "name", "uNGHHAwCFL");
        setField(term26427, term26427.getClass(), "userReviews", term26452);
        setField(term26401, term26401.getClass(), "user", term26427);
        setField(term26461, term26461.getClass(), "id", "LAOkeXXkDr");
        setField(term26461, term26461.getClass(), "review", "YkZqFgrgVM");
        setField(term26461, term26461.getClass(), "userReviews", term26486);
        setField(term26401, term26401.getClass(), "review", term26461);
        setIntField(term26494, term26494.getClass(), "year", 2012);
        setShortField(term26494, term26494.getClass(), "month", (short) 4);
        setShortField(term26494, term26494.getClass(), "day", (short) 25);
        setField(term26493, term26493.getClass(), "date", term26494);
        setByteField(term26498, term26498.getClass(), "hour", (byte) 21);
        setByteField(term26498, term26498.getClass(), "minute", (byte) 14);
        setByteField(term26498, term26498.getClass(), "second", (byte) 15);
        setIntField(term26498, term26498.getClass(), "nano", 561700934);
        setField(term26493, term26493.getClass(), "time", term26498);
        setField(term26401, term26401.getClass(), "date", term26493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term26401, args);
    }

};


