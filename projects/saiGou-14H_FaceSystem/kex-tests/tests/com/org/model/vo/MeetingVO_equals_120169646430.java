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

public class MeetingVO_equals_120169646430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12310;
     Object term12425;

    public MeetingVO_equals_120169646430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12311 = new Integer(-380787857);
        Integer term12349 = new Integer(319853052);
        Integer term12409 = new Integer(-1097563716);
        Integer term12421 = new Integer(1572907769);
        Integer term12423 = new Integer(1608016787);
        term12310 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term12351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12416 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12310, term12310.getClass(), "id", term12311);
        setField(term12310, term12310.getClass(), "name", "luSCmxphxi");
        setField(term12310, term12310.getClass(), "host", "OGEDwuJhjV");
        setField(term12310, term12310.getClass(), "roomName", "vepOtOxlWM");
        setField(term12310, term12310.getClass(), "online", term12349);
        setIntField(term12352, term12352.getClass(), "year", 2018);
        setShortField(term12352, term12352.getClass(), "month", (short) 11);
        setShortField(term12352, term12352.getClass(), "day", (short) 9);
        setField(term12351, term12351.getClass(), "date", term12352);
        setByteField(term12356, term12356.getClass(), "hour", (byte) 6);
        setByteField(term12356, term12356.getClass(), "minute", (byte) 8);
        setByteField(term12356, term12356.getClass(), "second", (byte) 32);
        setIntField(term12356, term12356.getClass(), "nano", 750733310);
        setField(term12351, term12351.getClass(), "time", term12356);
        setField(term12310, term12310.getClass(), "createTime", term12351);
        setField(term12310, term12310.getClass(), "link", "XZmoxlxcKh");
        setField(term12310, term12310.getClass(), "meetingTime", "aHNGawFCfD");
        setField(term12310, term12310.getClass(), "signTime", "cHjhnXKTVF");
        setField(term12310, term12310.getClass(), "introduce", "NVsXpTZPoM");
        setField(term12310, term12310.getClass(), "state", term12409);
        setIntField(term12412, term12412.getClass(), "year", 2010);
        setShortField(term12412, term12412.getClass(), "month", (short) 2);
        setShortField(term12412, term12412.getClass(), "day", (short) 24);
        setField(term12411, term12411.getClass(), "date", term12412);
        setByteField(term12416, term12416.getClass(), "hour", (byte) 17);
        setByteField(term12416, term12416.getClass(), "minute", (byte) 58);
        setByteField(term12416, term12416.getClass(), "second", (byte) 56);
        setIntField(term12416, term12416.getClass(), "nano", 291725532);
        setField(term12411, term12411.getClass(), "time", term12416);
        setField(term12310, term12310.getClass(), "updateTime", term12411);
        setField(term12310, term12310.getClass(), "userNumber", term12421);
        setField(term12310, term12310.getClass(), "signNumber", term12423);
        term12425 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12425;
        callMethod(klass, "equals", argTypes, term12310, args);
    }

};


