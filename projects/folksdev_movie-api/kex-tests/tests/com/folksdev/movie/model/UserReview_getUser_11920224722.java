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
     Object term25926;

    public UserReview_getUser_11920224722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term25981 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term25981, term25981.getClass(), "userReviewId", null);
        setField(term25981, term25981.getClass(), "user", null);
        setField(term25981, term25981.getClass(), "review", null);
        setField(term25981, term25981.getClass(), "date", null);
        ArrayList term25977 = new ArrayList();
        ((ArrayList) term25977).add(term25979);
        ((ArrayList) term25977).add(term25980);
        ((ArrayList) term25977).add(term25981);
        Object term26011 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26011, term26011.getClass(), "userReviewId", null);
        setField(term26011, term26011.getClass(), "user", null);
        setField(term26011, term26011.getClass(), "review", null);
        setField(term26011, term26011.getClass(), "date", null);
        Object term26012 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26012, term26012.getClass(), "userReviewId", null);
        setField(term26012, term26012.getClass(), "user", null);
        setField(term26012, term26012.getClass(), "review", null);
        setField(term26012, term26012.getClass(), "date", null);
        ArrayList term26009 = new ArrayList();
        ((ArrayList) term26009).add(term26011);
        ((ArrayList) term26009).add(term25979);
        ((ArrayList) term26009).add(term26012);
        ((ArrayList) term26009).add(term26011);
        ((ArrayList) term26009).add(term26011);
        term25926 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term25927 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term25952 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term25984 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26020 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25927, term25927.getClass(), "userId", "mZsPsRzyhQ");
        setField(term25927, term25927.getClass(), "reviewId", "IExlbTemvJ");
        setField(term25926, term25926.getClass(), "userReviewId", term25927);
        setField(term25952, term25952.getClass(), "id", "zaljyXXCoy");
        setField(term25952, term25952.getClass(), "name", "dKoYnXLGEI");
        setField(term25952, term25952.getClass(), "userReviews", term25977);
        setField(term25926, term25926.getClass(), "user", term25952);
        setField(term25984, term25984.getClass(), "id", "AscZyfQFkU");
        setField(term25984, term25984.getClass(), "review", "nPfruizWey");
        setField(term25984, term25984.getClass(), "userReviews", term26009);
        setField(term25926, term25926.getClass(), "review", term25984);
        setIntField(term26016, term26016.getClass(), "year", 2012);
        setShortField(term26016, term26016.getClass(), "month", (short) 3);
        setShortField(term26016, term26016.getClass(), "day", (short) 27);
        setField(term26015, term26015.getClass(), "date", term26016);
        setByteField(term26020, term26020.getClass(), "hour", (byte) 17);
        setByteField(term26020, term26020.getClass(), "minute", (byte) 49);
        setByteField(term26020, term26020.getClass(), "second", (byte) 24);
        setIntField(term26020, term26020.getClass(), "nano", 530647398);
        setField(term26015, term26015.getClass(), "time", term26020);
        setField(term25926, term25926.getClass(), "date", term26015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term25926, args);
    }

};


