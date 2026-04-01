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
     Object term26724;

    public UserReview_component3_18170438827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26777 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26777, term26777.getClass(), "userReviewId", null);
        setField(term26777, term26777.getClass(), "user", null);
        setField(term26777, term26777.getClass(), "review", null);
        setField(term26777, term26777.getClass(), "date", null);
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
        ArrayList term26775 = new ArrayList();
        ((ArrayList) term26775).add(term26777);
        ((ArrayList) term26775).add(term26778);
        ((ArrayList) term26775).add(term26779);
        ((ArrayList) term26775).add(term26780);
        ((ArrayList) term26775).add(term26781);
        ((ArrayList) term26775).add(term26777);
        ((ArrayList) term26775).add(term26782);
        ((ArrayList) term26775).add(term26779);
        Object term26812 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26812, term26812.getClass(), "userReviewId", null);
        setField(term26812, term26812.getClass(), "user", null);
        setField(term26812, term26812.getClass(), "review", null);
        setField(term26812, term26812.getClass(), "date", null);
        Object term26813 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term26813, term26813.getClass(), "userReviewId", null);
        setField(term26813, term26813.getClass(), "user", null);
        setField(term26813, term26813.getClass(), "review", null);
        setField(term26813, term26813.getClass(), "date", null);
        ArrayList term26810 = new ArrayList();
        ((ArrayList) term26810).add(term26777);
        ((ArrayList) term26810).add(term26812);
        ((ArrayList) term26810).add(term26780);
        ((ArrayList) term26810).add(term26813);
        ((ArrayList) term26810).add(term26777);
        ((ArrayList) term26810).add(term26780);
        ((ArrayList) term26810).add(term26778);
        term26724 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term26725 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term26750 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term26785 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term26816 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26817 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26821 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26725, term26725.getClass(), "userId", "ivAOXnVjmg");
        setField(term26725, term26725.getClass(), "reviewId", "FivesaUeHG");
        setField(term26724, term26724.getClass(), "userReviewId", term26725);
        setField(term26750, term26750.getClass(), "id", "TnpXhZmCRY");
        setField(term26750, term26750.getClass(), "name", "ECVAXFhrTP");
        setField(term26750, term26750.getClass(), "userReviews", term26775);
        setField(term26724, term26724.getClass(), "user", term26750);
        setField(term26785, term26785.getClass(), "id", "aZiFZfzhQT");
        setField(term26785, term26785.getClass(), "review", "HbzAbCwWRh");
        setField(term26785, term26785.getClass(), "userReviews", term26810);
        setField(term26724, term26724.getClass(), "review", term26785);
        setIntField(term26817, term26817.getClass(), "year", 2016);
        setShortField(term26817, term26817.getClass(), "month", (short) 2);
        setShortField(term26817, term26817.getClass(), "day", (short) 25);
        setField(term26816, term26816.getClass(), "date", term26817);
        setByteField(term26821, term26821.getClass(), "hour", (byte) 8);
        setByteField(term26821, term26821.getClass(), "minute", (byte) 54);
        setByteField(term26821, term26821.getClass(), "second", (byte) 40);
        setIntField(term26821, term26821.getClass(), "nano", 124525896);
        setField(term26816, term26816.getClass(), "time", term26821);
        setField(term26724, term26724.getClass(), "date", term26816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term26724, args);
    }

};


