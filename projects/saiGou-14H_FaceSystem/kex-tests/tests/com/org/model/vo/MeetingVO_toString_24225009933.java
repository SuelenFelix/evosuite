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

public class MeetingVO_toString_24225009933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12867;

    public MeetingVO_toString_24225009933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12868 = new Integer(-876426634);
        Integer term12906 = new Integer(213831054);
        Integer term12966 = new Integer(330043745);
        Integer term12978 = new Integer(-509349195);
        Integer term12980 = new Integer(-1639041228);
        term12867 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term12908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12913 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12968 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12969 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12973 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12867, term12867.getClass(), "id", term12868);
        setField(term12867, term12867.getClass(), "name", "VTjvZBqRUX");
        setField(term12867, term12867.getClass(), "host", "vhjxsMJjOh");
        setField(term12867, term12867.getClass(), "roomName", "gKgsqLPDCs");
        setField(term12867, term12867.getClass(), "online", term12906);
        setIntField(term12909, term12909.getClass(), "year", 2028);
        setShortField(term12909, term12909.getClass(), "month", (short) 5);
        setShortField(term12909, term12909.getClass(), "day", (short) 2);
        setField(term12908, term12908.getClass(), "date", term12909);
        setByteField(term12913, term12913.getClass(), "hour", (byte) 2);
        setByteField(term12913, term12913.getClass(), "minute", (byte) 59);
        setByteField(term12913, term12913.getClass(), "second", (byte) 30);
        setIntField(term12913, term12913.getClass(), "nano", 222274238);
        setField(term12908, term12908.getClass(), "time", term12913);
        setField(term12867, term12867.getClass(), "createTime", term12908);
        setField(term12867, term12867.getClass(), "link", "crZAQIKgDI");
        setField(term12867, term12867.getClass(), "meetingTime", "uDAdogNiBQ");
        setField(term12867, term12867.getClass(), "signTime", "GnPrxkKUmR");
        setField(term12867, term12867.getClass(), "introduce", "gVgLmqgxMh");
        setField(term12867, term12867.getClass(), "state", term12966);
        setIntField(term12969, term12969.getClass(), "year", 2011);
        setShortField(term12969, term12969.getClass(), "month", (short) 4);
        setShortField(term12969, term12969.getClass(), "day", (short) 19);
        setField(term12968, term12968.getClass(), "date", term12969);
        setByteField(term12973, term12973.getClass(), "hour", (byte) 12);
        setByteField(term12973, term12973.getClass(), "minute", (byte) 0);
        setByteField(term12973, term12973.getClass(), "second", (byte) 14);
        setIntField(term12973, term12973.getClass(), "nano", 849079063);
        setField(term12968, term12968.getClass(), "time", term12973);
        setField(term12867, term12867.getClass(), "updateTime", term12968);
        setField(term12867, term12867.getClass(), "userNumber", term12978);
        setField(term12867, term12867.getClass(), "signNumber", term12980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term12867, args);
    }

};


