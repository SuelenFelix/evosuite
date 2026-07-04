package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingVO_equals_120169646429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12309;
     Object term12424;

    public MeetingVO_equals_120169646429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12310 = new Integer(-380787857);
        Integer term12348 = new Integer(319853052);
        Integer term12408 = new Integer(-1097563716);
        Integer term12420 = new Integer(1572907769);
        Integer term12422 = new Integer(1608016787);
        term12309 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term12350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12415 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12309, term12309.getClass(), "id", term12310);
        setField(term12309, term12309.getClass(), "name", "luSCmxphxi");
        setField(term12309, term12309.getClass(), "host", "OGEDwuJhjV");
        setField(term12309, term12309.getClass(), "roomName", "vepOtOxlWM");
        setField(term12309, term12309.getClass(), "online", term12348);
        setIntField(term12351, term12351.getClass(), "year", 2018);
        setShortField(term12351, term12351.getClass(), "month", (short) 11);
        setShortField(term12351, term12351.getClass(), "day", (short) 9);
        setField(term12350, term12350.getClass(), "date", term12351);
        setByteField(term12355, term12355.getClass(), "hour", (byte) 6);
        setByteField(term12355, term12355.getClass(), "minute", (byte) 8);
        setByteField(term12355, term12355.getClass(), "second", (byte) 32);
        setIntField(term12355, term12355.getClass(), "nano", 750733310);
        setField(term12350, term12350.getClass(), "time", term12355);
        setField(term12309, term12309.getClass(), "createTime", term12350);
        setField(term12309, term12309.getClass(), "link", "XZmoxlxcKh");
        setField(term12309, term12309.getClass(), "meetingTime", "aHNGawFCfD");
        setField(term12309, term12309.getClass(), "signTime", "cHjhnXKTVF");
        setField(term12309, term12309.getClass(), "introduce", "NVsXpTZPoM");
        setField(term12309, term12309.getClass(), "state", term12408);
        setIntField(term12411, term12411.getClass(), "year", 2010);
        setShortField(term12411, term12411.getClass(), "month", (short) 2);
        setShortField(term12411, term12411.getClass(), "day", (short) 24);
        setField(term12410, term12410.getClass(), "date", term12411);
        setByteField(term12415, term12415.getClass(), "hour", (byte) 17);
        setByteField(term12415, term12415.getClass(), "minute", (byte) 58);
        setByteField(term12415, term12415.getClass(), "second", (byte) 56);
        setIntField(term12415, term12415.getClass(), "nano", 291725532);
        setField(term12410, term12410.getClass(), "time", term12415);
        setField(term12309, term12309.getClass(), "updateTime", term12410);
        setField(term12309, term12309.getClass(), "userNumber", term12420);
        setField(term12309, term12309.getClass(), "signNumber", term12422);
        term12424 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12424;
        callMethod(klass, "equals", argTypes, term12309, args);
    }

};


