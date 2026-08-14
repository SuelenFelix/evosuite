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

public class PostLike_getUserId_20470286043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31196;

    public PostLike_getUserId_20470286043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31197 = new Long(2599553846982918627L);
        Long term31199 = new Long(-4821516944173509228L);
        Long term31201 = new Long(2315395988604904502L);
        term31196 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31218 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31196, term31196.getClass(), "id", term31197);
        setField(term31196, term31196.getClass(), "userId", term31199);
        setField(term31196, term31196.getClass(), "postId", term31201);
        setIntField(term31204, term31204.getClass(), "year", 2010);
        setShortField(term31204, term31204.getClass(), "month", (short) 5);
        setShortField(term31204, term31204.getClass(), "day", (short) 27);
        setField(term31203, term31203.getClass(), "date", term31204);
        setByteField(term31208, term31208.getClass(), "hour", (byte) 12);
        setByteField(term31208, term31208.getClass(), "minute", (byte) 53);
        setByteField(term31208, term31208.getClass(), "second", (byte) 45);
        setIntField(term31208, term31208.getClass(), "nano", 508314626);
        setField(term31203, term31203.getClass(), "time", term31208);
        setField(term31196, term31196.getClass(), "createdAt", term31203);
        setIntField(term31214, term31214.getClass(), "year", 2028);
        setShortField(term31214, term31214.getClass(), "month", (short) 2);
        setShortField(term31214, term31214.getClass(), "day", (short) 29);
        setField(term31213, term31213.getClass(), "date", term31214);
        setByteField(term31218, term31218.getClass(), "hour", (byte) 9);
        setByteField(term31218, term31218.getClass(), "minute", (byte) 45);
        setByteField(term31218, term31218.getClass(), "second", (byte) 4);
        setIntField(term31218, term31218.getClass(), "nano", 508964901);
        setField(term31213, term31213.getClass(), "time", term31218);
        setField(term31196, term31196.getClass(), "updatedAt", term31213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term31196, args);
    }

};


