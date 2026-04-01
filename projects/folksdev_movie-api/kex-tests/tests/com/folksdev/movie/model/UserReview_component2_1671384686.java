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

public class UserReview_component2_1671384686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26562;

    public UserReview_component2_1671384686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26615 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26615, term26615.getClass(), "userReviewId", null);
        setField(term26615, term26615.getClass(), "user", null);
        setField(term26615, term26615.getClass(), "review", null);
        setField(term26615, term26615.getClass(), "date", null);
        Object term26616 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26616, term26616.getClass(), "userReviewId", null);
        setField(term26616, term26616.getClass(), "user", null);
        setField(term26616, term26616.getClass(), "review", null);
        setField(term26616, term26616.getClass(), "date", null);
        Object term26617 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26617, term26617.getClass(), "userReviewId", null);
        setField(term26617, term26617.getClass(), "user", null);
        setField(term26617, term26617.getClass(), "review", null);
        setField(term26617, term26617.getClass(), "date", null);
        Object term26618 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26618, term26618.getClass(), "userReviewId", null);
        setField(term26618, term26618.getClass(), "user", null);
        setField(term26618, term26618.getClass(), "review", null);
        setField(term26618, term26618.getClass(), "date", null);
        Object term26619 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26619, term26619.getClass(), "userReviewId", null);
        setField(term26619, term26619.getClass(), "user", null);
        setField(term26619, term26619.getClass(), "review", null);
        setField(term26619, term26619.getClass(), "date", null);
        Object term26620 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26620, term26620.getClass(), "userReviewId", null);
        setField(term26620, term26620.getClass(), "user", null);
        setField(term26620, term26620.getClass(), "review", null);
        setField(term26620, term26620.getClass(), "date", null);
        ArrayList term26613 = new ArrayList();
        ((ArrayList) term26613).add(term26615);
        ((ArrayList) term26613).add(term26616);
        ((ArrayList) term26613).add(term26616);
        ((ArrayList) term26613).add(term26617);
        ((ArrayList) term26613).add(term26618);
        ((ArrayList) term26613).add(term26619);
        ((ArrayList) term26613).add(term26616);
        ((ArrayList) term26613).add(term26620);
        Object term26650 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26650, term26650.getClass(), "userReviewId", null);
        setField(term26650, term26650.getClass(), "user", null);
        setField(term26650, term26650.getClass(), "review", null);
        setField(term26650, term26650.getClass(), "date", null);
        Object term26651 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26651, term26651.getClass(), "userReviewId", null);
        setField(term26651, term26651.getClass(), "user", null);
        setField(term26651, term26651.getClass(), "review", null);
        setField(term26651, term26651.getClass(), "date", null);
        ArrayList term26648 = new ArrayList();
        ((ArrayList) term26648).add(term26615);
        ((ArrayList) term26648).add(term26650);
        ((ArrayList) term26648).add(term26620);
        ((ArrayList) term26648).add(term26620);
        ((ArrayList) term26648).add(term26618);
        ((ArrayList) term26648).add(term26651);
        term26562 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26563 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26588 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26623 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26659 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26563, term26563.getClass(), "userId", "QEJBgSNviH");
        setField(term26563, term26563.getClass(), "reviewId", "bjigisSVNp");
        setField(term26562, term26562.getClass(), "userReviewId", term26563);
        setField(term26588, term26588.getClass(), "id", "yJCCaWqQuK");
        setField(term26588, term26588.getClass(), "name", "tgBNqkdndl");
        setField(term26588, term26588.getClass(), "userReviews", term26613);
        setField(term26562, term26562.getClass(), "user", term26588);
        setField(term26623, term26623.getClass(), "id", "LSrqDVjzEP");
        setField(term26623, term26623.getClass(), "review", "CPZCLJxTuA");
        setField(term26623, term26623.getClass(), "userReviews", term26648);
        setField(term26562, term26562.getClass(), "review", term26623);
        setIntField(term26655, term26655.getClass(), "year", 2025);
        setShortField(term26655, term26655.getClass(), "month", (short) 9);
        setShortField(term26655, term26655.getClass(), "day", (short) 25);
        setField(term26654, term26654.getClass(), "date", term26655);
        setByteField(term26659, term26659.getClass(), "hour", (byte) 20);
        setByteField(term26659, term26659.getClass(), "minute", (byte) 0);
        setByteField(term26659, term26659.getClass(), "second", (byte) 25);
        setIntField(term26659, term26659.getClass(), "nano", 65871584);
        setField(term26654, term26654.getClass(), "time", term26659);
        setField(term26562, term26562.getClass(), "date", term26654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term26562, args);
    }

};


