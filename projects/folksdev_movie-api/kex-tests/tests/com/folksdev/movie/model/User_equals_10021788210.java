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
     Object term28711;
     Object term28755;

    public User_equals_10021788210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28738 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28739 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28740 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28741 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28742 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28739, term28739.getClass(), "userId", null);
        setField(term28739, term28739.getClass(), "reviewId", null);
        setField(term28738, term28738.getClass(), "userReviewId", term28739);
        setField(term28740, term28740.getClass(), "id", null);
        setField(term28740, term28740.getClass(), "name", null);
        setField(term28740, term28740.getClass(), "userReviews", null);
        setField(term28738, term28738.getClass(), "user", term28740);
        setField(term28741, term28741.getClass(), "id", null);
        setField(term28741, term28741.getClass(), "review", null);
        setField(term28741, term28741.getClass(), "userReviews", null);
        setField(term28738, term28738.getClass(), "review", term28741);
        setField(term28742, term28742.getClass(), "date", null);
        setField(term28742, term28742.getClass(), "time", null);
        setField(term28738, term28738.getClass(), "date", term28742);
        Object term28743 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28744 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28745 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28746 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28747 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28744, term28744.getClass(), "userId", null);
        setField(term28744, term28744.getClass(), "reviewId", null);
        setField(term28743, term28743.getClass(), "userReviewId", term28744);
        setField(term28745, term28745.getClass(), "id", null);
        setField(term28745, term28745.getClass(), "name", null);
        setField(term28745, term28745.getClass(), "userReviews", null);
        setField(term28743, term28743.getClass(), "user", term28745);
        setField(term28746, term28746.getClass(), "id", null);
        setField(term28746, term28746.getClass(), "review", null);
        setField(term28746, term28746.getClass(), "userReviews", null);
        setField(term28743, term28743.getClass(), "review", term28746);
        setField(term28747, term28747.getClass(), "date", null);
        setField(term28747, term28747.getClass(), "time", null);
        setField(term28743, term28743.getClass(), "date", term28747);
        Object term28748 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28749 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28750 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28751 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28752 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28749, term28749.getClass(), "userId", null);
        setField(term28749, term28749.getClass(), "reviewId", null);
        setField(term28748, term28748.getClass(), "userReviewId", term28749);
        setField(term28750, term28750.getClass(), "id", null);
        setField(term28750, term28750.getClass(), "name", null);
        setField(term28750, term28750.getClass(), "userReviews", null);
        setField(term28748, term28748.getClass(), "user", term28750);
        setField(term28751, term28751.getClass(), "id", null);
        setField(term28751, term28751.getClass(), "review", null);
        setField(term28751, term28751.getClass(), "userReviews", null);
        setField(term28748, term28748.getClass(), "review", term28751);
        setField(term28752, term28752.getClass(), "date", null);
        setField(term28752, term28752.getClass(), "time", null);
        setField(term28748, term28748.getClass(), "date", term28752);
        ArrayList term28736 = new ArrayList();
        ((ArrayList) term28736).add(term28738);
        ((ArrayList) term28736).add(term28743);
        ((ArrayList) term28736).add(term28748);
        term28711 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28711, term28711.getClass(), "id", "tYasEQgFbL");
        setField(term28711, term28711.getClass(), "name", "hqURWIdULb");
        setField(term28711, term28711.getClass(), "userReviews", term28736);
        term28755 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28755;
        callMethod(klass, "equals", argTypes, term28711, args);
    }

};


