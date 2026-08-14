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

public class PostStat_fromBO_1524091660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3605;

    public PostStat_fromBO_1524091660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3606 = new Long(-6823727938421990489L);
        Long term3608 = new Long(-484994522244390100L);
        Long term3610 = new Long(0L);
        term3605 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term3612 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3613 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3617 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3622 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3623 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3627 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3605, term3605.getClass(), "id", term3606);
        setField(term3605, term3605.getClass(), "postId", term3608);
        setField(term3605, term3605.getClass(), "likeCount", term3610);
        setIntField(term3613, term3613.getClass(), "year", 2015);
        setShortField(term3613, term3613.getClass(), "month", (short) 3);
        setShortField(term3613, term3613.getClass(), "day", (short) 10);
        setField(term3612, term3612.getClass(), "date", term3613);
        setByteField(term3617, term3617.getClass(), "hour", (byte) 23);
        setByteField(term3617, term3617.getClass(), "minute", (byte) 34);
        setByteField(term3617, term3617.getClass(), "second", (byte) 44);
        setIntField(term3617, term3617.getClass(), "nano", 587322824);
        setField(term3612, term3612.getClass(), "time", term3617);
        setField(term3605, term3605.getClass(), "createdAt", term3612);
        setIntField(term3623, term3623.getClass(), "year", 2027);
        setShortField(term3623, term3623.getClass(), "month", (short) 8);
        setShortField(term3623, term3623.getClass(), "day", (short) 26);
        setField(term3622, term3622.getClass(), "date", term3623);
        setByteField(term3627, term3627.getClass(), "hour", (byte) 5);
        setByteField(term3627, term3627.getClass(), "minute", (byte) 11);
        setByteField(term3627, term3627.getClass(), "second", (byte) 9);
        setIntField(term3627, term3627.getClass(), "nano", 219245092);
        setField(term3622, term3622.getClass(), "time", term3627);
        setField(term3605, term3605.getClass(), "updatedAt", term3622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Object[] args = new Object[1];
        args[0] = term3605;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};


