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
     Object term25771;

    public UserReview_getUserReviewId_9614393421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25824 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term25824, term25824.getClass(), "userReviewId", null);
        setField(term25824, term25824.getClass(), "user", null);
        setField(term25824, term25824.getClass(), "review", null);
        setField(term25824, term25824.getClass(), "date", null);
        ArrayList term25822 = new ArrayList();
        ((ArrayList) term25822).add(term25824);
        ArrayList term25852 = new ArrayList();
        ((ArrayList) term25852).add(term25824);
        term25771 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term25772 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term25797 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term25827 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term25856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25861 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25772, term25772.getClass(), "userId", "jAxYagPvcV");
        setField(term25772, term25772.getClass(), "reviewId", "ZXLgGUqgyW");
        setField(term25771, term25771.getClass(), "userReviewId", term25772);
        setField(term25797, term25797.getClass(), "id", "PdeSzTcBgY");
        setField(term25797, term25797.getClass(), "name", "PmSvMYNoIS");
        setField(term25797, term25797.getClass(), "userReviews", term25822);
        setField(term25771, term25771.getClass(), "user", term25797);
        setField(term25827, term25827.getClass(), "id", "iGWkLjLGBY");
        setField(term25827, term25827.getClass(), "review", "jUkXaNkoAg");
        setField(term25827, term25827.getClass(), "userReviews", term25852);
        setField(term25771, term25771.getClass(), "review", term25827);
        setIntField(term25857, term25857.getClass(), "year", 2027);
        setShortField(term25857, term25857.getClass(), "month", (short) 2);
        setShortField(term25857, term25857.getClass(), "day", (short) 19);
        setField(term25856, term25856.getClass(), "date", term25857);
        setByteField(term25861, term25861.getClass(), "hour", (byte) 17);
        setByteField(term25861, term25861.getClass(), "minute", (byte) 37);
        setByteField(term25861, term25861.getClass(), "second", (byte) 27);
        setIntField(term25861, term25861.getClass(), "nano", 920380537);
        setField(term25856, term25856.getClass(), "time", term25861);
        setField(term25771, term25771.getClass(), "date", term25856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserReviewId", argTypes, term25771, args);
    }

};


