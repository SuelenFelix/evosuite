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

public class PostLike_PostLikeBuilder_postId_13530757883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22864;
     Object term22891;

    public PostLike_PostLikeBuilder_postId_13530757883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22865 = new Long(-8842842172497711872L);
        Long term22867 = new Long(-5367775625638780650L);
        Long term22869 = new Long(-7830820957252387854L);
        term22864 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder"));
        Object term22871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22886 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22864, term22864.getClass(), "id", term22865);
        setField(term22864, term22864.getClass(), "userId", term22867);
        setField(term22864, term22864.getClass(), "postId", term22869);
        setIntField(term22872, term22872.getClass(), "year", 2022);
        setShortField(term22872, term22872.getClass(), "month", (short) 5);
        setShortField(term22872, term22872.getClass(), "day", (short) 28);
        setField(term22871, term22871.getClass(), "date", term22872);
        setByteField(term22876, term22876.getClass(), "hour", (byte) 20);
        setByteField(term22876, term22876.getClass(), "minute", (byte) 42);
        setByteField(term22876, term22876.getClass(), "second", (byte) 20);
        setIntField(term22876, term22876.getClass(), "nano", 528388661);
        setField(term22871, term22871.getClass(), "time", term22876);
        setField(term22864, term22864.getClass(), "createdAt", term22871);
        setIntField(term22882, term22882.getClass(), "year", 2029);
        setShortField(term22882, term22882.getClass(), "month", (short) 5);
        setShortField(term22882, term22882.getClass(), "day", (short) 12);
        setField(term22881, term22881.getClass(), "date", term22882);
        setByteField(term22886, term22886.getClass(), "hour", (byte) 23);
        setByteField(term22886, term22886.getClass(), "minute", (byte) 20);
        setByteField(term22886, term22886.getClass(), "second", (byte) 4);
        setIntField(term22886, term22886.getClass(), "nano", 378307890);
        setField(term22881, term22881.getClass(), "time", term22886);
        setField(term22864, term22864.getClass(), "updatedAt", term22881);
        term22891 = new Long(-8985577692063635272L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike$PostLikeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term22891;
        callMethod(klass, "postId", argTypes, term22864, args);
    }

};


