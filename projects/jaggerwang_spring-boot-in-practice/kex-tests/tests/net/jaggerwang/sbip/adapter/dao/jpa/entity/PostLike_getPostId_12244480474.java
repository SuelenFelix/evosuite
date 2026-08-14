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

public class PostLike_getPostId_12244480474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31223;

    public PostLike_getPostId_12244480474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31224 = new Long(4337555582321907177L);
        Long term31226 = new Long(-6367418587326372844L);
        Long term31228 = new Long(6371581018571997173L);
        term31223 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31230 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31231 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31235 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31245 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31223, term31223.getClass(), "id", term31224);
        setField(term31223, term31223.getClass(), "userId", term31226);
        setField(term31223, term31223.getClass(), "postId", term31228);
        setIntField(term31231, term31231.getClass(), "year", 2018);
        setShortField(term31231, term31231.getClass(), "month", (short) 9);
        setShortField(term31231, term31231.getClass(), "day", (short) 10);
        setField(term31230, term31230.getClass(), "date", term31231);
        setByteField(term31235, term31235.getClass(), "hour", (byte) 11);
        setByteField(term31235, term31235.getClass(), "minute", (byte) 50);
        setByteField(term31235, term31235.getClass(), "second", (byte) 3);
        setIntField(term31235, term31235.getClass(), "nano", 33779151);
        setField(term31230, term31230.getClass(), "time", term31235);
        setField(term31223, term31223.getClass(), "createdAt", term31230);
        setIntField(term31241, term31241.getClass(), "year", 2022);
        setShortField(term31241, term31241.getClass(), "month", (short) 6);
        setShortField(term31241, term31241.getClass(), "day", (short) 29);
        setField(term31240, term31240.getClass(), "date", term31241);
        setByteField(term31245, term31245.getClass(), "hour", (byte) 1);
        setByteField(term31245, term31245.getClass(), "minute", (byte) 29);
        setByteField(term31245, term31245.getClass(), "second", (byte) 33);
        setIntField(term31245, term31245.getClass(), "nano", 714362758);
        setField(term31240, term31240.getClass(), "time", term31245);
        setField(term31223, term31223.getClass(), "updatedAt", term31240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostId", argTypes, term31223, args);
    }

};


