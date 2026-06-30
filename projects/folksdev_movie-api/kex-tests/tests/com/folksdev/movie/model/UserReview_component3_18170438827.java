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

public class UserReview_component3_18170438827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26726;

    public UserReview_component3_18170438827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26779 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26779, term26779.getClass(), "userReviewId", null);
        setField(term26779, term26779.getClass(), "user", null);
        setField(term26779, term26779.getClass(), "review", null);
        setField(term26779, term26779.getClass(), "date", null);
        Object term26780 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26780, term26780.getClass(), "userReviewId", null);
        setField(term26780, term26780.getClass(), "user", null);
        setField(term26780, term26780.getClass(), "review", null);
        setField(term26780, term26780.getClass(), "date", null);
        Object term26781 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26781, term26781.getClass(), "userReviewId", null);
        setField(term26781, term26781.getClass(), "user", null);
        setField(term26781, term26781.getClass(), "review", null);
        setField(term26781, term26781.getClass(), "date", null);
        Object term26782 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26782, term26782.getClass(), "userReviewId", null);
        setField(term26782, term26782.getClass(), "user", null);
        setField(term26782, term26782.getClass(), "review", null);
        setField(term26782, term26782.getClass(), "date", null);
        Object term26783 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26783, term26783.getClass(), "userReviewId", null);
        setField(term26783, term26783.getClass(), "user", null);
        setField(term26783, term26783.getClass(), "review", null);
        setField(term26783, term26783.getClass(), "date", null);
        Object term26784 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26784, term26784.getClass(), "userReviewId", null);
        setField(term26784, term26784.getClass(), "user", null);
        setField(term26784, term26784.getClass(), "review", null);
        setField(term26784, term26784.getClass(), "date", null);
        ArrayList term26777 = new ArrayList();
        ((ArrayList) term26777).add(term26779);
        ((ArrayList) term26777).add(term26780);
        ((ArrayList) term26777).add(term26781);
        ((ArrayList) term26777).add(term26782);
        ((ArrayList) term26777).add(term26783);
        ((ArrayList) term26777).add(term26779);
        ((ArrayList) term26777).add(term26784);
        ((ArrayList) term26777).add(term26781);
        Object term26814 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26814, term26814.getClass(), "userReviewId", null);
        setField(term26814, term26814.getClass(), "user", null);
        setField(term26814, term26814.getClass(), "review", null);
        setField(term26814, term26814.getClass(), "date", null);
        Object term26815 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26815, term26815.getClass(), "userReviewId", null);
        setField(term26815, term26815.getClass(), "user", null);
        setField(term26815, term26815.getClass(), "review", null);
        setField(term26815, term26815.getClass(), "date", null);
        ArrayList term26812 = new ArrayList();
        ((ArrayList) term26812).add(term26779);
        ((ArrayList) term26812).add(term26814);
        ((ArrayList) term26812).add(term26782);
        ((ArrayList) term26812).add(term26815);
        ((ArrayList) term26812).add(term26779);
        ((ArrayList) term26812).add(term26782);
        ((ArrayList) term26812).add(term26780);
        term26726 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26727 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26752 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26787 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26818 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26823 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26727, term26727.getClass(), "userId", "ivAOXnVjmg");
        setField(term26727, term26727.getClass(), "reviewId", "FivesaUeHG");
        setField(term26726, term26726.getClass(), "userReviewId", term26727);
        setField(term26752, term26752.getClass(), "id", "TnpXhZmCRY");
        setField(term26752, term26752.getClass(), "name", "ECVAXFhrTP");
        setField(term26752, term26752.getClass(), "userReviews", term26777);
        setField(term26726, term26726.getClass(), "user", term26752);
        setField(term26787, term26787.getClass(), "id", "aZiFZfzhQT");
        setField(term26787, term26787.getClass(), "review", "HbzAbCwWRh");
        setField(term26787, term26787.getClass(), "userReviews", term26812);
        setField(term26726, term26726.getClass(), "review", term26787);
        setIntField(term26819, term26819.getClass(), "year", 2016);
        setShortField(term26819, term26819.getClass(), "month", (short) 2);
        setShortField(term26819, term26819.getClass(), "day", (short) 25);
        setField(term26818, term26818.getClass(), "date", term26819);
        setByteField(term26823, term26823.getClass(), "hour", (byte) 8);
        setByteField(term26823, term26823.getClass(), "minute", (byte) 54);
        setByteField(term26823, term26823.getClass(), "second", (byte) 40);
        setIntField(term26823, term26823.getClass(), "nano", 124525896);
        setField(term26818, term26818.getClass(), "time", term26823);
        setField(term26726, term26726.getClass(), "date", term26818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term26726, args);
    }

};


