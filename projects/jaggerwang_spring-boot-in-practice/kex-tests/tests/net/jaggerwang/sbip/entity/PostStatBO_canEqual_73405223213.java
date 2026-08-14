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

public class PostStatBO_canEqual_73405223213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24788;
     Object term24815;

    public PostStatBO_canEqual_73405223213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24789 = new Long(1964822153944985001L);
        Long term24791 = new Long(-955253666696787757L);
        Long term24793 = new Long(0L);
        term24788 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24800 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24810 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24788, term24788.getClass(), "id", term24789);
        setField(term24788, term24788.getClass(), "postId", term24791);
        setField(term24788, term24788.getClass(), "likeCount", term24793);
        setIntField(term24796, term24796.getClass(), "year", 2011);
        setShortField(term24796, term24796.getClass(), "month", (short) 9);
        setShortField(term24796, term24796.getClass(), "day", (short) 7);
        setField(term24795, term24795.getClass(), "date", term24796);
        setByteField(term24800, term24800.getClass(), "hour", (byte) 0);
        setByteField(term24800, term24800.getClass(), "minute", (byte) 51);
        setByteField(term24800, term24800.getClass(), "second", (byte) 44);
        setIntField(term24800, term24800.getClass(), "nano", 245610060);
        setField(term24795, term24795.getClass(), "time", term24800);
        setField(term24788, term24788.getClass(), "createdAt", term24795);
        setIntField(term24806, term24806.getClass(), "year", 2018);
        setShortField(term24806, term24806.getClass(), "month", (short) 1);
        setShortField(term24806, term24806.getClass(), "day", (short) 29);
        setField(term24805, term24805.getClass(), "date", term24806);
        setByteField(term24810, term24810.getClass(), "hour", (byte) 22);
        setByteField(term24810, term24810.getClass(), "minute", (byte) 20);
        setByteField(term24810, term24810.getClass(), "second", (byte) 36);
        setIntField(term24810, term24810.getClass(), "nano", 74678080);
        setField(term24805, term24805.getClass(), "time", term24810);
        setField(term24788, term24788.getClass(), "updatedAt", term24805);
        term24815 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24815;
        callMethod(klass, "canEqual", argTypes, term24788, args);
    }

};


