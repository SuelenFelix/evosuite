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

public class UserStatBO_getId_14305968215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11635;

    public UserStatBO_getId_14305968215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11636 = new Long(-7268507582722666254L);
        Long term11638 = new Long(5671808784468963649L);
        Long term11640 = new Long(0L);
        Long term11642 = new Long(0L);
        Long term11644 = new Long(0L);
        Long term11646 = new Long(0L);
        term11635 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11658 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11659 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11663 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11635, term11635.getClass(), "id", term11636);
        setField(term11635, term11635.getClass(), "userId", term11638);
        setField(term11635, term11635.getClass(), "postCount", term11640);
        setField(term11635, term11635.getClass(), "likeCount", term11642);
        setField(term11635, term11635.getClass(), "followingCount", term11644);
        setField(term11635, term11635.getClass(), "followerCount", term11646);
        setIntField(term11649, term11649.getClass(), "year", 2018);
        setShortField(term11649, term11649.getClass(), "month", (short) 2);
        setShortField(term11649, term11649.getClass(), "day", (short) 14);
        setField(term11648, term11648.getClass(), "date", term11649);
        setByteField(term11653, term11653.getClass(), "hour", (byte) 2);
        setByteField(term11653, term11653.getClass(), "minute", (byte) 40);
        setByteField(term11653, term11653.getClass(), "second", (byte) 48);
        setIntField(term11653, term11653.getClass(), "nano", 371006728);
        setField(term11648, term11648.getClass(), "time", term11653);
        setField(term11635, term11635.getClass(), "createdAt", term11648);
        setIntField(term11659, term11659.getClass(), "year", 2025);
        setShortField(term11659, term11659.getClass(), "month", (short) 8);
        setShortField(term11659, term11659.getClass(), "day", (short) 22);
        setField(term11658, term11658.getClass(), "date", term11659);
        setByteField(term11663, term11663.getClass(), "hour", (byte) 6);
        setByteField(term11663, term11663.getClass(), "minute", (byte) 48);
        setByteField(term11663, term11663.getClass(), "second", (byte) 49);
        setIntField(term11663, term11663.getClass(), "nano", 46400229);
        setField(term11658, term11658.getClass(), "time", term11663);
        setField(term11635, term11635.getClass(), "updatedAt", term11658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term11635, args);
    }

};


