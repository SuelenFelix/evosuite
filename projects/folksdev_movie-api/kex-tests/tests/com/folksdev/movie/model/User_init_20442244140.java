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
     Object term27931;

    public User_init_20442244140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27941 = new ArrayList();
        ((ArrayList) term27941).add((Object)null);
        ((ArrayList) term27941).add((Object)null);
        ((ArrayList) term27941).add((Object)null);
        ((ArrayList) term27941).add((Object)null);
        ArrayList term27947 = new ArrayList();
        ((ArrayList) term27947).add((Object)null);
        ((ArrayList) term27947).add((Object)null);
        ((ArrayList) term27947).add((Object)null);
        ((ArrayList) term27947).add((Object)null);
        ((ArrayList) term27947).add((Object)null);
        ((ArrayList) term27947).add((Object)null);
        Object term27934 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27935 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27938 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27944 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27955 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27935, term27935.getClass(), "userId", "");
        setField(term27935, term27935.getClass(), "reviewId", "");
        setField(term27934, term27934.getClass(), "userReviewId", term27935);
        setField(term27938, term27938.getClass(), "id", "");
        setField(term27938, term27938.getClass(), "name", "");
        setField(term27938, term27938.getClass(), "userReviews", term27941);
        setField(term27934, term27934.getClass(), "user", term27938);
        setField(term27944, term27944.getClass(), "id", "");
        setField(term27944, term27944.getClass(), "review", "");
        setField(term27944, term27944.getClass(), "userReviews", term27947);
        setField(term27934, term27934.getClass(), "review", term27944);
        setIntField(term27951, term27951.getClass(), "year", 2021);
        setShortField(term27951, term27951.getClass(), "month", (short) 4);
        setShortField(term27951, term27951.getClass(), "day", (short) 22);
        setField(term27950, term27950.getClass(), "date", term27951);
        setByteField(term27955, term27955.getClass(), "hour", (byte) 17);
        setByteField(term27955, term27955.getClass(), "minute", (byte) 6);
        setByteField(term27955, term27955.getClass(), "second", (byte) 33);
        setIntField(term27955, term27955.getClass(), "nano", 21410850);
        setField(term27950, term27950.getClass(), "time", term27955);
        setField(term27934, term27934.getClass(), "date", term27950);
        term27931 = new LinkedList();
        ((LinkedList) term27931).add(term27934);
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
        args[2] = term27931;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


