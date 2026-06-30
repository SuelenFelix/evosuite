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
     Object term25927;

    public UserReview_getUser_11920224722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term25982 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term25982, term25982.getClass(), "userReviewId", null);
        setField(term25982, term25982.getClass(), "user", null);
        setField(term25982, term25982.getClass(), "review", null);
        setField(term25982, term25982.getClass(), "date", null);
        ArrayList term25978 = new ArrayList();
        ((ArrayList) term25978).add(term25980);
        ((ArrayList) term25978).add(term25981);
        ((ArrayList) term25978).add(term25982);
        Object term26012 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26012, term26012.getClass(), "userReviewId", null);
        setField(term26012, term26012.getClass(), "user", null);
        setField(term26012, term26012.getClass(), "review", null);
        setField(term26012, term26012.getClass(), "date", null);
        Object term26013 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26013, term26013.getClass(), "userReviewId", null);
        setField(term26013, term26013.getClass(), "user", null);
        setField(term26013, term26013.getClass(), "review", null);
        setField(term26013, term26013.getClass(), "date", null);
        ArrayList term26010 = new ArrayList();
        ((ArrayList) term26010).add(term26012);
        ((ArrayList) term26010).add(term25980);
        ((ArrayList) term26010).add(term26013);
        ((ArrayList) term26010).add(term26012);
        ((ArrayList) term26010).add(term26012);
        term25927 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term25928 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term25953 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term25985 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26016 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26021 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25928, term25928.getClass(), "userId", "mZsPsRzyhQ");
        setField(term25928, term25928.getClass(), "reviewId", "IExlbTemvJ");
        setField(term25927, term25927.getClass(), "userReviewId", term25928);
        setField(term25953, term25953.getClass(), "id", "zaljyXXCoy");
        setField(term25953, term25953.getClass(), "name", "dKoYnXLGEI");
        setField(term25953, term25953.getClass(), "userReviews", term25978);
        setField(term25927, term25927.getClass(), "user", term25953);
        setField(term25985, term25985.getClass(), "id", "AscZyfQFkU");
        setField(term25985, term25985.getClass(), "review", "nPfruizWey");
        setField(term25985, term25985.getClass(), "userReviews", term26010);
        setField(term25927, term25927.getClass(), "review", term25985);
        setIntField(term26017, term26017.getClass(), "year", 2012);
        setShortField(term26017, term26017.getClass(), "month", (short) 3);
        setShortField(term26017, term26017.getClass(), "day", (short) 27);
        setField(term26016, term26016.getClass(), "date", term26017);
        setByteField(term26021, term26021.getClass(), "hour", (byte) 17);
        setByteField(term26021, term26021.getClass(), "minute", (byte) 49);
        setByteField(term26021, term26021.getClass(), "second", (byte) 24);
        setIntField(term26021, term26021.getClass(), "nano", 530647398);
        setField(term26016, term26016.getClass(), "time", term26021);
        setField(term25927, term25927.getClass(), "date", term26016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term25927, args);
    }

};


