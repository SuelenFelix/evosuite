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

public class PostStat_getLikeCount_20747255416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3740;

    public PostStat_getLikeCount_20747255416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3741 = new Long(4044358158040652353L);
        Long term3743 = new Long(-4443169559037975007L);
        Long term3745 = new Long(-3842548265506930260L);
        term3740 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3747 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3748 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3752 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3757 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3758 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3762 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3740, term3740.getClass(), "id", term3741);
        setField(term3740, term3740.getClass(), "postId", term3743);
        setField(term3740, term3740.getClass(), "likeCount", term3745);
        setIntField(term3748, term3748.getClass(), "year", 2012);
        setShortField(term3748, term3748.getClass(), "month", (short) 3);
        setShortField(term3748, term3748.getClass(), "day", (short) 27);
        setField(term3747, term3747.getClass(), "date", term3748);
        setByteField(term3752, term3752.getClass(), "hour", (byte) 17);
        setByteField(term3752, term3752.getClass(), "minute", (byte) 49);
        setByteField(term3752, term3752.getClass(), "second", (byte) 24);
        setIntField(term3752, term3752.getClass(), "nano", 530647398);
        setField(term3747, term3747.getClass(), "time", term3752);
        setField(term3740, term3740.getClass(), "createdAt", term3747);
        setIntField(term3758, term3758.getClass(), "year", 2010);
        setShortField(term3758, term3758.getClass(), "month", (short) 6);
        setShortField(term3758, term3758.getClass(), "day", (short) 14);
        setField(term3757, term3757.getClass(), "date", term3758);
        setByteField(term3762, term3762.getClass(), "hour", (byte) 6);
        setByteField(term3762, term3762.getClass(), "minute", (byte) 22);
        setByteField(term3762, term3762.getClass(), "second", (byte) 20);
        setIntField(term3762, term3762.getClass(), "nano", 25133051);
        setField(term3757, term3757.getClass(), "time", term3762);
        setField(term3740, term3740.getClass(), "updatedAt", term3757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikeCount", argTypes, term3740, args);
    }

};


