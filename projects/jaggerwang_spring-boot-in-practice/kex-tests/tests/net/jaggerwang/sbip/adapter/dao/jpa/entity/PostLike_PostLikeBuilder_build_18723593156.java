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

public class PostLike_PostLikeBuilder_build_18723593156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22967;

    public PostLike_PostLikeBuilder_build_18723593156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22968 = new Long(-5455716707538294699L);
        Long term22970 = new Long(-1889784286465977825L);
        Long term22972 = new Long(5592522907226111065L);
        term22967 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder"));
        Object term22974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22979 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22989 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22967, term22967.getClass(), "id", term22968);
        setField(term22967, term22967.getClass(), "userId", term22970);
        setField(term22967, term22967.getClass(), "postId", term22972);
        setIntField(term22975, term22975.getClass(), "year", 2017);
        setShortField(term22975, term22975.getClass(), "month", (short) 1);
        setShortField(term22975, term22975.getClass(), "day", (short) 3);
        setField(term22974, term22974.getClass(), "date", term22975);
        setByteField(term22979, term22979.getClass(), "hour", (byte) 14);
        setByteField(term22979, term22979.getClass(), "minute", (byte) 1);
        setByteField(term22979, term22979.getClass(), "second", (byte) 1);
        setIntField(term22979, term22979.getClass(), "nano", 827128674);
        setField(term22974, term22974.getClass(), "time", term22979);
        setField(term22967, term22967.getClass(), "createdAt", term22974);
        setIntField(term22985, term22985.getClass(), "year", 2022);
        setShortField(term22985, term22985.getClass(), "month", (short) 9);
        setShortField(term22985, term22985.getClass(), "day", (short) 3);
        setField(term22984, term22984.getClass(), "date", term22985);
        setByteField(term22989, term22989.getClass(), "hour", (byte) 22);
        setByteField(term22989, term22989.getClass(), "minute", (byte) 31);
        setByteField(term22989, term22989.getClass(), "second", (byte) 44);
        setIntField(term22989, term22989.getClass(), "nano", 798112760);
        setField(term22984, term22984.getClass(), "time", term22989);
        setField(term22967, term22967.getClass(), "updatedAt", term22984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term22967, args);
    }

};


