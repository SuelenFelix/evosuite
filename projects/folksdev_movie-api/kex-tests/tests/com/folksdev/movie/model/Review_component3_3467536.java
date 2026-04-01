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
     Object term29170;

    public Review_component3_3467536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29197 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29198 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29199 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29200 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29201 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29198, term29198.getClass(), "userId", null);
        setField(term29198, term29198.getClass(), "reviewId", null);
        setField(term29197, term29197.getClass(), "userReviewId", term29198);
        setField(term29199, term29199.getClass(), "id", null);
        setField(term29199, term29199.getClass(), "name", null);
        setField(term29199, term29199.getClass(), "userReviews", null);
        setField(term29197, term29197.getClass(), "user", term29199);
        setField(term29200, term29200.getClass(), "id", null);
        setField(term29200, term29200.getClass(), "review", null);
        setField(term29200, term29200.getClass(), "userReviews", null);
        setField(term29197, term29197.getClass(), "review", term29200);
        setField(term29201, term29201.getClass(), "date", null);
        setField(term29201, term29201.getClass(), "time", null);
        setField(term29197, term29197.getClass(), "date", term29201);
        Object term29202 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29203 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29204 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29205 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29203, term29203.getClass(), "userId", null);
        setField(term29203, term29203.getClass(), "reviewId", null);
        setField(term29202, term29202.getClass(), "userReviewId", term29203);
        setField(term29204, term29204.getClass(), "id", null);
        setField(term29204, term29204.getClass(), "name", null);
        setField(term29204, term29204.getClass(), "userReviews", null);
        setField(term29202, term29202.getClass(), "user", term29204);
        setField(term29202, term29202.getClass(), "review", term29200);
        setField(term29205, term29205.getClass(), "date", null);
        setField(term29205, term29205.getClass(), "time", null);
        setField(term29202, term29202.getClass(), "date", term29205);
        Object term29206 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29207 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29208 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29209 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29210 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29207, term29207.getClass(), "userId", null);
        setField(term29207, term29207.getClass(), "reviewId", null);
        setField(term29206, term29206.getClass(), "userReviewId", term29207);
        setField(term29208, term29208.getClass(), "id", null);
        setField(term29208, term29208.getClass(), "name", null);
        setField(term29208, term29208.getClass(), "userReviews", null);
        setField(term29206, term29206.getClass(), "user", term29208);
        setField(term29209, term29209.getClass(), "id", null);
        setField(term29209, term29209.getClass(), "review", null);
        setField(term29209, term29209.getClass(), "userReviews", null);
        setField(term29206, term29206.getClass(), "review", term29209);
        setField(term29210, term29210.getClass(), "date", null);
        setField(term29210, term29210.getClass(), "time", null);
        setField(term29206, term29206.getClass(), "date", term29210);
        Object term29211 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29212 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29213 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29214 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29215 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29212, term29212.getClass(), "userId", null);
        setField(term29212, term29212.getClass(), "reviewId", null);
        setField(term29211, term29211.getClass(), "userReviewId", term29212);
        setField(term29213, term29213.getClass(), "id", null);
        setField(term29213, term29213.getClass(), "name", null);
        setField(term29213, term29213.getClass(), "userReviews", null);
        setField(term29211, term29211.getClass(), "user", term29213);
        setField(term29214, term29214.getClass(), "id", null);
        setField(term29214, term29214.getClass(), "review", null);
        setField(term29214, term29214.getClass(), "userReviews", null);
        setField(term29211, term29211.getClass(), "review", term29214);
        setField(term29215, term29215.getClass(), "date", null);
        setField(term29215, term29215.getClass(), "time", null);
        setField(term29211, term29211.getClass(), "date", term29215);
        ArrayList term29195 = new ArrayList();
        ((ArrayList) term29195).add(term29197);
        ((ArrayList) term29195).add(term29202);
        ((ArrayList) term29195).add(term29206);
        ((ArrayList) term29195).add(term29211);
        term29170 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29170, term29170.getClass(), "id", "uUYeaeRaCx");
        setField(term29170, term29170.getClass(), "review", "oCpxzVdxcV");
        setField(term29170, term29170.getClass(), "userReviews", term29195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term29170, args);
    }

};


