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
     Object term28712;
     Object term28756;

    public User_equals_10021788210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28739 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28740 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28741 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28742 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28743 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28740, term28740.getClass(), "userId", null);
        setField(term28740, term28740.getClass(), "reviewId", null);
        setField(term28739, term28739.getClass(), "userReviewId", term28740);
        setField(term28741, term28741.getClass(), "id", null);
        setField(term28741, term28741.getClass(), "name", null);
        setField(term28741, term28741.getClass(), "userReviews", null);
        setField(term28739, term28739.getClass(), "user", term28741);
        setField(term28742, term28742.getClass(), "id", null);
        setField(term28742, term28742.getClass(), "review", null);
        setField(term28742, term28742.getClass(), "userReviews", null);
        setField(term28739, term28739.getClass(), "review", term28742);
        setField(term28743, term28743.getClass(), "date", null);
        setField(term28743, term28743.getClass(), "time", null);
        setField(term28739, term28739.getClass(), "date", term28743);
        Object term28744 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28745 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28746 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28747 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28748 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28745, term28745.getClass(), "userId", null);
        setField(term28745, term28745.getClass(), "reviewId", null);
        setField(term28744, term28744.getClass(), "userReviewId", term28745);
        setField(term28746, term28746.getClass(), "id", null);
        setField(term28746, term28746.getClass(), "name", null);
        setField(term28746, term28746.getClass(), "userReviews", null);
        setField(term28744, term28744.getClass(), "user", term28746);
        setField(term28747, term28747.getClass(), "id", null);
        setField(term28747, term28747.getClass(), "review", null);
        setField(term28747, term28747.getClass(), "userReviews", null);
        setField(term28744, term28744.getClass(), "review", term28747);
        setField(term28748, term28748.getClass(), "date", null);
        setField(term28748, term28748.getClass(), "time", null);
        setField(term28744, term28744.getClass(), "date", term28748);
        Object term28749 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28750 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28751 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28752 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28753 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28750, term28750.getClass(), "userId", null);
        setField(term28750, term28750.getClass(), "reviewId", null);
        setField(term28749, term28749.getClass(), "userReviewId", term28750);
        setField(term28751, term28751.getClass(), "id", null);
        setField(term28751, term28751.getClass(), "name", null);
        setField(term28751, term28751.getClass(), "userReviews", null);
        setField(term28749, term28749.getClass(), "user", term28751);
        setField(term28752, term28752.getClass(), "id", null);
        setField(term28752, term28752.getClass(), "review", null);
        setField(term28752, term28752.getClass(), "userReviews", null);
        setField(term28749, term28749.getClass(), "review", term28752);
        setField(term28753, term28753.getClass(), "date", null);
        setField(term28753, term28753.getClass(), "time", null);
        setField(term28749, term28749.getClass(), "date", term28753);
        ArrayList term28737 = new ArrayList();
        ((ArrayList) term28737).add(term28739);
        ((ArrayList) term28737).add(term28744);
        ((ArrayList) term28737).add(term28749);
        term28712 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28712, term28712.getClass(), "id", "tYasEQgFbL");
        setField(term28712, term28712.getClass(), "name", "hqURWIdULb");
        setField(term28712, term28712.getClass(), "userReviews", term28737);
        term28756 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28756;
        callMethod(klass, "equals", argTypes, term28712, args);
    }

};


