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

public class PostStat_getPostId_12176648445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3713;

    public PostStat_getPostId_12176648445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3714 = new Long(4784595517102746672L);
        Long term3716 = new Long(-7612550318181586304L);
        Long term3718 = new Long(-2170847986967241072L);
        term3713 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3725 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3730 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3731 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3735 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3713, term3713.getClass(), "id", term3714);
        setField(term3713, term3713.getClass(), "postId", term3716);
        setField(term3713, term3713.getClass(), "likeCount", term3718);
        setIntField(term3721, term3721.getClass(), "year", 2016);
        setShortField(term3721, term3721.getClass(), "month", (short) 6);
        setShortField(term3721, term3721.getClass(), "day", (short) 15);
        setField(term3720, term3720.getClass(), "date", term3721);
        setByteField(term3725, term3725.getClass(), "hour", (byte) 21);
        setByteField(term3725, term3725.getClass(), "minute", (byte) 23);
        setByteField(term3725, term3725.getClass(), "second", (byte) 23);
        setIntField(term3725, term3725.getClass(), "nano", 433372070);
        setField(term3720, term3720.getClass(), "time", term3725);
        setField(term3713, term3713.getClass(), "createdAt", term3720);
        setIntField(term3731, term3731.getClass(), "year", 2012);
        setShortField(term3731, term3731.getClass(), "month", (short) 8);
        setShortField(term3731, term3731.getClass(), "day", (short) 25);
        setField(term3730, term3730.getClass(), "date", term3731);
        setByteField(term3735, term3735.getClass(), "hour", (byte) 19);
        setByteField(term3735, term3735.getClass(), "minute", (byte) 49);
        setByteField(term3735, term3735.getClass(), "second", (byte) 8);
        setIntField(term3735, term3735.getClass(), "nano", 912685024);
        setField(term3730, term3730.getClass(), "time", term3735);
        setField(term3713, term3713.getClass(), "updatedAt", term3730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostId", argTypes, term3713, args);
    }

};


