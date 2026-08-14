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

public class PostStatBO_hashCode_51879707214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24816;

    public PostStatBO_hashCode_51879707214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24817 = new Long(-99017747847004910L);
        Long term24819 = new Long(797798302378380033L);
        Long term24821 = new Long(0L);
        term24816 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24828 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24833 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24834 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24838 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24816, term24816.getClass(), "id", term24817);
        setField(term24816, term24816.getClass(), "postId", term24819);
        setField(term24816, term24816.getClass(), "likeCount", term24821);
        setIntField(term24824, term24824.getClass(), "year", 2020);
        setShortField(term24824, term24824.getClass(), "month", (short) 10);
        setShortField(term24824, term24824.getClass(), "day", (short) 2);
        setField(term24823, term24823.getClass(), "date", term24824);
        setByteField(term24828, term24828.getClass(), "hour", (byte) 1);
        setByteField(term24828, term24828.getClass(), "minute", (byte) 41);
        setByteField(term24828, term24828.getClass(), "second", (byte) 48);
        setIntField(term24828, term24828.getClass(), "nano", 834720747);
        setField(term24823, term24823.getClass(), "time", term24828);
        setField(term24816, term24816.getClass(), "createdAt", term24823);
        setIntField(term24834, term24834.getClass(), "year", 2022);
        setShortField(term24834, term24834.getClass(), "month", (short) 3);
        setShortField(term24834, term24834.getClass(), "day", (short) 31);
        setField(term24833, term24833.getClass(), "date", term24834);
        setByteField(term24838, term24838.getClass(), "hour", (byte) 3);
        setByteField(term24838, term24838.getClass(), "minute", (byte) 43);
        setByteField(term24838, term24838.getClass(), "second", (byte) 28);
        setIntField(term24838, term24838.getClass(), "nano", 772790770);
        setField(term24833, term24833.getClass(), "time", term24838);
        setField(term24816, term24816.getClass(), "updatedAt", term24833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term24816, args);
    }

};


