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

public class Review_component2_19537004115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29118;

    public Review_component2_19537004115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29145 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29146 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29147 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29148 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29149 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29146, term29146.getClass(), "userId", null);
        setField(term29146, term29146.getClass(), "reviewId", null);
        setField(term29145, term29145.getClass(), "userReviewId", term29146);
        setField(term29147, term29147.getClass(), "id", null);
        setField(term29147, term29147.getClass(), "name", null);
        setField(term29147, term29147.getClass(), "userReviews", null);
        setField(term29145, term29145.getClass(), "user", term29147);
        setField(term29148, term29148.getClass(), "id", null);
        setField(term29148, term29148.getClass(), "review", null);
        setField(term29148, term29148.getClass(), "userReviews", null);
        setField(term29145, term29145.getClass(), "review", term29148);
        setField(term29149, term29149.getClass(), "date", null);
        setField(term29149, term29149.getClass(), "time", null);
        setField(term29145, term29145.getClass(), "date", term29149);
        ArrayList term29143 = new ArrayList();
        ((ArrayList) term29143).add(term29145);
        term29118 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29118, term29118.getClass(), "id", "LNsNBvvYgQ");
        setField(term29118, term29118.getClass(), "review", "VGKsvldNNB");
        setField(term29118, term29118.getClass(), "userReviews", term29143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term29118, args);
    }

};


