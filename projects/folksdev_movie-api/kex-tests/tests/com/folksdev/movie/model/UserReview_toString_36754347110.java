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
     Object term27411;

    public UserReview_toString_36754347110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27464 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27464, term27464.getClass(), "userReviewId", null);
        setField(term27464, term27464.getClass(), "user", null);
        setField(term27464, term27464.getClass(), "review", null);
        setField(term27464, term27464.getClass(), "date", null);
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
        ArrayList term27462 = new ArrayList();
        ((ArrayList) term27462).add(term27464);
        ((ArrayList) term27462).add(term27465);
        ((ArrayList) term27462).add(term27466);
        Object term27496 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27496, term27496.getClass(), "userReviewId", null);
        setField(term27496, term27496.getClass(), "user", null);
        setField(term27496, term27496.getClass(), "review", null);
        setField(term27496, term27496.getClass(), "date", null);
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
        ArrayList term27494 = new ArrayList();
        ((ArrayList) term27494).add(term27496);
        ((ArrayList) term27494).add(term27497);
        ((ArrayList) term27494).add(term27465);
        ((ArrayList) term27494).add(term27498);
        ((ArrayList) term27494).add(term27464);
        ((ArrayList) term27494).add(term27499);
        ((ArrayList) term27494).add(term27498);
        ((ArrayList) term27494).add(term27498);
        ((ArrayList) term27494).add(term27496);
        term27411 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27412 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27437 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27469 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27507 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27412, term27412.getClass(), "userId", "PvtJhtGffh");
        setField(term27412, term27412.getClass(), "reviewId", "KReGJTSQuY");
        setField(term27411, term27411.getClass(), "userReviewId", term27412);
        setField(term27437, term27437.getClass(), "id", "hqZmoXoMuS");
        setField(term27437, term27437.getClass(), "name", "PUPJWadLXP");
        setField(term27437, term27437.getClass(), "userReviews", term27462);
        setField(term27411, term27411.getClass(), "user", term27437);
        setField(term27469, term27469.getClass(), "id", "jELmrpQCNf");
        setField(term27469, term27469.getClass(), "review", "NkjAcBXmmT");
        setField(term27469, term27469.getClass(), "userReviews", term27494);
        setField(term27411, term27411.getClass(), "review", term27469);
        setIntField(term27503, term27503.getClass(), "year", 2016);
        setShortField(term27503, term27503.getClass(), "month", (short) 6);
        setShortField(term27503, term27503.getClass(), "day", (short) 23);
        setField(term27502, term27502.getClass(), "date", term27503);
        setByteField(term27507, term27507.getClass(), "hour", (byte) 20);
        setByteField(term27507, term27507.getClass(), "minute", (byte) 51);
        setByteField(term27507, term27507.getClass(), "second", (byte) 43);
        setIntField(term27507, term27507.getClass(), "nano", 284389409);
        setField(term27502, term27502.getClass(), "time", term27507);
        setField(term27411, term27411.getClass(), "date", term27502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27411, args);
    }

};


