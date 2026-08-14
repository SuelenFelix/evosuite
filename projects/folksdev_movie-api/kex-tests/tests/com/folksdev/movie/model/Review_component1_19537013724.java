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

public class Review_component1_19537013724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29054;

    public Review_component1_19537013724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29081 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29082 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29083 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29084 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29085 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29082, term29082.getClass(), "userId", null);
        setField(term29082, term29082.getClass(), "reviewId", null);
        setField(term29081, term29081.getClass(), "userReviewId", term29082);
        setField(term29083, term29083.getClass(), "id", null);
        setField(term29083, term29083.getClass(), "name", null);
        setField(term29083, term29083.getClass(), "userReviews", null);
        setField(term29081, term29081.getClass(), "user", term29083);
        setField(term29084, term29084.getClass(), "id", null);
        setField(term29084, term29084.getClass(), "review", null);
        setField(term29084, term29084.getClass(), "userReviews", null);
        setField(term29081, term29081.getClass(), "review", term29084);
        setField(term29085, term29085.getClass(), "date", null);
        setField(term29085, term29085.getClass(), "time", null);
        setField(term29081, term29081.getClass(), "date", term29085);
        Object term29086 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29087 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29088 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29089 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29090 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29087, term29087.getClass(), "userId", null);
        setField(term29087, term29087.getClass(), "reviewId", null);
        setField(term29086, term29086.getClass(), "userReviewId", term29087);
        setField(term29088, term29088.getClass(), "id", null);
        setField(term29088, term29088.getClass(), "name", null);
        setField(term29088, term29088.getClass(), "userReviews", null);
        setField(term29086, term29086.getClass(), "user", term29088);
        setField(term29089, term29089.getClass(), "id", null);
        setField(term29089, term29089.getClass(), "review", null);
        setField(term29089, term29089.getClass(), "userReviews", null);
        setField(term29086, term29086.getClass(), "review", term29089);
        setField(term29090, term29090.getClass(), "date", null);
        setField(term29090, term29090.getClass(), "time", null);
        setField(term29086, term29086.getClass(), "date", term29090);
        Object term29091 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29092 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29093 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29094 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29092, term29092.getClass(), "userId", null);
        setField(term29092, term29092.getClass(), "reviewId", null);
        setField(term29091, term29091.getClass(), "userReviewId", term29092);
        setField(term29093, term29093.getClass(), "id", null);
        setField(term29093, term29093.getClass(), "name", null);
        setField(term29093, term29093.getClass(), "userReviews", null);
        setField(term29091, term29091.getClass(), "user", term29093);
        setField(term29091, term29091.getClass(), "review", term29089);
        setField(term29094, term29094.getClass(), "date", null);
        setField(term29094, term29094.getClass(), "time", null);
        setField(term29091, term29091.getClass(), "date", term29094);
        ArrayList term29079 = new ArrayList();
        ((ArrayList) term29079).add(term29081);
        ((ArrayList) term29079).add(term29086);
        ((ArrayList) term29079).add(term29091);
        term29054 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29054, term29054.getClass(), "id", "XiZyOHXnNC");
        setField(term29054, term29054.getClass(), "review", "gQlDPvSqrX");
        setField(term29054, term29054.getClass(), "userReviews", term29079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term29054, args);
    }

};


