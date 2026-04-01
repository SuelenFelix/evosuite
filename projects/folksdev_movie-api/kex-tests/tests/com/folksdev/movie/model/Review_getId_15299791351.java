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
     Object term28832;

    public Review_getId_15299791351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28859 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28860 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28861 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28862 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28863 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28860, term28860.getClass(), "userId", null);
        setField(term28860, term28860.getClass(), "reviewId", null);
        setField(term28859, term28859.getClass(), "userReviewId", term28860);
        setField(term28861, term28861.getClass(), "id", null);
        setField(term28861, term28861.getClass(), "name", null);
        setField(term28861, term28861.getClass(), "userReviews", null);
        setField(term28859, term28859.getClass(), "user", term28861);
        setField(term28862, term28862.getClass(), "id", null);
        setField(term28862, term28862.getClass(), "review", null);
        setField(term28862, term28862.getClass(), "userReviews", null);
        setField(term28859, term28859.getClass(), "review", term28862);
        setField(term28863, term28863.getClass(), "date", null);
        setField(term28863, term28863.getClass(), "time", null);
        setField(term28859, term28859.getClass(), "date", term28863);
        Object term28864 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28865 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28866 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28867 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28868 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28865, term28865.getClass(), "userId", null);
        setField(term28865, term28865.getClass(), "reviewId", null);
        setField(term28864, term28864.getClass(), "userReviewId", term28865);
        setField(term28866, term28866.getClass(), "id", null);
        setField(term28866, term28866.getClass(), "name", null);
        setField(term28866, term28866.getClass(), "userReviews", null);
        setField(term28864, term28864.getClass(), "user", term28866);
        setField(term28867, term28867.getClass(), "id", null);
        setField(term28867, term28867.getClass(), "review", null);
        setField(term28867, term28867.getClass(), "userReviews", null);
        setField(term28864, term28864.getClass(), "review", term28867);
        setField(term28868, term28868.getClass(), "date", null);
        setField(term28868, term28868.getClass(), "time", null);
        setField(term28864, term28864.getClass(), "date", term28868);
        Object term28869 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28870 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28871 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28872 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28870, term28870.getClass(), "userId", null);
        setField(term28870, term28870.getClass(), "reviewId", null);
        setField(term28869, term28869.getClass(), "userReviewId", term28870);
        setField(term28871, term28871.getClass(), "id", null);
        setField(term28871, term28871.getClass(), "name", null);
        setField(term28871, term28871.getClass(), "userReviews", null);
        setField(term28869, term28869.getClass(), "user", term28871);
        setField(term28869, term28869.getClass(), "review", term28862);
        setField(term28872, term28872.getClass(), "date", null);
        setField(term28872, term28872.getClass(), "time", null);
        setField(term28869, term28869.getClass(), "date", term28872);
        Object term28873 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28874 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28875 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28876 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28877 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28874, term28874.getClass(), "userId", null);
        setField(term28874, term28874.getClass(), "reviewId", null);
        setField(term28873, term28873.getClass(), "userReviewId", term28874);
        setField(term28875, term28875.getClass(), "id", null);
        setField(term28875, term28875.getClass(), "name", null);
        setField(term28875, term28875.getClass(), "userReviews", null);
        setField(term28873, term28873.getClass(), "user", term28875);
        setField(term28876, term28876.getClass(), "id", null);
        setField(term28876, term28876.getClass(), "review", null);
        setField(term28876, term28876.getClass(), "userReviews", null);
        setField(term28873, term28873.getClass(), "review", term28876);
        setField(term28877, term28877.getClass(), "date", null);
        setField(term28877, term28877.getClass(), "time", null);
        setField(term28873, term28873.getClass(), "date", term28877);
        ArrayList term28857 = new ArrayList();
        ((ArrayList) term28857).add(term28859);
        ((ArrayList) term28857).add(term28864);
        ((ArrayList) term28857).add(term28869);
        ((ArrayList) term28857).add(term28873);
        term28832 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term28832, term28832.getClass(), "id", "tHzdWkkvkE");
        setField(term28832, term28832.getClass(), "review", "OeOnaLqxoy");
        setField(term28832, term28832.getClass(), "userReviews", term28857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term28832, args);
    }

};


