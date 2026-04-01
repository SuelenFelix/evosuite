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
import java.lang.Object;
import java.util.ArrayList;

public class UserReview_getReview_1620384943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26084;

    public UserReview_getReview_1620384943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26137 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26137, term26137.getClass(), "userReviewId", null);
        setField(term26137, term26137.getClass(), "user", null);
        setField(term26137, term26137.getClass(), "review", null);
        setField(term26137, term26137.getClass(), "date", null);
        Object term26138 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26138, term26138.getClass(), "userReviewId", null);
        setField(term26138, term26138.getClass(), "user", null);
        setField(term26138, term26138.getClass(), "review", null);
        setField(term26138, term26138.getClass(), "date", null);
        Object term26139 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26139, term26139.getClass(), "userReviewId", null);
        setField(term26139, term26139.getClass(), "user", null);
        setField(term26139, term26139.getClass(), "review", null);
        setField(term26139, term26139.getClass(), "date", null);
        ArrayList term26135 = new ArrayList();
        ((ArrayList) term26135).add(term26137);
        ((ArrayList) term26135).add(term26138);
        ((ArrayList) term26135).add(term26139);
        ((ArrayList) term26135).add(term26139);
        ((ArrayList) term26135).add(term26137);
        Object term26169 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26169, term26169.getClass(), "userReviewId", null);
        setField(term26169, term26169.getClass(), "user", null);
        setField(term26169, term26169.getClass(), "review", null);
        setField(term26169, term26169.getClass(), "date", null);
        Object term26170 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26170, term26170.getClass(), "userReviewId", null);
        setField(term26170, term26170.getClass(), "user", null);
        setField(term26170, term26170.getClass(), "review", null);
        setField(term26170, term26170.getClass(), "date", null);
        ArrayList term26167 = new ArrayList();
        ((ArrayList) term26167).add(term26169);
        ((ArrayList) term26167).add(term26169);
        ((ArrayList) term26167).add(term26170);
        term26084 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26085 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26110 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26142 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26173 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26174 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26178 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26085, term26085.getClass(), "userId", "RvgkUqMUFX");
        setField(term26085, term26085.getClass(), "reviewId", "nOqmldTbXj");
        setField(term26084, term26084.getClass(), "userReviewId", term26085);
        setField(term26110, term26110.getClass(), "id", "xNDnWDGUNx");
        setField(term26110, term26110.getClass(), "name", "faGVqjLquQ");
        setField(term26110, term26110.getClass(), "userReviews", term26135);
        setField(term26084, term26084.getClass(), "user", term26110);
        setField(term26142, term26142.getClass(), "id", "aGJCHRHyCe");
        setField(term26142, term26142.getClass(), "review", "WingwhSgfc");
        setField(term26142, term26142.getClass(), "userReviews", term26167);
        setField(term26084, term26084.getClass(), "review", term26142);
        setIntField(term26174, term26174.getClass(), "year", 2010);
        setShortField(term26174, term26174.getClass(), "month", (short) 9);
        setShortField(term26174, term26174.getClass(), "day", (short) 28);
        setField(term26173, term26173.getClass(), "date", term26174);
        setByteField(term26178, term26178.getClass(), "hour", (byte) 6);
        setByteField(term26178, term26178.getClass(), "minute", (byte) 4);
        setByteField(term26178, term26178.getClass(), "second", (byte) 54);
        setIntField(term26178, term26178.getClass(), "nano", 604713782);
        setField(term26173, term26173.getClass(), "time", term26178);
        setField(term26084, term26084.getClass(), "date", term26173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReview", argTypes, term26084, args);
    }

};


