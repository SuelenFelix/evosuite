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
     Object term28238;

    public User_component2_9611859705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28265 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28266 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28267 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28268 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28269 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28266, term28266.getClass(), "userId", null);
        setField(term28266, term28266.getClass(), "reviewId", null);
        setField(term28265, term28265.getClass(), "userReviewId", term28266);
        setField(term28267, term28267.getClass(), "id", null);
        setField(term28267, term28267.getClass(), "name", null);
        setField(term28267, term28267.getClass(), "userReviews", null);
        setField(term28265, term28265.getClass(), "user", term28267);
        setField(term28268, term28268.getClass(), "id", null);
        setField(term28268, term28268.getClass(), "review", null);
        setField(term28268, term28268.getClass(), "userReviews", null);
        setField(term28265, term28265.getClass(), "review", term28268);
        setField(term28269, term28269.getClass(), "date", null);
        setField(term28269, term28269.getClass(), "time", null);
        setField(term28265, term28265.getClass(), "date", term28269);
        Object term28270 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28271 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28272 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28273 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28274 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28271, term28271.getClass(), "userId", null);
        setField(term28271, term28271.getClass(), "reviewId", null);
        setField(term28270, term28270.getClass(), "userReviewId", term28271);
        setField(term28272, term28272.getClass(), "id", null);
        setField(term28272, term28272.getClass(), "name", null);
        setField(term28272, term28272.getClass(), "userReviews", null);
        setField(term28270, term28270.getClass(), "user", term28272);
        setField(term28273, term28273.getClass(), "id", null);
        setField(term28273, term28273.getClass(), "review", null);
        setField(term28273, term28273.getClass(), "userReviews", null);
        setField(term28270, term28270.getClass(), "review", term28273);
        setField(term28274, term28274.getClass(), "date", null);
        setField(term28274, term28274.getClass(), "time", null);
        setField(term28270, term28270.getClass(), "date", term28274);
        Object term28275 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28276 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28277 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28278 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28279 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28276, term28276.getClass(), "userId", null);
        setField(term28276, term28276.getClass(), "reviewId", null);
        setField(term28275, term28275.getClass(), "userReviewId", term28276);
        setField(term28277, term28277.getClass(), "id", null);
        setField(term28277, term28277.getClass(), "name", null);
        setField(term28277, term28277.getClass(), "userReviews", null);
        setField(term28275, term28275.getClass(), "user", term28277);
        setField(term28278, term28278.getClass(), "id", null);
        setField(term28278, term28278.getClass(), "review", null);
        setField(term28278, term28278.getClass(), "userReviews", null);
        setField(term28275, term28275.getClass(), "review", term28278);
        setField(term28279, term28279.getClass(), "date", null);
        setField(term28279, term28279.getClass(), "time", null);
        setField(term28275, term28275.getClass(), "date", term28279);
        Object term28280 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28281 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28282 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28283 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28284 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28281, term28281.getClass(), "userId", null);
        setField(term28281, term28281.getClass(), "reviewId", null);
        setField(term28280, term28280.getClass(), "userReviewId", term28281);
        setField(term28282, term28282.getClass(), "id", null);
        setField(term28282, term28282.getClass(), "name", null);
        setField(term28282, term28282.getClass(), "userReviews", null);
        setField(term28280, term28280.getClass(), "user", term28282);
        setField(term28283, term28283.getClass(), "id", null);
        setField(term28283, term28283.getClass(), "review", null);
        setField(term28283, term28283.getClass(), "userReviews", null);
        setField(term28280, term28280.getClass(), "review", term28283);
        setField(term28284, term28284.getClass(), "date", null);
        setField(term28284, term28284.getClass(), "time", null);
        setField(term28280, term28280.getClass(), "date", term28284);
        Object term28285 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28286 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28287 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28288 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28289 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28286, term28286.getClass(), "userId", null);
        setField(term28286, term28286.getClass(), "reviewId", null);
        setField(term28285, term28285.getClass(), "userReviewId", term28286);
        setField(term28287, term28287.getClass(), "id", null);
        setField(term28287, term28287.getClass(), "name", null);
        setField(term28287, term28287.getClass(), "userReviews", null);
        setField(term28285, term28285.getClass(), "user", term28287);
        setField(term28288, term28288.getClass(), "id", null);
        setField(term28288, term28288.getClass(), "review", null);
        setField(term28288, term28288.getClass(), "userReviews", null);
        setField(term28285, term28285.getClass(), "review", term28288);
        setField(term28289, term28289.getClass(), "date", null);
        setField(term28289, term28289.getClass(), "time", null);
        setField(term28285, term28285.getClass(), "date", term28289);
        Object term28290 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28291 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28292 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28293 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28294 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28291, term28291.getClass(), "userId", null);
        setField(term28291, term28291.getClass(), "reviewId", null);
        setField(term28290, term28290.getClass(), "userReviewId", term28291);
        setField(term28292, term28292.getClass(), "id", null);
        setField(term28292, term28292.getClass(), "name", null);
        setField(term28292, term28292.getClass(), "userReviews", null);
        setField(term28290, term28290.getClass(), "user", term28292);
        setField(term28293, term28293.getClass(), "id", null);
        setField(term28293, term28293.getClass(), "review", null);
        setField(term28293, term28293.getClass(), "userReviews", null);
        setField(term28290, term28290.getClass(), "review", term28293);
        setField(term28294, term28294.getClass(), "date", null);
        setField(term28294, term28294.getClass(), "time", null);
        setField(term28290, term28290.getClass(), "date", term28294);
        ArrayList term28263 = new ArrayList();
        ((ArrayList) term28263).add(term28265);
        ((ArrayList) term28263).add(term28270);
        ((ArrayList) term28263).add(term28275);
        ((ArrayList) term28263).add(term28280);
        ((ArrayList) term28263).add(term28285);
        ((ArrayList) term28263).add(term28285);
        ((ArrayList) term28263).add(term28290);
        ((ArrayList) term28263).add(term28275);
        ((ArrayList) term28263).add(term28275);
        term28238 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28238, term28238.getClass(), "id", "crZAQIKgDI");
        setField(term28238, term28238.getClass(), "name", "uDAdogNiBQ");
        setField(term28238, term28238.getClass(), "userReviews", term28263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term28238, args);
    }

};


