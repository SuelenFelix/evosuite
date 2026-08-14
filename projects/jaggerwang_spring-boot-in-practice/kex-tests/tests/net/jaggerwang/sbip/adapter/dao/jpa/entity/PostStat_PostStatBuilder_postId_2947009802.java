package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStat_PostStatBuilder_postId_2947009802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31646;
     Object term31673;

    public PostStat_PostStatBuilder_postId_2947009802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31647 = new Long(2947576061864407618L);
        Long term31649 = new Long(7265006047025305787L);
        Long term31651 = new Long(-3323049156110984575L);
        term31646 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder"));
        Object term31653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31658 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31668 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31646, term31646.getClass(), "id", term31647);
        setField(term31646, term31646.getClass(), "postId", term31649);
        setField(term31646, term31646.getClass(), "likeCount", term31651);
        setIntField(term31654, term31654.getClass(), "year", 2026);
        setShortField(term31654, term31654.getClass(), "month", (short) 2);
        setShortField(term31654, term31654.getClass(), "day", (short) 5);
        setField(term31653, term31653.getClass(), "date", term31654);
        setByteField(term31658, term31658.getClass(), "hour", (byte) 8);
        setByteField(term31658, term31658.getClass(), "minute", (byte) 6);
        setByteField(term31658, term31658.getClass(), "second", (byte) 3);
        setIntField(term31658, term31658.getClass(), "nano", 107243113);
        setField(term31653, term31653.getClass(), "time", term31658);
        setField(term31646, term31646.getClass(), "createdAt", term31653);
        setIntField(term31664, term31664.getClass(), "year", 2013);
        setShortField(term31664, term31664.getClass(), "month", (short) 3);
        setShortField(term31664, term31664.getClass(), "day", (short) 17);
        setField(term31663, term31663.getClass(), "date", term31664);
        setByteField(term31668, term31668.getClass(), "hour", (byte) 6);
        setByteField(term31668, term31668.getClass(), "minute", (byte) 13);
        setByteField(term31668, term31668.getClass(), "second", (byte) 20);
        setIntField(term31668, term31668.getClass(), "nano", 748150546);
        setField(term31663, term31663.getClass(), "time", term31668);
        setField(term31646, term31646.getClass(), "updatedAt", term31663);
        term31673 = new Long(-9079706905309751984L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term31673;
        callMethod(klass, "postId", argTypes, term31646, args);
    }

};


