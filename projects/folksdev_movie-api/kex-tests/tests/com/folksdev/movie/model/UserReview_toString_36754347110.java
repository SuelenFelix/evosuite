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

public class UserReview_toString_36754347110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27412;

    public UserReview_toString_36754347110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27465 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27465, term27465.getClass(), "userReviewId", null);
        setField(term27465, term27465.getClass(), "user", null);
        setField(term27465, term27465.getClass(), "review", null);
        setField(term27465, term27465.getClass(), "date", null);
        Object term27466 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27466, term27466.getClass(), "userReviewId", null);
        setField(term27466, term27466.getClass(), "user", null);
        setField(term27466, term27466.getClass(), "review", null);
        setField(term27466, term27466.getClass(), "date", null);
        Object term27467 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27467, term27467.getClass(), "userReviewId", null);
        setField(term27467, term27467.getClass(), "user", null);
        setField(term27467, term27467.getClass(), "review", null);
        setField(term27467, term27467.getClass(), "date", null);
        ArrayList term27463 = new ArrayList();
        ((ArrayList) term27463).add(term27465);
        ((ArrayList) term27463).add(term27466);
        ((ArrayList) term27463).add(term27467);
        Object term27497 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27497, term27497.getClass(), "userReviewId", null);
        setField(term27497, term27497.getClass(), "user", null);
        setField(term27497, term27497.getClass(), "review", null);
        setField(term27497, term27497.getClass(), "date", null);
        Object term27498 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27498, term27498.getClass(), "userReviewId", null);
        setField(term27498, term27498.getClass(), "user", null);
        setField(term27498, term27498.getClass(), "review", null);
        setField(term27498, term27498.getClass(), "date", null);
        Object term27499 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27499, term27499.getClass(), "userReviewId", null);
        setField(term27499, term27499.getClass(), "user", null);
        setField(term27499, term27499.getClass(), "review", null);
        setField(term27499, term27499.getClass(), "date", null);
        Object term27500 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27500, term27500.getClass(), "userReviewId", null);
        setField(term27500, term27500.getClass(), "user", null);
        setField(term27500, term27500.getClass(), "review", null);
        setField(term27500, term27500.getClass(), "date", null);
        ArrayList term27495 = new ArrayList();
        ((ArrayList) term27495).add(term27497);
        ((ArrayList) term27495).add(term27498);
        ((ArrayList) term27495).add(term27466);
        ((ArrayList) term27495).add(term27499);
        ((ArrayList) term27495).add(term27465);
        ((ArrayList) term27495).add(term27500);
        ((ArrayList) term27495).add(term27499);
        ((ArrayList) term27495).add(term27499);
        ((ArrayList) term27495).add(term27497);
        term27412 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27413 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27438 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27470 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27508 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27413, term27413.getClass(), "userId", "PvtJhtGffh");
        setField(term27413, term27413.getClass(), "reviewId", "KReGJTSQuY");
        setField(term27412, term27412.getClass(), "userReviewId", term27413);
        setField(term27438, term27438.getClass(), "id", "hqZmoXoMuS");
        setField(term27438, term27438.getClass(), "name", "PUPJWadLXP");
        setField(term27438, term27438.getClass(), "userReviews", term27463);
        setField(term27412, term27412.getClass(), "user", term27438);
        setField(term27470, term27470.getClass(), "id", "jELmrpQCNf");
        setField(term27470, term27470.getClass(), "review", "NkjAcBXmmT");
        setField(term27470, term27470.getClass(), "userReviews", term27495);
        setField(term27412, term27412.getClass(), "review", term27470);
        setIntField(term27504, term27504.getClass(), "year", 2016);
        setShortField(term27504, term27504.getClass(), "month", (short) 6);
        setShortField(term27504, term27504.getClass(), "day", (short) 23);
        setField(term27503, term27503.getClass(), "date", term27504);
        setByteField(term27508, term27508.getClass(), "hour", (byte) 20);
        setByteField(term27508, term27508.getClass(), "minute", (byte) 51);
        setByteField(term27508, term27508.getClass(), "second", (byte) 43);
        setIntField(term27508, term27508.getClass(), "nano", 284389409);
        setField(term27503, term27503.getClass(), "time", term27508);
        setField(term27412, term27412.getClass(), "date", term27503);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27412, args);
    }

};


