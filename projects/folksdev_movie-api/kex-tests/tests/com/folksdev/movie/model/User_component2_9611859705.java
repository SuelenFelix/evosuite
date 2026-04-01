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
     Object term28237;

    public User_component2_9611859705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28264 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28265 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28266 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28267 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28268 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28265, term28265.getClass(), "userId", null);
        setField(term28265, term28265.getClass(), "reviewId", null);
        setField(term28264, term28264.getClass(), "userReviewId", term28265);
        setField(term28266, term28266.getClass(), "id", null);
        setField(term28266, term28266.getClass(), "name", null);
        setField(term28266, term28266.getClass(), "userReviews", null);
        setField(term28264, term28264.getClass(), "user", term28266);
        setField(term28267, term28267.getClass(), "id", null);
        setField(term28267, term28267.getClass(), "review", null);
        setField(term28267, term28267.getClass(), "userReviews", null);
        setField(term28264, term28264.getClass(), "review", term28267);
        setField(term28268, term28268.getClass(), "date", null);
        setField(term28268, term28268.getClass(), "time", null);
        setField(term28264, term28264.getClass(), "date", term28268);
        Object term28269 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28270 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28271 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28272 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28273 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28270, term28270.getClass(), "userId", null);
        setField(term28270, term28270.getClass(), "reviewId", null);
        setField(term28269, term28269.getClass(), "userReviewId", term28270);
        setField(term28271, term28271.getClass(), "id", null);
        setField(term28271, term28271.getClass(), "name", null);
        setField(term28271, term28271.getClass(), "userReviews", null);
        setField(term28269, term28269.getClass(), "user", term28271);
        setField(term28272, term28272.getClass(), "id", null);
        setField(term28272, term28272.getClass(), "review", null);
        setField(term28272, term28272.getClass(), "userReviews", null);
        setField(term28269, term28269.getClass(), "review", term28272);
        setField(term28273, term28273.getClass(), "date", null);
        setField(term28273, term28273.getClass(), "time", null);
        setField(term28269, term28269.getClass(), "date", term28273);
        Object term28274 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28275 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28276 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28277 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28278 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28275, term28275.getClass(), "userId", null);
        setField(term28275, term28275.getClass(), "reviewId", null);
        setField(term28274, term28274.getClass(), "userReviewId", term28275);
        setField(term28276, term28276.getClass(), "id", null);
        setField(term28276, term28276.getClass(), "name", null);
        setField(term28276, term28276.getClass(), "userReviews", null);
        setField(term28274, term28274.getClass(), "user", term28276);
        setField(term28277, term28277.getClass(), "id", null);
        setField(term28277, term28277.getClass(), "review", null);
        setField(term28277, term28277.getClass(), "userReviews", null);
        setField(term28274, term28274.getClass(), "review", term28277);
        setField(term28278, term28278.getClass(), "date", null);
        setField(term28278, term28278.getClass(), "time", null);
        setField(term28274, term28274.getClass(), "date", term28278);
        Object term28279 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28280 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28281 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28282 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28283 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28280, term28280.getClass(), "userId", null);
        setField(term28280, term28280.getClass(), "reviewId", null);
        setField(term28279, term28279.getClass(), "userReviewId", term28280);
        setField(term28281, term28281.getClass(), "id", null);
        setField(term28281, term28281.getClass(), "name", null);
        setField(term28281, term28281.getClass(), "userReviews", null);
        setField(term28279, term28279.getClass(), "user", term28281);
        setField(term28282, term28282.getClass(), "id", null);
        setField(term28282, term28282.getClass(), "review", null);
        setField(term28282, term28282.getClass(), "userReviews", null);
        setField(term28279, term28279.getClass(), "review", term28282);
        setField(term28283, term28283.getClass(), "date", null);
        setField(term28283, term28283.getClass(), "time", null);
        setField(term28279, term28279.getClass(), "date", term28283);
        Object term28284 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28285 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28286 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28287 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28288 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28285, term28285.getClass(), "userId", null);
        setField(term28285, term28285.getClass(), "reviewId", null);
        setField(term28284, term28284.getClass(), "userReviewId", term28285);
        setField(term28286, term28286.getClass(), "id", null);
        setField(term28286, term28286.getClass(), "name", null);
        setField(term28286, term28286.getClass(), "userReviews", null);
        setField(term28284, term28284.getClass(), "user", term28286);
        setField(term28287, term28287.getClass(), "id", null);
        setField(term28287, term28287.getClass(), "review", null);
        setField(term28287, term28287.getClass(), "userReviews", null);
        setField(term28284, term28284.getClass(), "review", term28287);
        setField(term28288, term28288.getClass(), "date", null);
        setField(term28288, term28288.getClass(), "time", null);
        setField(term28284, term28284.getClass(), "date", term28288);
        Object term28289 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28290 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28291 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28292 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28293 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28290, term28290.getClass(), "userId", null);
        setField(term28290, term28290.getClass(), "reviewId", null);
        setField(term28289, term28289.getClass(), "userReviewId", term28290);
        setField(term28291, term28291.getClass(), "id", null);
        setField(term28291, term28291.getClass(), "name", null);
        setField(term28291, term28291.getClass(), "userReviews", null);
        setField(term28289, term28289.getClass(), "user", term28291);
        setField(term28292, term28292.getClass(), "id", null);
        setField(term28292, term28292.getClass(), "review", null);
        setField(term28292, term28292.getClass(), "userReviews", null);
        setField(term28289, term28289.getClass(), "review", term28292);
        setField(term28293, term28293.getClass(), "date", null);
        setField(term28293, term28293.getClass(), "time", null);
        setField(term28289, term28289.getClass(), "date", term28293);
        ArrayList term28262 = new ArrayList();
        ((ArrayList) term28262).add(term28264);
        ((ArrayList) term28262).add(term28269);
        ((ArrayList) term28262).add(term28274);
        ((ArrayList) term28262).add(term28279);
        ((ArrayList) term28262).add(term28284);
        ((ArrayList) term28262).add(term28284);
        ((ArrayList) term28262).add(term28289);
        ((ArrayList) term28262).add(term28274);
        ((ArrayList) term28262).add(term28274);
        term28237 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28237, term28237.getClass(), "id", "crZAQIKgDI");
        setField(term28237, term28237.getClass(), "name", "uDAdogNiBQ");
        setField(term28237, term28237.getClass(), "userReviews", term28262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term28237, args);
    }

};


