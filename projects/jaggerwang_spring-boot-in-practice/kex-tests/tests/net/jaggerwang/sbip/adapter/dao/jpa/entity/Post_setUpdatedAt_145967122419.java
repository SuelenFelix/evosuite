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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_setUpdatedAt_145967122419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9830;
     Object term9892;

    public Post_setUpdatedAt_145967122419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9831 = new Long(3423965054378869855L);
        Long term9833 = new Long(-593735869267672817L);
        Class<? extends Object> term9903 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term9902 = ((Class) term9903).getDeclaredField((String) "IMAGE");
        ((Field) term9902).setAccessible(true);
        Object enum29 = ((Field) term9902).get((Object) null);
        Long term9858 = new Long(6041374912351843923L);
        Long term9860 = new Long(2535970782317488741L);
        Long term9862 = new Long(-5258945362776941718L);
        Long term9864 = new Long(24067105862153728L);
        Long term9866 = new Long(-8477368071089201577L);
        ArrayList term9856 = new ArrayList();
        ((ArrayList) term9856).add(term9858);
        ((ArrayList) term9856).add(term9860);
        ((ArrayList) term9856).add(term9862);
        ((ArrayList) term9856).add(term9864);
        ((ArrayList) term9856).add(term9866);
        Long term9870 = new Long(-1526729287349763895L);
        term9830 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term9872 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9873 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9877 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9887 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9830, term9830.getClass(), "id", term9831);
        setField(term9830, term9830.getClass(), "userId", term9833);
        setField(term9830, term9830.getClass(), "type", enum29);
        setField(term9830, term9830.getClass(), "text", "eqJfYWRaEL");
        setField(term9830, term9830.getClass(), "imageIds", term9856);
        setField(term9830, term9830.getClass(), "videoId", term9870);
        setIntField(term9873, term9873.getClass(), "year", 2021);
        setShortField(term9873, term9873.getClass(), "month", (short) 12);
        setShortField(term9873, term9873.getClass(), "day", (short) 21);
        setField(term9872, term9872.getClass(), "date", term9873);
        setByteField(term9877, term9877.getClass(), "hour", (byte) 12);
        setByteField(term9877, term9877.getClass(), "minute", (byte) 59);
        setByteField(term9877, term9877.getClass(), "second", (byte) 52);
        setIntField(term9877, term9877.getClass(), "nano", 47081639);
        setField(term9872, term9872.getClass(), "time", term9877);
        setField(term9830, term9830.getClass(), "createdAt", term9872);
        setIntField(term9883, term9883.getClass(), "year", 2026);
        setShortField(term9883, term9883.getClass(), "month", (short) 6);
        setShortField(term9883, term9883.getClass(), "day", (short) 13);
        setField(term9882, term9882.getClass(), "date", term9883);
        setByteField(term9887, term9887.getClass(), "hour", (byte) 19);
        setByteField(term9887, term9887.getClass(), "minute", (byte) 23);
        setByteField(term9887, term9887.getClass(), "second", (byte) 46);
        setIntField(term9887, term9887.getClass(), "nano", 67955056);
        setField(term9882, term9882.getClass(), "time", term9887);
        setField(term9830, term9830.getClass(), "updatedAt", term9882);
        term9892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9897 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term9893, term9893.getClass(), "year", 2013);
        setShortField(term9893, term9893.getClass(), "month", (short) 12);
        setShortField(term9893, term9893.getClass(), "day", (short) 23);
        setField(term9892, term9892.getClass(), "date", term9893);
        setByteField(term9897, term9897.getClass(), "hour", (byte) 1);
        setByteField(term9897, term9897.getClass(), "minute", (byte) 0);
        setByteField(term9897, term9897.getClass(), "second", (byte) 32);
        setIntField(term9897, term9897.getClass(), "nano", 168525686);
        setField(term9892, term9892.getClass(), "time", term9897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term9892;
        callMethod(klass, "setUpdatedAt", argTypes, term9830, args);
    }

};


