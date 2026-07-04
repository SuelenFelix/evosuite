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

public class MeetingVO_setState_1925779525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11553;
     Object term11668;

    public MeetingVO_setState_1925779525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11554 = new Integer(-128490829);
        Integer term11592 = new Integer(202214133);
        Integer term11652 = new Integer(1543091617);
        Integer term11664 = new Integer(-763166094);
        Integer term11666 = new Integer(-222941705);
        term11553 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term11594 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11595 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11599 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11659 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11553, term11553.getClass(), "id", term11554);
        setField(term11553, term11553.getClass(), "name", "dHrIcaTbcS");
        setField(term11553, term11553.getClass(), "host", "tAqyToqusS");
        setField(term11553, term11553.getClass(), "roomName", "MwiFLgdSDA");
        setField(term11553, term11553.getClass(), "online", term11592);
        setIntField(term11595, term11595.getClass(), "year", 2028);
        setShortField(term11595, term11595.getClass(), "month", (short) 1);
        setShortField(term11595, term11595.getClass(), "day", (short) 18);
        setField(term11594, term11594.getClass(), "date", term11595);
        setByteField(term11599, term11599.getClass(), "hour", (byte) 12);
        setByteField(term11599, term11599.getClass(), "minute", (byte) 4);
        setByteField(term11599, term11599.getClass(), "second", (byte) 39);
        setIntField(term11599, term11599.getClass(), "nano", 651287093);
        setField(term11594, term11594.getClass(), "time", term11599);
        setField(term11553, term11553.getClass(), "createTime", term11594);
        setField(term11553, term11553.getClass(), "link", "VhnistEcCA");
        setField(term11553, term11553.getClass(), "meetingTime", "hlPKLObFBU");
        setField(term11553, term11553.getClass(), "signTime", "oNGVAyjCob");
        setField(term11553, term11553.getClass(), "introduce", "lzqPLDonds");
        setField(term11553, term11553.getClass(), "state", term11652);
        setIntField(term11655, term11655.getClass(), "year", 2027);
        setShortField(term11655, term11655.getClass(), "month", (short) 7);
        setShortField(term11655, term11655.getClass(), "day", (short) 23);
        setField(term11654, term11654.getClass(), "date", term11655);
        setByteField(term11659, term11659.getClass(), "hour", (byte) 12);
        setByteField(term11659, term11659.getClass(), "minute", (byte) 6);
        setByteField(term11659, term11659.getClass(), "second", (byte) 19);
        setIntField(term11659, term11659.getClass(), "nano", 8025683);
        setField(term11654, term11654.getClass(), "time", term11659);
        setField(term11553, term11553.getClass(), "updateTime", term11654);
        setField(term11553, term11553.getClass(), "userNumber", term11664);
        setField(term11553, term11553.getClass(), "signNumber", term11666);
        term11668 = new Integer(291864719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term11668;
        callMethod(klass, "setState", argTypes, term11553, args);
    }

};


