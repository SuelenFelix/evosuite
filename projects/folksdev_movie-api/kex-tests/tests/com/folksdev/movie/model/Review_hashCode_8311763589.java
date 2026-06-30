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
     Object term29463;

    public Review_hashCode_8311763589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29490 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29491 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29492 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29493 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29494 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29491, term29491.getClass(), "userId", null);
        setField(term29491, term29491.getClass(), "reviewId", null);
        setField(term29490, term29490.getClass(), "userReviewId", term29491);
        setField(term29492, term29492.getClass(), "id", null);
        setField(term29492, term29492.getClass(), "name", null);
        setField(term29492, term29492.getClass(), "userReviews", null);
        setField(term29490, term29490.getClass(), "user", term29492);
        setField(term29493, term29493.getClass(), "id", null);
        setField(term29493, term29493.getClass(), "review", null);
        setField(term29493, term29493.getClass(), "userReviews", null);
        setField(term29490, term29490.getClass(), "review", term29493);
        setField(term29494, term29494.getClass(), "date", null);
        setField(term29494, term29494.getClass(), "time", null);
        setField(term29490, term29490.getClass(), "date", term29494);
        Object term29495 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29496 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29497 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29498 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29499 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29496, term29496.getClass(), "userId", null);
        setField(term29496, term29496.getClass(), "reviewId", null);
        setField(term29495, term29495.getClass(), "userReviewId", term29496);
        setField(term29497, term29497.getClass(), "id", null);
        setField(term29497, term29497.getClass(), "name", null);
        setField(term29497, term29497.getClass(), "userReviews", null);
        setField(term29495, term29495.getClass(), "user", term29497);
        setField(term29498, term29498.getClass(), "id", null);
        setField(term29498, term29498.getClass(), "review", null);
        setField(term29498, term29498.getClass(), "userReviews", null);
        setField(term29495, term29495.getClass(), "review", term29498);
        setField(term29499, term29499.getClass(), "date", null);
        setField(term29499, term29499.getClass(), "time", null);
        setField(term29495, term29495.getClass(), "date", term29499);
        Object term29500 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29501 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29502 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29503 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29501, term29501.getClass(), "userId", null);
        setField(term29501, term29501.getClass(), "reviewId", null);
        setField(term29500, term29500.getClass(), "userReviewId", term29501);
        setField(term29502, term29502.getClass(), "id", null);
        setField(term29502, term29502.getClass(), "name", null);
        setField(term29502, term29502.getClass(), "userReviews", null);
        setField(term29500, term29500.getClass(), "user", term29502);
        setField(term29500, term29500.getClass(), "review", term29493);
        setField(term29503, term29503.getClass(), "date", null);
        setField(term29503, term29503.getClass(), "time", null);
        setField(term29500, term29500.getClass(), "date", term29503);
        Object term29504 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29505 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29506 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29507 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29508 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29505, term29505.getClass(), "userId", null);
        setField(term29505, term29505.getClass(), "reviewId", null);
        setField(term29504, term29504.getClass(), "userReviewId", term29505);
        setField(term29506, term29506.getClass(), "id", null);
        setField(term29506, term29506.getClass(), "name", null);
        setField(term29506, term29506.getClass(), "userReviews", null);
        setField(term29504, term29504.getClass(), "user", term29506);
        setField(term29507, term29507.getClass(), "id", null);
        setField(term29507, term29507.getClass(), "review", null);
        setField(term29507, term29507.getClass(), "userReviews", null);
        setField(term29504, term29504.getClass(), "review", term29507);
        setField(term29508, term29508.getClass(), "date", null);
        setField(term29508, term29508.getClass(), "time", null);
        setField(term29504, term29504.getClass(), "date", term29508);
        Object term29509 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29510 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29511 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29512 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29513 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29510, term29510.getClass(), "userId", null);
        setField(term29510, term29510.getClass(), "reviewId", null);
        setField(term29509, term29509.getClass(), "userReviewId", term29510);
        setField(term29511, term29511.getClass(), "id", null);
        setField(term29511, term29511.getClass(), "name", null);
        setField(term29511, term29511.getClass(), "userReviews", null);
        setField(term29509, term29509.getClass(), "user", term29511);
        setField(term29512, term29512.getClass(), "id", null);
        setField(term29512, term29512.getClass(), "review", null);
        setField(term29512, term29512.getClass(), "userReviews", null);
        setField(term29509, term29509.getClass(), "review", term29512);
        setField(term29513, term29513.getClass(), "date", null);
        setField(term29513, term29513.getClass(), "time", null);
        setField(term29509, term29509.getClass(), "date", term29513);
        Object term29514 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29515 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29516 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29517 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29518 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29515, term29515.getClass(), "userId", null);
        setField(term29515, term29515.getClass(), "reviewId", null);
        setField(term29514, term29514.getClass(), "userReviewId", term29515);
        setField(term29516, term29516.getClass(), "id", null);
        setField(term29516, term29516.getClass(), "name", null);
        setField(term29516, term29516.getClass(), "userReviews", null);
        setField(term29514, term29514.getClass(), "user", term29516);
        setField(term29517, term29517.getClass(), "id", null);
        setField(term29517, term29517.getClass(), "review", null);
        setField(term29517, term29517.getClass(), "userReviews", null);
        setField(term29514, term29514.getClass(), "review", term29517);
        setField(term29518, term29518.getClass(), "date", null);
        setField(term29518, term29518.getClass(), "time", null);
        setField(term29514, term29514.getClass(), "date", term29518);
        ArrayList term29488 = new ArrayList();
        ((ArrayList) term29488).add(term29490);
        ((ArrayList) term29488).add(term29495);
        ((ArrayList) term29488).add(term29500);
        ((ArrayList) term29488).add(term29504);
        ((ArrayList) term29488).add(term29509);
        ((ArrayList) term29488).add(term29514);
        term29463 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29463, term29463.getClass(), "id", "tMDFwEQAGW");
        setField(term29463, term29463.getClass(), "review", "heAByNySVP");
        setField(term29463, term29463.getClass(), "userReviews", term29488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term29463, args);
    }

};


