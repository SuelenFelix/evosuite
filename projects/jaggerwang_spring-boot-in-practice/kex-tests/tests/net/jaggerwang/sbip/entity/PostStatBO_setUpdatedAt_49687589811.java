package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatBO_setUpdatedAt_49687589811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24723;
     Object term24750;

    public PostStatBO_setUpdatedAt_49687589811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24724 = new Long(678465732474023847L);
        Long term24726 = new Long(2551047634163864862L);
        Long term24728 = new Long(0L);
        term24723 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24730 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24731 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24735 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24745 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24723, term24723.getClass(), "id", term24724);
        setField(term24723, term24723.getClass(), "postId", term24726);
        setField(term24723, term24723.getClass(), "likeCount", term24728);
        setIntField(term24731, term24731.getClass(), "year", 2029);
        setShortField(term24731, term24731.getClass(), "month", (short) 11);
        setShortField(term24731, term24731.getClass(), "day", (short) 6);
        setField(term24730, term24730.getClass(), "date", term24731);
        setByteField(term24735, term24735.getClass(), "hour", (byte) 2);
        setByteField(term24735, term24735.getClass(), "minute", (byte) 55);
        setByteField(term24735, term24735.getClass(), "second", (byte) 43);
        setIntField(term24735, term24735.getClass(), "nano", 109400580);
        setField(term24730, term24730.getClass(), "time", term24735);
        setField(term24723, term24723.getClass(), "createdAt", term24730);
        setIntField(term24741, term24741.getClass(), "year", 2020);
        setShortField(term24741, term24741.getClass(), "month", (short) 7);
        setShortField(term24741, term24741.getClass(), "day", (short) 24);
        setField(term24740, term24740.getClass(), "date", term24741);
        setByteField(term24745, term24745.getClass(), "hour", (byte) 22);
        setByteField(term24745, term24745.getClass(), "minute", (byte) 16);
        setByteField(term24745, term24745.getClass(), "second", (byte) 59);
        setIntField(term24745, term24745.getClass(), "nano", 588569833);
        setField(term24740, term24740.getClass(), "time", term24745);
        setField(term24723, term24723.getClass(), "updatedAt", term24740);
        term24750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24755 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24751, term24751.getClass(), "year", 2019);
        setShortField(term24751, term24751.getClass(), "month", (short) 8);
        setShortField(term24751, term24751.getClass(), "day", (short) 6);
        setField(term24750, term24750.getClass(), "date", term24751);
        setByteField(term24755, term24755.getClass(), "hour", (byte) 5);
        setByteField(term24755, term24755.getClass(), "minute", (byte) 32);
        setByteField(term24755, term24755.getClass(), "second", (byte) 47);
        setIntField(term24755, term24755.getClass(), "nano", 73220317);
        setField(term24750, term24750.getClass(), "time", term24755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term24750;
        callMethod(klass, "setUpdatedAt", argTypes, term24723, args);
    }

};


