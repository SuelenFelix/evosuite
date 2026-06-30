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
     Object term28575;

    public User_toString_10596642478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28602 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28603 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28604 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28605 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28606 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28603, term28603.getClass(), "userId", null);
        setField(term28603, term28603.getClass(), "reviewId", null);
        setField(term28602, term28602.getClass(), "userReviewId", term28603);
        setField(term28604, term28604.getClass(), "id", null);
        setField(term28604, term28604.getClass(), "name", null);
        setField(term28604, term28604.getClass(), "userReviews", null);
        setField(term28602, term28602.getClass(), "user", term28604);
        setField(term28605, term28605.getClass(), "id", null);
        setField(term28605, term28605.getClass(), "review", null);
        setField(term28605, term28605.getClass(), "userReviews", null);
        setField(term28602, term28602.getClass(), "review", term28605);
        setField(term28606, term28606.getClass(), "date", null);
        setField(term28606, term28606.getClass(), "time", null);
        setField(term28602, term28602.getClass(), "date", term28606);
        Object term28607 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28608 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28609 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28610 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28611 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28608, term28608.getClass(), "userId", null);
        setField(term28608, term28608.getClass(), "reviewId", null);
        setField(term28607, term28607.getClass(), "userReviewId", term28608);
        setField(term28609, term28609.getClass(), "id", null);
        setField(term28609, term28609.getClass(), "name", null);
        setField(term28609, term28609.getClass(), "userReviews", null);
        setField(term28607, term28607.getClass(), "user", term28609);
        setField(term28610, term28610.getClass(), "id", null);
        setField(term28610, term28610.getClass(), "review", null);
        setField(term28610, term28610.getClass(), "userReviews", null);
        setField(term28607, term28607.getClass(), "review", term28610);
        setField(term28611, term28611.getClass(), "date", null);
        setField(term28611, term28611.getClass(), "time", null);
        setField(term28607, term28607.getClass(), "date", term28611);
        Object term28612 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term28613 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term28614 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term28615 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term28616 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28613, term28613.getClass(), "userId", null);
        setField(term28613, term28613.getClass(), "reviewId", null);
        setField(term28612, term28612.getClass(), "userReviewId", term28613);
        setField(term28614, term28614.getClass(), "id", null);
        setField(term28614, term28614.getClass(), "name", null);
        setField(term28614, term28614.getClass(), "userReviews", null);
        setField(term28612, term28612.getClass(), "user", term28614);
        setField(term28615, term28615.getClass(), "id", null);
        setField(term28615, term28615.getClass(), "review", null);
        setField(term28615, term28615.getClass(), "userReviews", null);
        setField(term28612, term28612.getClass(), "review", term28615);
        setField(term28616, term28616.getClass(), "date", null);
        setField(term28616, term28616.getClass(), "time", null);
        setField(term28612, term28612.getClass(), "date", term28616);
        ArrayList term28600 = new ArrayList();
        ((ArrayList) term28600).add(term28602);
        ((ArrayList) term28600).add(term28607);
        ((ArrayList) term28600).add(term28612);
        term28575 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        setField(term28575, term28575.getClass(), "id", "amltyOnIBK");
        setField(term28575, term28575.getClass(), "name", "hjGlJibBAS");
        setField(term28575, term28575.getClass(), "userReviews", term28600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28575, args);
    }

};


