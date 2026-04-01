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

public class UserReview_getUserReviewId_9614393421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25770;

    public UserReview_getUserReviewId_9614393421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25823 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term25823, term25823.getClass(), "userReviewId", null);
        setField(term25823, term25823.getClass(), "user", null);
        setField(term25823, term25823.getClass(), "review", null);
        setField(term25823, term25823.getClass(), "date", null);
        ArrayList term25821 = new ArrayList();
        ((ArrayList) term25821).add(term25823);
        ArrayList term25851 = new ArrayList();
        ((ArrayList) term25851).add(term25823);
        term25770 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term25771 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term25796 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term25826 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term25855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25860 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25771, term25771.getClass(), "userId", "jAxYagPvcV");
        setField(term25771, term25771.getClass(), "reviewId", "ZXLgGUqgyW");
        setField(term25770, term25770.getClass(), "userReviewId", term25771);
        setField(term25796, term25796.getClass(), "id", "PdeSzTcBgY");
        setField(term25796, term25796.getClass(), "name", "PmSvMYNoIS");
        setField(term25796, term25796.getClass(), "userReviews", term25821);
        setField(term25770, term25770.getClass(), "user", term25796);
        setField(term25826, term25826.getClass(), "id", "iGWkLjLGBY");
        setField(term25826, term25826.getClass(), "review", "jUkXaNkoAg");
        setField(term25826, term25826.getClass(), "userReviews", term25851);
        setField(term25770, term25770.getClass(), "review", term25826);
        setIntField(term25856, term25856.getClass(), "year", 2027);
        setShortField(term25856, term25856.getClass(), "month", (short) 2);
        setShortField(term25856, term25856.getClass(), "day", (short) 19);
        setField(term25855, term25855.getClass(), "date", term25856);
        setByteField(term25860, term25860.getClass(), "hour", (byte) 17);
        setByteField(term25860, term25860.getClass(), "minute", (byte) 37);
        setByteField(term25860, term25860.getClass(), "second", (byte) 27);
        setIntField(term25860, term25860.getClass(), "nano", 920380537);
        setField(term25855, term25855.getClass(), "time", term25860);
        setField(term25770, term25770.getClass(), "date", term25855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserReviewId", argTypes, term25770, args);
    }

};


