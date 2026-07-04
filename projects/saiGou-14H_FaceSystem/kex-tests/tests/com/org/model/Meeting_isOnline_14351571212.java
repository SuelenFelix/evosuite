package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Meeting_isOnline_14351571212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28541;

    public Meeting_isOnline_14351571212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28542 = new Integer(-381739191);
        Integer term28624 = new Integer(-432438127);
        Integer term28626 = new Integer(44813544);
        Integer term28641 = new Integer(654539936);
        term28541 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term28544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28549 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28595 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28541, term28541.getClass(), "id", term28542);
        setIntField(term28545, term28545.getClass(), "year", 2017);
        setShortField(term28545, term28545.getClass(), "month", (short) 7);
        setShortField(term28545, term28545.getClass(), "day", (short) 24);
        setField(term28544, term28544.getClass(), "date", term28545);
        setByteField(term28549, term28549.getClass(), "hour", (byte) 3);
        setByteField(term28549, term28549.getClass(), "minute", (byte) 55);
        setByteField(term28549, term28549.getClass(), "second", (byte) 40);
        setIntField(term28549, term28549.getClass(), "nano", 397924395);
        setField(term28544, term28544.getClass(), "time", term28549);
        setField(term28541, term28541.getClass(), "createTime", term28544);
        setField(term28541, term28541.getClass(), "name", "ZdokwWCVab");
        setField(term28541, term28541.getClass(), "link", "kHaNkhgOjo");
        setField(term28541, term28541.getClass(), "introduce", "nWDCnQtxKC");
        setIntField(term28591, term28591.getClass(), "year", 2019);
        setShortField(term28591, term28591.getClass(), "month", (short) 1);
        setShortField(term28591, term28591.getClass(), "day", (short) 4);
        setField(term28590, term28590.getClass(), "date", term28591);
        setByteField(term28595, term28595.getClass(), "hour", (byte) 6);
        setByteField(term28595, term28595.getClass(), "minute", (byte) 53);
        setByteField(term28595, term28595.getClass(), "second", (byte) 23);
        setIntField(term28595, term28595.getClass(), "nano", 416630544);
        setField(term28590, term28590.getClass(), "time", term28595);
        setField(term28541, term28541.getClass(), "updateTime", term28590);
        setField(term28541, term28541.getClass(), "meetingTime", "uBqCFlJFKn");
        setField(term28541, term28541.getClass(), "signTime", "CdWGcgAUBN");
        setField(term28541, term28541.getClass(), "signNumber", term28624);
        setField(term28541, term28541.getClass(), "userNumber", term28626);
        setField(term28541, term28541.getClass(), "fileUrl", "yShXFHBMjq");
        setBooleanField(term28541, term28541.getClass(), "online", false);
        setField(term28541, term28541.getClass(), "deleted", term28641);
        setField(term28541, term28541.getClass(), "host", "PvSoEnEttM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOnline", argTypes, term28541, args);
    }

};


