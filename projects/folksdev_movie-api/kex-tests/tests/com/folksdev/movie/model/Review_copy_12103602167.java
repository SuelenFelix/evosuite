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
     Object term29239;
     Object term29292;

    public Review_copy_12103602167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29264 = new ArrayList();
        term29239 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29239, term29239.getClass(), "id", "CoPgTYdcst");
        setField(term29239, term29239.getClass(), "review", "UYWsaWaOUS");
        setField(term29239, term29239.getClass(), "userReviews", term29264);
        ArrayList term29302 = new ArrayList();
        ((ArrayList) term29302).add((Object)null);
        ((ArrayList) term29302).add((Object)null);
        ((ArrayList) term29302).add((Object)null);
        ((ArrayList) term29302).add((Object)null);
        ((ArrayList) term29302).add((Object)null);
        ((ArrayList) term29302).add((Object)null);
        ArrayList term29308 = new ArrayList();
        ((ArrayList) term29308).add((Object)null);
        ((ArrayList) term29308).add((Object)null);
        ((ArrayList) term29308).add((Object)null);
        ((ArrayList) term29308).add((Object)null);
        ((ArrayList) term29308).add((Object)null);
        ((ArrayList) term29308).add((Object)null);
        ((ArrayList) term29308).add((Object)null);
        Object term29295 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29296 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29299 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29305 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29316 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29296, term29296.getClass(), "userId", "");
        setField(term29296, term29296.getClass(), "reviewId", "");
        setField(term29295, term29295.getClass(), "userReviewId", term29296);
        setField(term29299, term29299.getClass(), "id", "");
        setField(term29299, term29299.getClass(), "name", "");
        setField(term29299, term29299.getClass(), "userReviews", term29302);
        setField(term29295, term29295.getClass(), "user", term29299);
        setField(term29305, term29305.getClass(), "id", "");
        setField(term29305, term29305.getClass(), "review", "");
        setField(term29305, term29305.getClass(), "userReviews", term29308);
        setField(term29295, term29295.getClass(), "review", term29305);
        setIntField(term29312, term29312.getClass(), "year", 2014);
        setShortField(term29312, term29312.getClass(), "month", (short) 2);
        setShortField(term29312, term29312.getClass(), "day", (short) 18);
        setField(term29311, term29311.getClass(), "date", term29312);
        setByteField(term29316, term29316.getClass(), "hour", (byte) 4);
        setByteField(term29316, term29316.getClass(), "minute", (byte) 16);
        setByteField(term29316, term29316.getClass(), "second", (byte) 8);
        setIntField(term29316, term29316.getClass(), "nano", 486006871);
        setField(term29311, term29311.getClass(), "time", term29316);
        setField(term29295, term29295.getClass(), "date", term29311);
        Object term29322 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29323 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29324 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29325 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29326 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29323, term29323.getClass(), "userId", null);
        setField(term29323, term29323.getClass(), "reviewId", null);
        setField(term29322, term29322.getClass(), "userReviewId", term29323);
        setField(term29324, term29324.getClass(), "id", null);
        setField(term29324, term29324.getClass(), "name", null);
        setField(term29324, term29324.getClass(), "userReviews", null);
        setField(term29322, term29322.getClass(), "user", term29324);
        setField(term29325, term29325.getClass(), "id", null);
        setField(term29325, term29325.getClass(), "review", null);
        setField(term29325, term29325.getClass(), "userReviews", null);
        setField(term29322, term29322.getClass(), "review", term29325);
        setField(term29326, term29326.getClass(), "date", null);
        setField(term29326, term29326.getClass(), "time", null);
        setField(term29322, term29322.getClass(), "date", term29326);
        Object term29328 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term29328, term29328.getClass(), "userReviewId", null);
        setField(term29328, term29328.getClass(), "user", null);
        setField(term29328, term29328.getClass(), "review", null);
        setField(term29328, term29328.getClass(), "date", null);
        term29292 = new LinkedList();
        ((LinkedList) term29292).add(term29295);
        ((LinkedList) term29292).add(term29322);
        ((LinkedList) term29292).add(term29328);
        ((LinkedList) term29292).add((Object)null);
        ((LinkedList) term29292).add((Object)null);
        ((LinkedList) term29292).add((Object)null);
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
        args[2] = term29292;
        callMethod(klass, "copy", argTypes, term29239, args);
    }

};


