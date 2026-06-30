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
     Object term28639;

    public User_hashCode_5489045579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28666 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28667 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28668 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28669 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28670 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28667, term28667.getClass(), "userId", null);
        setField(term28667, term28667.getClass(), "reviewId", null);
        setField(term28666, term28666.getClass(), "userReviewId", term28667);
        setField(term28668, term28668.getClass(), "id", null);
        setField(term28668, term28668.getClass(), "name", null);
        setField(term28668, term28668.getClass(), "userReviews", null);
        setField(term28666, term28666.getClass(), "user", term28668);
        setField(term28669, term28669.getClass(), "id", null);
        setField(term28669, term28669.getClass(), "review", null);
        setField(term28669, term28669.getClass(), "userReviews", null);
        setField(term28666, term28666.getClass(), "review", term28669);
        setField(term28670, term28670.getClass(), "date", null);
        setField(term28670, term28670.getClass(), "time", null);
        setField(term28666, term28666.getClass(), "date", term28670);
        Object term28671 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28672 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28673 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28674 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28675 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28672, term28672.getClass(), "userId", null);
        setField(term28672, term28672.getClass(), "reviewId", null);
        setField(term28671, term28671.getClass(), "userReviewId", term28672);
        setField(term28673, term28673.getClass(), "id", null);
        setField(term28673, term28673.getClass(), "name", null);
        setField(term28673, term28673.getClass(), "userReviews", null);
        setField(term28671, term28671.getClass(), "user", term28673);
        setField(term28674, term28674.getClass(), "id", null);
        setField(term28674, term28674.getClass(), "review", null);
        setField(term28674, term28674.getClass(), "userReviews", null);
        setField(term28671, term28671.getClass(), "review", term28674);
        setField(term28675, term28675.getClass(), "date", null);
        setField(term28675, term28675.getClass(), "time", null);
        setField(term28671, term28671.getClass(), "date", term28675);
        Object term28676 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28677 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28678 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28679 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28680 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28677, term28677.getClass(), "userId", null);
        setField(term28677, term28677.getClass(), "reviewId", null);
        setField(term28676, term28676.getClass(), "userReviewId", term28677);
        setField(term28678, term28678.getClass(), "id", null);
        setField(term28678, term28678.getClass(), "name", null);
        setField(term28678, term28678.getClass(), "userReviews", null);
        setField(term28676, term28676.getClass(), "user", term28678);
        setField(term28679, term28679.getClass(), "id", null);
        setField(term28679, term28679.getClass(), "review", null);
        setField(term28679, term28679.getClass(), "userReviews", null);
        setField(term28676, term28676.getClass(), "review", term28679);
        setField(term28680, term28680.getClass(), "date", null);
        setField(term28680, term28680.getClass(), "time", null);
        setField(term28676, term28676.getClass(), "date", term28680);
        Object term28681 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28682 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28683 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28684 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28682, term28682.getClass(), "userId", null);
        setField(term28682, term28682.getClass(), "reviewId", null);
        setField(term28681, term28681.getClass(), "userReviewId", term28682);
        setField(term28681, term28681.getClass(), "user", term28673);
        setField(term28683, term28683.getClass(), "id", null);
        setField(term28683, term28683.getClass(), "review", null);
        setField(term28683, term28683.getClass(), "userReviews", null);
        setField(term28681, term28681.getClass(), "review", term28683);
        setField(term28684, term28684.getClass(), "date", null);
        setField(term28684, term28684.getClass(), "time", null);
        setField(term28681, term28681.getClass(), "date", term28684);
        Object term28685 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28686 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28687 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28688 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28689 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28686, term28686.getClass(), "userId", null);
        setField(term28686, term28686.getClass(), "reviewId", null);
        setField(term28685, term28685.getClass(), "userReviewId", term28686);
        setField(term28687, term28687.getClass(), "id", null);
        setField(term28687, term28687.getClass(), "name", null);
        setField(term28687, term28687.getClass(), "userReviews", null);
        setField(term28685, term28685.getClass(), "user", term28687);
        setField(term28688, term28688.getClass(), "id", null);
        setField(term28688, term28688.getClass(), "review", null);
        setField(term28688, term28688.getClass(), "userReviews", null);
        setField(term28685, term28685.getClass(), "review", term28688);
        setField(term28689, term28689.getClass(), "date", null);
        setField(term28689, term28689.getClass(), "time", null);
        setField(term28685, term28685.getClass(), "date", term28689);
        ArrayList term28664 = new ArrayList();
        ((ArrayList) term28664).add(term28666);
        ((ArrayList) term28664).add(term28671);
        ((ArrayList) term28664).add(term28671);
        ((ArrayList) term28664).add(term28676);
        ((ArrayList) term28664).add(term28681);
        ((ArrayList) term28664).add(term28685);
        term28639 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28639, term28639.getClass(), "id", "frPgAZBkug");
        setField(term28639, term28639.getClass(), "name", "AAzuYrqTRq");
        setField(term28639, term28639.getClass(), "userReviews", term28664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term28639, args);
    }

};


