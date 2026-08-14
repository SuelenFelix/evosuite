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
     Object term53235;

    public MeetingVO_toString_24225009932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53236 = new Integer(-1557704101);
        Integer term53274 = new Integer(-764615686);
        Integer term53334 = new Integer(-762034217);
        Integer term53346 = new Integer(481600552);
        Integer term53348 = new Integer(1415008678);
        term53235 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term53276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53341 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term53235, term53235.getClass(), "id", term53236);
        setField(term53235, term53235.getClass(), "name", "tMGOlywCNF");
        setField(term53235, term53235.getClass(), "host", "VGKRiEyTvE");
        setField(term53235, term53235.getClass(), "roomName", "IhcEHpXkob");
        setField(term53235, term53235.getClass(), "online", term53274);
        setIntField(term53277, term53277.getClass(), "year", 2010);
        setShortField(term53277, term53277.getClass(), "month", (short) 9);
        setShortField(term53277, term53277.getClass(), "day", (short) 8);
        setField(term53276, term53276.getClass(), "date", term53277);
        setByteField(term53281, term53281.getClass(), "hour", (byte) 10);
        setByteField(term53281, term53281.getClass(), "minute", (byte) 51);
        setByteField(term53281, term53281.getClass(), "second", (byte) 17);
        setIntField(term53281, term53281.getClass(), "nano", 736149959);
        setField(term53276, term53276.getClass(), "time", term53281);
        setField(term53235, term53235.getClass(), "createTime", term53276);
        setField(term53235, term53235.getClass(), "link", "ioEDElbWJy");
        setField(term53235, term53235.getClass(), "meetingTime", "EOTzpwdFZX");
        setField(term53235, term53235.getClass(), "signTime", "ruVLkwVHZZ");
        setField(term53235, term53235.getClass(), "introduce", "OKqVtEfDVA");
        setField(term53235, term53235.getClass(), "state", term53334);
        setIntField(term53337, term53337.getClass(), "year", 2022);
        setShortField(term53337, term53337.getClass(), "month", (short) 6);
        setShortField(term53337, term53337.getClass(), "day", (short) 3);
        setField(term53336, term53336.getClass(), "date", term53337);
        setByteField(term53341, term53341.getClass(), "hour", (byte) 14);
        setByteField(term53341, term53341.getClass(), "minute", (byte) 38);
        setByteField(term53341, term53341.getClass(), "second", (byte) 25);
        setIntField(term53341, term53341.getClass(), "nano", 986041484);
        setField(term53336, term53336.getClass(), "time", term53341);
        setField(term53235, term53235.getClass(), "updateTime", term53336);
        setField(term53235, term53235.getClass(), "userNumber", term53346);
        setField(term53235, term53235.getClass(), "signNumber", term53348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term53235, args);
    }

};


