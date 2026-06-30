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

public class Review_getUserReviews_18380836513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28986;

    public Review_getUserReviews_18380836513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29013 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29014 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29015 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29016 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29017 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29014, term29014.getClass(), "userId", null);
        setField(term29014, term29014.getClass(), "reviewId", null);
        setField(term29013, term29013.getClass(), "userReviewId", term29014);
        setField(term29015, term29015.getClass(), "id", null);
        setField(term29015, term29015.getClass(), "name", null);
        setField(term29015, term29015.getClass(), "userReviews", null);
        setField(term29013, term29013.getClass(), "user", term29015);
        setField(term29016, term29016.getClass(), "id", null);
        setField(term29016, term29016.getClass(), "review", null);
        setField(term29016, term29016.getClass(), "userReviews", null);
        setField(term29013, term29013.getClass(), "review", term29016);
        setField(term29017, term29017.getClass(), "date", null);
        setField(term29017, term29017.getClass(), "time", null);
        setField(term29013, term29013.getClass(), "date", term29017);
        Object term29018 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29019 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29020 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29021 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29022 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29019, term29019.getClass(), "userId", null);
        setField(term29019, term29019.getClass(), "reviewId", null);
        setField(term29018, term29018.getClass(), "userReviewId", term29019);
        setField(term29020, term29020.getClass(), "id", null);
        setField(term29020, term29020.getClass(), "name", null);
        setField(term29020, term29020.getClass(), "userReviews", null);
        setField(term29018, term29018.getClass(), "user", term29020);
        setField(term29021, term29021.getClass(), "id", null);
        setField(term29021, term29021.getClass(), "review", null);
        setField(term29021, term29021.getClass(), "userReviews", null);
        setField(term29018, term29018.getClass(), "review", term29021);
        setField(term29022, term29022.getClass(), "date", null);
        setField(term29022, term29022.getClass(), "time", null);
        setField(term29018, term29018.getClass(), "date", term29022);
        Object term29023 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29024 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29025 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29026 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29027 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29024, term29024.getClass(), "userId", null);
        setField(term29024, term29024.getClass(), "reviewId", null);
        setField(term29023, term29023.getClass(), "userReviewId", term29024);
        setField(term29025, term29025.getClass(), "id", null);
        setField(term29025, term29025.getClass(), "name", null);
        setField(term29025, term29025.getClass(), "userReviews", null);
        setField(term29023, term29023.getClass(), "user", term29025);
        setField(term29026, term29026.getClass(), "id", null);
        setField(term29026, term29026.getClass(), "review", null);
        setField(term29026, term29026.getClass(), "userReviews", null);
        setField(term29023, term29023.getClass(), "review", term29026);
        setField(term29027, term29027.getClass(), "date", null);
        setField(term29027, term29027.getClass(), "time", null);
        setField(term29023, term29023.getClass(), "date", term29027);
        Object term29028 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29029 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29030 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29031 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29032 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29029, term29029.getClass(), "userId", null);
        setField(term29029, term29029.getClass(), "reviewId", null);
        setField(term29028, term29028.getClass(), "userReviewId", term29029);
        setField(term29030, term29030.getClass(), "id", null);
        setField(term29030, term29030.getClass(), "name", null);
        setField(term29030, term29030.getClass(), "userReviews", null);
        setField(term29028, term29028.getClass(), "user", term29030);
        setField(term29031, term29031.getClass(), "id", null);
        setField(term29031, term29031.getClass(), "review", null);
        setField(term29031, term29031.getClass(), "userReviews", null);
        setField(term29028, term29028.getClass(), "review", term29031);
        setField(term29032, term29032.getClass(), "date", null);
        setField(term29032, term29032.getClass(), "time", null);
        setField(term29028, term29028.getClass(), "date", term29032);
        ArrayList term29011 = new ArrayList();
        ((ArrayList) term29011).add(term29013);
        ((ArrayList) term29011).add(term29018);
        ((ArrayList) term29011).add(term29023);
        ((ArrayList) term29011).add(term29028);
        ((ArrayList) term29011).add(term29028);
        term28986 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term28986, term28986.getClass(), "id", "aygFZPbIko");
        setField(term28986, term28986.getClass(), "review", "hUhlDCVWIF");
        setField(term28986, term28986.getClass(), "userReviews", term29011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserReviews", argTypes, term28986, args);
    }

};


