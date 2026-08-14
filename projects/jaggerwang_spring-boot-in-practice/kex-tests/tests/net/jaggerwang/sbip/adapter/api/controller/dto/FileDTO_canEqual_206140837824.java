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

public class FileDTO_canEqual_206140837824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26542;
     Object term26650;

    public FileDTO_canEqual_206140837824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26543 = new Long(3931473624300151730L);
        Long term26545 = new Long(661905373566913125L);
        Class<? extends Object> term26652 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term26651 = ((Class) term26652).getDeclaredField((String) "LOCAL");
        ((Field) term26651).setAccessible(true);
        Object enum53 = ((Field) term26651).get((Object) null);
        Long term26593 = new Long(-3753621038448351550L);
        HashMap term26639 = new HashMap();
        term26542 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term26580 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term26607 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26608 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26612 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26622 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26542, term26542.getClass(), "id", term26543);
        setField(term26542, term26542.getClass(), "userId", term26545);
        setField(term26542, term26542.getClass(), "region", enum53);
        setField(term26542, term26542.getClass(), "bucket", "ktbqerIaKW");
        setField(term26542, term26542.getClass(), "path", "VoghngXfsK");
        setField(term26580, term26580.getClass(), "name", "GbahCBMvct");
        setField(term26580, term26580.getClass(), "size", term26593);
        setField(term26580, term26580.getClass(), "type", "iiHBhsNFgk");
        setField(term26542, term26542.getClass(), "meta", term26580);
        setIntField(term26608, term26608.getClass(), "year", 2012);
        setShortField(term26608, term26608.getClass(), "month", (short) 2);
        setShortField(term26608, term26608.getClass(), "day", (short) 18);
        setField(term26607, term26607.getClass(), "date", term26608);
        setByteField(term26612, term26612.getClass(), "hour", (byte) 4);
        setByteField(term26612, term26612.getClass(), "minute", (byte) 27);
        setByteField(term26612, term26612.getClass(), "second", (byte) 19);
        setIntField(term26612, term26612.getClass(), "nano", 948215601);
        setField(term26607, term26607.getClass(), "time", term26612);
        setField(term26542, term26542.getClass(), "createdAt", term26607);
        setIntField(term26618, term26618.getClass(), "year", 2029);
        setShortField(term26618, term26618.getClass(), "month", (short) 11);
        setShortField(term26618, term26618.getClass(), "day", (short) 23);
        setField(term26617, term26617.getClass(), "date", term26618);
        setByteField(term26622, term26622.getClass(), "hour", (byte) 18);
        setByteField(term26622, term26622.getClass(), "minute", (byte) 47);
        setByteField(term26622, term26622.getClass(), "second", (byte) 36);
        setIntField(term26622, term26622.getClass(), "nano", 43248731);
        setField(term26617, term26617.getClass(), "time", term26622);
        setField(term26542, term26542.getClass(), "updatedAt", term26617);
        setField(term26542, term26542.getClass(), "url", "HknsTajwxJ");
        setField(term26542, term26542.getClass(), "thumbs", term26639);
        term26650 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26650;
        callMethod(klass, "canEqual", argTypes, term26542, args);
    }

};


