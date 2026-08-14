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

public class UserReview_component4_12073603288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26887;

    public UserReview_component4_12073603288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26940 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26940, term26940.getClass(), "userReviewId", null);
        setField(term26940, term26940.getClass(), "user", null);
        setField(term26940, term26940.getClass(), "review", null);
        setField(term26940, term26940.getClass(), "date", null);
        Object term26941 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26941, term26941.getClass(), "userReviewId", null);
        setField(term26941, term26941.getClass(), "user", null);
        setField(term26941, term26941.getClass(), "review", null);
        setField(term26941, term26941.getClass(), "date", null);
        ArrayList term26938 = new ArrayList();
        ((ArrayList) term26938).add(term26940);
        ((ArrayList) term26938).add(term26940);
        ((ArrayList) term26938).add(term26941);
        Object term26971 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26971, term26971.getClass(), "userReviewId", null);
        setField(term26971, term26971.getClass(), "user", null);
        setField(term26971, term26971.getClass(), "review", null);
        setField(term26971, term26971.getClass(), "date", null);
        Object term26972 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26972, term26972.getClass(), "userReviewId", null);
        setField(term26972, term26972.getClass(), "user", null);
        setField(term26972, term26972.getClass(), "review", null);
        setField(term26972, term26972.getClass(), "date", null);
        Object term26973 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26973, term26973.getClass(), "userReviewId", null);
        setField(term26973, term26973.getClass(), "user", null);
        setField(term26973, term26973.getClass(), "review", null);
        setField(term26973, term26973.getClass(), "date", null);
        Object term26974 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26974, term26974.getClass(), "userReviewId", null);
        setField(term26974, term26974.getClass(), "user", null);
        setField(term26974, term26974.getClass(), "review", null);
        setField(term26974, term26974.getClass(), "date", null);
        Object term26975 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26975, term26975.getClass(), "userReviewId", null);
        setField(term26975, term26975.getClass(), "user", null);
        setField(term26975, term26975.getClass(), "review", null);
        setField(term26975, term26975.getClass(), "date", null);
        ArrayList term26969 = new ArrayList();
        ((ArrayList) term26969).add(term26971);
        ((ArrayList) term26969).add(term26972);
        ((ArrayList) term26969).add(term26940);
        ((ArrayList) term26969).add(term26971);
        ((ArrayList) term26969).add(term26973);
        ((ArrayList) term26969).add(term26887);
        ((ArrayList) term26969).add(term26974);
        ((ArrayList) term26969).add(term26975);
        term26887 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26888 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26913 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26944 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26983 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26888, term26888.getClass(), "userId", "yBgWgFtVxP");
        setField(term26888, term26888.getClass(), "reviewId", "NAwiEDVBcB");
        setField(term26887, term26887.getClass(), "userReviewId", term26888);
        setField(term26913, term26913.getClass(), "id", "jxuVQHHLqy");
        setField(term26913, term26913.getClass(), "name", "TnUXNtKOns");
        setField(term26913, term26913.getClass(), "userReviews", term26938);
        setField(term26887, term26887.getClass(), "user", term26913);
        setField(term26944, term26944.getClass(), "id", "nlvRWrTxvz");
        setField(term26944, term26944.getClass(), "review", "isMKwgUmka");
        setField(term26944, term26944.getClass(), "userReviews", term26969);
        setField(term26887, term26887.getClass(), "review", term26944);
        setIntField(term26979, term26979.getClass(), "year", 2027);
        setShortField(term26979, term26979.getClass(), "month", (short) 7);
        setShortField(term26979, term26979.getClass(), "day", (short) 23);
        setField(term26978, term26978.getClass(), "date", term26979);
        setByteField(term26983, term26983.getClass(), "hour", (byte) 12);
        setByteField(term26983, term26983.getClass(), "minute", (byte) 6);
        setByteField(term26983, term26983.getClass(), "second", (byte) 19);
        setIntField(term26983, term26983.getClass(), "nano", 8025683);
        setField(term26978, term26978.getClass(), "time", term26983);
        setField(term26887, term26887.getClass(), "date", term26978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component4", argTypes, term26887, args);
    }

};


