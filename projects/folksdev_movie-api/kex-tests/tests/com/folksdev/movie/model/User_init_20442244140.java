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
     Object term27933;

    public User_init_20442244140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27943 = new ArrayList();
        ((ArrayList) term27943).add((Object)null);
        ((ArrayList) term27943).add((Object)null);
        ((ArrayList) term27943).add((Object)null);
        ((ArrayList) term27943).add((Object)null);
        ArrayList term27949 = new ArrayList();
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        ((ArrayList) term27949).add((Object)null);
        Object term27936 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27937 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27940 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27946 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27957 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27937, term27937.getClass(), "userId", "");
        setField(term27937, term27937.getClass(), "reviewId", "");
        setField(term27936, term27936.getClass(), "userReviewId", term27937);
        setField(term27940, term27940.getClass(), "id", "");
        setField(term27940, term27940.getClass(), "name", "");
        setField(term27940, term27940.getClass(), "userReviews", term27943);
        setField(term27936, term27936.getClass(), "user", term27940);
        setField(term27946, term27946.getClass(), "id", "");
        setField(term27946, term27946.getClass(), "review", "");
        setField(term27946, term27946.getClass(), "userReviews", term27949);
        setField(term27936, term27936.getClass(), "review", term27946);
        setIntField(term27953, term27953.getClass(), "year", 2021);
        setShortField(term27953, term27953.getClass(), "month", (short) 4);
        setShortField(term27953, term27953.getClass(), "day", (short) 22);
        setField(term27952, term27952.getClass(), "date", term27953);
        setByteField(term27957, term27957.getClass(), "hour", (byte) 17);
        setByteField(term27957, term27957.getClass(), "minute", (byte) 6);
        setByteField(term27957, term27957.getClass(), "second", (byte) 33);
        setIntField(term27957, term27957.getClass(), "nano", 21410850);
        setField(term27952, term27952.getClass(), "time", term27957);
        setField(term27936, term27936.getClass(), "date", term27952);
        term27933 = new LinkedList();
        ((LinkedList) term27933).add(term27936);
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
        args[2] = term27933;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


