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
     Object term29172;

    public Review_component3_3467536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29199 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29200 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29201 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29202 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29203 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29200, term29200.getClass(), "userId", null);
        setField(term29200, term29200.getClass(), "reviewId", null);
        setField(term29199, term29199.getClass(), "userReviewId", term29200);
        setField(term29201, term29201.getClass(), "id", null);
        setField(term29201, term29201.getClass(), "name", null);
        setField(term29201, term29201.getClass(), "userReviews", null);
        setField(term29199, term29199.getClass(), "user", term29201);
        setField(term29202, term29202.getClass(), "id", null);
        setField(term29202, term29202.getClass(), "review", null);
        setField(term29202, term29202.getClass(), "userReviews", null);
        setField(term29199, term29199.getClass(), "review", term29202);
        setField(term29203, term29203.getClass(), "date", null);
        setField(term29203, term29203.getClass(), "time", null);
        setField(term29199, term29199.getClass(), "date", term29203);
        Object term29204 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29205 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29206 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29207 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29205, term29205.getClass(), "userId", null);
        setField(term29205, term29205.getClass(), "reviewId", null);
        setField(term29204, term29204.getClass(), "userReviewId", term29205);
        setField(term29206, term29206.getClass(), "id", null);
        setField(term29206, term29206.getClass(), "name", null);
        setField(term29206, term29206.getClass(), "userReviews", null);
        setField(term29204, term29204.getClass(), "user", term29206);
        setField(term29204, term29204.getClass(), "review", term29202);
        setField(term29207, term29207.getClass(), "date", null);
        setField(term29207, term29207.getClass(), "time", null);
        setField(term29204, term29204.getClass(), "date", term29207);
        Object term29208 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29209 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29210 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29211 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29212 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29209, term29209.getClass(), "userId", null);
        setField(term29209, term29209.getClass(), "reviewId", null);
        setField(term29208, term29208.getClass(), "userReviewId", term29209);
        setField(term29210, term29210.getClass(), "id", null);
        setField(term29210, term29210.getClass(), "name", null);
        setField(term29210, term29210.getClass(), "userReviews", null);
        setField(term29208, term29208.getClass(), "user", term29210);
        setField(term29211, term29211.getClass(), "id", null);
        setField(term29211, term29211.getClass(), "review", null);
        setField(term29211, term29211.getClass(), "userReviews", null);
        setField(term29208, term29208.getClass(), "review", term29211);
        setField(term29212, term29212.getClass(), "date", null);
        setField(term29212, term29212.getClass(), "time", null);
        setField(term29208, term29208.getClass(), "date", term29212);
        Object term29213 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29214 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29215 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29216 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29217 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29214, term29214.getClass(), "userId", null);
        setField(term29214, term29214.getClass(), "reviewId", null);
        setField(term29213, term29213.getClass(), "userReviewId", term29214);
        setField(term29215, term29215.getClass(), "id", null);
        setField(term29215, term29215.getClass(), "name", null);
        setField(term29215, term29215.getClass(), "userReviews", null);
        setField(term29213, term29213.getClass(), "user", term29215);
        setField(term29216, term29216.getClass(), "id", null);
        setField(term29216, term29216.getClass(), "review", null);
        setField(term29216, term29216.getClass(), "userReviews", null);
        setField(term29213, term29213.getClass(), "review", term29216);
        setField(term29217, term29217.getClass(), "date", null);
        setField(term29217, term29217.getClass(), "time", null);
        setField(term29213, term29213.getClass(), "date", term29217);
        ArrayList term29197 = new ArrayList();
        ((ArrayList) term29197).add(term29199);
        ((ArrayList) term29197).add(term29204);
        ((ArrayList) term29197).add(term29208);
        ((ArrayList) term29197).add(term29213);
        term29172 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29172, term29172.getClass(), "id", "uUYeaeRaCx");
        setField(term29172, term29172.getClass(), "review", "oCpxzVdxcV");
        setField(term29172, term29172.getClass(), "userReviews", term29197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term29172, args);
    }

};


