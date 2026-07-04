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

public class MeetingVO_canEqual_200585909330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12495;
     Object term12610;

    public MeetingVO_canEqual_200585909330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12496 = new Integer(-516303035);
        Integer term12534 = new Integer(-2143043890);
        Integer term12594 = new Integer(-2138825831);
        Integer term12606 = new Integer(1454781562);
        Integer term12608 = new Integer(-27944011);
        term12495 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term12536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12541 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12601 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12495, term12495.getClass(), "id", term12496);
        setField(term12495, term12495.getClass(), "name", "OlbhHDRGng");
        setField(term12495, term12495.getClass(), "host", "kbxuaUHTXf");
        setField(term12495, term12495.getClass(), "roomName", "CwmyQhyiUR");
        setField(term12495, term12495.getClass(), "online", term12534);
        setIntField(term12537, term12537.getClass(), "year", 2028);
        setShortField(term12537, term12537.getClass(), "month", (short) 7);
        setShortField(term12537, term12537.getClass(), "day", (short) 22);
        setField(term12536, term12536.getClass(), "date", term12537);
        setByteField(term12541, term12541.getClass(), "hour", (byte) 18);
        setByteField(term12541, term12541.getClass(), "minute", (byte) 33);
        setByteField(term12541, term12541.getClass(), "second", (byte) 7);
        setIntField(term12541, term12541.getClass(), "nano", 763613074);
        setField(term12536, term12536.getClass(), "time", term12541);
        setField(term12495, term12495.getClass(), "createTime", term12536);
        setField(term12495, term12495.getClass(), "link", "PxwyuZAkGy");
        setField(term12495, term12495.getClass(), "meetingTime", "ODhSWAnZWd");
        setField(term12495, term12495.getClass(), "signTime", "NQkFXmkuYK");
        setField(term12495, term12495.getClass(), "introduce", "kHzsJWDHsz");
        setField(term12495, term12495.getClass(), "state", term12594);
        setIntField(term12597, term12597.getClass(), "year", 2011);
        setShortField(term12597, term12597.getClass(), "month", (short) 8);
        setShortField(term12597, term12597.getClass(), "day", (short) 1);
        setField(term12596, term12596.getClass(), "date", term12597);
        setByteField(term12601, term12601.getClass(), "hour", (byte) 7);
        setByteField(term12601, term12601.getClass(), "minute", (byte) 2);
        setByteField(term12601, term12601.getClass(), "second", (byte) 46);
        setIntField(term12601, term12601.getClass(), "nano", 187178462);
        setField(term12596, term12596.getClass(), "time", term12601);
        setField(term12495, term12495.getClass(), "updateTime", term12596);
        setField(term12495, term12495.getClass(), "userNumber", term12606);
        setField(term12495, term12495.getClass(), "signNumber", term12608);
        term12610 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12610;
        callMethod(klass, "canEqual", argTypes, term12495, args);
    }

};


