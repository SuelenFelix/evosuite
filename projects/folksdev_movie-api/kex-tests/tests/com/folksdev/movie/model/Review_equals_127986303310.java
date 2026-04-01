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

public class Review_equals_127986303310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29539;
     Object term29573;

    public Review_equals_127986303310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29566 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29567 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29568 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29569 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29570 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29567, term29567.getClass(), "userId", null);
        setField(term29567, term29567.getClass(), "reviewId", null);
        setField(term29566, term29566.getClass(), "userReviewId", term29567);
        setField(term29568, term29568.getClass(), "id", null);
        setField(term29568, term29568.getClass(), "name", null);
        setField(term29568, term29568.getClass(), "userReviews", null);
        setField(term29566, term29566.getClass(), "user", term29568);
        setField(term29569, term29569.getClass(), "id", null);
        setField(term29569, term29569.getClass(), "review", null);
        setField(term29569, term29569.getClass(), "userReviews", null);
        setField(term29566, term29566.getClass(), "review", term29569);
        setField(term29570, term29570.getClass(), "date", null);
        setField(term29570, term29570.getClass(), "time", null);
        setField(term29566, term29566.getClass(), "date", term29570);
        ArrayList term29564 = new ArrayList();
        ((ArrayList) term29564).add(term29566);
        term29539 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29539, term29539.getClass(), "id", "qkZsBlbGpw");
        setField(term29539, term29539.getClass(), "review", "UonOkFcwuK");
        setField(term29539, term29539.getClass(), "userReviews", term29564);
        term29573 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29573;
        callMethod(klass, "equals", argTypes, term29539, args);
    }

};


