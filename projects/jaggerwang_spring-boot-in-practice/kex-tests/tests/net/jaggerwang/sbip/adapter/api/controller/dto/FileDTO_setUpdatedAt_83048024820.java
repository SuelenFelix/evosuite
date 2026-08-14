package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class FileDTO_setUpdatedAt_83048024820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24935;
     Object term25043;

    public FileDTO_setUpdatedAt_83048024820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24936 = new Long(3643973882575578879L);
        Long term24938 = new Long(-1750555031444556464L);
        Class<? extends Object> term25054 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term25053 = ((Class) term25054).getDeclaredField((String) "LOCAL");
        ((Field) term25053).setAccessible(true);
        Object enum49 = ((Field) term25053).get((Object) null);
        Long term24986 = new Long(-3231440836116263235L);
        HashMap term25032 = new HashMap();
        term24935 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term24973 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term25000 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25001 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25005 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25015 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24935, term24935.getClass(), "id", term24936);
        setField(term24935, term24935.getClass(), "userId", term24938);
        setField(term24935, term24935.getClass(), "region", enum49);
        setField(term24935, term24935.getClass(), "bucket", "wsysQLGFnl");
        setField(term24935, term24935.getClass(), "path", "ckQLZGFjMX");
        setField(term24973, term24973.getClass(), "name", "qphdrqUtNx");
        setField(term24973, term24973.getClass(), "size", term24986);
        setField(term24973, term24973.getClass(), "type", "bwlLFAfNWx");
        setField(term24935, term24935.getClass(), "meta", term24973);
        setIntField(term25001, term25001.getClass(), "year", 2021);
        setShortField(term25001, term25001.getClass(), "month", (short) 10);
        setShortField(term25001, term25001.getClass(), "day", (short) 16);
        setField(term25000, term25000.getClass(), "date", term25001);
        setByteField(term25005, term25005.getClass(), "hour", (byte) 5);
        setByteField(term25005, term25005.getClass(), "minute", (byte) 6);
        setByteField(term25005, term25005.getClass(), "second", (byte) 17);
        setIntField(term25005, term25005.getClass(), "nano", 631786532);
        setField(term25000, term25000.getClass(), "time", term25005);
        setField(term24935, term24935.getClass(), "createdAt", term25000);
        setIntField(term25011, term25011.getClass(), "year", 2027);
        setShortField(term25011, term25011.getClass(), "month", (short) 11);
        setShortField(term25011, term25011.getClass(), "day", (short) 10);
        setField(term25010, term25010.getClass(), "date", term25011);
        setByteField(term25015, term25015.getClass(), "hour", (byte) 9);
        setByteField(term25015, term25015.getClass(), "minute", (byte) 27);
        setByteField(term25015, term25015.getClass(), "second", (byte) 5);
        setIntField(term25015, term25015.getClass(), "nano", 574938581);
        setField(term25010, term25010.getClass(), "time", term25015);
        setField(term24935, term24935.getClass(), "updatedAt", term25010);
        setField(term24935, term24935.getClass(), "url", "JWodNQzjjV");
        setField(term24935, term24935.getClass(), "thumbs", term25032);
        term25043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25048 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term25044, term25044.getClass(), "year", 2011);
        setShortField(term25044, term25044.getClass(), "month", (short) 8);
        setShortField(term25044, term25044.getClass(), "day", (short) 29);
        setField(term25043, term25043.getClass(), "date", term25044);
        setByteField(term25048, term25048.getClass(), "hour", (byte) 10);
        setByteField(term25048, term25048.getClass(), "minute", (byte) 15);
        setByteField(term25048, term25048.getClass(), "second", (byte) 18);
        setIntField(term25048, term25048.getClass(), "nano", 171360352);
        setField(term25043, term25043.getClass(), "time", term25048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term25043;
        callMethod(klass, "setUpdatedAt", argTypes, term24935, args);
    }

};


