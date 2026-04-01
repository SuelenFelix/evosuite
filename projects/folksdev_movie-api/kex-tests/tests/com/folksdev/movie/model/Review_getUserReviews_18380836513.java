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
     Object term28984;

    public Review_getUserReviews_18380836513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29011 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29012 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29013 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29014 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29015 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29012, term29012.getClass(), "userId", null);
        setField(term29012, term29012.getClass(), "reviewId", null);
        setField(term29011, term29011.getClass(), "userReviewId", term29012);
        setField(term29013, term29013.getClass(), "id", null);
        setField(term29013, term29013.getClass(), "name", null);
        setField(term29013, term29013.getClass(), "userReviews", null);
        setField(term29011, term29011.getClass(), "user", term29013);
        setField(term29014, term29014.getClass(), "id", null);
        setField(term29014, term29014.getClass(), "review", null);
        setField(term29014, term29014.getClass(), "userReviews", null);
        setField(term29011, term29011.getClass(), "review", term29014);
        setField(term29015, term29015.getClass(), "date", null);
        setField(term29015, term29015.getClass(), "time", null);
        setField(term29011, term29011.getClass(), "date", term29015);
        Object term29016 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29017 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29018 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29019 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29020 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29017, term29017.getClass(), "userId", null);
        setField(term29017, term29017.getClass(), "reviewId", null);
        setField(term29016, term29016.getClass(), "userReviewId", term29017);
        setField(term29018, term29018.getClass(), "id", null);
        setField(term29018, term29018.getClass(), "name", null);
        setField(term29018, term29018.getClass(), "userReviews", null);
        setField(term29016, term29016.getClass(), "user", term29018);
        setField(term29019, term29019.getClass(), "id", null);
        setField(term29019, term29019.getClass(), "review", null);
        setField(term29019, term29019.getClass(), "userReviews", null);
        setField(term29016, term29016.getClass(), "review", term29019);
        setField(term29020, term29020.getClass(), "date", null);
        setField(term29020, term29020.getClass(), "time", null);
        setField(term29016, term29016.getClass(), "date", term29020);
        Object term29021 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29022 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29023 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29024 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29025 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29022, term29022.getClass(), "userId", null);
        setField(term29022, term29022.getClass(), "reviewId", null);
        setField(term29021, term29021.getClass(), "userReviewId", term29022);
        setField(term29023, term29023.getClass(), "id", null);
        setField(term29023, term29023.getClass(), "name", null);
        setField(term29023, term29023.getClass(), "userReviews", null);
        setField(term29021, term29021.getClass(), "user", term29023);
        setField(term29024, term29024.getClass(), "id", null);
        setField(term29024, term29024.getClass(), "review", null);
        setField(term29024, term29024.getClass(), "userReviews", null);
        setField(term29021, term29021.getClass(), "review", term29024);
        setField(term29025, term29025.getClass(), "date", null);
        setField(term29025, term29025.getClass(), "time", null);
        setField(term29021, term29021.getClass(), "date", term29025);
        Object term29026 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29027 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29028 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29029 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29030 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29027, term29027.getClass(), "userId", null);
        setField(term29027, term29027.getClass(), "reviewId", null);
        setField(term29026, term29026.getClass(), "userReviewId", term29027);
        setField(term29028, term29028.getClass(), "id", null);
        setField(term29028, term29028.getClass(), "name", null);
        setField(term29028, term29028.getClass(), "userReviews", null);
        setField(term29026, term29026.getClass(), "user", term29028);
        setField(term29029, term29029.getClass(), "id", null);
        setField(term29029, term29029.getClass(), "review", null);
        setField(term29029, term29029.getClass(), "userReviews", null);
        setField(term29026, term29026.getClass(), "review", term29029);
        setField(term29030, term29030.getClass(), "date", null);
        setField(term29030, term29030.getClass(), "time", null);
        setField(term29026, term29026.getClass(), "date", term29030);
        ArrayList term29009 = new ArrayList();
        ((ArrayList) term29009).add(term29011);
        ((ArrayList) term29009).add(term29016);
        ((ArrayList) term29009).add(term29021);
        ((ArrayList) term29009).add(term29026);
        ((ArrayList) term29009).add(term29026);
        term28984 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term28984, term28984.getClass(), "id", "aygFZPbIko");
        setField(term28984, term28984.getClass(), "review", "hUhlDCVWIF");
        setField(term28984, term28984.getClass(), "userReviews", term29009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserReviews", argTypes, term28984, args);
    }

};


