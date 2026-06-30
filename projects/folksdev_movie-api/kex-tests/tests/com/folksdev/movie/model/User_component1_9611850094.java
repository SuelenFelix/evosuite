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
     Object term28175;

    public User_component1_9611850094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28202 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28203 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28204 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28205 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28206 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28203, term28203.getClass(), "userId", null);
        setField(term28203, term28203.getClass(), "reviewId", null);
        setField(term28202, term28202.getClass(), "userReviewId", term28203);
        setField(term28204, term28204.getClass(), "id", null);
        setField(term28204, term28204.getClass(), "name", null);
        setField(term28204, term28204.getClass(), "userReviews", null);
        setField(term28202, term28202.getClass(), "user", term28204);
        setField(term28205, term28205.getClass(), "id", null);
        setField(term28205, term28205.getClass(), "review", null);
        setField(term28205, term28205.getClass(), "userReviews", null);
        setField(term28202, term28202.getClass(), "review", term28205);
        setField(term28206, term28206.getClass(), "date", null);
        setField(term28206, term28206.getClass(), "time", null);
        setField(term28202, term28202.getClass(), "date", term28206);
        Object term28207 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28208 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28209 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28210 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28211 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28208, term28208.getClass(), "userId", null);
        setField(term28208, term28208.getClass(), "reviewId", null);
        setField(term28207, term28207.getClass(), "userReviewId", term28208);
        setField(term28209, term28209.getClass(), "id", null);
        setField(term28209, term28209.getClass(), "name", null);
        setField(term28209, term28209.getClass(), "userReviews", null);
        setField(term28207, term28207.getClass(), "user", term28209);
        setField(term28210, term28210.getClass(), "id", null);
        setField(term28210, term28210.getClass(), "review", null);
        setField(term28210, term28210.getClass(), "userReviews", null);
        setField(term28207, term28207.getClass(), "review", term28210);
        setField(term28211, term28211.getClass(), "date", null);
        setField(term28211, term28211.getClass(), "time", null);
        setField(term28207, term28207.getClass(), "date", term28211);
        Object term28212 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28213 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28214 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28215 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28216 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28213, term28213.getClass(), "userId", null);
        setField(term28213, term28213.getClass(), "reviewId", null);
        setField(term28212, term28212.getClass(), "userReviewId", term28213);
        setField(term28214, term28214.getClass(), "id", null);
        setField(term28214, term28214.getClass(), "name", null);
        setField(term28214, term28214.getClass(), "userReviews", null);
        setField(term28212, term28212.getClass(), "user", term28214);
        setField(term28215, term28215.getClass(), "id", null);
        setField(term28215, term28215.getClass(), "review", null);
        setField(term28215, term28215.getClass(), "userReviews", null);
        setField(term28212, term28212.getClass(), "review", term28215);
        setField(term28216, term28216.getClass(), "date", null);
        setField(term28216, term28216.getClass(), "time", null);
        setField(term28212, term28212.getClass(), "date", term28216);
        ArrayList term28200 = new ArrayList();
        ((ArrayList) term28200).add(term28202);
        ((ArrayList) term28200).add(term28207);
        ((ArrayList) term28200).add(term28212);
        ((ArrayList) term28200).add(term28212);
        term28175 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28175, term28175.getClass(), "id", "rBZaHWidIS");
        setField(term28175, term28175.getClass(), "name", "xneQCADwGB");
        setField(term28175, term28175.getClass(), "userReviews", term28200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term28175, args);
    }

};


