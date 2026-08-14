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

public class PostStat_PostStatBuilder_createdAt_3430223574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31704;
     Object term31731;

    public PostStat_PostStatBuilder_createdAt_3430223574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31705 = new Long(5067793047038594982L);
        Long term31707 = new Long(-1572808624189549793L);
        Long term31709 = new Long(-6151316713456472560L);
        term31704 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder"));
        Object term31711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31716 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31726 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31704, term31704.getClass(), "id", term31705);
        setField(term31704, term31704.getClass(), "postId", term31707);
        setField(term31704, term31704.getClass(), "likeCount", term31709);
        setIntField(term31712, term31712.getClass(), "year", 2016);
        setShortField(term31712, term31712.getClass(), "month", (short) 12);
        setShortField(term31712, term31712.getClass(), "day", (short) 20);
        setField(term31711, term31711.getClass(), "date", term31712);
        setByteField(term31716, term31716.getClass(), "hour", (byte) 20);
        setByteField(term31716, term31716.getClass(), "minute", (byte) 42);
        setByteField(term31716, term31716.getClass(), "second", (byte) 4);
        setIntField(term31716, term31716.getClass(), "nano", 499637837);
        setField(term31711, term31711.getClass(), "time", term31716);
        setField(term31704, term31704.getClass(), "createdAt", term31711);
        setIntField(term31722, term31722.getClass(), "year", 2017);
        setShortField(term31722, term31722.getClass(), "month", (short) 1);
        setShortField(term31722, term31722.getClass(), "day", (short) 2);
        setField(term31721, term31721.getClass(), "date", term31722);
        setByteField(term31726, term31726.getClass(), "hour", (byte) 17);
        setByteField(term31726, term31726.getClass(), "minute", (byte) 7);
        setByteField(term31726, term31726.getClass(), "second", (byte) 40);
        setIntField(term31726, term31726.getClass(), "nano", 688544705);
        setField(term31721, term31721.getClass(), "time", term31726);
        setField(term31704, term31704.getClass(), "updatedAt", term31721);
        term31731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31736 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31732, term31732.getClass(), "year", 2017);
        setShortField(term31732, term31732.getClass(), "month", (short) 8);
        setShortField(term31732, term31732.getClass(), "day", (short) 31);
        setField(term31731, term31731.getClass(), "date", term31732);
        setByteField(term31736, term31736.getClass(), "hour", (byte) 12);
        setByteField(term31736, term31736.getClass(), "minute", (byte) 32);
        setByteField(term31736, term31736.getClass(), "second", (byte) 28);
        setIntField(term31736, term31736.getClass(), "nano", 428210685);
        setField(term31731, term31731.getClass(), "time", term31736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term31731;
        callMethod(klass, "createdAt", argTypes, term31704, args);
    }

};


