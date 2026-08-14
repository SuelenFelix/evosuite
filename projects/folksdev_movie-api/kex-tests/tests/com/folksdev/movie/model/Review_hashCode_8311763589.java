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

public class Review_hashCode_8311763589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29462;

    public Review_hashCode_8311763589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29489 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29490 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29491 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29492 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29493 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29490, term29490.getClass(), "userId", null);
        setField(term29490, term29490.getClass(), "reviewId", null);
        setField(term29489, term29489.getClass(), "userReviewId", term29490);
        setField(term29491, term29491.getClass(), "id", null);
        setField(term29491, term29491.getClass(), "name", null);
        setField(term29491, term29491.getClass(), "userReviews", null);
        setField(term29489, term29489.getClass(), "user", term29491);
        setField(term29492, term29492.getClass(), "id", null);
        setField(term29492, term29492.getClass(), "review", null);
        setField(term29492, term29492.getClass(), "userReviews", null);
        setField(term29489, term29489.getClass(), "review", term29492);
        setField(term29493, term29493.getClass(), "date", null);
        setField(term29493, term29493.getClass(), "time", null);
        setField(term29489, term29489.getClass(), "date", term29493);
        Object term29494 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29495 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29496 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29497 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29498 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29495, term29495.getClass(), "userId", null);
        setField(term29495, term29495.getClass(), "reviewId", null);
        setField(term29494, term29494.getClass(), "userReviewId", term29495);
        setField(term29496, term29496.getClass(), "id", null);
        setField(term29496, term29496.getClass(), "name", null);
        setField(term29496, term29496.getClass(), "userReviews", null);
        setField(term29494, term29494.getClass(), "user", term29496);
        setField(term29497, term29497.getClass(), "id", null);
        setField(term29497, term29497.getClass(), "review", null);
        setField(term29497, term29497.getClass(), "userReviews", null);
        setField(term29494, term29494.getClass(), "review", term29497);
        setField(term29498, term29498.getClass(), "date", null);
        setField(term29498, term29498.getClass(), "time", null);
        setField(term29494, term29494.getClass(), "date", term29498);
        Object term29499 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29500 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29501 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29502 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29500, term29500.getClass(), "userId", null);
        setField(term29500, term29500.getClass(), "reviewId", null);
        setField(term29499, term29499.getClass(), "userReviewId", term29500);
        setField(term29501, term29501.getClass(), "id", null);
        setField(term29501, term29501.getClass(), "name", null);
        setField(term29501, term29501.getClass(), "userReviews", null);
        setField(term29499, term29499.getClass(), "user", term29501);
        setField(term29499, term29499.getClass(), "review", term29492);
        setField(term29502, term29502.getClass(), "date", null);
        setField(term29502, term29502.getClass(), "time", null);
        setField(term29499, term29499.getClass(), "date", term29502);
        Object term29503 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29504 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29505 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29506 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29507 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29504, term29504.getClass(), "userId", null);
        setField(term29504, term29504.getClass(), "reviewId", null);
        setField(term29503, term29503.getClass(), "userReviewId", term29504);
        setField(term29505, term29505.getClass(), "id", null);
        setField(term29505, term29505.getClass(), "name", null);
        setField(term29505, term29505.getClass(), "userReviews", null);
        setField(term29503, term29503.getClass(), "user", term29505);
        setField(term29506, term29506.getClass(), "id", null);
        setField(term29506, term29506.getClass(), "review", null);
        setField(term29506, term29506.getClass(), "userReviews", null);
        setField(term29503, term29503.getClass(), "review", term29506);
        setField(term29507, term29507.getClass(), "date", null);
        setField(term29507, term29507.getClass(), "time", null);
        setField(term29503, term29503.getClass(), "date", term29507);
        Object term29508 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29509 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29510 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29511 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29512 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29509, term29509.getClass(), "userId", null);
        setField(term29509, term29509.getClass(), "reviewId", null);
        setField(term29508, term29508.getClass(), "userReviewId", term29509);
        setField(term29510, term29510.getClass(), "id", null);
        setField(term29510, term29510.getClass(), "name", null);
        setField(term29510, term29510.getClass(), "userReviews", null);
        setField(term29508, term29508.getClass(), "user", term29510);
        setField(term29511, term29511.getClass(), "id", null);
        setField(term29511, term29511.getClass(), "review", null);
        setField(term29511, term29511.getClass(), "userReviews", null);
        setField(term29508, term29508.getClass(), "review", term29511);
        setField(term29512, term29512.getClass(), "date", null);
        setField(term29512, term29512.getClass(), "time", null);
        setField(term29508, term29508.getClass(), "date", term29512);
        Object term29513 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29514 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29515 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29516 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29517 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29514, term29514.getClass(), "userId", null);
        setField(term29514, term29514.getClass(), "reviewId", null);
        setField(term29513, term29513.getClass(), "userReviewId", term29514);
        setField(term29515, term29515.getClass(), "id", null);
        setField(term29515, term29515.getClass(), "name", null);
        setField(term29515, term29515.getClass(), "userReviews", null);
        setField(term29513, term29513.getClass(), "user", term29515);
        setField(term29516, term29516.getClass(), "id", null);
        setField(term29516, term29516.getClass(), "review", null);
        setField(term29516, term29516.getClass(), "userReviews", null);
        setField(term29513, term29513.getClass(), "review", term29516);
        setField(term29517, term29517.getClass(), "date", null);
        setField(term29517, term29517.getClass(), "time", null);
        setField(term29513, term29513.getClass(), "date", term29517);
        ArrayList term29487 = new ArrayList();
        ((ArrayList) term29487).add(term29489);
        ((ArrayList) term29487).add(term29494);
        ((ArrayList) term29487).add(term29499);
        ((ArrayList) term29487).add(term29503);
        ((ArrayList) term29487).add(term29508);
        ((ArrayList) term29487).add(term29513);
        term29462 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29462, term29462.getClass(), "id", "tMDFwEQAGW");
        setField(term29462, term29462.getClass(), "review", "heAByNySVP");
        setField(term29462, term29462.getClass(), "userReviews", term29487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term29462, args);
    }

};


