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

public class File_FileBuilder_region_7927785433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708;
     Object enum2;

    public File_FileBuilder_region_7927785433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term709 = new Long(-7237588299778557629L);
        Long term711 = new Long(6967924379644551255L);
        Class<? extends Object> term794 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term793 = ((Class) term794).getDeclaredField((String) "LOCAL");
        ((Field) term793).setAccessible(true);
        enum2 = ((Field) term793).get((Object) null);
        Long term759 = new Long(-2813493605142626659L);
        term708 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder"));
        Object term746 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term773 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term778 = newInstance(Class.forName("java.time.LocalTime"));
        Object term783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term788 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term708, term708.getClass(), "id", term709);
        setField(term708, term708.getClass(), "userId", term711);
        setField(term708, term708.getClass(), "region", enum2);
        setField(term708, term708.getClass(), "bucket", "hRNSzYYIrc");
        setField(term708, term708.getClass(), "path", "RMFIsYGgne");
        setField(term746, term746.getClass(), "name", "NRdvgJlhkX");
        setField(term746, term746.getClass(), "size", term759);
        setField(term746, term746.getClass(), "type", "uuaPigETmJ");
        setField(term708, term708.getClass(), "meta", term746);
        setIntField(term774, term774.getClass(), "year", 2022);
        setShortField(term774, term774.getClass(), "month", (short) 2);
        setShortField(term774, term774.getClass(), "day", (short) 26);
        setField(term773, term773.getClass(), "date", term774);
        setByteField(term778, term778.getClass(), "hour", (byte) 11);
        setByteField(term778, term778.getClass(), "minute", (byte) 42);
        setByteField(term778, term778.getClass(), "second", (byte) 15);
        setIntField(term778, term778.getClass(), "nano", 377731937);
        setField(term773, term773.getClass(), "time", term778);
        setField(term708, term708.getClass(), "createdAt", term773);
        setIntField(term784, term784.getClass(), "year", 2026);
        setShortField(term784, term784.getClass(), "month", (short) 12);
        setShortField(term784, term784.getClass(), "day", (short) 14);
        setField(term783, term783.getClass(), "date", term784);
        setByteField(term788, term788.getClass(), "hour", (byte) 16);
        setByteField(term788, term788.getClass(), "minute", (byte) 34);
        setByteField(term788, term788.getClass(), "second", (byte) 9);
        setIntField(term788, term788.getClass(), "nano", 518326996);
        setField(term783, term783.getClass(), "time", term788);
        setField(term708, term708.getClass(), "updatedAt", term783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.FileBO$Region");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "region", argTypes, term708, args);
    }

};


