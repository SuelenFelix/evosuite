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
     Object term27735;
     Object term27836;

    public UserReview_equals_59190289412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term27791 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27791, term27791.getClass(), "userReviewId", null);
        setField(term27791, term27791.getClass(), "user", null);
        setField(term27791, term27791.getClass(), "review", null);
        setField(term27791, term27791.getClass(), "date", null);
        Object term27792 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27792, term27792.getClass(), "userReviewId", null);
        setField(term27792, term27792.getClass(), "user", null);
        setField(term27792, term27792.getClass(), "review", null);
        setField(term27792, term27792.getClass(), "date", null);
        ArrayList term27786 = new ArrayList();
        ((ArrayList) term27786).add(term27788);
        ((ArrayList) term27786).add(term27788);
        ((ArrayList) term27786).add(term27789);
        ((ArrayList) term27786).add(term27790);
        ((ArrayList) term27786).add(term27790);
        ((ArrayList) term27786).add(term27791);
        ((ArrayList) term27786).add(term27792);
        ((ArrayList) term27786).add(term27788);
        Object term27822 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27822, term27822.getClass(), "userReviewId", null);
        setField(term27822, term27822.getClass(), "user", null);
        setField(term27822, term27822.getClass(), "review", null);
        setField(term27822, term27822.getClass(), "date", null);
        Object term27823 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27823, term27823.getClass(), "userReviewId", null);
        setField(term27823, term27823.getClass(), "user", null);
        setField(term27823, term27823.getClass(), "review", null);
        setField(term27823, term27823.getClass(), "date", null);
        ArrayList term27820 = new ArrayList();
        ((ArrayList) term27820).add(term27822);
        ((ArrayList) term27820).add(term27790);
        ((ArrayList) term27820).add(term27823);
        ((ArrayList) term27820).add(term27791);
        term27735 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27736 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27761 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27795 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27831 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27736, term27736.getClass(), "userId", "pZrAdSHQIs");
        setField(term27736, term27736.getClass(), "reviewId", "XTOiucaEva");
        setField(term27735, term27735.getClass(), "userReviewId", term27736);
        setField(term27761, term27761.getClass(), "id", "JMekRNxFMU");
        setField(term27761, term27761.getClass(), "name", "LBNEEquiet");
        setField(term27761, term27761.getClass(), "userReviews", term27786);
        setField(term27735, term27735.getClass(), "user", term27761);
        setField(term27795, term27795.getClass(), "id", "PxBSOwkatN");
        setField(term27795, term27795.getClass(), "review", "uKjlgaHcoc");
        setField(term27795, term27795.getClass(), "userReviews", term27820);
        setField(term27735, term27735.getClass(), "review", term27795);
        setIntField(term27827, term27827.getClass(), "year", 2013);
        setShortField(term27827, term27827.getClass(), "month", (short) 7);
        setShortField(term27827, term27827.getClass(), "day", (short) 3);
        setField(term27826, term27826.getClass(), "date", term27827);
        setByteField(term27831, term27831.getClass(), "hour", (byte) 10);
        setByteField(term27831, term27831.getClass(), "minute", (byte) 59);
        setByteField(term27831, term27831.getClass(), "second", (byte) 22);
        setIntField(term27831, term27831.getClass(), "nano", 937921480);
        setField(term27826, term27826.getClass(), "time", term27831);
        setField(term27735, term27735.getClass(), "date", term27826);
        term27836 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27836;
        callMethod(klass, "equals", argTypes, term27735, args);
    }

};


