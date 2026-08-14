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
     Object term28833;

    public Review_getId_15299791351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28860 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28861 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28862 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28863 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28864 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28861, term28861.getClass(), "userId", null);
        setField(term28861, term28861.getClass(), "reviewId", null);
        setField(term28860, term28860.getClass(), "userReviewId", term28861);
        setField(term28862, term28862.getClass(), "id", null);
        setField(term28862, term28862.getClass(), "name", null);
        setField(term28862, term28862.getClass(), "userReviews", null);
        setField(term28860, term28860.getClass(), "user", term28862);
        setField(term28863, term28863.getClass(), "id", null);
        setField(term28863, term28863.getClass(), "review", null);
        setField(term28863, term28863.getClass(), "userReviews", null);
        setField(term28860, term28860.getClass(), "review", term28863);
        setField(term28864, term28864.getClass(), "date", null);
        setField(term28864, term28864.getClass(), "time", null);
        setField(term28860, term28860.getClass(), "date", term28864);
        Object term28865 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28866 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28867 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28868 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28869 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28866, term28866.getClass(), "userId", null);
        setField(term28866, term28866.getClass(), "reviewId", null);
        setField(term28865, term28865.getClass(), "userReviewId", term28866);
        setField(term28867, term28867.getClass(), "id", null);
        setField(term28867, term28867.getClass(), "name", null);
        setField(term28867, term28867.getClass(), "userReviews", null);
        setField(term28865, term28865.getClass(), "user", term28867);
        setField(term28868, term28868.getClass(), "id", null);
        setField(term28868, term28868.getClass(), "review", null);
        setField(term28868, term28868.getClass(), "userReviews", null);
        setField(term28865, term28865.getClass(), "review", term28868);
        setField(term28869, term28869.getClass(), "date", null);
        setField(term28869, term28869.getClass(), "time", null);
        setField(term28865, term28865.getClass(), "date", term28869);
        Object term28870 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28871 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28872 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28873 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28871, term28871.getClass(), "userId", null);
        setField(term28871, term28871.getClass(), "reviewId", null);
        setField(term28870, term28870.getClass(), "userReviewId", term28871);
        setField(term28872, term28872.getClass(), "id", null);
        setField(term28872, term28872.getClass(), "name", null);
        setField(term28872, term28872.getClass(), "userReviews", null);
        setField(term28870, term28870.getClass(), "user", term28872);
        setField(term28870, term28870.getClass(), "review", term28863);
        setField(term28873, term28873.getClass(), "date", null);
        setField(term28873, term28873.getClass(), "time", null);
        setField(term28870, term28870.getClass(), "date", term28873);
        Object term28874 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28875 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28876 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28877 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28878 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28875, term28875.getClass(), "userId", null);
        setField(term28875, term28875.getClass(), "reviewId", null);
        setField(term28874, term28874.getClass(), "userReviewId", term28875);
        setField(term28876, term28876.getClass(), "id", null);
        setField(term28876, term28876.getClass(), "name", null);
        setField(term28876, term28876.getClass(), "userReviews", null);
        setField(term28874, term28874.getClass(), "user", term28876);
        setField(term28877, term28877.getClass(), "id", null);
        setField(term28877, term28877.getClass(), "review", null);
        setField(term28877, term28877.getClass(), "userReviews", null);
        setField(term28874, term28874.getClass(), "review", term28877);
        setField(term28878, term28878.getClass(), "date", null);
        setField(term28878, term28878.getClass(), "time", null);
        setField(term28874, term28874.getClass(), "date", term28878);
        ArrayList term28858 = new ArrayList();
        ((ArrayList) term28858).add(term28860);
        ((ArrayList) term28858).add(term28865);
        ((ArrayList) term28858).add(term28870);
        ((ArrayList) term28858).add(term28874);
        term28833 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term28833, term28833.getClass(), "id", "tHzdWkkvkE");
        setField(term28833, term28833.getClass(), "review", "OeOnaLqxoy");
        setField(term28833, term28833.getClass(), "userReviews", term28858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term28833, args);
    }

};


