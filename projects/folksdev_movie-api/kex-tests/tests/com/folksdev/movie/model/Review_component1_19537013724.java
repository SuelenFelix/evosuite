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
     Object term29053;

    public Review_component1_19537013724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29080 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29081 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29082 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29083 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29084 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29081, term29081.getClass(), "userId", null);
        setField(term29081, term29081.getClass(), "reviewId", null);
        setField(term29080, term29080.getClass(), "userReviewId", term29081);
        setField(term29082, term29082.getClass(), "id", null);
        setField(term29082, term29082.getClass(), "name", null);
        setField(term29082, term29082.getClass(), "userReviews", null);
        setField(term29080, term29080.getClass(), "user", term29082);
        setField(term29083, term29083.getClass(), "id", null);
        setField(term29083, term29083.getClass(), "review", null);
        setField(term29083, term29083.getClass(), "userReviews", null);
        setField(term29080, term29080.getClass(), "review", term29083);
        setField(term29084, term29084.getClass(), "date", null);
        setField(term29084, term29084.getClass(), "time", null);
        setField(term29080, term29080.getClass(), "date", term29084);
        Object term29085 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29086 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29087 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29088 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term29089 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29086, term29086.getClass(), "userId", null);
        setField(term29086, term29086.getClass(), "reviewId", null);
        setField(term29085, term29085.getClass(), "userReviewId", term29086);
        setField(term29087, term29087.getClass(), "id", null);
        setField(term29087, term29087.getClass(), "name", null);
        setField(term29087, term29087.getClass(), "userReviews", null);
        setField(term29085, term29085.getClass(), "user", term29087);
        setField(term29088, term29088.getClass(), "id", null);
        setField(term29088, term29088.getClass(), "review", null);
        setField(term29088, term29088.getClass(), "userReviews", null);
        setField(term29085, term29085.getClass(), "review", term29088);
        setField(term29089, term29089.getClass(), "date", null);
        setField(term29089, term29089.getClass(), "time", null);
        setField(term29085, term29085.getClass(), "date", term29089);
        Object term29090 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term29091 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term29092 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term29093 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term29091, term29091.getClass(), "userId", null);
        setField(term29091, term29091.getClass(), "reviewId", null);
        setField(term29090, term29090.getClass(), "userReviewId", term29091);
        setField(term29092, term29092.getClass(), "id", null);
        setField(term29092, term29092.getClass(), "name", null);
        setField(term29092, term29092.getClass(), "userReviews", null);
        setField(term29090, term29090.getClass(), "user", term29092);
        setField(term29090, term29090.getClass(), "review", term29088);
        setField(term29093, term29093.getClass(), "date", null);
        setField(term29093, term29093.getClass(), "time", null);
        setField(term29090, term29090.getClass(), "date", term29093);
        ArrayList term29078 = new ArrayList();
        ((ArrayList) term29078).add(term29080);
        ((ArrayList) term29078).add(term29085);
        ((ArrayList) term29078).add(term29090);
        term29053 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        setField(term29053, term29053.getClass(), "id", "XiZyOHXnNC");
        setField(term29053, term29053.getClass(), "review", "gQlDPvSqrX");
        setField(term29053, term29053.getClass(), "userReviews", term29078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Review");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term29053, args);
    }

};


