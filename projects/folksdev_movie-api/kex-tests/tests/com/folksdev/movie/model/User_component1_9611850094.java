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
import java.util.ArrayList;
import java.lang.Object;

public class User_component1_9611850094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28173;

    public User_component1_9611850094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28200 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28201 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28202 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28203 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28204 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28201, term28201.getClass(), "userId", null);
        setField(term28201, term28201.getClass(), "reviewId", null);
        setField(term28200, term28200.getClass(), "userReviewId", term28201);
        setField(term28202, term28202.getClass(), "id", null);
        setField(term28202, term28202.getClass(), "name", null);
        setField(term28202, term28202.getClass(), "userReviews", null);
        setField(term28200, term28200.getClass(), "user", term28202);
        setField(term28203, term28203.getClass(), "id", null);
        setField(term28203, term28203.getClass(), "review", null);
        setField(term28203, term28203.getClass(), "userReviews", null);
        setField(term28200, term28200.getClass(), "review", term28203);
        setField(term28204, term28204.getClass(), "date", null);
        setField(term28204, term28204.getClass(), "time", null);
        setField(term28200, term28200.getClass(), "date", term28204);
        Object term28205 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28206 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28207 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28208 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28209 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28206, term28206.getClass(), "userId", null);
        setField(term28206, term28206.getClass(), "reviewId", null);
        setField(term28205, term28205.getClass(), "userReviewId", term28206);
        setField(term28207, term28207.getClass(), "id", null);
        setField(term28207, term28207.getClass(), "name", null);
        setField(term28207, term28207.getClass(), "userReviews", null);
        setField(term28205, term28205.getClass(), "user", term28207);
        setField(term28208, term28208.getClass(), "id", null);
        setField(term28208, term28208.getClass(), "review", null);
        setField(term28208, term28208.getClass(), "userReviews", null);
        setField(term28205, term28205.getClass(), "review", term28208);
        setField(term28209, term28209.getClass(), "date", null);
        setField(term28209, term28209.getClass(), "time", null);
        setField(term28205, term28205.getClass(), "date", term28209);
        Object term28210 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28211 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28212 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28213 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28214 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28211, term28211.getClass(), "userId", null);
        setField(term28211, term28211.getClass(), "reviewId", null);
        setField(term28210, term28210.getClass(), "userReviewId", term28211);
        setField(term28212, term28212.getClass(), "id", null);
        setField(term28212, term28212.getClass(), "name", null);
        setField(term28212, term28212.getClass(), "userReviews", null);
        setField(term28210, term28210.getClass(), "user", term28212);
        setField(term28213, term28213.getClass(), "id", null);
        setField(term28213, term28213.getClass(), "review", null);
        setField(term28213, term28213.getClass(), "userReviews", null);
        setField(term28210, term28210.getClass(), "review", term28213);
        setField(term28214, term28214.getClass(), "date", null);
        setField(term28214, term28214.getClass(), "time", null);
        setField(term28210, term28210.getClass(), "date", term28214);
        ArrayList term28198 = new ArrayList();
        ((ArrayList) term28198).add(term28200);
        ((ArrayList) term28198).add(term28205);
        ((ArrayList) term28198).add(term28210);
        ((ArrayList) term28198).add(term28210);
        term28173 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28173, term28173.getClass(), "id", "rBZaHWidIS");
        setField(term28173, term28173.getClass(), "name", "xneQCADwGB");
        setField(term28173, term28173.getClass(), "userReviews", term28198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term28173, args);
    }

};


