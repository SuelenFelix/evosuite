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

public class User_getId_13849072461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27982;

    public User_getId_13849072461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28009 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28010 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28011 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28012 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28013 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28010, term28010.getClass(), "userId", null);
        setField(term28010, term28010.getClass(), "reviewId", null);
        setField(term28009, term28009.getClass(), "userReviewId", term28010);
        setField(term28011, term28011.getClass(), "id", null);
        setField(term28011, term28011.getClass(), "name", null);
        setField(term28011, term28011.getClass(), "userReviews", null);
        setField(term28009, term28009.getClass(), "user", term28011);
        setField(term28012, term28012.getClass(), "id", null);
        setField(term28012, term28012.getClass(), "review", null);
        setField(term28012, term28012.getClass(), "userReviews", null);
        setField(term28009, term28009.getClass(), "review", term28012);
        setField(term28013, term28013.getClass(), "date", null);
        setField(term28013, term28013.getClass(), "time", null);
        setField(term28009, term28009.getClass(), "date", term28013);
        Object term28014 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28015 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28016 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28017 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28018 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28015, term28015.getClass(), "userId", null);
        setField(term28015, term28015.getClass(), "reviewId", null);
        setField(term28014, term28014.getClass(), "userReviewId", term28015);
        setField(term28016, term28016.getClass(), "id", null);
        setField(term28016, term28016.getClass(), "name", null);
        setField(term28016, term28016.getClass(), "userReviews", null);
        setField(term28014, term28014.getClass(), "user", term28016);
        setField(term28017, term28017.getClass(), "id", null);
        setField(term28017, term28017.getClass(), "review", null);
        setField(term28017, term28017.getClass(), "userReviews", null);
        setField(term28014, term28014.getClass(), "review", term28017);
        setField(term28018, term28018.getClass(), "date", null);
        setField(term28018, term28018.getClass(), "time", null);
        setField(term28014, term28014.getClass(), "date", term28018);
        Object term28019 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28020 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28021 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28022 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28023 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28020, term28020.getClass(), "userId", null);
        setField(term28020, term28020.getClass(), "reviewId", null);
        setField(term28019, term28019.getClass(), "userReviewId", term28020);
        setField(term28021, term28021.getClass(), "id", null);
        setField(term28021, term28021.getClass(), "name", null);
        setField(term28021, term28021.getClass(), "userReviews", null);
        setField(term28019, term28019.getClass(), "user", term28021);
        setField(term28022, term28022.getClass(), "id", null);
        setField(term28022, term28022.getClass(), "review", null);
        setField(term28022, term28022.getClass(), "userReviews", null);
        setField(term28019, term28019.getClass(), "review", term28022);
        setField(term28023, term28023.getClass(), "date", null);
        setField(term28023, term28023.getClass(), "time", null);
        setField(term28019, term28019.getClass(), "date", term28023);
        Object term28024 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28025 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28026 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28027 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28028 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28025, term28025.getClass(), "userId", null);
        setField(term28025, term28025.getClass(), "reviewId", null);
        setField(term28024, term28024.getClass(), "userReviewId", term28025);
        setField(term28026, term28026.getClass(), "id", null);
        setField(term28026, term28026.getClass(), "name", null);
        setField(term28026, term28026.getClass(), "userReviews", null);
        setField(term28024, term28024.getClass(), "user", term28026);
        setField(term28027, term28027.getClass(), "id", null);
        setField(term28027, term28027.getClass(), "review", null);
        setField(term28027, term28027.getClass(), "userReviews", null);
        setField(term28024, term28024.getClass(), "review", term28027);
        setField(term28028, term28028.getClass(), "date", null);
        setField(term28028, term28028.getClass(), "time", null);
        setField(term28024, term28024.getClass(), "date", term28028);
        Object term28029 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28030 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28031 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28032 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28033 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28030, term28030.getClass(), "userId", null);
        setField(term28030, term28030.getClass(), "reviewId", null);
        setField(term28029, term28029.getClass(), "userReviewId", term28030);
        setField(term28031, term28031.getClass(), "id", null);
        setField(term28031, term28031.getClass(), "name", null);
        setField(term28031, term28031.getClass(), "userReviews", null);
        setField(term28029, term28029.getClass(), "user", term28031);
        setField(term28032, term28032.getClass(), "id", null);
        setField(term28032, term28032.getClass(), "review", null);
        setField(term28032, term28032.getClass(), "userReviews", null);
        setField(term28029, term28029.getClass(), "review", term28032);
        setField(term28033, term28033.getClass(), "date", null);
        setField(term28033, term28033.getClass(), "time", null);
        setField(term28029, term28029.getClass(), "date", term28033);
        ArrayList term28007 = new ArrayList();
        ((ArrayList) term28007).add(term28009);
        ((ArrayList) term28007).add(term28014);
        ((ArrayList) term28007).add(term28019);
        ((ArrayList) term28007).add(term28024);
        ((ArrayList) term28007).add(term28024);
        ((ArrayList) term28007).add(term28029);
        term27982 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term27982, term27982.getClass(), "id", "SSWEZgFiFO");
        setField(term27982, term27982.getClass(), "name", "spphrCslQA");
        setField(term27982, term27982.getClass(), "userReviews", term28007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term27982, args);
    }

};


