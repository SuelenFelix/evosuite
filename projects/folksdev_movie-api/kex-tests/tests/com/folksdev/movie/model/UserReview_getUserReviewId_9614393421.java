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

public class UserReview_getUserReviewId_9614393421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25772;

    public UserReview_getUserReviewId_9614393421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25825 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term25825, term25825.getClass(), "userReviewId", null);
        setField(term25825, term25825.getClass(), "user", null);
        setField(term25825, term25825.getClass(), "review", null);
        setField(term25825, term25825.getClass(), "date", null);
        ArrayList term25823 = new ArrayList();
        ((ArrayList) term25823).add(term25825);
        ArrayList term25853 = new ArrayList();
        ((ArrayList) term25853).add(term25825);
        term25772 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term25773 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term25798 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term25828 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term25857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25862 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25773, term25773.getClass(), "userId", "jAxYagPvcV");
        setField(term25773, term25773.getClass(), "reviewId", "ZXLgGUqgyW");
        setField(term25772, term25772.getClass(), "userReviewId", term25773);
        setField(term25798, term25798.getClass(), "id", "PdeSzTcBgY");
        setField(term25798, term25798.getClass(), "name", "PmSvMYNoIS");
        setField(term25798, term25798.getClass(), "userReviews", term25823);
        setField(term25772, term25772.getClass(), "user", term25798);
        setField(term25828, term25828.getClass(), "id", "iGWkLjLGBY");
        setField(term25828, term25828.getClass(), "review", "jUkXaNkoAg");
        setField(term25828, term25828.getClass(), "userReviews", term25853);
        setField(term25772, term25772.getClass(), "review", term25828);
        setIntField(term25858, term25858.getClass(), "year", 2027);
        setShortField(term25858, term25858.getClass(), "month", (short) 2);
        setShortField(term25858, term25858.getClass(), "day", (short) 19);
        setField(term25857, term25857.getClass(), "date", term25858);
        setByteField(term25862, term25862.getClass(), "hour", (byte) 17);
        setByteField(term25862, term25862.getClass(), "minute", (byte) 37);
        setByteField(term25862, term25862.getClass(), "second", (byte) 27);
        setIntField(term25862, term25862.getClass(), "nano", 920380537);
        setField(term25857, term25857.getClass(), "time", term25862);
        setField(term25772, term25772.getClass(), "date", term25857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserReviewId", argTypes, term25772, args);
    }

};


