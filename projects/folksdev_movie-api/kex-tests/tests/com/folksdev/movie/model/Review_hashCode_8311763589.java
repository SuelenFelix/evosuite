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
     Object term29461;

    public Review_hashCode_8311763589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29488 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29489 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29490 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29491 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29492 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29489, term29489.getClass(), "userId", null);
        setField(term29489, term29489.getClass(), "reviewId", null);
        setField(term29488, term29488.getClass(), "userReviewId", term29489);
        setField(term29490, term29490.getClass(), "id", null);
        setField(term29490, term29490.getClass(), "name", null);
        setField(term29490, term29490.getClass(), "userReviews", null);
        setField(term29488, term29488.getClass(), "user", term29490);
        setField(term29491, term29491.getClass(), "id", null);
        setField(term29491, term29491.getClass(), "review", null);
        setField(term29491, term29491.getClass(), "userReviews", null);
        setField(term29488, term29488.getClass(), "review", term29491);
        setField(term29492, term29492.getClass(), "date", null);
        setField(term29492, term29492.getClass(), "time", null);
        setField(term29488, term29488.getClass(), "date", term29492);
        Object term29493 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29494 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29495 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29496 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29497 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29494, term29494.getClass(), "userId", null);
        setField(term29494, term29494.getClass(), "reviewId", null);
        setField(term29493, term29493.getClass(), "userReviewId", term29494);
        setField(term29495, term29495.getClass(), "id", null);
        setField(term29495, term29495.getClass(), "name", null);
        setField(term29495, term29495.getClass(), "userReviews", null);
        setField(term29493, term29493.getClass(), "user", term29495);
        setField(term29496, term29496.getClass(), "id", null);
        setField(term29496, term29496.getClass(), "review", null);
        setField(term29496, term29496.getClass(), "userReviews", null);
        setField(term29493, term29493.getClass(), "review", term29496);
        setField(term29497, term29497.getClass(), "date", null);
        setField(term29497, term29497.getClass(), "time", null);
        setField(term29493, term29493.getClass(), "date", term29497);
        Object term29498 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29499 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29500 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29501 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29499, term29499.getClass(), "userId", null);
        setField(term29499, term29499.getClass(), "reviewId", null);
        setField(term29498, term29498.getClass(), "userReviewId", term29499);
        setField(term29500, term29500.getClass(), "id", null);
        setField(term29500, term29500.getClass(), "name", null);
        setField(term29500, term29500.getClass(), "userReviews", null);
        setField(term29498, term29498.getClass(), "user", term29500);
        setField(term29498, term29498.getClass(), "review", term29491);
        setField(term29501, term29501.getClass(), "date", null);
        setField(term29501, term29501.getClass(), "time", null);
        setField(term29498, term29498.getClass(), "date", term29501);
        Object term29502 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29503 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29504 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29505 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29506 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29503, term29503.getClass(), "userId", null);
        setField(term29503, term29503.getClass(), "reviewId", null);
        setField(term29502, term29502.getClass(), "userReviewId", term29503);
        setField(term29504, term29504.getClass(), "id", null);
        setField(term29504, term29504.getClass(), "name", null);
        setField(term29504, term29504.getClass(), "userReviews", null);
        setField(term29502, term29502.getClass(), "user", term29504);
        setField(term29505, term29505.getClass(), "id", null);
        setField(term29505, term29505.getClass(), "review", null);
        setField(term29505, term29505.getClass(), "userReviews", null);
        setField(term29502, term29502.getClass(), "review", term29505);
        setField(term29506, term29506.getClass(), "date", null);
        setField(term29506, term29506.getClass(), "time", null);
        setField(term29502, term29502.getClass(), "date", term29506);
        Object term29507 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29508 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29509 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29510 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29511 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29508, term29508.getClass(), "userId", null);
        setField(term29508, term29508.getClass(), "reviewId", null);
        setField(term29507, term29507.getClass(), "userReviewId", term29508);
        setField(term29509, term29509.getClass(), "id", null);
        setField(term29509, term29509.getClass(), "name", null);
        setField(term29509, term29509.getClass(), "userReviews", null);
        setField(term29507, term29507.getClass(), "user", term29509);
        setField(term29510, term29510.getClass(), "id", null);
        setField(term29510, term29510.getClass(), "review", null);
        setField(term29510, term29510.getClass(), "userReviews", null);
        setField(term29507, term29507.getClass(), "review", term29510);
        setField(term29511, term29511.getClass(), "date", null);
        setField(term29511, term29511.getClass(), "time", null);
        setField(term29507, term29507.getClass(), "date", term29511);
        Object term29512 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29513 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29514 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29515 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29516 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29513, term29513.getClass(), "userId", null);
        setField(term29513, term29513.getClass(), "reviewId", null);
        setField(term29512, term29512.getClass(), "userReviewId", term29513);
        setField(term29514, term29514.getClass(), "id", null);
        setField(term29514, term29514.getClass(), "name", null);
        setField(term29514, term29514.getClass(), "userReviews", null);
        setField(term29512, term29512.getClass(), "user", term29514);
        setField(term29515, term29515.getClass(), "id", null);
        setField(term29515, term29515.getClass(), "review", null);
        setField(term29515, term29515.getClass(), "userReviews", null);
        setField(term29512, term29512.getClass(), "review", term29515);
        setField(term29516, term29516.getClass(), "date", null);
        setField(term29516, term29516.getClass(), "time", null);
        setField(term29512, term29512.getClass(), "date", term29516);
        ArrayList term29486 = new ArrayList();
        ((ArrayList) term29486).add(term29488);
        ((ArrayList) term29486).add(term29493);
        ((ArrayList) term29486).add(term29498);
        ((ArrayList) term29486).add(term29502);
        ((ArrayList) term29486).add(term29507);
        ((ArrayList) term29486).add(term29512);
        term29461 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29461, term29461.getClass(), "id", "tMDFwEQAGW");
        setField(term29461, term29461.getClass(), "review", "heAByNySVP");
        setField(term29461, term29461.getClass(), "userReviews", term29486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term29461, args);
    }

};


