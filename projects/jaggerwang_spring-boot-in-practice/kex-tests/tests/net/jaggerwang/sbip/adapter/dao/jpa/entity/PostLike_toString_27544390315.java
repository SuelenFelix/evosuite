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

public class PostLike_toString_27544390315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31548;

    public PostLike_toString_27544390315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31549 = new Long(4369503082568083627L);
        Long term31551 = new Long(-1148001666040486410L);
        Long term31553 = new Long(-2097210721190032076L);
        term31548 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31560 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31565 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31566 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31570 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31548, term31548.getClass(), "id", term31549);
        setField(term31548, term31548.getClass(), "userId", term31551);
        setField(term31548, term31548.getClass(), "postId", term31553);
        setIntField(term31556, term31556.getClass(), "year", 2027);
        setShortField(term31556, term31556.getClass(), "month", (short) 1);
        setShortField(term31556, term31556.getClass(), "day", (short) 10);
        setField(term31555, term31555.getClass(), "date", term31556);
        setByteField(term31560, term31560.getClass(), "hour", (byte) 8);
        setByteField(term31560, term31560.getClass(), "minute", (byte) 34);
        setByteField(term31560, term31560.getClass(), "second", (byte) 28);
        setIntField(term31560, term31560.getClass(), "nano", 703673031);
        setField(term31555, term31555.getClass(), "time", term31560);
        setField(term31548, term31548.getClass(), "createdAt", term31555);
        setIntField(term31566, term31566.getClass(), "year", 2014);
        setShortField(term31566, term31566.getClass(), "month", (short) 5);
        setShortField(term31566, term31566.getClass(), "day", (short) 30);
        setField(term31565, term31565.getClass(), "date", term31566);
        setByteField(term31570, term31570.getClass(), "hour", (byte) 10);
        setByteField(term31570, term31570.getClass(), "minute", (byte) 34);
        setByteField(term31570, term31570.getClass(), "second", (byte) 17);
        setIntField(term31570, term31570.getClass(), "nano", 917654429);
        setField(term31565, term31565.getClass(), "time", term31570);
        setField(term31548, term31548.getClass(), "updatedAt", term31565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31548, args);
    }

};


