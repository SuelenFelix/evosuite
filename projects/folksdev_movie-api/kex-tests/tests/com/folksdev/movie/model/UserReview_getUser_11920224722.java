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

public class UserReview_getUser_11920224722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25925;

    public UserReview_getUser_11920224722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25978 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term25978, term25978.getClass(), "userReviewId", null);
        setField(term25978, term25978.getClass(), "user", null);
        setField(term25978, term25978.getClass(), "review", null);
        setField(term25978, term25978.getClass(), "date", null);
        Object term25979 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term25979, term25979.getClass(), "userReviewId", null);
        setField(term25979, term25979.getClass(), "user", null);
        setField(term25979, term25979.getClass(), "review", null);
        setField(term25979, term25979.getClass(), "date", null);
        Object term25980 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term25980, term25980.getClass(), "userReviewId", null);
        setField(term25980, term25980.getClass(), "user", null);
        setField(term25980, term25980.getClass(), "review", null);
        setField(term25980, term25980.getClass(), "date", null);
        ArrayList term25976 = new ArrayList();
        ((ArrayList) term25976).add(term25978);
        ((ArrayList) term25976).add(term25979);
        ((ArrayList) term25976).add(term25980);
        Object term26010 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26010, term26010.getClass(), "userReviewId", null);
        setField(term26010, term26010.getClass(), "user", null);
        setField(term26010, term26010.getClass(), "review", null);
        setField(term26010, term26010.getClass(), "date", null);
        Object term26011 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26011, term26011.getClass(), "userReviewId", null);
        setField(term26011, term26011.getClass(), "user", null);
        setField(term26011, term26011.getClass(), "review", null);
        setField(term26011, term26011.getClass(), "date", null);
        ArrayList term26008 = new ArrayList();
        ((ArrayList) term26008).add(term26010);
        ((ArrayList) term26008).add(term25978);
        ((ArrayList) term26008).add(term26011);
        ((ArrayList) term26008).add(term26010);
        ((ArrayList) term26008).add(term26010);
        term25925 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term25926 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term25951 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term25983 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26014 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26015 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26019 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25926, term25926.getClass(), "userId", "mZsPsRzyhQ");
        setField(term25926, term25926.getClass(), "reviewId", "IExlbTemvJ");
        setField(term25925, term25925.getClass(), "userReviewId", term25926);
        setField(term25951, term25951.getClass(), "id", "zaljyXXCoy");
        setField(term25951, term25951.getClass(), "name", "dKoYnXLGEI");
        setField(term25951, term25951.getClass(), "userReviews", term25976);
        setField(term25925, term25925.getClass(), "user", term25951);
        setField(term25983, term25983.getClass(), "id", "AscZyfQFkU");
        setField(term25983, term25983.getClass(), "review", "nPfruizWey");
        setField(term25983, term25983.getClass(), "userReviews", term26008);
        setField(term25925, term25925.getClass(), "review", term25983);
        setIntField(term26015, term26015.getClass(), "year", 2012);
        setShortField(term26015, term26015.getClass(), "month", (short) 3);
        setShortField(term26015, term26015.getClass(), "day", (short) 27);
        setField(term26014, term26014.getClass(), "date", term26015);
        setByteField(term26019, term26019.getClass(), "hour", (byte) 17);
        setByteField(term26019, term26019.getClass(), "minute", (byte) 49);
        setByteField(term26019, term26019.getClass(), "second", (byte) 24);
        setIntField(term26019, term26019.getClass(), "nano", 530647398);
        setField(term26014, term26014.getClass(), "time", term26019);
        setField(term25925, term25925.getClass(), "date", term26014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term25925, args);
    }

};


