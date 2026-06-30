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

public class User_component2_9611859705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28239;

    public User_component2_9611859705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28266 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28267 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28268 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28269 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28270 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28267, term28267.getClass(), "userId", null);
        setField(term28267, term28267.getClass(), "reviewId", null);
        setField(term28266, term28266.getClass(), "userReviewId", term28267);
        setField(term28268, term28268.getClass(), "id", null);
        setField(term28268, term28268.getClass(), "name", null);
        setField(term28268, term28268.getClass(), "userReviews", null);
        setField(term28266, term28266.getClass(), "user", term28268);
        setField(term28269, term28269.getClass(), "id", null);
        setField(term28269, term28269.getClass(), "review", null);
        setField(term28269, term28269.getClass(), "userReviews", null);
        setField(term28266, term28266.getClass(), "review", term28269);
        setField(term28270, term28270.getClass(), "date", null);
        setField(term28270, term28270.getClass(), "time", null);
        setField(term28266, term28266.getClass(), "date", term28270);
        Object term28271 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28272 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28273 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28274 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28275 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28272, term28272.getClass(), "userId", null);
        setField(term28272, term28272.getClass(), "reviewId", null);
        setField(term28271, term28271.getClass(), "userReviewId", term28272);
        setField(term28273, term28273.getClass(), "id", null);
        setField(term28273, term28273.getClass(), "name", null);
        setField(term28273, term28273.getClass(), "userReviews", null);
        setField(term28271, term28271.getClass(), "user", term28273);
        setField(term28274, term28274.getClass(), "id", null);
        setField(term28274, term28274.getClass(), "review", null);
        setField(term28274, term28274.getClass(), "userReviews", null);
        setField(term28271, term28271.getClass(), "review", term28274);
        setField(term28275, term28275.getClass(), "date", null);
        setField(term28275, term28275.getClass(), "time", null);
        setField(term28271, term28271.getClass(), "date", term28275);
        Object term28276 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28277 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28278 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28279 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28280 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28277, term28277.getClass(), "userId", null);
        setField(term28277, term28277.getClass(), "reviewId", null);
        setField(term28276, term28276.getClass(), "userReviewId", term28277);
        setField(term28278, term28278.getClass(), "id", null);
        setField(term28278, term28278.getClass(), "name", null);
        setField(term28278, term28278.getClass(), "userReviews", null);
        setField(term28276, term28276.getClass(), "user", term28278);
        setField(term28279, term28279.getClass(), "id", null);
        setField(term28279, term28279.getClass(), "review", null);
        setField(term28279, term28279.getClass(), "userReviews", null);
        setField(term28276, term28276.getClass(), "review", term28279);
        setField(term28280, term28280.getClass(), "date", null);
        setField(term28280, term28280.getClass(), "time", null);
        setField(term28276, term28276.getClass(), "date", term28280);
        Object term28281 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28282 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28283 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28284 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28285 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28282, term28282.getClass(), "userId", null);
        setField(term28282, term28282.getClass(), "reviewId", null);
        setField(term28281, term28281.getClass(), "userReviewId", term28282);
        setField(term28283, term28283.getClass(), "id", null);
        setField(term28283, term28283.getClass(), "name", null);
        setField(term28283, term28283.getClass(), "userReviews", null);
        setField(term28281, term28281.getClass(), "user", term28283);
        setField(term28284, term28284.getClass(), "id", null);
        setField(term28284, term28284.getClass(), "review", null);
        setField(term28284, term28284.getClass(), "userReviews", null);
        setField(term28281, term28281.getClass(), "review", term28284);
        setField(term28285, term28285.getClass(), "date", null);
        setField(term28285, term28285.getClass(), "time", null);
        setField(term28281, term28281.getClass(), "date", term28285);
        Object term28286 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28287 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28288 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28289 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28290 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28287, term28287.getClass(), "userId", null);
        setField(term28287, term28287.getClass(), "reviewId", null);
        setField(term28286, term28286.getClass(), "userReviewId", term28287);
        setField(term28288, term28288.getClass(), "id", null);
        setField(term28288, term28288.getClass(), "name", null);
        setField(term28288, term28288.getClass(), "userReviews", null);
        setField(term28286, term28286.getClass(), "user", term28288);
        setField(term28289, term28289.getClass(), "id", null);
        setField(term28289, term28289.getClass(), "review", null);
        setField(term28289, term28289.getClass(), "userReviews", null);
        setField(term28286, term28286.getClass(), "review", term28289);
        setField(term28290, term28290.getClass(), "date", null);
        setField(term28290, term28290.getClass(), "time", null);
        setField(term28286, term28286.getClass(), "date", term28290);
        Object term28291 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28292 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28293 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28294 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28295 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28292, term28292.getClass(), "userId", null);
        setField(term28292, term28292.getClass(), "reviewId", null);
        setField(term28291, term28291.getClass(), "userReviewId", term28292);
        setField(term28293, term28293.getClass(), "id", null);
        setField(term28293, term28293.getClass(), "name", null);
        setField(term28293, term28293.getClass(), "userReviews", null);
        setField(term28291, term28291.getClass(), "user", term28293);
        setField(term28294, term28294.getClass(), "id", null);
        setField(term28294, term28294.getClass(), "review", null);
        setField(term28294, term28294.getClass(), "userReviews", null);
        setField(term28291, term28291.getClass(), "review", term28294);
        setField(term28295, term28295.getClass(), "date", null);
        setField(term28295, term28295.getClass(), "time", null);
        setField(term28291, term28291.getClass(), "date", term28295);
        ArrayList term28264 = new ArrayList();
        ((ArrayList) term28264).add(term28266);
        ((ArrayList) term28264).add(term28271);
        ((ArrayList) term28264).add(term28276);
        ((ArrayList) term28264).add(term28281);
        ((ArrayList) term28264).add(term28286);
        ((ArrayList) term28264).add(term28286);
        ((ArrayList) term28264).add(term28291);
        ((ArrayList) term28264).add(term28276);
        ((ArrayList) term28264).add(term28276);
        term28239 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28239, term28239.getClass(), "id", "crZAQIKgDI");
        setField(term28239, term28239.getClass(), "name", "uDAdogNiBQ");
        setField(term28239, term28239.getClass(), "userReviews", term28264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term28239, args);
    }

};


