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

public class MeetingVO_toString_24225009932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12866;

    public MeetingVO_toString_24225009932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12867 = new Integer(-876426634);
        Integer term12905 = new Integer(213831054);
        Integer term12965 = new Integer(330043745);
        Integer term12977 = new Integer(-509349195);
        Integer term12979 = new Integer(-1639041228);
        term12866 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term12907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12972 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12866, term12866.getClass(), "id", term12867);
        setField(term12866, term12866.getClass(), "name", "VTjvZBqRUX");
        setField(term12866, term12866.getClass(), "host", "vhjxsMJjOh");
        setField(term12866, term12866.getClass(), "roomName", "gKgsqLPDCs");
        setField(term12866, term12866.getClass(), "online", term12905);
        setIntField(term12908, term12908.getClass(), "year", 2028);
        setShortField(term12908, term12908.getClass(), "month", (short) 5);
        setShortField(term12908, term12908.getClass(), "day", (short) 2);
        setField(term12907, term12907.getClass(), "date", term12908);
        setByteField(term12912, term12912.getClass(), "hour", (byte) 2);
        setByteField(term12912, term12912.getClass(), "minute", (byte) 59);
        setByteField(term12912, term12912.getClass(), "second", (byte) 30);
        setIntField(term12912, term12912.getClass(), "nano", 222274238);
        setField(term12907, term12907.getClass(), "time", term12912);
        setField(term12866, term12866.getClass(), "createTime", term12907);
        setField(term12866, term12866.getClass(), "link", "crZAQIKgDI");
        setField(term12866, term12866.getClass(), "meetingTime", "uDAdogNiBQ");
        setField(term12866, term12866.getClass(), "signTime", "GnPrxkKUmR");
        setField(term12866, term12866.getClass(), "introduce", "gVgLmqgxMh");
        setField(term12866, term12866.getClass(), "state", term12965);
        setIntField(term12968, term12968.getClass(), "year", 2011);
        setShortField(term12968, term12968.getClass(), "month", (short) 4);
        setShortField(term12968, term12968.getClass(), "day", (short) 19);
        setField(term12967, term12967.getClass(), "date", term12968);
        setByteField(term12972, term12972.getClass(), "hour", (byte) 12);
        setByteField(term12972, term12972.getClass(), "minute", (byte) 0);
        setByteField(term12972, term12972.getClass(), "second", (byte) 14);
        setIntField(term12972, term12972.getClass(), "nano", 849079063);
        setField(term12967, term12967.getClass(), "time", term12972);
        setField(term12866, term12866.getClass(), "updateTime", term12967);
        setField(term12866, term12866.getClass(), "userNumber", term12977);
        setField(term12866, term12866.getClass(), "signNumber", term12979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12866, args);
    }

};


