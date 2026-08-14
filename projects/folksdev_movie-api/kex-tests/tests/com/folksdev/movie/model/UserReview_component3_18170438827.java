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
     Object term26725;

    public UserReview_component3_18170438827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26778 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26778, term26778.getClass(), "userReviewId", null);
        setField(term26778, term26778.getClass(), "user", null);
        setField(term26778, term26778.getClass(), "review", null);
        setField(term26778, term26778.getClass(), "date", null);
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
        ArrayList term26776 = new ArrayList();
        ((ArrayList) term26776).add(term26778);
        ((ArrayList) term26776).add(term26779);
        ((ArrayList) term26776).add(term26780);
        ((ArrayList) term26776).add(term26781);
        ((ArrayList) term26776).add(term26782);
        ((ArrayList) term26776).add(term26778);
        ((ArrayList) term26776).add(term26783);
        ((ArrayList) term26776).add(term26780);
        Object term26813 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26813, term26813.getClass(), "userReviewId", null);
        setField(term26813, term26813.getClass(), "user", null);
        setField(term26813, term26813.getClass(), "review", null);
        setField(term26813, term26813.getClass(), "date", null);
        Object term26814 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26814, term26814.getClass(), "userReviewId", null);
        setField(term26814, term26814.getClass(), "user", null);
        setField(term26814, term26814.getClass(), "review", null);
        setField(term26814, term26814.getClass(), "date", null);
        ArrayList term26811 = new ArrayList();
        ((ArrayList) term26811).add(term26778);
        ((ArrayList) term26811).add(term26813);
        ((ArrayList) term26811).add(term26781);
        ((ArrayList) term26811).add(term26814);
        ((ArrayList) term26811).add(term26778);
        ((ArrayList) term26811).add(term26781);
        ((ArrayList) term26811).add(term26779);
        term26725 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26726 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26751 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26786 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26822 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26726, term26726.getClass(), "userId", "ivAOXnVjmg");
        setField(term26726, term26726.getClass(), "reviewId", "FivesaUeHG");
        setField(term26725, term26725.getClass(), "userReviewId", term26726);
        setField(term26751, term26751.getClass(), "id", "TnpXhZmCRY");
        setField(term26751, term26751.getClass(), "name", "ECVAXFhrTP");
        setField(term26751, term26751.getClass(), "userReviews", term26776);
        setField(term26725, term26725.getClass(), "user", term26751);
        setField(term26786, term26786.getClass(), "id", "aZiFZfzhQT");
        setField(term26786, term26786.getClass(), "review", "HbzAbCwWRh");
        setField(term26786, term26786.getClass(), "userReviews", term26811);
        setField(term26725, term26725.getClass(), "review", term26786);
        setIntField(term26818, term26818.getClass(), "year", 2016);
        setShortField(term26818, term26818.getClass(), "month", (short) 2);
        setShortField(term26818, term26818.getClass(), "day", (short) 25);
        setField(term26817, term26817.getClass(), "date", term26818);
        setByteField(term26822, term26822.getClass(), "hour", (byte) 8);
        setByteField(term26822, term26822.getClass(), "minute", (byte) 54);
        setByteField(term26822, term26822.getClass(), "second", (byte) 40);
        setIntField(term26822, term26822.getClass(), "nano", 124525896);
        setField(term26817, term26817.getClass(), "time", term26822);
        setField(term26725, term26725.getClass(), "date", term26817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term26725, args);
    }

};


