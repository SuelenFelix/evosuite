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
     Object term28574;

    public User_toString_10596642478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28601 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28602 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28603 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28604 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28605 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28602, term28602.getClass(), "userId", null);
        setField(term28602, term28602.getClass(), "reviewId", null);
        setField(term28601, term28601.getClass(), "userReviewId", term28602);
        setField(term28603, term28603.getClass(), "id", null);
        setField(term28603, term28603.getClass(), "name", null);
        setField(term28603, term28603.getClass(), "userReviews", null);
        setField(term28601, term28601.getClass(), "user", term28603);
        setField(term28604, term28604.getClass(), "id", null);
        setField(term28604, term28604.getClass(), "review", null);
        setField(term28604, term28604.getClass(), "userReviews", null);
        setField(term28601, term28601.getClass(), "review", term28604);
        setField(term28605, term28605.getClass(), "date", null);
        setField(term28605, term28605.getClass(), "time", null);
        setField(term28601, term28601.getClass(), "date", term28605);
        Object term28606 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28607 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28608 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28609 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28610 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28607, term28607.getClass(), "userId", null);
        setField(term28607, term28607.getClass(), "reviewId", null);
        setField(term28606, term28606.getClass(), "userReviewId", term28607);
        setField(term28608, term28608.getClass(), "id", null);
        setField(term28608, term28608.getClass(), "name", null);
        setField(term28608, term28608.getClass(), "userReviews", null);
        setField(term28606, term28606.getClass(), "user", term28608);
        setField(term28609, term28609.getClass(), "id", null);
        setField(term28609, term28609.getClass(), "review", null);
        setField(term28609, term28609.getClass(), "userReviews", null);
        setField(term28606, term28606.getClass(), "review", term28609);
        setField(term28610, term28610.getClass(), "date", null);
        setField(term28610, term28610.getClass(), "time", null);
        setField(term28606, term28606.getClass(), "date", term28610);
        Object term28611 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28612 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28613 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28614 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28615 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28612, term28612.getClass(), "userId", null);
        setField(term28612, term28612.getClass(), "reviewId", null);
        setField(term28611, term28611.getClass(), "userReviewId", term28612);
        setField(term28613, term28613.getClass(), "id", null);
        setField(term28613, term28613.getClass(), "name", null);
        setField(term28613, term28613.getClass(), "userReviews", null);
        setField(term28611, term28611.getClass(), "user", term28613);
        setField(term28614, term28614.getClass(), "id", null);
        setField(term28614, term28614.getClass(), "review", null);
        setField(term28614, term28614.getClass(), "userReviews", null);
        setField(term28611, term28611.getClass(), "review", term28614);
        setField(term28615, term28615.getClass(), "date", null);
        setField(term28615, term28615.getClass(), "time", null);
        setField(term28611, term28611.getClass(), "date", term28615);
        ArrayList term28599 = new ArrayList();
        ((ArrayList) term28599).add(term28601);
        ((ArrayList) term28599).add(term28606);
        ((ArrayList) term28599).add(term28611);
        term28574 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28574, term28574.getClass(), "id", "amltyOnIBK");
        setField(term28574, term28574.getClass(), "name", "hjGlJibBAS");
        setField(term28574, term28574.getClass(), "userReviews", term28599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28574, args);
    }

};


