package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_toString_118972202220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18916;

    public PostBO_toString_118972202220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18917 = new Long(2274723545906746965L);
        Long term18919 = new Long(1353683663053784647L);
        Class<? extends Object> term18971 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term18970 = ((Class) term18971).getDeclaredField((String) "IMAGE");
        ((Field) term18970).setAccessible(true);
        Object enum53 = ((Field) term18970).get((Object) null);
        Long term18944 = new Long(-1465819833800717311L);
        ArrayList term18942 = new ArrayList();
        ((ArrayList) term18942).add(term18944);
        Long term18948 = new Long(-8306611953768020559L);
        term18916 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term18950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18955 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18965 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18916, term18916.getClass(), "id", term18917);
        setField(term18916, term18916.getClass(), "userId", term18919);
        setField(term18916, term18916.getClass(), "type", enum53);
        setField(term18916, term18916.getClass(), "text", "JmcmxoGhIK");
        setField(term18916, term18916.getClass(), "imageIds", term18942);
        setField(term18916, term18916.getClass(), "videoId", term18948);
        setIntField(term18951, term18951.getClass(), "year", 2026);
        setShortField(term18951, term18951.getClass(), "month", (short) 7);
        setShortField(term18951, term18951.getClass(), "day", (short) 4);
        setField(term18950, term18950.getClass(), "date", term18951);
        setByteField(term18955, term18955.getClass(), "hour", (byte) 8);
        setByteField(term18955, term18955.getClass(), "minute", (byte) 51);
        setByteField(term18955, term18955.getClass(), "second", (byte) 9);
        setIntField(term18955, term18955.getClass(), "nano", 936880887);
        setField(term18950, term18950.getClass(), "time", term18955);
        setField(term18916, term18916.getClass(), "createdAt", term18950);
        setIntField(term18961, term18961.getClass(), "year", 2022);
        setShortField(term18961, term18961.getClass(), "month", (short) 5);
        setShortField(term18961, term18961.getClass(), "day", (short) 26);
        setField(term18960, term18960.getClass(), "date", term18961);
        setByteField(term18965, term18965.getClass(), "hour", (byte) 6);
        setByteField(term18965, term18965.getClass(), "minute", (byte) 54);
        setByteField(term18965, term18965.getClass(), "second", (byte) 49);
        setIntField(term18965, term18965.getClass(), "nano", 822216068);
        setField(term18960, term18960.getClass(), "time", term18965);
        setField(term18916, term18916.getClass(), "updatedAt", term18960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18916, args);
    }

};


