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
     Object term28055;

    public User_getName_21035453102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28082 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28083 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28084 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28085 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28086 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28083, term28083.getClass(), "userId", null);
        setField(term28083, term28083.getClass(), "reviewId", null);
        setField(term28082, term28082.getClass(), "userReviewId", term28083);
        setField(term28084, term28084.getClass(), "id", null);
        setField(term28084, term28084.getClass(), "name", null);
        setField(term28084, term28084.getClass(), "userReviews", null);
        setField(term28082, term28082.getClass(), "user", term28084);
        setField(term28085, term28085.getClass(), "id", null);
        setField(term28085, term28085.getClass(), "review", null);
        setField(term28085, term28085.getClass(), "userReviews", null);
        setField(term28082, term28082.getClass(), "review", term28085);
        setField(term28086, term28086.getClass(), "date", null);
        setField(term28086, term28086.getClass(), "time", null);
        setField(term28082, term28082.getClass(), "date", term28086);
        Object term28087 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28088 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28089 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28090 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28091 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28088, term28088.getClass(), "userId", null);
        setField(term28088, term28088.getClass(), "reviewId", null);
        setField(term28087, term28087.getClass(), "userReviewId", term28088);
        setField(term28089, term28089.getClass(), "id", null);
        setField(term28089, term28089.getClass(), "name", null);
        setField(term28089, term28089.getClass(), "userReviews", null);
        setField(term28087, term28087.getClass(), "user", term28089);
        setField(term28090, term28090.getClass(), "id", null);
        setField(term28090, term28090.getClass(), "review", null);
        setField(term28090, term28090.getClass(), "userReviews", null);
        setField(term28087, term28087.getClass(), "review", term28090);
        setField(term28091, term28091.getClass(), "date", null);
        setField(term28091, term28091.getClass(), "time", null);
        setField(term28087, term28087.getClass(), "date", term28091);
        ArrayList term28080 = new ArrayList();
        ((ArrayList) term28080).add(term28082);
        ((ArrayList) term28080).add(term28087);
        term28055 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28055, term28055.getClass(), "id", "iwismCnYjB");
        setField(term28055, term28055.getClass(), "name", "GerBZdiruT");
        setField(term28055, term28055.getClass(), "userReviews", term28080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term28055, args);
    }

};


