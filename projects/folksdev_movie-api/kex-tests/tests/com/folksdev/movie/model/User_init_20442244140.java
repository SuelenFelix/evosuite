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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class User_init_20442244140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27932;

    public User_init_20442244140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27942 = new ArrayList();
        ((ArrayList) term27942).add((Object)null);
        ((ArrayList) term27942).add((Object)null);
        ((ArrayList) term27942).add((Object)null);
        ((ArrayList) term27942).add((Object)null);
        ArrayList term27948 = new ArrayList();
        ((ArrayList) term27948).add((Object)null);
        ((ArrayList) term27948).add((Object)null);
        ((ArrayList) term27948).add((Object)null);
        ((ArrayList) term27948).add((Object)null);
        ((ArrayList) term27948).add((Object)null);
        ((ArrayList) term27948).add((Object)null);
        Object term27935 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27936 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27939 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27945 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27951 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27952 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27956 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27936, term27936.getClass(), "userId", "");
        setField(term27936, term27936.getClass(), "reviewId", "");
        setField(term27935, term27935.getClass(), "userReviewId", term27936);
        setField(term27939, term27939.getClass(), "id", "");
        setField(term27939, term27939.getClass(), "name", "");
        setField(term27939, term27939.getClass(), "userReviews", term27942);
        setField(term27935, term27935.getClass(), "user", term27939);
        setField(term27945, term27945.getClass(), "id", "");
        setField(term27945, term27945.getClass(), "review", "");
        setField(term27945, term27945.getClass(), "userReviews", term27948);
        setField(term27935, term27935.getClass(), "review", term27945);
        setIntField(term27952, term27952.getClass(), "year", 2021);
        setShortField(term27952, term27952.getClass(), "month", (short) 4);
        setShortField(term27952, term27952.getClass(), "day", (short) 22);
        setField(term27951, term27951.getClass(), "date", term27952);
        setByteField(term27956, term27956.getClass(), "hour", (byte) 17);
        setByteField(term27956, term27956.getClass(), "minute", (byte) 6);
        setByteField(term27956, term27956.getClass(), "second", (byte) 33);
        setIntField(term27956, term27956.getClass(), "nano", 21410850);
        setField(term27951, term27951.getClass(), "time", term27956);
        setField(term27935, term27935.getClass(), "date", term27951);
        term27932 = new LinkedList();
        ((LinkedList) term27932).add(term27935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "ITJMSWaPGZ";
        args[1] = "ivvEvcUacU";
        args[2] = term27932;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


