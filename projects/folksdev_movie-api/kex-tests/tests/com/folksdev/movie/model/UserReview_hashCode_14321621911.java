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
     Object term27571;

    public UserReview_hashCode_14321621911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27624 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27624, term27624.getClass(), "userReviewId", null);
        setField(term27624, term27624.getClass(), "user", null);
        setField(term27624, term27624.getClass(), "review", null);
        setField(term27624, term27624.getClass(), "date", null);
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
        ArrayList term27622 = new ArrayList();
        ((ArrayList) term27622).add(term27624);
        ((ArrayList) term27622).add(term27625);
        ((ArrayList) term27622).add(term27624);
        ((ArrayList) term27622).add(term27626);
        ((ArrayList) term27622).add(term27626);
        ((ArrayList) term27622).add(term27627);
        ((ArrayList) term27622).add(term27628);
        ((ArrayList) term27622).add(term27629);
        Object term27659 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27659, term27659.getClass(), "userReviewId", null);
        setField(term27659, term27659.getClass(), "user", null);
        setField(term27659, term27659.getClass(), "review", null);
        setField(term27659, term27659.getClass(), "date", null);
        Object term27660 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27660, term27660.getClass(), "userReviewId", null);
        setField(term27660, term27660.getClass(), "user", null);
        setField(term27660, term27660.getClass(), "review", null);
        setField(term27660, term27660.getClass(), "date", null);
        ArrayList term27657 = new ArrayList();
        ((ArrayList) term27657).add(term27626);
        ((ArrayList) term27657).add(term27659);
        ((ArrayList) term27657).add(term27624);
        ((ArrayList) term27657).add(term27660);
        ((ArrayList) term27657).add(term27659);
        ((ArrayList) term27657).add(term27659);
        ((ArrayList) term27657).add(term27628);
        term27571 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27572 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27597 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27632 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27668 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27572, term27572.getClass(), "userId", "KgtGJGInhu");
        setField(term27572, term27572.getClass(), "reviewId", "mVHDjrsMAV");
        setField(term27571, term27571.getClass(), "userReviewId", term27572);
        setField(term27597, term27597.getClass(), "id", "rjWnqcjYuU");
        setField(term27597, term27597.getClass(), "name", "JhszTkUWCg");
        setField(term27597, term27597.getClass(), "userReviews", term27622);
        setField(term27571, term27571.getClass(), "user", term27597);
        setField(term27632, term27632.getClass(), "id", "zQtuUgUIjK");
        setField(term27632, term27632.getClass(), "review", "VBeGRjPsPN");
        setField(term27632, term27632.getClass(), "userReviews", term27657);
        setField(term27571, term27571.getClass(), "review", term27632);
        setIntField(term27664, term27664.getClass(), "year", 2016);
        setShortField(term27664, term27664.getClass(), "month", (short) 3);
        setShortField(term27664, term27664.getClass(), "day", (short) 20);
        setField(term27663, term27663.getClass(), "date", term27664);
        setByteField(term27668, term27668.getClass(), "hour", (byte) 0);
        setByteField(term27668, term27668.getClass(), "minute", (byte) 54);
        setByteField(term27668, term27668.getClass(), "second", (byte) 6);
        setIntField(term27668, term27668.getClass(), "nano", 183302469);
        setField(term27663, term27663.getClass(), "time", term27668);
        setField(term27571, term27571.getClass(), "date", term27663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term27571, args);
    }

};


