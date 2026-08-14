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

public class PostStat_PostStatBuilder_build_4238898666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31778;

    public PostStat_PostStatBuilder_build_4238898666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31779 = new Long(-2341942457089205755L);
        Long term31781 = new Long(-7503147844796296300L);
        Long term31783 = new Long(1099634235456795888L);
        term31778 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder"));
        Object term31785 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31786 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31790 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31800 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31778, term31778.getClass(), "id", term31779);
        setField(term31778, term31778.getClass(), "postId", term31781);
        setField(term31778, term31778.getClass(), "likeCount", term31783);
        setIntField(term31786, term31786.getClass(), "year", 2019);
        setShortField(term31786, term31786.getClass(), "month", (short) 8);
        setShortField(term31786, term31786.getClass(), "day", (short) 6);
        setField(term31785, term31785.getClass(), "date", term31786);
        setByteField(term31790, term31790.getClass(), "hour", (byte) 19);
        setByteField(term31790, term31790.getClass(), "minute", (byte) 30);
        setByteField(term31790, term31790.getClass(), "second", (byte) 36);
        setIntField(term31790, term31790.getClass(), "nano", 118147558);
        setField(term31785, term31785.getClass(), "time", term31790);
        setField(term31778, term31778.getClass(), "createdAt", term31785);
        setIntField(term31796, term31796.getClass(), "year", 2010);
        setShortField(term31796, term31796.getClass(), "month", (short) 11);
        setShortField(term31796, term31796.getClass(), "day", (short) 17);
        setField(term31795, term31795.getClass(), "date", term31796);
        setByteField(term31800, term31800.getClass(), "hour", (byte) 7);
        setByteField(term31800, term31800.getClass(), "minute", (byte) 36);
        setByteField(term31800, term31800.getClass(), "second", (byte) 53);
        setIntField(term31800, term31800.getClass(), "nano", 316643445);
        setField(term31795, term31795.getClass(), "time", term31800);
        setField(term31778, term31778.getClass(), "updatedAt", term31795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term31778, args);
    }

};


