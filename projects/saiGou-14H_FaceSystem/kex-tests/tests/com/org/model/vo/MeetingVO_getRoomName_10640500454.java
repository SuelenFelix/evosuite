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

public class MeetingVO_getRoomName_10640500454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7500;

    public MeetingVO_getRoomName_10640500454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7501 = new Integer(-1553893255);
        Integer term7539 = new Integer(1303442927);
        Integer term7599 = new Integer(794568325);
        Integer term7611 = new Integer(-434468428);
        Integer term7613 = new Integer(1559605714);
        term7500 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term7541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7606 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7500, term7500.getClass(), "id", term7501);
        setField(term7500, term7500.getClass(), "name", "rjWnqcjYuU");
        setField(term7500, term7500.getClass(), "host", "JhszTkUWCg");
        setField(term7500, term7500.getClass(), "roomName", "gfNPCeiULY");
        setField(term7500, term7500.getClass(), "online", term7539);
        setIntField(term7542, term7542.getClass(), "year", 2023);
        setShortField(term7542, term7542.getClass(), "month", (short) 3);
        setShortField(term7542, term7542.getClass(), "day", (short) 7);
        setField(term7541, term7541.getClass(), "date", term7542);
        setByteField(term7546, term7546.getClass(), "hour", (byte) 21);
        setByteField(term7546, term7546.getClass(), "minute", (byte) 15);
        setByteField(term7546, term7546.getClass(), "second", (byte) 43);
        setIntField(term7546, term7546.getClass(), "nano", 639721472);
        setField(term7541, term7541.getClass(), "time", term7546);
        setField(term7500, term7500.getClass(), "createTime", term7541);
        setField(term7500, term7500.getClass(), "link", "aUJLXfcWME");
        setField(term7500, term7500.getClass(), "meetingTime", "ixeIpUaVug");
        setField(term7500, term7500.getClass(), "signTime", "TELyWFMBJv");
        setField(term7500, term7500.getClass(), "introduce", "bIqbgRdzpB");
        setField(term7500, term7500.getClass(), "state", term7599);
        setIntField(term7602, term7602.getClass(), "year", 2015);
        setShortField(term7602, term7602.getClass(), "month", (short) 3);
        setShortField(term7602, term7602.getClass(), "day", (short) 10);
        setField(term7601, term7601.getClass(), "date", term7602);
        setByteField(term7606, term7606.getClass(), "hour", (byte) 23);
        setByteField(term7606, term7606.getClass(), "minute", (byte) 34);
        setByteField(term7606, term7606.getClass(), "second", (byte) 44);
        setIntField(term7606, term7606.getClass(), "nano", 587322824);
        setField(term7601, term7601.getClass(), "time", term7606);
        setField(term7500, term7500.getClass(), "updateTime", term7601);
        setField(term7500, term7500.getClass(), "userNumber", term7611);
        setField(term7500, term7500.getClass(), "signNumber", term7613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoomName", argTypes, term7500, args);
    }

};


