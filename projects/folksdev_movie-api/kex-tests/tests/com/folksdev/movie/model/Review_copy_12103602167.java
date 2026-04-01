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
import java.util.LinkedList;
import java.lang.Object;

public class Review_copy_12103602167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29238;
     Object term29291;

    public Review_copy_12103602167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29263 = new ArrayList();
        term29238 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29238, term29238.getClass(), "id", "CoPgTYdcst");
        setField(term29238, term29238.getClass(), "review", "UYWsaWaOUS");
        setField(term29238, term29238.getClass(), "userReviews", term29263);
        ArrayList term29301 = new ArrayList();
        ((ArrayList) term29301).add((Object)null);
        ((ArrayList) term29301).add((Object)null);
        ((ArrayList) term29301).add((Object)null);
        ((ArrayList) term29301).add((Object)null);
        ((ArrayList) term29301).add((Object)null);
        ((ArrayList) term29301).add((Object)null);
        ArrayList term29307 = new ArrayList();
        ((ArrayList) term29307).add((Object)null);
        ((ArrayList) term29307).add((Object)null);
        ((ArrayList) term29307).add((Object)null);
        ((ArrayList) term29307).add((Object)null);
        ((ArrayList) term29307).add((Object)null);
        ((ArrayList) term29307).add((Object)null);
        ((ArrayList) term29307).add((Object)null);
        Object term29294 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29295 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29298 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29304 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29310 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29311 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29315 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29295, term29295.getClass(), "userId", "");
        setField(term29295, term29295.getClass(), "reviewId", "");
        setField(term29294, term29294.getClass(), "userReviewId", term29295);
        setField(term29298, term29298.getClass(), "id", "");
        setField(term29298, term29298.getClass(), "name", "");
        setField(term29298, term29298.getClass(), "userReviews", term29301);
        setField(term29294, term29294.getClass(), "user", term29298);
        setField(term29304, term29304.getClass(), "id", "");
        setField(term29304, term29304.getClass(), "review", "");
        setField(term29304, term29304.getClass(), "userReviews", term29307);
        setField(term29294, term29294.getClass(), "review", term29304);
        setIntField(term29311, term29311.getClass(), "year", 2014);
        setShortField(term29311, term29311.getClass(), "month", (short) 2);
        setShortField(term29311, term29311.getClass(), "day", (short) 18);
        setField(term29310, term29310.getClass(), "date", term29311);
        setByteField(term29315, term29315.getClass(), "hour", (byte) 4);
        setByteField(term29315, term29315.getClass(), "minute", (byte) 16);
        setByteField(term29315, term29315.getClass(), "second", (byte) 8);
        setIntField(term29315, term29315.getClass(), "nano", 486006871);
        setField(term29310, term29310.getClass(), "time", term29315);
        setField(term29294, term29294.getClass(), "date", term29310);
        Object term29321 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29322 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29323 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29324 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29325 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29322, term29322.getClass(), "userId", null);
        setField(term29322, term29322.getClass(), "reviewId", null);
        setField(term29321, term29321.getClass(), "userReviewId", term29322);
        setField(term29323, term29323.getClass(), "id", null);
        setField(term29323, term29323.getClass(), "name", null);
        setField(term29323, term29323.getClass(), "userReviews", null);
        setField(term29321, term29321.getClass(), "user", term29323);
        setField(term29324, term29324.getClass(), "id", null);
        setField(term29324, term29324.getClass(), "review", null);
        setField(term29324, term29324.getClass(), "userReviews", null);
        setField(term29321, term29321.getClass(), "review", term29324);
        setField(term29325, term29325.getClass(), "date", null);
        setField(term29325, term29325.getClass(), "time", null);
        setField(term29321, term29321.getClass(), "date", term29325);
        Object term29327 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term29327, term29327.getClass(), "userReviewId", null);
        setField(term29327, term29327.getClass(), "user", null);
        setField(term29327, term29327.getClass(), "review", null);
        setField(term29327, term29327.getClass(), "date", null);
        term29291 = new LinkedList();
        ((LinkedList) term29291).add(term29294);
        ((LinkedList) term29291).add(term29321);
        ((LinkedList) term29291).add(term29327);
        ((LinkedList) term29291).add((Object)null);
        ((LinkedList) term29291).add((Object)null);
        ((LinkedList) term29291).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "oOxKzvqxUJ";
        args[1] = "tjqgiPrtgj";
        args[2] = term29291;
        callMethod(klass, "copy", argTypes, term29238, args);
    }

};


