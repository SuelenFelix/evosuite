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

public class UserReview_getDate_20636347734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26243;

    public UserReview_getDate_20636347734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26296 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26296, term26296.getClass(), "userReviewId", null);
        setField(term26296, term26296.getClass(), "user", null);
        setField(term26296, term26296.getClass(), "review", null);
        setField(term26296, term26296.getClass(), "date", null);
        ArrayList term26294 = new ArrayList();
        ((ArrayList) term26294).add(term26296);
        Object term26326 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26326, term26326.getClass(), "userReviewId", null);
        setField(term26326, term26326.getClass(), "user", null);
        setField(term26326, term26326.getClass(), "review", null);
        setField(term26326, term26326.getClass(), "date", null);
        Object term26327 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26327, term26327.getClass(), "userReviewId", null);
        setField(term26327, term26327.getClass(), "user", null);
        setField(term26327, term26327.getClass(), "review", null);
        setField(term26327, term26327.getClass(), "date", null);
        ArrayList term26324 = new ArrayList();
        ((ArrayList) term26324).add(term26326);
        ((ArrayList) term26324).add(term26327);
        term26243 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26244 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26269 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26299 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26335 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26244, term26244.getClass(), "userId", "YEcmxINfnL");
        setField(term26244, term26244.getClass(), "reviewId", "EGytMwlDVe");
        setField(term26243, term26243.getClass(), "userReviewId", term26244);
        setField(term26269, term26269.getClass(), "id", "GFQCmYZmcg");
        setField(term26269, term26269.getClass(), "name", "qPgbFtsgtk");
        setField(term26269, term26269.getClass(), "userReviews", term26294);
        setField(term26243, term26243.getClass(), "user", term26269);
        setField(term26299, term26299.getClass(), "id", "YcXTXuOFYV");
        setField(term26299, term26299.getClass(), "review", "HGhIlMCaKM");
        setField(term26299, term26299.getClass(), "userReviews", term26324);
        setField(term26243, term26243.getClass(), "review", term26299);
        setIntField(term26331, term26331.getClass(), "year", 2014);
        setShortField(term26331, term26331.getClass(), "month", (short) 11);
        setShortField(term26331, term26331.getClass(), "day", (short) 8);
        setField(term26330, term26330.getClass(), "date", term26331);
        setByteField(term26335, term26335.getClass(), "hour", (byte) 8);
        setByteField(term26335, term26335.getClass(), "minute", (byte) 43);
        setByteField(term26335, term26335.getClass(), "second", (byte) 32);
        setIntField(term26335, term26335.getClass(), "nano", 154434838);
        setField(term26330, term26330.getClass(), "time", term26335);
        setField(term26243, term26243.getClass(), "date", term26330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term26243, args);
    }

};


