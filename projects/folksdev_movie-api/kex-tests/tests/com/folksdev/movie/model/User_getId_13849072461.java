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
     Object term27981;

    public User_getId_13849072461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28008 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28009 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28010 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28011 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28012 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28009, term28009.getClass(), "userId", null);
        setField(term28009, term28009.getClass(), "reviewId", null);
        setField(term28008, term28008.getClass(), "userReviewId", term28009);
        setField(term28010, term28010.getClass(), "id", null);
        setField(term28010, term28010.getClass(), "name", null);
        setField(term28010, term28010.getClass(), "userReviews", null);
        setField(term28008, term28008.getClass(), "user", term28010);
        setField(term28011, term28011.getClass(), "id", null);
        setField(term28011, term28011.getClass(), "review", null);
        setField(term28011, term28011.getClass(), "userReviews", null);
        setField(term28008, term28008.getClass(), "review", term28011);
        setField(term28012, term28012.getClass(), "date", null);
        setField(term28012, term28012.getClass(), "time", null);
        setField(term28008, term28008.getClass(), "date", term28012);
        Object term28013 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28014 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28015 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28016 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28017 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28014, term28014.getClass(), "userId", null);
        setField(term28014, term28014.getClass(), "reviewId", null);
        setField(term28013, term28013.getClass(), "userReviewId", term28014);
        setField(term28015, term28015.getClass(), "id", null);
        setField(term28015, term28015.getClass(), "name", null);
        setField(term28015, term28015.getClass(), "userReviews", null);
        setField(term28013, term28013.getClass(), "user", term28015);
        setField(term28016, term28016.getClass(), "id", null);
        setField(term28016, term28016.getClass(), "review", null);
        setField(term28016, term28016.getClass(), "userReviews", null);
        setField(term28013, term28013.getClass(), "review", term28016);
        setField(term28017, term28017.getClass(), "date", null);
        setField(term28017, term28017.getClass(), "time", null);
        setField(term28013, term28013.getClass(), "date", term28017);
        Object term28018 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28019 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28020 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28021 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28022 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28019, term28019.getClass(), "userId", null);
        setField(term28019, term28019.getClass(), "reviewId", null);
        setField(term28018, term28018.getClass(), "userReviewId", term28019);
        setField(term28020, term28020.getClass(), "id", null);
        setField(term28020, term28020.getClass(), "name", null);
        setField(term28020, term28020.getClass(), "userReviews", null);
        setField(term28018, term28018.getClass(), "user", term28020);
        setField(term28021, term28021.getClass(), "id", null);
        setField(term28021, term28021.getClass(), "review", null);
        setField(term28021, term28021.getClass(), "userReviews", null);
        setField(term28018, term28018.getClass(), "review", term28021);
        setField(term28022, term28022.getClass(), "date", null);
        setField(term28022, term28022.getClass(), "time", null);
        setField(term28018, term28018.getClass(), "date", term28022);
        Object term28023 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28024 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28025 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28026 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28027 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28024, term28024.getClass(), "userId", null);
        setField(term28024, term28024.getClass(), "reviewId", null);
        setField(term28023, term28023.getClass(), "userReviewId", term28024);
        setField(term28025, term28025.getClass(), "id", null);
        setField(term28025, term28025.getClass(), "name", null);
        setField(term28025, term28025.getClass(), "userReviews", null);
        setField(term28023, term28023.getClass(), "user", term28025);
        setField(term28026, term28026.getClass(), "id", null);
        setField(term28026, term28026.getClass(), "review", null);
        setField(term28026, term28026.getClass(), "userReviews", null);
        setField(term28023, term28023.getClass(), "review", term28026);
        setField(term28027, term28027.getClass(), "date", null);
        setField(term28027, term28027.getClass(), "time", null);
        setField(term28023, term28023.getClass(), "date", term28027);
        Object term28028 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28029 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28030 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28031 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28032 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28029, term28029.getClass(), "userId", null);
        setField(term28029, term28029.getClass(), "reviewId", null);
        setField(term28028, term28028.getClass(), "userReviewId", term28029);
        setField(term28030, term28030.getClass(), "id", null);
        setField(term28030, term28030.getClass(), "name", null);
        setField(term28030, term28030.getClass(), "userReviews", null);
        setField(term28028, term28028.getClass(), "user", term28030);
        setField(term28031, term28031.getClass(), "id", null);
        setField(term28031, term28031.getClass(), "review", null);
        setField(term28031, term28031.getClass(), "userReviews", null);
        setField(term28028, term28028.getClass(), "review", term28031);
        setField(term28032, term28032.getClass(), "date", null);
        setField(term28032, term28032.getClass(), "time", null);
        setField(term28028, term28028.getClass(), "date", term28032);
        ArrayList term28006 = new ArrayList();
        ((ArrayList) term28006).add(term28008);
        ((ArrayList) term28006).add(term28013);
        ((ArrayList) term28006).add(term28018);
        ((ArrayList) term28006).add(term28023);
        ((ArrayList) term28006).add(term28023);
        ((ArrayList) term28006).add(term28028);
        term27981 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term27981, term27981.getClass(), "id", "SSWEZgFiFO");
        setField(term27981, term27981.getClass(), "name", "spphrCslQA");
        setField(term27981, term27981.getClass(), "userReviews", term28006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term27981, args);
    }

};


