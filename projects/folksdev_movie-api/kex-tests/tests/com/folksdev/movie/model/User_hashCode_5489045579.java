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

public class User_hashCode_5489045579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28638;

    public User_hashCode_5489045579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28665 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28666 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28667 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28668 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28669 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28666, term28666.getClass(), "userId", null);
        setField(term28666, term28666.getClass(), "reviewId", null);
        setField(term28665, term28665.getClass(), "userReviewId", term28666);
        setField(term28667, term28667.getClass(), "id", null);
        setField(term28667, term28667.getClass(), "name", null);
        setField(term28667, term28667.getClass(), "userReviews", null);
        setField(term28665, term28665.getClass(), "user", term28667);
        setField(term28668, term28668.getClass(), "id", null);
        setField(term28668, term28668.getClass(), "review", null);
        setField(term28668, term28668.getClass(), "userReviews", null);
        setField(term28665, term28665.getClass(), "review", term28668);
        setField(term28669, term28669.getClass(), "date", null);
        setField(term28669, term28669.getClass(), "time", null);
        setField(term28665, term28665.getClass(), "date", term28669);
        Object term28670 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28671 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28672 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28673 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28674 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28671, term28671.getClass(), "userId", null);
        setField(term28671, term28671.getClass(), "reviewId", null);
        setField(term28670, term28670.getClass(), "userReviewId", term28671);
        setField(term28672, term28672.getClass(), "id", null);
        setField(term28672, term28672.getClass(), "name", null);
        setField(term28672, term28672.getClass(), "userReviews", null);
        setField(term28670, term28670.getClass(), "user", term28672);
        setField(term28673, term28673.getClass(), "id", null);
        setField(term28673, term28673.getClass(), "review", null);
        setField(term28673, term28673.getClass(), "userReviews", null);
        setField(term28670, term28670.getClass(), "review", term28673);
        setField(term28674, term28674.getClass(), "date", null);
        setField(term28674, term28674.getClass(), "time", null);
        setField(term28670, term28670.getClass(), "date", term28674);
        Object term28675 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28676 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28677 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28678 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28679 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28676, term28676.getClass(), "userId", null);
        setField(term28676, term28676.getClass(), "reviewId", null);
        setField(term28675, term28675.getClass(), "userReviewId", term28676);
        setField(term28677, term28677.getClass(), "id", null);
        setField(term28677, term28677.getClass(), "name", null);
        setField(term28677, term28677.getClass(), "userReviews", null);
        setField(term28675, term28675.getClass(), "user", term28677);
        setField(term28678, term28678.getClass(), "id", null);
        setField(term28678, term28678.getClass(), "review", null);
        setField(term28678, term28678.getClass(), "userReviews", null);
        setField(term28675, term28675.getClass(), "review", term28678);
        setField(term28679, term28679.getClass(), "date", null);
        setField(term28679, term28679.getClass(), "time", null);
        setField(term28675, term28675.getClass(), "date", term28679);
        Object term28680 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28681 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28682 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28683 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28681, term28681.getClass(), "userId", null);
        setField(term28681, term28681.getClass(), "reviewId", null);
        setField(term28680, term28680.getClass(), "userReviewId", term28681);
        setField(term28680, term28680.getClass(), "user", term28672);
        setField(term28682, term28682.getClass(), "id", null);
        setField(term28682, term28682.getClass(), "review", null);
        setField(term28682, term28682.getClass(), "userReviews", null);
        setField(term28680, term28680.getClass(), "review", term28682);
        setField(term28683, term28683.getClass(), "date", null);
        setField(term28683, term28683.getClass(), "time", null);
        setField(term28680, term28680.getClass(), "date", term28683);
        Object term28684 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28685 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28686 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28687 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28688 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28685, term28685.getClass(), "userId", null);
        setField(term28685, term28685.getClass(), "reviewId", null);
        setField(term28684, term28684.getClass(), "userReviewId", term28685);
        setField(term28686, term28686.getClass(), "id", null);
        setField(term28686, term28686.getClass(), "name", null);
        setField(term28686, term28686.getClass(), "userReviews", null);
        setField(term28684, term28684.getClass(), "user", term28686);
        setField(term28687, term28687.getClass(), "id", null);
        setField(term28687, term28687.getClass(), "review", null);
        setField(term28687, term28687.getClass(), "userReviews", null);
        setField(term28684, term28684.getClass(), "review", term28687);
        setField(term28688, term28688.getClass(), "date", null);
        setField(term28688, term28688.getClass(), "time", null);
        setField(term28684, term28684.getClass(), "date", term28688);
        ArrayList term28663 = new ArrayList();
        ((ArrayList) term28663).add(term28665);
        ((ArrayList) term28663).add(term28670);
        ((ArrayList) term28663).add(term28670);
        ((ArrayList) term28663).add(term28675);
        ((ArrayList) term28663).add(term28680);
        ((ArrayList) term28663).add(term28684);
        term28638 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28638, term28638.getClass(), "id", "frPgAZBkug");
        setField(term28638, term28638.getClass(), "name", "AAzuYrqTRq");
        setField(term28638, term28638.getClass(), "userReviews", term28663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term28638, args);
    }

};


