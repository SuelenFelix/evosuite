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
     Object term26086;

    public UserReview_getReview_1620384943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term26141 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26141, term26141.getClass(), "userReviewId", null);
        setField(term26141, term26141.getClass(), "user", null);
        setField(term26141, term26141.getClass(), "review", null);
        setField(term26141, term26141.getClass(), "date", null);
        ArrayList term26137 = new ArrayList();
        ((ArrayList) term26137).add(term26139);
        ((ArrayList) term26137).add(term26140);
        ((ArrayList) term26137).add(term26141);
        ((ArrayList) term26137).add(term26141);
        ((ArrayList) term26137).add(term26139);
        Object term26171 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26171, term26171.getClass(), "userReviewId", null);
        setField(term26171, term26171.getClass(), "user", null);
        setField(term26171, term26171.getClass(), "review", null);
        setField(term26171, term26171.getClass(), "date", null);
        Object term26172 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26172, term26172.getClass(), "userReviewId", null);
        setField(term26172, term26172.getClass(), "user", null);
        setField(term26172, term26172.getClass(), "review", null);
        setField(term26172, term26172.getClass(), "date", null);
        ArrayList term26169 = new ArrayList();
        ((ArrayList) term26169).add(term26171);
        ((ArrayList) term26169).add(term26171);
        ((ArrayList) term26169).add(term26172);
        term26086 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26087 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26112 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26144 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26180 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26087, term26087.getClass(), "userId", "RvgkUqMUFX");
        setField(term26087, term26087.getClass(), "reviewId", "nOqmldTbXj");
        setField(term26086, term26086.getClass(), "userReviewId", term26087);
        setField(term26112, term26112.getClass(), "id", "xNDnWDGUNx");
        setField(term26112, term26112.getClass(), "name", "faGVqjLquQ");
        setField(term26112, term26112.getClass(), "userReviews", term26137);
        setField(term26086, term26086.getClass(), "user", term26112);
        setField(term26144, term26144.getClass(), "id", "aGJCHRHyCe");
        setField(term26144, term26144.getClass(), "review", "WingwhSgfc");
        setField(term26144, term26144.getClass(), "userReviews", term26169);
        setField(term26086, term26086.getClass(), "review", term26144);
        setIntField(term26176, term26176.getClass(), "year", 2010);
        setShortField(term26176, term26176.getClass(), "month", (short) 9);
        setShortField(term26176, term26176.getClass(), "day", (short) 28);
        setField(term26175, term26175.getClass(), "date", term26176);
        setByteField(term26180, term26180.getClass(), "hour", (byte) 6);
        setByteField(term26180, term26180.getClass(), "minute", (byte) 4);
        setByteField(term26180, term26180.getClass(), "second", (byte) 54);
        setIntField(term26180, term26180.getClass(), "nano", 604713782);
        setField(term26175, term26175.getClass(), "time", term26180);
        setField(term26086, term26086.getClass(), "date", term26175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReview", argTypes, term26086, args);
    }

};


