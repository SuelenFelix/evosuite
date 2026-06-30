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
     Object term29055;

    public Review_component1_19537013724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29082 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29083 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29084 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29085 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29086 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29083, term29083.getClass(), "userId", null);
        setField(term29083, term29083.getClass(), "reviewId", null);
        setField(term29082, term29082.getClass(), "userReviewId", term29083);
        setField(term29084, term29084.getClass(), "id", null);
        setField(term29084, term29084.getClass(), "name", null);
        setField(term29084, term29084.getClass(), "userReviews", null);
        setField(term29082, term29082.getClass(), "user", term29084);
        setField(term29085, term29085.getClass(), "id", null);
        setField(term29085, term29085.getClass(), "review", null);
        setField(term29085, term29085.getClass(), "userReviews", null);
        setField(term29082, term29082.getClass(), "review", term29085);
        setField(term29086, term29086.getClass(), "date", null);
        setField(term29086, term29086.getClass(), "time", null);
        setField(term29082, term29082.getClass(), "date", term29086);
        Object term29087 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29088 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29089 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29090 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29091 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29088, term29088.getClass(), "userId", null);
        setField(term29088, term29088.getClass(), "reviewId", null);
        setField(term29087, term29087.getClass(), "userReviewId", term29088);
        setField(term29089, term29089.getClass(), "id", null);
        setField(term29089, term29089.getClass(), "name", null);
        setField(term29089, term29089.getClass(), "userReviews", null);
        setField(term29087, term29087.getClass(), "user", term29089);
        setField(term29090, term29090.getClass(), "id", null);
        setField(term29090, term29090.getClass(), "review", null);
        setField(term29090, term29090.getClass(), "userReviews", null);
        setField(term29087, term29087.getClass(), "review", term29090);
        setField(term29091, term29091.getClass(), "date", null);
        setField(term29091, term29091.getClass(), "time", null);
        setField(term29087, term29087.getClass(), "date", term29091);
        Object term29092 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29093 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29094 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29095 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29093, term29093.getClass(), "userId", null);
        setField(term29093, term29093.getClass(), "reviewId", null);
        setField(term29092, term29092.getClass(), "userReviewId", term29093);
        setField(term29094, term29094.getClass(), "id", null);
        setField(term29094, term29094.getClass(), "name", null);
        setField(term29094, term29094.getClass(), "userReviews", null);
        setField(term29092, term29092.getClass(), "user", term29094);
        setField(term29092, term29092.getClass(), "review", term29090);
        setField(term29095, term29095.getClass(), "date", null);
        setField(term29095, term29095.getClass(), "time", null);
        setField(term29092, term29092.getClass(), "date", term29095);
        ArrayList term29080 = new ArrayList();
        ((ArrayList) term29080).add(term29082);
        ((ArrayList) term29080).add(term29087);
        ((ArrayList) term29080).add(term29092);
        term29055 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29055, term29055.getClass(), "id", "XiZyOHXnNC");
        setField(term29055, term29055.getClass(), "review", "gQlDPvSqrX");
        setField(term29055, term29055.getClass(), "userReviews", term29080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term29055, args);
    }

};


