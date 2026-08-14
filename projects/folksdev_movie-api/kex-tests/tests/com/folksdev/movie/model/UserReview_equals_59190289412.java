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
     Object term27734;
     Object term27835;

    public UserReview_equals_59190289412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
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
        Object term27791 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27791, term27791.getClass(), "userReviewId", null);
        setField(term27791, term27791.getClass(), "user", null);
        setField(term27791, term27791.getClass(), "review", null);
        setField(term27791, term27791.getClass(), "date", null);
        ArrayList term27785 = new ArrayList();
        ((ArrayList) term27785).add(term27787);
        ((ArrayList) term27785).add(term27787);
        ((ArrayList) term27785).add(term27788);
        ((ArrayList) term27785).add(term27789);
        ((ArrayList) term27785).add(term27789);
        ((ArrayList) term27785).add(term27790);
        ((ArrayList) term27785).add(term27791);
        ((ArrayList) term27785).add(term27787);
        Object term27821 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27821, term27821.getClass(), "userReviewId", null);
        setField(term27821, term27821.getClass(), "user", null);
        setField(term27821, term27821.getClass(), "review", null);
        setField(term27821, term27821.getClass(), "date", null);
        Object term27822 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        setField(term27822, term27822.getClass(), "userReviewId", null);
        setField(term27822, term27822.getClass(), "user", null);
        setField(term27822, term27822.getClass(), "review", null);
        setField(term27822, term27822.getClass(), "date", null);
        ArrayList term27819 = new ArrayList();
        ((ArrayList) term27819).add(term27821);
        ((ArrayList) term27819).add(term27789);
        ((ArrayList) term27819).add(term27822);
        ((ArrayList) term27819).add(term27790);
        term27734 = newInstance(Class.forName("com.folksdev.movie.model.UserReview"));
        Object term27735 = newInstance(Class.forName("com.folksdev.movie.model.UserReviewId"));
        Object term27760 = newInstance(Class.forName("com.folksdev.movie.model.User"));
        Object term27794 = newInstance(Class.forName("com.folksdev.movie.model.Review"));
        Object term27825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27830 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27735, term27735.getClass(), "userId", "pZrAdSHQIs");
        setField(term27735, term27735.getClass(), "reviewId", "XTOiucaEva");
        setField(term27734, term27734.getClass(), "userReviewId", term27735);
        setField(term27760, term27760.getClass(), "id", "JMekRNxFMU");
        setField(term27760, term27760.getClass(), "name", "LBNEEquiet");
        setField(term27760, term27760.getClass(), "userReviews", term27785);
        setField(term27734, term27734.getClass(), "user", term27760);
        setField(term27794, term27794.getClass(), "id", "PxBSOwkatN");
        setField(term27794, term27794.getClass(), "review", "uKjlgaHcoc");
        setField(term27794, term27794.getClass(), "userReviews", term27819);
        setField(term27734, term27734.getClass(), "review", term27794);
        setIntField(term27826, term27826.getClass(), "year", 2013);
        setShortField(term27826, term27826.getClass(), "month", (short) 7);
        setShortField(term27826, term27826.getClass(), "day", (short) 3);
        setField(term27825, term27825.getClass(), "date", term27826);
        setByteField(term27830, term27830.getClass(), "hour", (byte) 10);
        setByteField(term27830, term27830.getClass(), "minute", (byte) 59);
        setByteField(term27830, term27830.getClass(), "second", (byte) 22);
        setIntField(term27830, term27830.getClass(), "nano", 937921480);
        setField(term27825, term27825.getClass(), "time", term27830);
        setField(term27734, term27734.getClass(), "date", term27825);
        term27835 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.UserReview");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27835;
        callMethod(klass, "equals", argTypes, term27734, args);
    }

};


