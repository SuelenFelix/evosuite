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

public class MeetingVO_hashCode_75300978931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53050;

    public MeetingVO_hashCode_75300978931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53051 = new Integer(-1372040155);
        Integer term53089 = new Integer(2091263178);
        Integer term53149 = new Integer(-1726739412);
        Integer term53161 = new Integer(-910985376);
        Integer term53163 = new Integer(1260410174);
        term53050 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term53091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53156 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term53050, term53050.getClass(), "id", term53051);
        setField(term53050, term53050.getClass(), "name", "elULqOCaCg");
        setField(term53050, term53050.getClass(), "host", "JzQtKVDWeX");
        setField(term53050, term53050.getClass(), "roomName", "VtkumdeGYO");
        setField(term53050, term53050.getClass(), "online", term53089);
        setIntField(term53092, term53092.getClass(), "year", 2025);
        setShortField(term53092, term53092.getClass(), "month", (short) 6);
        setShortField(term53092, term53092.getClass(), "day", (short) 10);
        setField(term53091, term53091.getClass(), "date", term53092);
        setByteField(term53096, term53096.getClass(), "hour", (byte) 2);
        setByteField(term53096, term53096.getClass(), "minute", (byte) 11);
        setByteField(term53096, term53096.getClass(), "second", (byte) 0);
        setIntField(term53096, term53096.getClass(), "nano", 567450408);
        setField(term53091, term53091.getClass(), "time", term53096);
        setField(term53050, term53050.getClass(), "createTime", term53091);
        setField(term53050, term53050.getClass(), "link", "chSGxkbeAc");
        setField(term53050, term53050.getClass(), "meetingTime", "wnxOndGYJi");
        setField(term53050, term53050.getClass(), "signTime", "BOLQzJFvBT");
        setField(term53050, term53050.getClass(), "introduce", "GSDNcmjnrW");
        setField(term53050, term53050.getClass(), "state", term53149);
        setIntField(term53152, term53152.getClass(), "year", 2012);
        setShortField(term53152, term53152.getClass(), "month", (short) 1);
        setShortField(term53152, term53152.getClass(), "day", (short) 29);
        setField(term53151, term53151.getClass(), "date", term53152);
        setByteField(term53156, term53156.getClass(), "hour", (byte) 8);
        setByteField(term53156, term53156.getClass(), "minute", (byte) 32);
        setByteField(term53156, term53156.getClass(), "second", (byte) 23);
        setIntField(term53156, term53156.getClass(), "nano", 150335383);
        setField(term53151, term53151.getClass(), "time", term53156);
        setField(term53050, term53050.getClass(), "updateTime", term53151);
        setField(term53050, term53050.getClass(), "userNumber", term53161);
        setField(term53050, term53050.getClass(), "signNumber", term53163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term53050, args);
    }

};


