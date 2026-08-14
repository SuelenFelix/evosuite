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
     Object term26563;

    public UserReview_component2_1671384686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term26621 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26621, term26621.getClass(), "userReviewId", null);
        setField(term26621, term26621.getClass(), "user", null);
        setField(term26621, term26621.getClass(), "review", null);
        setField(term26621, term26621.getClass(), "date", null);
        ArrayList term26614 = new ArrayList();
        ((ArrayList) term26614).add(term26616);
        ((ArrayList) term26614).add(term26617);
        ((ArrayList) term26614).add(term26617);
        ((ArrayList) term26614).add(term26618);
        ((ArrayList) term26614).add(term26619);
        ((ArrayList) term26614).add(term26620);
        ((ArrayList) term26614).add(term26617);
        ((ArrayList) term26614).add(term26621);
        Object term26651 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26651, term26651.getClass(), "userReviewId", null);
        setField(term26651, term26651.getClass(), "user", null);
        setField(term26651, term26651.getClass(), "review", null);
        setField(term26651, term26651.getClass(), "date", null);
        Object term26652 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26652, term26652.getClass(), "userReviewId", null);
        setField(term26652, term26652.getClass(), "user", null);
        setField(term26652, term26652.getClass(), "review", null);
        setField(term26652, term26652.getClass(), "date", null);
        ArrayList term26649 = new ArrayList();
        ((ArrayList) term26649).add(term26616);
        ((ArrayList) term26649).add(term26651);
        ((ArrayList) term26649).add(term26621);
        ((ArrayList) term26649).add(term26621);
        ((ArrayList) term26649).add(term26619);
        ((ArrayList) term26649).add(term26652);
        term26563 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26564 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26589 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26624 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26655 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26656 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26660 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26564, term26564.getClass(), "userId", "QEJBgSNviH");
        setField(term26564, term26564.getClass(), "reviewId", "bjigisSVNp");
        setField(term26563, term26563.getClass(), "userReviewId", term26564);
        setField(term26589, term26589.getClass(), "id", "yJCCaWqQuK");
        setField(term26589, term26589.getClass(), "name", "tgBNqkdndl");
        setField(term26589, term26589.getClass(), "userReviews", term26614);
        setField(term26563, term26563.getClass(), "user", term26589);
        setField(term26624, term26624.getClass(), "id", "LSrqDVjzEP");
        setField(term26624, term26624.getClass(), "review", "CPZCLJxTuA");
        setField(term26624, term26624.getClass(), "userReviews", term26649);
        setField(term26563, term26563.getClass(), "review", term26624);
        setIntField(term26656, term26656.getClass(), "year", 2025);
        setShortField(term26656, term26656.getClass(), "month", (short) 9);
        setShortField(term26656, term26656.getClass(), "day", (short) 25);
        setField(term26655, term26655.getClass(), "date", term26656);
        setByteField(term26660, term26660.getClass(), "hour", (byte) 20);
        setByteField(term26660, term26660.getClass(), "minute", (byte) 0);
        setByteField(term26660, term26660.getClass(), "second", (byte) 25);
        setIntField(term26660, term26660.getClass(), "nano", 65871584);
        setField(term26655, term26655.getClass(), "time", term26660);
        setField(term26563, term26563.getClass(), "date", term26655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term26563, args);
    }

};


