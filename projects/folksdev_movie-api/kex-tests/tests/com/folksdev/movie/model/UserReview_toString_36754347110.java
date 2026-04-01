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
     Object term27410;

    public UserReview_toString_36754347110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27463 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27463, term27463.getClass(), "userReviewId", null);
        setField(term27463, term27463.getClass(), "user", null);
        setField(term27463, term27463.getClass(), "review", null);
        setField(term27463, term27463.getClass(), "date", null);
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
        ArrayList term27461 = new ArrayList();
        ((ArrayList) term27461).add(term27463);
        ((ArrayList) term27461).add(term27464);
        ((ArrayList) term27461).add(term27465);
        Object term27495 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27495, term27495.getClass(), "userReviewId", null);
        setField(term27495, term27495.getClass(), "user", null);
        setField(term27495, term27495.getClass(), "review", null);
        setField(term27495, term27495.getClass(), "date", null);
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
        ArrayList term27493 = new ArrayList();
        ((ArrayList) term27493).add(term27495);
        ((ArrayList) term27493).add(term27496);
        ((ArrayList) term27493).add(term27464);
        ((ArrayList) term27493).add(term27497);
        ((ArrayList) term27493).add(term27463);
        ((ArrayList) term27493).add(term27498);
        ((ArrayList) term27493).add(term27497);
        ((ArrayList) term27493).add(term27497);
        ((ArrayList) term27493).add(term27495);
        term27410 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27411 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27436 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27468 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27506 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27411, term27411.getClass(), "userId", "PvtJhtGffh");
        setField(term27411, term27411.getClass(), "reviewId", "KReGJTSQuY");
        setField(term27410, term27410.getClass(), "userReviewId", term27411);
        setField(term27436, term27436.getClass(), "id", "hqZmoXoMuS");
        setField(term27436, term27436.getClass(), "name", "PUPJWadLXP");
        setField(term27436, term27436.getClass(), "userReviews", term27461);
        setField(term27410, term27410.getClass(), "user", term27436);
        setField(term27468, term27468.getClass(), "id", "jELmrpQCNf");
        setField(term27468, term27468.getClass(), "review", "NkjAcBXmmT");
        setField(term27468, term27468.getClass(), "userReviews", term27493);
        setField(term27410, term27410.getClass(), "review", term27468);
        setIntField(term27502, term27502.getClass(), "year", 2016);
        setShortField(term27502, term27502.getClass(), "month", (short) 6);
        setShortField(term27502, term27502.getClass(), "day", (short) 23);
        setField(term27501, term27501.getClass(), "date", term27502);
        setByteField(term27506, term27506.getClass(), "hour", (byte) 20);
        setByteField(term27506, term27506.getClass(), "minute", (byte) 51);
        setByteField(term27506, term27506.getClass(), "second", (byte) 43);
        setIntField(term27506, term27506.getClass(), "nano", 284389409);
        setField(term27501, term27501.getClass(), "time", term27506);
        setField(term27410, term27410.getClass(), "date", term27501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27410, args);
    }

};


