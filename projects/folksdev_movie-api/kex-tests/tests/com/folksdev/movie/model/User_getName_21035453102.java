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

public class User_getName_21035453102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28057;

    public User_getName_21035453102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28084 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28085 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28086 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28087 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28088 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28085, term28085.getClass(), "userId", null);
        setField(term28085, term28085.getClass(), "reviewId", null);
        setField(term28084, term28084.getClass(), "userReviewId", term28085);
        setField(term28086, term28086.getClass(), "id", null);
        setField(term28086, term28086.getClass(), "name", null);
        setField(term28086, term28086.getClass(), "userReviews", null);
        setField(term28084, term28084.getClass(), "user", term28086);
        setField(term28087, term28087.getClass(), "id", null);
        setField(term28087, term28087.getClass(), "review", null);
        setField(term28087, term28087.getClass(), "userReviews", null);
        setField(term28084, term28084.getClass(), "review", term28087);
        setField(term28088, term28088.getClass(), "date", null);
        setField(term28088, term28088.getClass(), "time", null);
        setField(term28084, term28084.getClass(), "date", term28088);
        Object term28089 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28090 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28091 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28092 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28093 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28090, term28090.getClass(), "userId", null);
        setField(term28090, term28090.getClass(), "reviewId", null);
        setField(term28089, term28089.getClass(), "userReviewId", term28090);
        setField(term28091, term28091.getClass(), "id", null);
        setField(term28091, term28091.getClass(), "name", null);
        setField(term28091, term28091.getClass(), "userReviews", null);
        setField(term28089, term28089.getClass(), "user", term28091);
        setField(term28092, term28092.getClass(), "id", null);
        setField(term28092, term28092.getClass(), "review", null);
        setField(term28092, term28092.getClass(), "userReviews", null);
        setField(term28089, term28089.getClass(), "review", term28092);
        setField(term28093, term28093.getClass(), "date", null);
        setField(term28093, term28093.getClass(), "time", null);
        setField(term28089, term28089.getClass(), "date", term28093);
        ArrayList term28082 = new ArrayList();
        ((ArrayList) term28082).add(term28084);
        ((ArrayList) term28082).add(term28089);
        term28057 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28057, term28057.getClass(), "id", "iwismCnYjB");
        setField(term28057, term28057.getClass(), "name", "GerBZdiruT");
        setField(term28057, term28057.getClass(), "userReviews", term28082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term28057, args);
    }

};


