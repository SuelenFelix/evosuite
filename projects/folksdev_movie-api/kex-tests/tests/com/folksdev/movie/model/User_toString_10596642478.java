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

public class User_toString_10596642478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28573;

    public User_toString_10596642478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28600 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28601 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28602 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28603 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28604 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28601, term28601.getClass(), "userId", null);
        setField(term28601, term28601.getClass(), "reviewId", null);
        setField(term28600, term28600.getClass(), "userReviewId", term28601);
        setField(term28602, term28602.getClass(), "id", null);
        setField(term28602, term28602.getClass(), "name", null);
        setField(term28602, term28602.getClass(), "userReviews", null);
        setField(term28600, term28600.getClass(), "user", term28602);
        setField(term28603, term28603.getClass(), "id", null);
        setField(term28603, term28603.getClass(), "review", null);
        setField(term28603, term28603.getClass(), "userReviews", null);
        setField(term28600, term28600.getClass(), "review", term28603);
        setField(term28604, term28604.getClass(), "date", null);
        setField(term28604, term28604.getClass(), "time", null);
        setField(term28600, term28600.getClass(), "date", term28604);
        Object term28605 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28606 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28607 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28608 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28609 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28606, term28606.getClass(), "userId", null);
        setField(term28606, term28606.getClass(), "reviewId", null);
        setField(term28605, term28605.getClass(), "userReviewId", term28606);
        setField(term28607, term28607.getClass(), "id", null);
        setField(term28607, term28607.getClass(), "name", null);
        setField(term28607, term28607.getClass(), "userReviews", null);
        setField(term28605, term28605.getClass(), "user", term28607);
        setField(term28608, term28608.getClass(), "id", null);
        setField(term28608, term28608.getClass(), "review", null);
        setField(term28608, term28608.getClass(), "userReviews", null);
        setField(term28605, term28605.getClass(), "review", term28608);
        setField(term28609, term28609.getClass(), "date", null);
        setField(term28609, term28609.getClass(), "time", null);
        setField(term28605, term28605.getClass(), "date", term28609);
        Object term28610 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28611 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28612 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28613 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28614 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28611, term28611.getClass(), "userId", null);
        setField(term28611, term28611.getClass(), "reviewId", null);
        setField(term28610, term28610.getClass(), "userReviewId", term28611);
        setField(term28612, term28612.getClass(), "id", null);
        setField(term28612, term28612.getClass(), "name", null);
        setField(term28612, term28612.getClass(), "userReviews", null);
        setField(term28610, term28610.getClass(), "user", term28612);
        setField(term28613, term28613.getClass(), "id", null);
        setField(term28613, term28613.getClass(), "review", null);
        setField(term28613, term28613.getClass(), "userReviews", null);
        setField(term28610, term28610.getClass(), "review", term28613);
        setField(term28614, term28614.getClass(), "date", null);
        setField(term28614, term28614.getClass(), "time", null);
        setField(term28610, term28610.getClass(), "date", term28614);
        ArrayList term28598 = new ArrayList();
        ((ArrayList) term28598).add(term28600);
        ((ArrayList) term28598).add(term28605);
        ((ArrayList) term28598).add(term28610);
        term28573 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28573, term28573.getClass(), "id", "amltyOnIBK");
        setField(term28573, term28573.getClass(), "name", "hjGlJibBAS");
        setField(term28573, term28573.getClass(), "userReviews", term28598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28573, args);
    }

};


