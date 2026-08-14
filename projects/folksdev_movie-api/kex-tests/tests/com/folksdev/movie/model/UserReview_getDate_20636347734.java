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
     Object term26244;

    public UserReview_getDate_20636347734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26297 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26297, term26297.getClass(), "userReviewId", null);
        setField(term26297, term26297.getClass(), "user", null);
        setField(term26297, term26297.getClass(), "review", null);
        setField(term26297, term26297.getClass(), "date", null);
        ArrayList term26295 = new ArrayList();
        ((ArrayList) term26295).add(term26297);
        Object term26327 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26327, term26327.getClass(), "userReviewId", null);
        setField(term26327, term26327.getClass(), "user", null);
        setField(term26327, term26327.getClass(), "review", null);
        setField(term26327, term26327.getClass(), "date", null);
        Object term26328 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26328, term26328.getClass(), "userReviewId", null);
        setField(term26328, term26328.getClass(), "user", null);
        setField(term26328, term26328.getClass(), "review", null);
        setField(term26328, term26328.getClass(), "date", null);
        ArrayList term26325 = new ArrayList();
        ((ArrayList) term26325).add(term26327);
        ((ArrayList) term26325).add(term26328);
        term26244 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26245 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26270 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26300 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26331 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26332 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26336 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26245, term26245.getClass(), "userId", "YEcmxINfnL");
        setField(term26245, term26245.getClass(), "reviewId", "EGytMwlDVe");
        setField(term26244, term26244.getClass(), "userReviewId", term26245);
        setField(term26270, term26270.getClass(), "id", "GFQCmYZmcg");
        setField(term26270, term26270.getClass(), "name", "qPgbFtsgtk");
        setField(term26270, term26270.getClass(), "userReviews", term26295);
        setField(term26244, term26244.getClass(), "user", term26270);
        setField(term26300, term26300.getClass(), "id", "YcXTXuOFYV");
        setField(term26300, term26300.getClass(), "review", "HGhIlMCaKM");
        setField(term26300, term26300.getClass(), "userReviews", term26325);
        setField(term26244, term26244.getClass(), "review", term26300);
        setIntField(term26332, term26332.getClass(), "year", 2014);
        setShortField(term26332, term26332.getClass(), "month", (short) 11);
        setShortField(term26332, term26332.getClass(), "day", (short) 8);
        setField(term26331, term26331.getClass(), "date", term26332);
        setByteField(term26336, term26336.getClass(), "hour", (byte) 8);
        setByteField(term26336, term26336.getClass(), "minute", (byte) 43);
        setByteField(term26336, term26336.getClass(), "second", (byte) 32);
        setIntField(term26336, term26336.getClass(), "nano", 154434838);
        setField(term26331, term26331.getClass(), "time", term26336);
        setField(term26244, term26244.getClass(), "date", term26331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term26244, args);
    }

};


