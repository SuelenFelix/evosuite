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
     Object term28056;

    public User_getName_21035453102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28083 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28084 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28085 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28086 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28087 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28084, term28084.getClass(), "userId", null);
        setField(term28084, term28084.getClass(), "reviewId", null);
        setField(term28083, term28083.getClass(), "userReviewId", term28084);
        setField(term28085, term28085.getClass(), "id", null);
        setField(term28085, term28085.getClass(), "name", null);
        setField(term28085, term28085.getClass(), "userReviews", null);
        setField(term28083, term28083.getClass(), "user", term28085);
        setField(term28086, term28086.getClass(), "id", null);
        setField(term28086, term28086.getClass(), "review", null);
        setField(term28086, term28086.getClass(), "userReviews", null);
        setField(term28083, term28083.getClass(), "review", term28086);
        setField(term28087, term28087.getClass(), "date", null);
        setField(term28087, term28087.getClass(), "time", null);
        setField(term28083, term28083.getClass(), "date", term28087);
        Object term28088 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28089 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28090 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28091 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28092 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28089, term28089.getClass(), "userId", null);
        setField(term28089, term28089.getClass(), "reviewId", null);
        setField(term28088, term28088.getClass(), "userReviewId", term28089);
        setField(term28090, term28090.getClass(), "id", null);
        setField(term28090, term28090.getClass(), "name", null);
        setField(term28090, term28090.getClass(), "userReviews", null);
        setField(term28088, term28088.getClass(), "user", term28090);
        setField(term28091, term28091.getClass(), "id", null);
        setField(term28091, term28091.getClass(), "review", null);
        setField(term28091, term28091.getClass(), "userReviews", null);
        setField(term28088, term28088.getClass(), "review", term28091);
        setField(term28092, term28092.getClass(), "date", null);
        setField(term28092, term28092.getClass(), "time", null);
        setField(term28088, term28088.getClass(), "date", term28092);
        ArrayList term28081 = new ArrayList();
        ((ArrayList) term28081).add(term28083);
        ((ArrayList) term28081).add(term28088);
        term28056 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28056, term28056.getClass(), "id", "iwismCnYjB");
        setField(term28056, term28056.getClass(), "name", "GerBZdiruT");
        setField(term28056, term28056.getClass(), "userReviews", term28081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term28056, args);
    }

};


