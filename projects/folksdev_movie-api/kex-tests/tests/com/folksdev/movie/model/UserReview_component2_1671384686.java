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
     Object term26564;

    public UserReview_component2_1671384686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term26622 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26622, term26622.getClass(), "userReviewId", null);
        setField(term26622, term26622.getClass(), "user", null);
        setField(term26622, term26622.getClass(), "review", null);
        setField(term26622, term26622.getClass(), "date", null);
        ArrayList term26615 = new ArrayList();
        ((ArrayList) term26615).add(term26617);
        ((ArrayList) term26615).add(term26618);
        ((ArrayList) term26615).add(term26618);
        ((ArrayList) term26615).add(term26619);
        ((ArrayList) term26615).add(term26620);
        ((ArrayList) term26615).add(term26621);
        ((ArrayList) term26615).add(term26618);
        ((ArrayList) term26615).add(term26622);
        Object term26652 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26652, term26652.getClass(), "userReviewId", null);
        setField(term26652, term26652.getClass(), "user", null);
        setField(term26652, term26652.getClass(), "review", null);
        setField(term26652, term26652.getClass(), "date", null);
        Object term26653 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26653, term26653.getClass(), "userReviewId", null);
        setField(term26653, term26653.getClass(), "user", null);
        setField(term26653, term26653.getClass(), "review", null);
        setField(term26653, term26653.getClass(), "date", null);
        ArrayList term26650 = new ArrayList();
        ((ArrayList) term26650).add(term26617);
        ((ArrayList) term26650).add(term26652);
        ((ArrayList) term26650).add(term26622);
        ((ArrayList) term26650).add(term26622);
        ((ArrayList) term26650).add(term26620);
        ((ArrayList) term26650).add(term26653);
        term26564 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26565 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26590 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26625 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26656 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26657 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26661 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26565, term26565.getClass(), "userId", "QEJBgSNviH");
        setField(term26565, term26565.getClass(), "reviewId", "bjigisSVNp");
        setField(term26564, term26564.getClass(), "userReviewId", term26565);
        setField(term26590, term26590.getClass(), "id", "yJCCaWqQuK");
        setField(term26590, term26590.getClass(), "name", "tgBNqkdndl");
        setField(term26590, term26590.getClass(), "userReviews", term26615);
        setField(term26564, term26564.getClass(), "user", term26590);
        setField(term26625, term26625.getClass(), "id", "LSrqDVjzEP");
        setField(term26625, term26625.getClass(), "review", "CPZCLJxTuA");
        setField(term26625, term26625.getClass(), "userReviews", term26650);
        setField(term26564, term26564.getClass(), "review", term26625);
        setIntField(term26657, term26657.getClass(), "year", 2025);
        setShortField(term26657, term26657.getClass(), "month", (short) 9);
        setShortField(term26657, term26657.getClass(), "day", (short) 25);
        setField(term26656, term26656.getClass(), "date", term26657);
        setByteField(term26661, term26661.getClass(), "hour", (byte) 20);
        setByteField(term26661, term26661.getClass(), "minute", (byte) 0);
        setByteField(term26661, term26661.getClass(), "second", (byte) 25);
        setIntField(term26661, term26661.getClass(), "nano", 65871584);
        setField(term26656, term26656.getClass(), "time", term26661);
        setField(term26564, term26564.getClass(), "date", term26656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term26564, args);
    }

};


