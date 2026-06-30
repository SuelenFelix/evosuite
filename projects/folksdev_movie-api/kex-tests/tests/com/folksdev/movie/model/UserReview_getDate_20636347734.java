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
     Object term26245;

    public UserReview_getDate_20636347734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26298 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26298, term26298.getClass(), "userReviewId", null);
        setField(term26298, term26298.getClass(), "user", null);
        setField(term26298, term26298.getClass(), "review", null);
        setField(term26298, term26298.getClass(), "date", null);
        ArrayList term26296 = new ArrayList();
        ((ArrayList) term26296).add(term26298);
        Object term26328 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26328, term26328.getClass(), "userReviewId", null);
        setField(term26328, term26328.getClass(), "user", null);
        setField(term26328, term26328.getClass(), "review", null);
        setField(term26328, term26328.getClass(), "date", null);
        Object term26329 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26329, term26329.getClass(), "userReviewId", null);
        setField(term26329, term26329.getClass(), "user", null);
        setField(term26329, term26329.getClass(), "review", null);
        setField(term26329, term26329.getClass(), "date", null);
        ArrayList term26326 = new ArrayList();
        ((ArrayList) term26326).add(term26328);
        ((ArrayList) term26326).add(term26329);
        term26245 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26246 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26271 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26301 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26332 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26333 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26337 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26246, term26246.getClass(), "userId", "YEcmxINfnL");
        setField(term26246, term26246.getClass(), "reviewId", "EGytMwlDVe");
        setField(term26245, term26245.getClass(), "userReviewId", term26246);
        setField(term26271, term26271.getClass(), "id", "GFQCmYZmcg");
        setField(term26271, term26271.getClass(), "name", "qPgbFtsgtk");
        setField(term26271, term26271.getClass(), "userReviews", term26296);
        setField(term26245, term26245.getClass(), "user", term26271);
        setField(term26301, term26301.getClass(), "id", "YcXTXuOFYV");
        setField(term26301, term26301.getClass(), "review", "HGhIlMCaKM");
        setField(term26301, term26301.getClass(), "userReviews", term26326);
        setField(term26245, term26245.getClass(), "review", term26301);
        setIntField(term26333, term26333.getClass(), "year", 2014);
        setShortField(term26333, term26333.getClass(), "month", (short) 11);
        setShortField(term26333, term26333.getClass(), "day", (short) 8);
        setField(term26332, term26332.getClass(), "date", term26333);
        setByteField(term26337, term26337.getClass(), "hour", (byte) 8);
        setByteField(term26337, term26337.getClass(), "minute", (byte) 43);
        setByteField(term26337, term26337.getClass(), "second", (byte) 32);
        setIntField(term26337, term26337.getClass(), "nano", 154434838);
        setField(term26332, term26332.getClass(), "time", term26337);
        setField(term26245, term26245.getClass(), "date", term26332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term26245, args);
    }

};


