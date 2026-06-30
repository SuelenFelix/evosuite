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

public class Review_getId_15299791351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28834;

    public Review_getId_15299791351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28861 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28862 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28863 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28864 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28865 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28862, term28862.getClass(), "userId", null);
        setField(term28862, term28862.getClass(), "reviewId", null);
        setField(term28861, term28861.getClass(), "userReviewId", term28862);
        setField(term28863, term28863.getClass(), "id", null);
        setField(term28863, term28863.getClass(), "name", null);
        setField(term28863, term28863.getClass(), "userReviews", null);
        setField(term28861, term28861.getClass(), "user", term28863);
        setField(term28864, term28864.getClass(), "id", null);
        setField(term28864, term28864.getClass(), "review", null);
        setField(term28864, term28864.getClass(), "userReviews", null);
        setField(term28861, term28861.getClass(), "review", term28864);
        setField(term28865, term28865.getClass(), "date", null);
        setField(term28865, term28865.getClass(), "time", null);
        setField(term28861, term28861.getClass(), "date", term28865);
        Object term28866 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28867 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28868 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28869 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28870 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28867, term28867.getClass(), "userId", null);
        setField(term28867, term28867.getClass(), "reviewId", null);
        setField(term28866, term28866.getClass(), "userReviewId", term28867);
        setField(term28868, term28868.getClass(), "id", null);
        setField(term28868, term28868.getClass(), "name", null);
        setField(term28868, term28868.getClass(), "userReviews", null);
        setField(term28866, term28866.getClass(), "user", term28868);
        setField(term28869, term28869.getClass(), "id", null);
        setField(term28869, term28869.getClass(), "review", null);
        setField(term28869, term28869.getClass(), "userReviews", null);
        setField(term28866, term28866.getClass(), "review", term28869);
        setField(term28870, term28870.getClass(), "date", null);
        setField(term28870, term28870.getClass(), "time", null);
        setField(term28866, term28866.getClass(), "date", term28870);
        Object term28871 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28872 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28873 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28874 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28872, term28872.getClass(), "userId", null);
        setField(term28872, term28872.getClass(), "reviewId", null);
        setField(term28871, term28871.getClass(), "userReviewId", term28872);
        setField(term28873, term28873.getClass(), "id", null);
        setField(term28873, term28873.getClass(), "name", null);
        setField(term28873, term28873.getClass(), "userReviews", null);
        setField(term28871, term28871.getClass(), "user", term28873);
        setField(term28871, term28871.getClass(), "review", term28864);
        setField(term28874, term28874.getClass(), "date", null);
        setField(term28874, term28874.getClass(), "time", null);
        setField(term28871, term28871.getClass(), "date", term28874);
        Object term28875 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28876 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28877 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28878 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28879 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28876, term28876.getClass(), "userId", null);
        setField(term28876, term28876.getClass(), "reviewId", null);
        setField(term28875, term28875.getClass(), "userReviewId", term28876);
        setField(term28877, term28877.getClass(), "id", null);
        setField(term28877, term28877.getClass(), "name", null);
        setField(term28877, term28877.getClass(), "userReviews", null);
        setField(term28875, term28875.getClass(), "user", term28877);
        setField(term28878, term28878.getClass(), "id", null);
        setField(term28878, term28878.getClass(), "review", null);
        setField(term28878, term28878.getClass(), "userReviews", null);
        setField(term28875, term28875.getClass(), "review", term28878);
        setField(term28879, term28879.getClass(), "date", null);
        setField(term28879, term28879.getClass(), "time", null);
        setField(term28875, term28875.getClass(), "date", term28879);
        ArrayList term28859 = new ArrayList();
        ((ArrayList) term28859).add(term28861);
        ((ArrayList) term28859).add(term28866);
        ((ArrayList) term28859).add(term28871);
        ((ArrayList) term28859).add(term28875);
        term28834 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term28834, term28834.getClass(), "id", "tHzdWkkvkE");
        setField(term28834, term28834.getClass(), "review", "OeOnaLqxoy");
        setField(term28834, term28834.getClass(), "userReviews", term28859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term28834, args);
    }

};


