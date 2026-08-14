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

public class FileDTO_getUserId_16746954054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18750;

    public FileDTO_getUserId_16746954054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18751 = new Long(-5587528177305224828L);
        Long term18753 = new Long(7950532649535587877L);
        Class<? extends Object> term18859 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term18858 = ((Class) term18859).getDeclaredField((String) "LOCAL");
        ((Field) term18858).setAccessible(true);
        Object enum33 = ((Field) term18858).get((Object) null);
        Long term18801 = new Long(7799452759993694308L);
        HashMap term18847 = new HashMap();
        term18750 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term18788 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term18815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18820 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18830 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18750, term18750.getClass(), "id", term18751);
        setField(term18750, term18750.getClass(), "userId", term18753);
        setField(term18750, term18750.getClass(), "region", enum33);
        setField(term18750, term18750.getClass(), "bucket", "IEYhJmgCVd");
        setField(term18750, term18750.getClass(), "path", "KSJeYkkvpk");
        setField(term18788, term18788.getClass(), "name", "qUtkFGMNUV");
        setField(term18788, term18788.getClass(), "size", term18801);
        setField(term18788, term18788.getClass(), "type", "mGRiYhnMcR");
        setField(term18750, term18750.getClass(), "meta", term18788);
        setIntField(term18816, term18816.getClass(), "year", 2027);
        setShortField(term18816, term18816.getClass(), "month", (short) 8);
        setShortField(term18816, term18816.getClass(), "day", (short) 16);
        setField(term18815, term18815.getClass(), "date", term18816);
        setByteField(term18820, term18820.getClass(), "hour", (byte) 8);
        setByteField(term18820, term18820.getClass(), "minute", (byte) 3);
        setByteField(term18820, term18820.getClass(), "second", (byte) 15);
        setIntField(term18820, term18820.getClass(), "nano", 332963320);
        setField(term18815, term18815.getClass(), "time", term18820);
        setField(term18750, term18750.getClass(), "createdAt", term18815);
        setIntField(term18826, term18826.getClass(), "year", 2021);
        setShortField(term18826, term18826.getClass(), "month", (short) 11);
        setShortField(term18826, term18826.getClass(), "day", (short) 12);
        setField(term18825, term18825.getClass(), "date", term18826);
        setByteField(term18830, term18830.getClass(), "hour", (byte) 0);
        setByteField(term18830, term18830.getClass(), "minute", (byte) 51);
        setByteField(term18830, term18830.getClass(), "second", (byte) 55);
        setIntField(term18830, term18830.getClass(), "nano", 745543124);
        setField(term18825, term18825.getClass(), "time", term18830);
        setField(term18750, term18750.getClass(), "updatedAt", term18825);
        setField(term18750, term18750.getClass(), "url", "NFlvfJCVPO");
        setField(term18750, term18750.getClass(), "thumbs", term18847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term18750, args);
    }

};


