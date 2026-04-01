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
     Object term28637;

    public User_hashCode_5489045579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28664 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28665 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28666 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28667 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28668 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28665, term28665.getClass(), "userId", null);
        setField(term28665, term28665.getClass(), "reviewId", null);
        setField(term28664, term28664.getClass(), "userReviewId", term28665);
        setField(term28666, term28666.getClass(), "id", null);
        setField(term28666, term28666.getClass(), "name", null);
        setField(term28666, term28666.getClass(), "userReviews", null);
        setField(term28664, term28664.getClass(), "user", term28666);
        setField(term28667, term28667.getClass(), "id", null);
        setField(term28667, term28667.getClass(), "review", null);
        setField(term28667, term28667.getClass(), "userReviews", null);
        setField(term28664, term28664.getClass(), "review", term28667);
        setField(term28668, term28668.getClass(), "date", null);
        setField(term28668, term28668.getClass(), "time", null);
        setField(term28664, term28664.getClass(), "date", term28668);
        Object term28669 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28670 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28671 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28672 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28673 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28670, term28670.getClass(), "userId", null);
        setField(term28670, term28670.getClass(), "reviewId", null);
        setField(term28669, term28669.getClass(), "userReviewId", term28670);
        setField(term28671, term28671.getClass(), "id", null);
        setField(term28671, term28671.getClass(), "name", null);
        setField(term28671, term28671.getClass(), "userReviews", null);
        setField(term28669, term28669.getClass(), "user", term28671);
        setField(term28672, term28672.getClass(), "id", null);
        setField(term28672, term28672.getClass(), "review", null);
        setField(term28672, term28672.getClass(), "userReviews", null);
        setField(term28669, term28669.getClass(), "review", term28672);
        setField(term28673, term28673.getClass(), "date", null);
        setField(term28673, term28673.getClass(), "time", null);
        setField(term28669, term28669.getClass(), "date", term28673);
        Object term28674 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28675 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28676 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28677 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28678 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28675, term28675.getClass(), "userId", null);
        setField(term28675, term28675.getClass(), "reviewId", null);
        setField(term28674, term28674.getClass(), "userReviewId", term28675);
        setField(term28676, term28676.getClass(), "id", null);
        setField(term28676, term28676.getClass(), "name", null);
        setField(term28676, term28676.getClass(), "userReviews", null);
        setField(term28674, term28674.getClass(), "user", term28676);
        setField(term28677, term28677.getClass(), "id", null);
        setField(term28677, term28677.getClass(), "review", null);
        setField(term28677, term28677.getClass(), "userReviews", null);
        setField(term28674, term28674.getClass(), "review", term28677);
        setField(term28678, term28678.getClass(), "date", null);
        setField(term28678, term28678.getClass(), "time", null);
        setField(term28674, term28674.getClass(), "date", term28678);
        Object term28679 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28680 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28681 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28682 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28680, term28680.getClass(), "userId", null);
        setField(term28680, term28680.getClass(), "reviewId", null);
        setField(term28679, term28679.getClass(), "userReviewId", term28680);
        setField(term28679, term28679.getClass(), "user", term28671);
        setField(term28681, term28681.getClass(), "id", null);
        setField(term28681, term28681.getClass(), "review", null);
        setField(term28681, term28681.getClass(), "userReviews", null);
        setField(term28679, term28679.getClass(), "review", term28681);
        setField(term28682, term28682.getClass(), "date", null);
        setField(term28682, term28682.getClass(), "time", null);
        setField(term28679, term28679.getClass(), "date", term28682);
        Object term28683 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28684 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28685 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28686 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28687 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28684, term28684.getClass(), "userId", null);
        setField(term28684, term28684.getClass(), "reviewId", null);
        setField(term28683, term28683.getClass(), "userReviewId", term28684);
        setField(term28685, term28685.getClass(), "id", null);
        setField(term28685, term28685.getClass(), "name", null);
        setField(term28685, term28685.getClass(), "userReviews", null);
        setField(term28683, term28683.getClass(), "user", term28685);
        setField(term28686, term28686.getClass(), "id", null);
        setField(term28686, term28686.getClass(), "review", null);
        setField(term28686, term28686.getClass(), "userReviews", null);
        setField(term28683, term28683.getClass(), "review", term28686);
        setField(term28687, term28687.getClass(), "date", null);
        setField(term28687, term28687.getClass(), "time", null);
        setField(term28683, term28683.getClass(), "date", term28687);
        ArrayList term28662 = new ArrayList();
        ((ArrayList) term28662).add(term28664);
        ((ArrayList) term28662).add(term28669);
        ((ArrayList) term28662).add(term28669);
        ((ArrayList) term28662).add(term28674);
        ((ArrayList) term28662).add(term28679);
        ((ArrayList) term28662).add(term28683);
        term28637 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28637, term28637.getClass(), "id", "frPgAZBkug");
        setField(term28637, term28637.getClass(), "name", "AAzuYrqTRq");
        setField(term28637, term28637.getClass(), "userReviews", term28662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term28637, args);
    }

};


