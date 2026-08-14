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

public class UserReview_hashCode_14321621911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27572;

    public UserReview_hashCode_14321621911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27625 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27625, term27625.getClass(), "userReviewId", null);
        setField(term27625, term27625.getClass(), "user", null);
        setField(term27625, term27625.getClass(), "review", null);
        setField(term27625, term27625.getClass(), "date", null);
        Object term27626 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27626, term27626.getClass(), "userReviewId", null);
        setField(term27626, term27626.getClass(), "user", null);
        setField(term27626, term27626.getClass(), "review", null);
        setField(term27626, term27626.getClass(), "date", null);
        Object term27627 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27627, term27627.getClass(), "userReviewId", null);
        setField(term27627, term27627.getClass(), "user", null);
        setField(term27627, term27627.getClass(), "review", null);
        setField(term27627, term27627.getClass(), "date", null);
        Object term27628 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27628, term27628.getClass(), "userReviewId", null);
        setField(term27628, term27628.getClass(), "user", null);
        setField(term27628, term27628.getClass(), "review", null);
        setField(term27628, term27628.getClass(), "date", null);
        Object term27629 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27629, term27629.getClass(), "userReviewId", null);
        setField(term27629, term27629.getClass(), "user", null);
        setField(term27629, term27629.getClass(), "review", null);
        setField(term27629, term27629.getClass(), "date", null);
        Object term27630 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27630, term27630.getClass(), "userReviewId", null);
        setField(term27630, term27630.getClass(), "user", null);
        setField(term27630, term27630.getClass(), "review", null);
        setField(term27630, term27630.getClass(), "date", null);
        ArrayList term27623 = new ArrayList();
        ((ArrayList) term27623).add(term27625);
        ((ArrayList) term27623).add(term27626);
        ((ArrayList) term27623).add(term27625);
        ((ArrayList) term27623).add(term27627);
        ((ArrayList) term27623).add(term27627);
        ((ArrayList) term27623).add(term27628);
        ((ArrayList) term27623).add(term27629);
        ((ArrayList) term27623).add(term27630);
        Object term27660 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27660, term27660.getClass(), "userReviewId", null);
        setField(term27660, term27660.getClass(), "user", null);
        setField(term27660, term27660.getClass(), "review", null);
        setField(term27660, term27660.getClass(), "date", null);
        Object term27661 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27661, term27661.getClass(), "userReviewId", null);
        setField(term27661, term27661.getClass(), "user", null);
        setField(term27661, term27661.getClass(), "review", null);
        setField(term27661, term27661.getClass(), "date", null);
        ArrayList term27658 = new ArrayList();
        ((ArrayList) term27658).add(term27627);
        ((ArrayList) term27658).add(term27660);
        ((ArrayList) term27658).add(term27625);
        ((ArrayList) term27658).add(term27661);
        ((ArrayList) term27658).add(term27660);
        ((ArrayList) term27658).add(term27660);
        ((ArrayList) term27658).add(term27629);
        term27572 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27573 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27598 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27633 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27669 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27573, term27573.getClass(), "userId", "KgtGJGInhu");
        setField(term27573, term27573.getClass(), "reviewId", "mVHDjrsMAV");
        setField(term27572, term27572.getClass(), "userReviewId", term27573);
        setField(term27598, term27598.getClass(), "id", "rjWnqcjYuU");
        setField(term27598, term27598.getClass(), "name", "JhszTkUWCg");
        setField(term27598, term27598.getClass(), "userReviews", term27623);
        setField(term27572, term27572.getClass(), "user", term27598);
        setField(term27633, term27633.getClass(), "id", "zQtuUgUIjK");
        setField(term27633, term27633.getClass(), "review", "VBeGRjPsPN");
        setField(term27633, term27633.getClass(), "userReviews", term27658);
        setField(term27572, term27572.getClass(), "review", term27633);
        setIntField(term27665, term27665.getClass(), "year", 2016);
        setShortField(term27665, term27665.getClass(), "month", (short) 3);
        setShortField(term27665, term27665.getClass(), "day", (short) 20);
        setField(term27664, term27664.getClass(), "date", term27665);
        setByteField(term27669, term27669.getClass(), "hour", (byte) 0);
        setByteField(term27669, term27669.getClass(), "minute", (byte) 54);
        setByteField(term27669, term27669.getClass(), "second", (byte) 6);
        setIntField(term27669, term27669.getClass(), "nano", 183302469);
        setField(term27664, term27664.getClass(), "time", term27669);
        setField(term27572, term27572.getClass(), "date", term27664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term27572, args);
    }

};


