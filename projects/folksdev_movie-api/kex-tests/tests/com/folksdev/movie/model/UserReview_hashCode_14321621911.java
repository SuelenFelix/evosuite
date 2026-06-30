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
     Object term27573;

    public UserReview_hashCode_14321621911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term27631 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27631, term27631.getClass(), "userReviewId", null);
        setField(term27631, term27631.getClass(), "user", null);
        setField(term27631, term27631.getClass(), "review", null);
        setField(term27631, term27631.getClass(), "date", null);
        ArrayList term27624 = new ArrayList();
        ((ArrayList) term27624).add(term27626);
        ((ArrayList) term27624).add(term27627);
        ((ArrayList) term27624).add(term27626);
        ((ArrayList) term27624).add(term27628);
        ((ArrayList) term27624).add(term27628);
        ((ArrayList) term27624).add(term27629);
        ((ArrayList) term27624).add(term27630);
        ((ArrayList) term27624).add(term27631);
        Object term27661 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27661, term27661.getClass(), "userReviewId", null);
        setField(term27661, term27661.getClass(), "user", null);
        setField(term27661, term27661.getClass(), "review", null);
        setField(term27661, term27661.getClass(), "date", null);
        Object term27662 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27662, term27662.getClass(), "userReviewId", null);
        setField(term27662, term27662.getClass(), "user", null);
        setField(term27662, term27662.getClass(), "review", null);
        setField(term27662, term27662.getClass(), "date", null);
        ArrayList term27659 = new ArrayList();
        ((ArrayList) term27659).add(term27628);
        ((ArrayList) term27659).add(term27661);
        ((ArrayList) term27659).add(term27626);
        ((ArrayList) term27659).add(term27662);
        ((ArrayList) term27659).add(term27661);
        ((ArrayList) term27659).add(term27661);
        ((ArrayList) term27659).add(term27630);
        term27573 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27574 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27599 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27634 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27665 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27666 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27670 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27574, term27574.getClass(), "userId", "KgtGJGInhu");
        setField(term27574, term27574.getClass(), "reviewId", "mVHDjrsMAV");
        setField(term27573, term27573.getClass(), "userReviewId", term27574);
        setField(term27599, term27599.getClass(), "id", "rjWnqcjYuU");
        setField(term27599, term27599.getClass(), "name", "JhszTkUWCg");
        setField(term27599, term27599.getClass(), "userReviews", term27624);
        setField(term27573, term27573.getClass(), "user", term27599);
        setField(term27634, term27634.getClass(), "id", "zQtuUgUIjK");
        setField(term27634, term27634.getClass(), "review", "VBeGRjPsPN");
        setField(term27634, term27634.getClass(), "userReviews", term27659);
        setField(term27573, term27573.getClass(), "review", term27634);
        setIntField(term27666, term27666.getClass(), "year", 2016);
        setShortField(term27666, term27666.getClass(), "month", (short) 3);
        setShortField(term27666, term27666.getClass(), "day", (short) 20);
        setField(term27665, term27665.getClass(), "date", term27666);
        setByteField(term27670, term27670.getClass(), "hour", (byte) 0);
        setByteField(term27670, term27670.getClass(), "minute", (byte) 54);
        setByteField(term27670, term27670.getClass(), "second", (byte) 6);
        setIntField(term27670, term27670.getClass(), "nano", 183302469);
        setField(term27665, term27665.getClass(), "time", term27670);
        setField(term27573, term27573.getClass(), "date", term27665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term27573, args);
    }

};


