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

public class PostStat_setId_2627716269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3821;
     Object term3848;

    public PostStat_setId_2627716269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3822 = new Long(-7738503207562305297L);
        Long term3824 = new Long(3825396310311739952L);
        Long term3826 = new Long(-3838084482494604218L);
        term3821 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3833 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3838 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3839 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3843 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3821, term3821.getClass(), "id", term3822);
        setField(term3821, term3821.getClass(), "postId", term3824);
        setField(term3821, term3821.getClass(), "likeCount", term3826);
        setIntField(term3829, term3829.getClass(), "year", 2023);
        setShortField(term3829, term3829.getClass(), "month", (short) 7);
        setShortField(term3829, term3829.getClass(), "day", (short) 16);
        setField(term3828, term3828.getClass(), "date", term3829);
        setByteField(term3833, term3833.getClass(), "hour", (byte) 3);
        setByteField(term3833, term3833.getClass(), "minute", (byte) 1);
        setByteField(term3833, term3833.getClass(), "second", (byte) 19);
        setIntField(term3833, term3833.getClass(), "nano", 488629554);
        setField(term3828, term3828.getClass(), "time", term3833);
        setField(term3821, term3821.getClass(), "createdAt", term3828);
        setIntField(term3839, term3839.getClass(), "year", 2018);
        setShortField(term3839, term3839.getClass(), "month", (short) 7);
        setShortField(term3839, term3839.getClass(), "day", (short) 12);
        setField(term3838, term3838.getClass(), "date", term3839);
        setByteField(term3843, term3843.getClass(), "hour", (byte) 1);
        setByteField(term3843, term3843.getClass(), "minute", (byte) 3);
        setByteField(term3843, term3843.getClass(), "second", (byte) 47);
        setIntField(term3843, term3843.getClass(), "nano", 2729929);
        setField(term3838, term3838.getClass(), "time", term3843);
        setField(term3821, term3821.getClass(), "updatedAt", term3838);
        term3848 = new Long(3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3848;
        callMethod(klass, "setId", argTypes, term3821, args);
    }

};


