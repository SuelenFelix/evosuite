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

public class PostBO_getType_2100909773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13878;

    public PostBO_getType_2100909773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13879 = new Long(-1635471392209071620L);
        Long term13881 = new Long(-4714000263923324167L);
        Class<? extends Object> term13939 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term13938 = ((Class) term13939).getDeclaredField((String) "IMAGE");
        ((Field) term13938).setAccessible(true);
        Object enum35 = ((Field) term13938).get((Object) null);
        Long term13906 = new Long(6906379511067694917L);
        Long term13908 = new Long(-9204303423581447271L);
        Long term13910 = new Long(6248239231585852341L);
        Long term13912 = new Long(-88538481937688851L);
        ArrayList term13904 = new ArrayList();
        ((ArrayList) term13904).add(term13906);
        ((ArrayList) term13904).add(term13908);
        ((ArrayList) term13904).add(term13910);
        ((ArrayList) term13904).add(term13912);
        Long term13916 = new Long(4069264186851023313L);
        term13878 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term13918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13933 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13878, term13878.getClass(), "id", term13879);
        setField(term13878, term13878.getClass(), "userId", term13881);
        setField(term13878, term13878.getClass(), "type", enum35);
        setField(term13878, term13878.getClass(), "text", "hMmaoREuCK");
        setField(term13878, term13878.getClass(), "imageIds", term13904);
        setField(term13878, term13878.getClass(), "videoId", term13916);
        setIntField(term13919, term13919.getClass(), "year", 2023);
        setShortField(term13919, term13919.getClass(), "month", (short) 11);
        setShortField(term13919, term13919.getClass(), "day", (short) 14);
        setField(term13918, term13918.getClass(), "date", term13919);
        setByteField(term13923, term13923.getClass(), "hour", (byte) 15);
        setByteField(term13923, term13923.getClass(), "minute", (byte) 2);
        setByteField(term13923, term13923.getClass(), "second", (byte) 47);
        setIntField(term13923, term13923.getClass(), "nano", 703984770);
        setField(term13918, term13918.getClass(), "time", term13923);
        setField(term13878, term13878.getClass(), "createdAt", term13918);
        setIntField(term13929, term13929.getClass(), "year", 2024);
        setShortField(term13929, term13929.getClass(), "month", (short) 4);
        setShortField(term13929, term13929.getClass(), "day", (short) 26);
        setField(term13928, term13928.getClass(), "date", term13929);
        setByteField(term13933, term13933.getClass(), "hour", (byte) 15);
        setByteField(term13933, term13933.getClass(), "minute", (byte) 12);
        setByteField(term13933, term13933.getClass(), "second", (byte) 31);
        setIntField(term13933, term13933.getClass(), "nano", 839979637);
        setField(term13928, term13928.getClass(), "time", term13933);
        setField(term13878, term13878.getClass(), "updatedAt", term13928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term13878, args);
    }

};


