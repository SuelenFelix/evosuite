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
     Object term28985;

    public Review_getUserReviews_18380836513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29012 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29013 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29014 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29015 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29016 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29013, term29013.getClass(), "userId", null);
        setField(term29013, term29013.getClass(), "reviewId", null);
        setField(term29012, term29012.getClass(), "userReviewId", term29013);
        setField(term29014, term29014.getClass(), "id", null);
        setField(term29014, term29014.getClass(), "name", null);
        setField(term29014, term29014.getClass(), "userReviews", null);
        setField(term29012, term29012.getClass(), "user", term29014);
        setField(term29015, term29015.getClass(), "id", null);
        setField(term29015, term29015.getClass(), "review", null);
        setField(term29015, term29015.getClass(), "userReviews", null);
        setField(term29012, term29012.getClass(), "review", term29015);
        setField(term29016, term29016.getClass(), "date", null);
        setField(term29016, term29016.getClass(), "time", null);
        setField(term29012, term29012.getClass(), "date", term29016);
        Object term29017 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29018 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29019 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29020 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29021 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29018, term29018.getClass(), "userId", null);
        setField(term29018, term29018.getClass(), "reviewId", null);
        setField(term29017, term29017.getClass(), "userReviewId", term29018);
        setField(term29019, term29019.getClass(), "id", null);
        setField(term29019, term29019.getClass(), "name", null);
        setField(term29019, term29019.getClass(), "userReviews", null);
        setField(term29017, term29017.getClass(), "user", term29019);
        setField(term29020, term29020.getClass(), "id", null);
        setField(term29020, term29020.getClass(), "review", null);
        setField(term29020, term29020.getClass(), "userReviews", null);
        setField(term29017, term29017.getClass(), "review", term29020);
        setField(term29021, term29021.getClass(), "date", null);
        setField(term29021, term29021.getClass(), "time", null);
        setField(term29017, term29017.getClass(), "date", term29021);
        Object term29022 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29023 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29024 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29025 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29026 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29023, term29023.getClass(), "userId", null);
        setField(term29023, term29023.getClass(), "reviewId", null);
        setField(term29022, term29022.getClass(), "userReviewId", term29023);
        setField(term29024, term29024.getClass(), "id", null);
        setField(term29024, term29024.getClass(), "name", null);
        setField(term29024, term29024.getClass(), "userReviews", null);
        setField(term29022, term29022.getClass(), "user", term29024);
        setField(term29025, term29025.getClass(), "id", null);
        setField(term29025, term29025.getClass(), "review", null);
        setField(term29025, term29025.getClass(), "userReviews", null);
        setField(term29022, term29022.getClass(), "review", term29025);
        setField(term29026, term29026.getClass(), "date", null);
        setField(term29026, term29026.getClass(), "time", null);
        setField(term29022, term29022.getClass(), "date", term29026);
        Object term29027 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29028 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29029 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29030 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29031 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29028, term29028.getClass(), "userId", null);
        setField(term29028, term29028.getClass(), "reviewId", null);
        setField(term29027, term29027.getClass(), "userReviewId", term29028);
        setField(term29029, term29029.getClass(), "id", null);
        setField(term29029, term29029.getClass(), "name", null);
        setField(term29029, term29029.getClass(), "userReviews", null);
        setField(term29027, term29027.getClass(), "user", term29029);
        setField(term29030, term29030.getClass(), "id", null);
        setField(term29030, term29030.getClass(), "review", null);
        setField(term29030, term29030.getClass(), "userReviews", null);
        setField(term29027, term29027.getClass(), "review", term29030);
        setField(term29031, term29031.getClass(), "date", null);
        setField(term29031, term29031.getClass(), "time", null);
        setField(term29027, term29027.getClass(), "date", term29031);
        ArrayList term29010 = new ArrayList();
        ((ArrayList) term29010).add(term29012);
        ((ArrayList) term29010).add(term29017);
        ((ArrayList) term29010).add(term29022);
        ((ArrayList) term29010).add(term29027);
        ((ArrayList) term29010).add(term29027);
        term28985 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term28985, term28985.getClass(), "id", "aygFZPbIko");
        setField(term28985, term28985.getClass(), "review", "hUhlDCVWIF");
        setField(term28985, term28985.getClass(), "userReviews", term29010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserReviews", argTypes, term28985, args);
    }

};


