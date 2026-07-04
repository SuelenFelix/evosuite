package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting_setCreateTime_172815733116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29279;
     Object term29393;

    public Meeting_setCreateTime_172815733116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29280 = new Integer(-831752810);
        Integer term29362 = new Integer(-386141354);
        Integer term29364 = new Integer(-226677391);
        Integer term29379 = new Integer(-1991945298);
        term29279 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term29282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29287 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29333 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29279, term29279.getClass(), "id", term29280);
        setIntField(term29283, term29283.getClass(), "year", 2023);
        setShortField(term29283, term29283.getClass(), "month", (short) 5);
        setShortField(term29283, term29283.getClass(), "day", (short) 24);
        setField(term29282, term29282.getClass(), "date", term29283);
        setByteField(term29287, term29287.getClass(), "hour", (byte) 7);
        setByteField(term29287, term29287.getClass(), "minute", (byte) 37);
        setByteField(term29287, term29287.getClass(), "second", (byte) 7);
        setIntField(term29287, term29287.getClass(), "nano", 648887020);
        setField(term29282, term29282.getClass(), "time", term29287);
        setField(term29279, term29279.getClass(), "createTime", term29282);
        setField(term29279, term29279.getClass(), "name", "kDvCVaiDrD");
        setField(term29279, term29279.getClass(), "link", "dyqwIzdzpi");
        setField(term29279, term29279.getClass(), "introduce", "QQNYZIaGLG");
        setIntField(term29329, term29329.getClass(), "year", 2029);
        setShortField(term29329, term29329.getClass(), "month", (short) 8);
        setShortField(term29329, term29329.getClass(), "day", (short) 9);
        setField(term29328, term29328.getClass(), "date", term29329);
        setByteField(term29333, term29333.getClass(), "hour", (byte) 15);
        setByteField(term29333, term29333.getClass(), "minute", (byte) 45);
        setByteField(term29333, term29333.getClass(), "second", (byte) 28);
        setIntField(term29333, term29333.getClass(), "nano", 584909169);
        setField(term29328, term29328.getClass(), "time", term29333);
        setField(term29279, term29279.getClass(), "updateTime", term29328);
        setField(term29279, term29279.getClass(), "meetingTime", "gsDkRFcnWo");
        setField(term29279, term29279.getClass(), "signTime", "yQngLjjiPy");
        setField(term29279, term29279.getClass(), "signNumber", term29362);
        setField(term29279, term29279.getClass(), "userNumber", term29364);
        setField(term29279, term29279.getClass(), "fileUrl", "UrfjRKtIoT");
        setBooleanField(term29279, term29279.getClass(), "online", true);
        setField(term29279, term29279.getClass(), "deleted", term29379);
        setField(term29279, term29279.getClass(), "host", "vgahNbDKFu");
        term29393 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29394 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29398 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29394, term29394.getClass(), "year", 2024);
        setShortField(term29394, term29394.getClass(), "month", (short) 10);
        setShortField(term29394, term29394.getClass(), "day", (short) 29);
        setField(term29393, term29393.getClass(), "date", term29394);
        setByteField(term29398, term29398.getClass(), "hour", (byte) 8);
        setByteField(term29398, term29398.getClass(), "minute", (byte) 39);
        setByteField(term29398, term29398.getClass(), "second", (byte) 36);
        setIntField(term29398, term29398.getClass(), "nano", 718768967);
        setField(term29393, term29393.getClass(), "time", term29398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term29393;
        callMethod(klass, "setCreateTime", argTypes, term29279, args);
    }

};


