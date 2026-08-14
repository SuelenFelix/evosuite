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
     Object term29117;

    public Review_component2_19537004115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29144 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29145 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29146 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29147 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29148 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29145, term29145.getClass(), "userId", null);
        setField(term29145, term29145.getClass(), "reviewId", null);
        setField(term29144, term29144.getClass(), "userReviewId", term29145);
        setField(term29146, term29146.getClass(), "id", null);
        setField(term29146, term29146.getClass(), "name", null);
        setField(term29146, term29146.getClass(), "userReviews", null);
        setField(term29144, term29144.getClass(), "user", term29146);
        setField(term29147, term29147.getClass(), "id", null);
        setField(term29147, term29147.getClass(), "review", null);
        setField(term29147, term29147.getClass(), "userReviews", null);
        setField(term29144, term29144.getClass(), "review", term29147);
        setField(term29148, term29148.getClass(), "date", null);
        setField(term29148, term29148.getClass(), "time", null);
        setField(term29144, term29144.getClass(), "date", term29148);
        ArrayList term29142 = new ArrayList();
        ((ArrayList) term29142).add(term29144);
        term29117 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29117, term29117.getClass(), "id", "LNsNBvvYgQ");
        setField(term29117, term29117.getClass(), "review", "VGKsvldNNB");
        setField(term29117, term29117.getClass(), "userReviews", term29142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term29117, args);
    }

};


