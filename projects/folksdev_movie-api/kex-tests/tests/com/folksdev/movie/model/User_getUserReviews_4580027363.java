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

public class User_getUserReviews_4580027363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28115;

    public User_getUserReviews_4580027363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28142 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28143 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28144 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28145 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28146 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28143, term28143.getClass(), "userId", null);
        setField(term28143, term28143.getClass(), "reviewId", null);
        setField(term28142, term28142.getClass(), "userReviewId", term28143);
        setField(term28144, term28144.getClass(), "id", null);
        setField(term28144, term28144.getClass(), "name", null);
        setField(term28144, term28144.getClass(), "userReviews", null);
        setField(term28142, term28142.getClass(), "user", term28144);
        setField(term28145, term28145.getClass(), "id", null);
        setField(term28145, term28145.getClass(), "review", null);
        setField(term28145, term28145.getClass(), "userReviews", null);
        setField(term28142, term28142.getClass(), "review", term28145);
        setField(term28146, term28146.getClass(), "date", null);
        setField(term28146, term28146.getClass(), "time", null);
        setField(term28142, term28142.getClass(), "date", term28146);
        Object term28147 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28148 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28149 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28150 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28151 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28148, term28148.getClass(), "userId", null);
        setField(term28148, term28148.getClass(), "reviewId", null);
        setField(term28147, term28147.getClass(), "userReviewId", term28148);
        setField(term28149, term28149.getClass(), "id", null);
        setField(term28149, term28149.getClass(), "name", null);
        setField(term28149, term28149.getClass(), "userReviews", null);
        setField(term28147, term28147.getClass(), "user", term28149);
        setField(term28150, term28150.getClass(), "id", null);
        setField(term28150, term28150.getClass(), "review", null);
        setField(term28150, term28150.getClass(), "userReviews", null);
        setField(term28147, term28147.getClass(), "review", term28150);
        setField(term28151, term28151.getClass(), "date", null);
        setField(term28151, term28151.getClass(), "time", null);
        setField(term28147, term28147.getClass(), "date", term28151);
        ArrayList term28140 = new ArrayList();
        ((ArrayList) term28140).add(term28142);
        ((ArrayList) term28140).add(term28147);
        term28115 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28115, term28115.getClass(), "id", "dHrIcaTbcS");
        setField(term28115, term28115.getClass(), "name", "tAqyToqusS");
        setField(term28115, term28115.getClass(), "userReviews", term28140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserReviews", argTypes, term28115, args);
    }

};


