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

public class MeetingVO_canEqual_200585909331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12496;
     Object term12611;

    public MeetingVO_canEqual_200585909331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12497 = new Integer(-516303035);
        Integer term12535 = new Integer(-2143043890);
        Integer term12595 = new Integer(-2138825831);
        Integer term12607 = new Integer(1454781562);
        Integer term12609 = new Integer(-27944011);
        term12496 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term12537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12597 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12598 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12602 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12496, term12496.getClass(), "id", term12497);
        setField(term12496, term12496.getClass(), "name", "OlbhHDRGng");
        setField(term12496, term12496.getClass(), "host", "kbxuaUHTXf");
        setField(term12496, term12496.getClass(), "roomName", "CwmyQhyiUR");
        setField(term12496, term12496.getClass(), "online", term12535);
        setIntField(term12538, term12538.getClass(), "year", 2028);
        setShortField(term12538, term12538.getClass(), "month", (short) 7);
        setShortField(term12538, term12538.getClass(), "day", (short) 22);
        setField(term12537, term12537.getClass(), "date", term12538);
        setByteField(term12542, term12542.getClass(), "hour", (byte) 18);
        setByteField(term12542, term12542.getClass(), "minute", (byte) 33);
        setByteField(term12542, term12542.getClass(), "second", (byte) 7);
        setIntField(term12542, term12542.getClass(), "nano", 763613074);
        setField(term12537, term12537.getClass(), "time", term12542);
        setField(term12496, term12496.getClass(), "createTime", term12537);
        setField(term12496, term12496.getClass(), "link", "PxwyuZAkGy");
        setField(term12496, term12496.getClass(), "meetingTime", "ODhSWAnZWd");
        setField(term12496, term12496.getClass(), "signTime", "NQkFXmkuYK");
        setField(term12496, term12496.getClass(), "introduce", "kHzsJWDHsz");
        setField(term12496, term12496.getClass(), "state", term12595);
        setIntField(term12598, term12598.getClass(), "year", 2011);
        setShortField(term12598, term12598.getClass(), "month", (short) 8);
        setShortField(term12598, term12598.getClass(), "day", (short) 1);
        setField(term12597, term12597.getClass(), "date", term12598);
        setByteField(term12602, term12602.getClass(), "hour", (byte) 7);
        setByteField(term12602, term12602.getClass(), "minute", (byte) 2);
        setByteField(term12602, term12602.getClass(), "second", (byte) 46);
        setIntField(term12602, term12602.getClass(), "nano", 187178462);
        setField(term12597, term12597.getClass(), "time", term12602);
        setField(term12496, term12496.getClass(), "updateTime", term12597);
        setField(term12496, term12496.getClass(), "userNumber", term12607);
        setField(term12496, term12496.getClass(), "signNumber", term12609);
        term12611 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12611;
        callMethod(klass, "canEqual", argTypes, term12496, args);
    }

};


