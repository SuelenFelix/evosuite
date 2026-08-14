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

public class Review_component3_3467536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29171;

    public Review_component3_3467536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29198 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29199 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29200 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29201 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29202 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29199, term29199.getClass(), "userId", null);
        setField(term29199, term29199.getClass(), "reviewId", null);
        setField(term29198, term29198.getClass(), "userReviewId", term29199);
        setField(term29200, term29200.getClass(), "id", null);
        setField(term29200, term29200.getClass(), "name", null);
        setField(term29200, term29200.getClass(), "userReviews", null);
        setField(term29198, term29198.getClass(), "user", term29200);
        setField(term29201, term29201.getClass(), "id", null);
        setField(term29201, term29201.getClass(), "review", null);
        setField(term29201, term29201.getClass(), "userReviews", null);
        setField(term29198, term29198.getClass(), "review", term29201);
        setField(term29202, term29202.getClass(), "date", null);
        setField(term29202, term29202.getClass(), "time", null);
        setField(term29198, term29198.getClass(), "date", term29202);
        Object term29203 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29204 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29205 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29206 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29204, term29204.getClass(), "userId", null);
        setField(term29204, term29204.getClass(), "reviewId", null);
        setField(term29203, term29203.getClass(), "userReviewId", term29204);
        setField(term29205, term29205.getClass(), "id", null);
        setField(term29205, term29205.getClass(), "name", null);
        setField(term29205, term29205.getClass(), "userReviews", null);
        setField(term29203, term29203.getClass(), "user", term29205);
        setField(term29203, term29203.getClass(), "review", term29201);
        setField(term29206, term29206.getClass(), "date", null);
        setField(term29206, term29206.getClass(), "time", null);
        setField(term29203, term29203.getClass(), "date", term29206);
        Object term29207 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29208 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29209 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29210 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29211 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29208, term29208.getClass(), "userId", null);
        setField(term29208, term29208.getClass(), "reviewId", null);
        setField(term29207, term29207.getClass(), "userReviewId", term29208);
        setField(term29209, term29209.getClass(), "id", null);
        setField(term29209, term29209.getClass(), "name", null);
        setField(term29209, term29209.getClass(), "userReviews", null);
        setField(term29207, term29207.getClass(), "user", term29209);
        setField(term29210, term29210.getClass(), "id", null);
        setField(term29210, term29210.getClass(), "review", null);
        setField(term29210, term29210.getClass(), "userReviews", null);
        setField(term29207, term29207.getClass(), "review", term29210);
        setField(term29211, term29211.getClass(), "date", null);
        setField(term29211, term29211.getClass(), "time", null);
        setField(term29207, term29207.getClass(), "date", term29211);
        Object term29212 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29213 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29214 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29215 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29216 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29213, term29213.getClass(), "userId", null);
        setField(term29213, term29213.getClass(), "reviewId", null);
        setField(term29212, term29212.getClass(), "userReviewId", term29213);
        setField(term29214, term29214.getClass(), "id", null);
        setField(term29214, term29214.getClass(), "name", null);
        setField(term29214, term29214.getClass(), "userReviews", null);
        setField(term29212, term29212.getClass(), "user", term29214);
        setField(term29215, term29215.getClass(), "id", null);
        setField(term29215, term29215.getClass(), "review", null);
        setField(term29215, term29215.getClass(), "userReviews", null);
        setField(term29212, term29212.getClass(), "review", term29215);
        setField(term29216, term29216.getClass(), "date", null);
        setField(term29216, term29216.getClass(), "time", null);
        setField(term29212, term29212.getClass(), "date", term29216);
        ArrayList term29196 = new ArrayList();
        ((ArrayList) term29196).add(term29198);
        ((ArrayList) term29196).add(term29203);
        ((ArrayList) term29196).add(term29207);
        ((ArrayList) term29196).add(term29212);
        term29171 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29171, term29171.getClass(), "id", "uUYeaeRaCx");
        setField(term29171, term29171.getClass(), "review", "oCpxzVdxcV");
        setField(term29171, term29171.getClass(), "userReviews", term29196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term29171, args);
    }

};


