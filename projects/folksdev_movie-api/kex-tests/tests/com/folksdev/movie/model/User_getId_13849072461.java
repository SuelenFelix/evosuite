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
     Object term27983;

    public User_getId_13849072461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28010 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28011 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28012 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28013 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28014 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28011, term28011.getClass(), "userId", null);
        setField(term28011, term28011.getClass(), "reviewId", null);
        setField(term28010, term28010.getClass(), "userReviewId", term28011);
        setField(term28012, term28012.getClass(), "id", null);
        setField(term28012, term28012.getClass(), "name", null);
        setField(term28012, term28012.getClass(), "userReviews", null);
        setField(term28010, term28010.getClass(), "user", term28012);
        setField(term28013, term28013.getClass(), "id", null);
        setField(term28013, term28013.getClass(), "review", null);
        setField(term28013, term28013.getClass(), "userReviews", null);
        setField(term28010, term28010.getClass(), "review", term28013);
        setField(term28014, term28014.getClass(), "date", null);
        setField(term28014, term28014.getClass(), "time", null);
        setField(term28010, term28010.getClass(), "date", term28014);
        Object term28015 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28016 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28017 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28018 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28019 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28016, term28016.getClass(), "userId", null);
        setField(term28016, term28016.getClass(), "reviewId", null);
        setField(term28015, term28015.getClass(), "userReviewId", term28016);
        setField(term28017, term28017.getClass(), "id", null);
        setField(term28017, term28017.getClass(), "name", null);
        setField(term28017, term28017.getClass(), "userReviews", null);
        setField(term28015, term28015.getClass(), "user", term28017);
        setField(term28018, term28018.getClass(), "id", null);
        setField(term28018, term28018.getClass(), "review", null);
        setField(term28018, term28018.getClass(), "userReviews", null);
        setField(term28015, term28015.getClass(), "review", term28018);
        setField(term28019, term28019.getClass(), "date", null);
        setField(term28019, term28019.getClass(), "time", null);
        setField(term28015, term28015.getClass(), "date", term28019);
        Object term28020 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28021 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28022 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28023 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28024 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28021, term28021.getClass(), "userId", null);
        setField(term28021, term28021.getClass(), "reviewId", null);
        setField(term28020, term28020.getClass(), "userReviewId", term28021);
        setField(term28022, term28022.getClass(), "id", null);
        setField(term28022, term28022.getClass(), "name", null);
        setField(term28022, term28022.getClass(), "userReviews", null);
        setField(term28020, term28020.getClass(), "user", term28022);
        setField(term28023, term28023.getClass(), "id", null);
        setField(term28023, term28023.getClass(), "review", null);
        setField(term28023, term28023.getClass(), "userReviews", null);
        setField(term28020, term28020.getClass(), "review", term28023);
        setField(term28024, term28024.getClass(), "date", null);
        setField(term28024, term28024.getClass(), "time", null);
        setField(term28020, term28020.getClass(), "date", term28024);
        Object term28025 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28026 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28027 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28028 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28029 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28026, term28026.getClass(), "userId", null);
        setField(term28026, term28026.getClass(), "reviewId", null);
        setField(term28025, term28025.getClass(), "userReviewId", term28026);
        setField(term28027, term28027.getClass(), "id", null);
        setField(term28027, term28027.getClass(), "name", null);
        setField(term28027, term28027.getClass(), "userReviews", null);
        setField(term28025, term28025.getClass(), "user", term28027);
        setField(term28028, term28028.getClass(), "id", null);
        setField(term28028, term28028.getClass(), "review", null);
        setField(term28028, term28028.getClass(), "userReviews", null);
        setField(term28025, term28025.getClass(), "review", term28028);
        setField(term28029, term28029.getClass(), "date", null);
        setField(term28029, term28029.getClass(), "time", null);
        setField(term28025, term28025.getClass(), "date", term28029);
        Object term28030 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28031 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28032 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28033 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28034 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28031, term28031.getClass(), "userId", null);
        setField(term28031, term28031.getClass(), "reviewId", null);
        setField(term28030, term28030.getClass(), "userReviewId", term28031);
        setField(term28032, term28032.getClass(), "id", null);
        setField(term28032, term28032.getClass(), "name", null);
        setField(term28032, term28032.getClass(), "userReviews", null);
        setField(term28030, term28030.getClass(), "user", term28032);
        setField(term28033, term28033.getClass(), "id", null);
        setField(term28033, term28033.getClass(), "review", null);
        setField(term28033, term28033.getClass(), "userReviews", null);
        setField(term28030, term28030.getClass(), "review", term28033);
        setField(term28034, term28034.getClass(), "date", null);
        setField(term28034, term28034.getClass(), "time", null);
        setField(term28030, term28030.getClass(), "date", term28034);
        ArrayList term28008 = new ArrayList();
        ((ArrayList) term28008).add(term28010);
        ((ArrayList) term28008).add(term28015);
        ((ArrayList) term28008).add(term28020);
        ((ArrayList) term28008).add(term28025);
        ((ArrayList) term28008).add(term28025);
        ((ArrayList) term28008).add(term28030);
        term27983 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term27983, term27983.getClass(), "id", "SSWEZgFiFO");
        setField(term27983, term27983.getClass(), "name", "spphrCslQA");
        setField(term27983, term27983.getClass(), "userReviews", term28008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term27983, args);
    }

};


