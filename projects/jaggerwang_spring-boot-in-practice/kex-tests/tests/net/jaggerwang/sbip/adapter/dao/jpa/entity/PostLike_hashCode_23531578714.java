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

public class PostLike_hashCode_23531578714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31521;

    public PostLike_hashCode_23531578714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31522 = new Long(2678845111978352940L);
        Long term31524 = new Long(873013799050926004L);
        Long term31526 = new Long(132446939133186077L);
        term31521 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31528 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31529 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31533 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31543 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31521, term31521.getClass(), "id", term31522);
        setField(term31521, term31521.getClass(), "userId", term31524);
        setField(term31521, term31521.getClass(), "postId", term31526);
        setIntField(term31529, term31529.getClass(), "year", 2015);
        setShortField(term31529, term31529.getClass(), "month", (short) 8);
        setShortField(term31529, term31529.getClass(), "day", (short) 3);
        setField(term31528, term31528.getClass(), "date", term31529);
        setByteField(term31533, term31533.getClass(), "hour", (byte) 21);
        setByteField(term31533, term31533.getClass(), "minute", (byte) 57);
        setByteField(term31533, term31533.getClass(), "second", (byte) 2);
        setIntField(term31533, term31533.getClass(), "nano", 438141628);
        setField(term31528, term31528.getClass(), "time", term31533);
        setField(term31521, term31521.getClass(), "createdAt", term31528);
        setIntField(term31539, term31539.getClass(), "year", 2011);
        setShortField(term31539, term31539.getClass(), "month", (short) 3);
        setShortField(term31539, term31539.getClass(), "day", (short) 10);
        setField(term31538, term31538.getClass(), "date", term31539);
        setByteField(term31543, term31543.getClass(), "hour", (byte) 4);
        setByteField(term31543, term31543.getClass(), "minute", (byte) 13);
        setByteField(term31543, term31543.getClass(), "second", (byte) 46);
        setIntField(term31543, term31543.getClass(), "nano", 212390008);
        setField(term31538, term31538.getClass(), "time", term31543);
        setField(term31521, term31521.getClass(), "updatedAt", term31538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term31521, args);
    }

};


