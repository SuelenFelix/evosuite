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

public class PostStat_setLikeCount_210780529511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3879;
     Object term3906;

    public PostStat_setLikeCount_210780529511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3880 = new Long(2062173786000223358L);
        Long term3882 = new Long(-8658027316505137504L);
        Long term3884 = new Long(414749984815662075L);
        term3879 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3891 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3901 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3879, term3879.getClass(), "id", term3880);
        setField(term3879, term3879.getClass(), "postId", term3882);
        setField(term3879, term3879.getClass(), "likeCount", term3884);
        setIntField(term3887, term3887.getClass(), "year", 2020);
        setShortField(term3887, term3887.getClass(), "month", (short) 8);
        setShortField(term3887, term3887.getClass(), "day", (short) 15);
        setField(term3886, term3886.getClass(), "date", term3887);
        setByteField(term3891, term3891.getClass(), "hour", (byte) 2);
        setByteField(term3891, term3891.getClass(), "minute", (byte) 0);
        setByteField(term3891, term3891.getClass(), "second", (byte) 38);
        setIntField(term3891, term3891.getClass(), "nano", 146431486);
        setField(term3886, term3886.getClass(), "time", term3891);
        setField(term3879, term3879.getClass(), "createdAt", term3886);
        setIntField(term3897, term3897.getClass(), "year", 2014);
        setShortField(term3897, term3897.getClass(), "month", (short) 11);
        setShortField(term3897, term3897.getClass(), "day", (short) 8);
        setField(term3896, term3896.getClass(), "date", term3897);
        setByteField(term3901, term3901.getClass(), "hour", (byte) 8);
        setByteField(term3901, term3901.getClass(), "minute", (byte) 43);
        setByteField(term3901, term3901.getClass(), "second", (byte) 32);
        setIntField(term3901, term3901.getClass(), "nano", 154434838);
        setField(term3896, term3896.getClass(), "time", term3901);
        setField(term3879, term3879.getClass(), "updatedAt", term3896);
        term3906 = new Long(463622836963501975L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3906;
        callMethod(klass, "setLikeCount", argTypes, term3879, args);
    }

};


