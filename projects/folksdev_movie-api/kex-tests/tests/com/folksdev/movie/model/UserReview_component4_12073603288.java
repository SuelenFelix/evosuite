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
     Object term26886;

    public UserReview_component4_12073603288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26939 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26939, term26939.getClass(), "userReviewId", null);
        setField(term26939, term26939.getClass(), "user", null);
        setField(term26939, term26939.getClass(), "review", null);
        setField(term26939, term26939.getClass(), "date", null);
        Object term26940 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26940, term26940.getClass(), "userReviewId", null);
        setField(term26940, term26940.getClass(), "user", null);
        setField(term26940, term26940.getClass(), "review", null);
        setField(term26940, term26940.getClass(), "date", null);
        ArrayList term26937 = new ArrayList();
        ((ArrayList) term26937).add(term26939);
        ((ArrayList) term26937).add(term26939);
        ((ArrayList) term26937).add(term26940);
        Object term26970 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26970, term26970.getClass(), "userReviewId", null);
        setField(term26970, term26970.getClass(), "user", null);
        setField(term26970, term26970.getClass(), "review", null);
        setField(term26970, term26970.getClass(), "date", null);
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
        ArrayList term26968 = new ArrayList();
        ((ArrayList) term26968).add(term26970);
        ((ArrayList) term26968).add(term26971);
        ((ArrayList) term26968).add(term26939);
        ((ArrayList) term26968).add(term26970);
        ((ArrayList) term26968).add(term26972);
        ((ArrayList) term26968).add(term26886);
        ((ArrayList) term26968).add(term26973);
        ((ArrayList) term26968).add(term26974);
        term26886 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26887 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26912 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26943 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26982 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26887, term26887.getClass(), "userId", "yBgWgFtVxP");
        setField(term26887, term26887.getClass(), "reviewId", "NAwiEDVBcB");
        setField(term26886, term26886.getClass(), "userReviewId", term26887);
        setField(term26912, term26912.getClass(), "id", "jxuVQHHLqy");
        setField(term26912, term26912.getClass(), "name", "TnUXNtKOns");
        setField(term26912, term26912.getClass(), "userReviews", term26937);
        setField(term26886, term26886.getClass(), "user", term26912);
        setField(term26943, term26943.getClass(), "id", "nlvRWrTxvz");
        setField(term26943, term26943.getClass(), "review", "isMKwgUmka");
        setField(term26943, term26943.getClass(), "userReviews", term26968);
        setField(term26886, term26886.getClass(), "review", term26943);
        setIntField(term26978, term26978.getClass(), "year", 2027);
        setShortField(term26978, term26978.getClass(), "month", (short) 7);
        setShortField(term26978, term26978.getClass(), "day", (short) 23);
        setField(term26977, term26977.getClass(), "date", term26978);
        setByteField(term26982, term26982.getClass(), "hour", (byte) 12);
        setByteField(term26982, term26982.getClass(), "minute", (byte) 6);
        setByteField(term26982, term26982.getClass(), "second", (byte) 19);
        setIntField(term26982, term26982.getClass(), "nano", 8025683);
        setField(term26977, term26977.getClass(), "time", term26982);
        setField(term26886, term26886.getClass(), "date", term26977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component4", argTypes, term26886, args);
    }

};


