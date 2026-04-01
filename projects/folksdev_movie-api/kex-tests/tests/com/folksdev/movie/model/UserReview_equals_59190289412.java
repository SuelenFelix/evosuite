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

public class UserReview_equals_59190289412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27733;
     Object term27834;

    public UserReview_equals_59190289412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27786 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27786, term27786.getClass(), "userReviewId", null);
        setField(term27786, term27786.getClass(), "user", null);
        setField(term27786, term27786.getClass(), "review", null);
        setField(term27786, term27786.getClass(), "date", null);
        Object term27787 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27787, term27787.getClass(), "userReviewId", null);
        setField(term27787, term27787.getClass(), "user", null);
        setField(term27787, term27787.getClass(), "review", null);
        setField(term27787, term27787.getClass(), "date", null);
        Object term27788 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27788, term27788.getClass(), "userReviewId", null);
        setField(term27788, term27788.getClass(), "user", null);
        setField(term27788, term27788.getClass(), "review", null);
        setField(term27788, term27788.getClass(), "date", null);
        Object term27789 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27789, term27789.getClass(), "userReviewId", null);
        setField(term27789, term27789.getClass(), "user", null);
        setField(term27789, term27789.getClass(), "review", null);
        setField(term27789, term27789.getClass(), "date", null);
        Object term27790 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27790, term27790.getClass(), "userReviewId", null);
        setField(term27790, term27790.getClass(), "user", null);
        setField(term27790, term27790.getClass(), "review", null);
        setField(term27790, term27790.getClass(), "date", null);
        ArrayList term27784 = new ArrayList();
        ((ArrayList) term27784).add(term27786);
        ((ArrayList) term27784).add(term27786);
        ((ArrayList) term27784).add(term27787);
        ((ArrayList) term27784).add(term27788);
        ((ArrayList) term27784).add(term27788);
        ((ArrayList) term27784).add(term27789);
        ((ArrayList) term27784).add(term27790);
        ((ArrayList) term27784).add(term27786);
        Object term27820 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27820, term27820.getClass(), "userReviewId", null);
        setField(term27820, term27820.getClass(), "user", null);
        setField(term27820, term27820.getClass(), "review", null);
        setField(term27820, term27820.getClass(), "date", null);
        Object term27821 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27821, term27821.getClass(), "userReviewId", null);
        setField(term27821, term27821.getClass(), "user", null);
        setField(term27821, term27821.getClass(), "review", null);
        setField(term27821, term27821.getClass(), "date", null);
        ArrayList term27818 = new ArrayList();
        ((ArrayList) term27818).add(term27820);
        ((ArrayList) term27818).add(term27788);
        ((ArrayList) term27818).add(term27821);
        ((ArrayList) term27818).add(term27789);
        term27733 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27734 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27759 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27793 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27824 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27825 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27829 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27734, term27734.getClass(), "userId", "pZrAdSHQIs");
        setField(term27734, term27734.getClass(), "reviewId", "XTOiucaEva");
        setField(term27733, term27733.getClass(), "userReviewId", term27734);
        setField(term27759, term27759.getClass(), "id", "JMekRNxFMU");
        setField(term27759, term27759.getClass(), "name", "LBNEEquiet");
        setField(term27759, term27759.getClass(), "userReviews", term27784);
        setField(term27733, term27733.getClass(), "user", term27759);
        setField(term27793, term27793.getClass(), "id", "PxBSOwkatN");
        setField(term27793, term27793.getClass(), "review", "uKjlgaHcoc");
        setField(term27793, term27793.getClass(), "userReviews", term27818);
        setField(term27733, term27733.getClass(), "review", term27793);
        setIntField(term27825, term27825.getClass(), "year", 2013);
        setShortField(term27825, term27825.getClass(), "month", (short) 7);
        setShortField(term27825, term27825.getClass(), "day", (short) 3);
        setField(term27824, term27824.getClass(), "date", term27825);
        setByteField(term27829, term27829.getClass(), "hour", (byte) 10);
        setByteField(term27829, term27829.getClass(), "minute", (byte) 59);
        setByteField(term27829, term27829.getClass(), "second", (byte) 22);
        setIntField(term27829, term27829.getClass(), "nano", 937921480);
        setField(term27824, term27824.getClass(), "time", term27829);
        setField(term27733, term27733.getClass(), "date", term27824);
        term27834 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27834;
        callMethod(klass, "equals", argTypes, term27733, args);
    }

};


