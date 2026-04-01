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

public class User_equals_10021788210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28710;
     Object term28754;

    public User_equals_10021788210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28737 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28738 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28739 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28740 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28741 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28738, term28738.getClass(), "userId", null);
        setField(term28738, term28738.getClass(), "reviewId", null);
        setField(term28737, term28737.getClass(), "userReviewId", term28738);
        setField(term28739, term28739.getClass(), "id", null);
        setField(term28739, term28739.getClass(), "name", null);
        setField(term28739, term28739.getClass(), "userReviews", null);
        setField(term28737, term28737.getClass(), "user", term28739);
        setField(term28740, term28740.getClass(), "id", null);
        setField(term28740, term28740.getClass(), "review", null);
        setField(term28740, term28740.getClass(), "userReviews", null);
        setField(term28737, term28737.getClass(), "review", term28740);
        setField(term28741, term28741.getClass(), "date", null);
        setField(term28741, term28741.getClass(), "time", null);
        setField(term28737, term28737.getClass(), "date", term28741);
        Object term28742 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28743 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28744 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28745 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28746 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28743, term28743.getClass(), "userId", null);
        setField(term28743, term28743.getClass(), "reviewId", null);
        setField(term28742, term28742.getClass(), "userReviewId", term28743);
        setField(term28744, term28744.getClass(), "id", null);
        setField(term28744, term28744.getClass(), "name", null);
        setField(term28744, term28744.getClass(), "userReviews", null);
        setField(term28742, term28742.getClass(), "user", term28744);
        setField(term28745, term28745.getClass(), "id", null);
        setField(term28745, term28745.getClass(), "review", null);
        setField(term28745, term28745.getClass(), "userReviews", null);
        setField(term28742, term28742.getClass(), "review", term28745);
        setField(term28746, term28746.getClass(), "date", null);
        setField(term28746, term28746.getClass(), "time", null);
        setField(term28742, term28742.getClass(), "date", term28746);
        Object term28747 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28748 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28749 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28750 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28751 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28748, term28748.getClass(), "userId", null);
        setField(term28748, term28748.getClass(), "reviewId", null);
        setField(term28747, term28747.getClass(), "userReviewId", term28748);
        setField(term28749, term28749.getClass(), "id", null);
        setField(term28749, term28749.getClass(), "name", null);
        setField(term28749, term28749.getClass(), "userReviews", null);
        setField(term28747, term28747.getClass(), "user", term28749);
        setField(term28750, term28750.getClass(), "id", null);
        setField(term28750, term28750.getClass(), "review", null);
        setField(term28750, term28750.getClass(), "userReviews", null);
        setField(term28747, term28747.getClass(), "review", term28750);
        setField(term28751, term28751.getClass(), "date", null);
        setField(term28751, term28751.getClass(), "time", null);
        setField(term28747, term28747.getClass(), "date", term28751);
        ArrayList term28735 = new ArrayList();
        ((ArrayList) term28735).add(term28737);
        ((ArrayList) term28735).add(term28742);
        ((ArrayList) term28735).add(term28747);
        term28710 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28710, term28710.getClass(), "id", "tYasEQgFbL");
        setField(term28710, term28710.getClass(), "name", "hqURWIdULb");
        setField(term28710, term28710.getClass(), "userReviews", term28735);
        term28754 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28754;
        callMethod(klass, "equals", argTypes, term28710, args);
    }

};


