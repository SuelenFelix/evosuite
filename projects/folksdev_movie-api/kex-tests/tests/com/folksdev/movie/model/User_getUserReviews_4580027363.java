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
     Object term28114;

    public User_getUserReviews_4580027363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28141 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28142 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28143 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28144 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28145 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28142, term28142.getClass(), "userId", null);
        setField(term28142, term28142.getClass(), "reviewId", null);
        setField(term28141, term28141.getClass(), "userReviewId", term28142);
        setField(term28143, term28143.getClass(), "id", null);
        setField(term28143, term28143.getClass(), "name", null);
        setField(term28143, term28143.getClass(), "userReviews", null);
        setField(term28141, term28141.getClass(), "user", term28143);
        setField(term28144, term28144.getClass(), "id", null);
        setField(term28144, term28144.getClass(), "review", null);
        setField(term28144, term28144.getClass(), "userReviews", null);
        setField(term28141, term28141.getClass(), "review", term28144);
        setField(term28145, term28145.getClass(), "date", null);
        setField(term28145, term28145.getClass(), "time", null);
        setField(term28141, term28141.getClass(), "date", term28145);
        Object term28146 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28147 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28148 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28149 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28150 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28147, term28147.getClass(), "userId", null);
        setField(term28147, term28147.getClass(), "reviewId", null);
        setField(term28146, term28146.getClass(), "userReviewId", term28147);
        setField(term28148, term28148.getClass(), "id", null);
        setField(term28148, term28148.getClass(), "name", null);
        setField(term28148, term28148.getClass(), "userReviews", null);
        setField(term28146, term28146.getClass(), "user", term28148);
        setField(term28149, term28149.getClass(), "id", null);
        setField(term28149, term28149.getClass(), "review", null);
        setField(term28149, term28149.getClass(), "userReviews", null);
        setField(term28146, term28146.getClass(), "review", term28149);
        setField(term28150, term28150.getClass(), "date", null);
        setField(term28150, term28150.getClass(), "time", null);
        setField(term28146, term28146.getClass(), "date", term28150);
        ArrayList term28139 = new ArrayList();
        ((ArrayList) term28139).add(term28141);
        ((ArrayList) term28139).add(term28146);
        term28114 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28114, term28114.getClass(), "id", "dHrIcaTbcS");
        setField(term28114, term28114.getClass(), "name", "tAqyToqusS");
        setField(term28114, term28114.getClass(), "userReviews", term28139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserReviews", argTypes, term28114, args);
    }

};


