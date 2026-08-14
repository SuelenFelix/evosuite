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
     Object term26085;

    public UserReview_getReview_1620384943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term26140 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26140, term26140.getClass(), "userReviewId", null);
        setField(term26140, term26140.getClass(), "user", null);
        setField(term26140, term26140.getClass(), "review", null);
        setField(term26140, term26140.getClass(), "date", null);
        ArrayList term26136 = new ArrayList();
        ((ArrayList) term26136).add(term26138);
        ((ArrayList) term26136).add(term26139);
        ((ArrayList) term26136).add(term26140);
        ((ArrayList) term26136).add(term26140);
        ((ArrayList) term26136).add(term26138);
        Object term26170 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26170, term26170.getClass(), "userReviewId", null);
        setField(term26170, term26170.getClass(), "user", null);
        setField(term26170, term26170.getClass(), "review", null);
        setField(term26170, term26170.getClass(), "date", null);
        Object term26171 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26171, term26171.getClass(), "userReviewId", null);
        setField(term26171, term26171.getClass(), "user", null);
        setField(term26171, term26171.getClass(), "review", null);
        setField(term26171, term26171.getClass(), "date", null);
        ArrayList term26168 = new ArrayList();
        ((ArrayList) term26168).add(term26170);
        ((ArrayList) term26168).add(term26170);
        ((ArrayList) term26168).add(term26171);
        term26085 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26086 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26111 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26143 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26179 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26086, term26086.getClass(), "userId", "RvgkUqMUFX");
        setField(term26086, term26086.getClass(), "reviewId", "nOqmldTbXj");
        setField(term26085, term26085.getClass(), "userReviewId", term26086);
        setField(term26111, term26111.getClass(), "id", "xNDnWDGUNx");
        setField(term26111, term26111.getClass(), "name", "faGVqjLquQ");
        setField(term26111, term26111.getClass(), "userReviews", term26136);
        setField(term26085, term26085.getClass(), "user", term26111);
        setField(term26143, term26143.getClass(), "id", "aGJCHRHyCe");
        setField(term26143, term26143.getClass(), "review", "WingwhSgfc");
        setField(term26143, term26143.getClass(), "userReviews", term26168);
        setField(term26085, term26085.getClass(), "review", term26143);
        setIntField(term26175, term26175.getClass(), "year", 2010);
        setShortField(term26175, term26175.getClass(), "month", (short) 9);
        setShortField(term26175, term26175.getClass(), "day", (short) 28);
        setField(term26174, term26174.getClass(), "date", term26175);
        setByteField(term26179, term26179.getClass(), "hour", (byte) 6);
        setByteField(term26179, term26179.getClass(), "minute", (byte) 4);
        setByteField(term26179, term26179.getClass(), "second", (byte) 54);
        setIntField(term26179, term26179.getClass(), "nano", 604713782);
        setField(term26174, term26174.getClass(), "time", term26179);
        setField(term26085, term26085.getClass(), "date", term26174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReview", argTypes, term26085, args);
    }

};


