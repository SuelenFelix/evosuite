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
     Object term26888;

    public UserReview_component4_12073603288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26941 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26941, term26941.getClass(), "userReviewId", null);
        setField(term26941, term26941.getClass(), "user", null);
        setField(term26941, term26941.getClass(), "review", null);
        setField(term26941, term26941.getClass(), "date", null);
        Object term26942 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26942, term26942.getClass(), "userReviewId", null);
        setField(term26942, term26942.getClass(), "user", null);
        setField(term26942, term26942.getClass(), "review", null);
        setField(term26942, term26942.getClass(), "date", null);
        ArrayList term26939 = new ArrayList();
        ((ArrayList) term26939).add(term26941);
        ((ArrayList) term26939).add(term26941);
        ((ArrayList) term26939).add(term26942);
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
        Object term26976 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26976, term26976.getClass(), "userReviewId", null);
        setField(term26976, term26976.getClass(), "user", null);
        setField(term26976, term26976.getClass(), "review", null);
        setField(term26976, term26976.getClass(), "date", null);
        ArrayList term26970 = new ArrayList();
        ((ArrayList) term26970).add(term26972);
        ((ArrayList) term26970).add(term26973);
        ((ArrayList) term26970).add(term26941);
        ((ArrayList) term26970).add(term26972);
        ((ArrayList) term26970).add(term26974);
        ((ArrayList) term26970).add(term26888);
        ((ArrayList) term26970).add(term26975);
        ((ArrayList) term26970).add(term26976);
        term26888 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26889 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26914 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26945 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26979 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26980 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26984 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26889, term26889.getClass(), "userId", "yBgWgFtVxP");
        setField(term26889, term26889.getClass(), "reviewId", "NAwiEDVBcB");
        setField(term26888, term26888.getClass(), "userReviewId", term26889);
        setField(term26914, term26914.getClass(), "id", "jxuVQHHLqy");
        setField(term26914, term26914.getClass(), "name", "TnUXNtKOns");
        setField(term26914, term26914.getClass(), "userReviews", term26939);
        setField(term26888, term26888.getClass(), "user", term26914);
        setField(term26945, term26945.getClass(), "id", "nlvRWrTxvz");
        setField(term26945, term26945.getClass(), "review", "isMKwgUmka");
        setField(term26945, term26945.getClass(), "userReviews", term26970);
        setField(term26888, term26888.getClass(), "review", term26945);
        setIntField(term26980, term26980.getClass(), "year", 2027);
        setShortField(term26980, term26980.getClass(), "month", (short) 7);
        setShortField(term26980, term26980.getClass(), "day", (short) 23);
        setField(term26979, term26979.getClass(), "date", term26980);
        setByteField(term26984, term26984.getClass(), "hour", (byte) 12);
        setByteField(term26984, term26984.getClass(), "minute", (byte) 6);
        setByteField(term26984, term26984.getClass(), "second", (byte) 19);
        setIntField(term26984, term26984.getClass(), "nano", 8025683);
        setField(term26979, term26979.getClass(), "time", term26984);
        setField(term26888, term26888.getClass(), "date", term26979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component4", argTypes, term26888, args);
    }

};


