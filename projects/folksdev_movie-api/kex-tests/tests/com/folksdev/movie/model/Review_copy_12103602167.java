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
     Object term29240;
     Object term29293;

    public Review_copy_12103602167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29265 = new ArrayList();
        term29240 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29240, term29240.getClass(), "id", "CoPgTYdcst");
        setField(term29240, term29240.getClass(), "review", "UYWsaWaOUS");
        setField(term29240, term29240.getClass(), "userReviews", term29265);
        ArrayList term29303 = new ArrayList();
        ((ArrayList) term29303).add((Object)null);
        ((ArrayList) term29303).add((Object)null);
        ((ArrayList) term29303).add((Object)null);
        ((ArrayList) term29303).add((Object)null);
        ((ArrayList) term29303).add((Object)null);
        ((ArrayList) term29303).add((Object)null);
        ArrayList term29309 = new ArrayList();
        ((ArrayList) term29309).add((Object)null);
        ((ArrayList) term29309).add((Object)null);
        ((ArrayList) term29309).add((Object)null);
        ((ArrayList) term29309).add((Object)null);
        ((ArrayList) term29309).add((Object)null);
        ((ArrayList) term29309).add((Object)null);
        ((ArrayList) term29309).add((Object)null);
        Object term29296 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29297 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29300 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29306 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29312 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29313 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29317 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29297, term29297.getClass(), "userId", "");
        setField(term29297, term29297.getClass(), "reviewId", "");
        setField(term29296, term29296.getClass(), "userReviewId", term29297);
        setField(term29300, term29300.getClass(), "id", "");
        setField(term29300, term29300.getClass(), "name", "");
        setField(term29300, term29300.getClass(), "userReviews", term29303);
        setField(term29296, term29296.getClass(), "user", term29300);
        setField(term29306, term29306.getClass(), "id", "");
        setField(term29306, term29306.getClass(), "review", "");
        setField(term29306, term29306.getClass(), "userReviews", term29309);
        setField(term29296, term29296.getClass(), "review", term29306);
        setIntField(term29313, term29313.getClass(), "year", 2014);
        setShortField(term29313, term29313.getClass(), "month", (short) 2);
        setShortField(term29313, term29313.getClass(), "day", (short) 18);
        setField(term29312, term29312.getClass(), "date", term29313);
        setByteField(term29317, term29317.getClass(), "hour", (byte) 4);
        setByteField(term29317, term29317.getClass(), "minute", (byte) 16);
        setByteField(term29317, term29317.getClass(), "second", (byte) 8);
        setIntField(term29317, term29317.getClass(), "nano", 486006871);
        setField(term29312, term29312.getClass(), "time", term29317);
        setField(term29296, term29296.getClass(), "date", term29312);
        Object term29323 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29324 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29325 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29326 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29327 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29324, term29324.getClass(), "userId", null);
        setField(term29324, term29324.getClass(), "reviewId", null);
        setField(term29323, term29323.getClass(), "userReviewId", term29324);
        setField(term29325, term29325.getClass(), "id", null);
        setField(term29325, term29325.getClass(), "name", null);
        setField(term29325, term29325.getClass(), "userReviews", null);
        setField(term29323, term29323.getClass(), "user", term29325);
        setField(term29326, term29326.getClass(), "id", null);
        setField(term29326, term29326.getClass(), "review", null);
        setField(term29326, term29326.getClass(), "userReviews", null);
        setField(term29323, term29323.getClass(), "review", term29326);
        setField(term29327, term29327.getClass(), "date", null);
        setField(term29327, term29327.getClass(), "time", null);
        setField(term29323, term29323.getClass(), "date", term29327);
        Object term29329 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term29329, term29329.getClass(), "userReviewId", null);
        setField(term29329, term29329.getClass(), "user", null);
        setField(term29329, term29329.getClass(), "review", null);
        setField(term29329, term29329.getClass(), "date", null);
        term29293 = new LinkedList();
        ((LinkedList) term29293).add(term29296);
        ((LinkedList) term29293).add(term29323);
        ((LinkedList) term29293).add(term29329);
        ((LinkedList) term29293).add((Object)null);
        ((LinkedList) term29293).add((Object)null);
        ((LinkedList) term29293).add((Object)null);
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
        args[2] = term29293;
        callMethod(klass, "copy", argTypes, term29240, args);
    }

};


