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

public class Meeting_setUserNumber_125656282124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30883;
     Object term30997;

    public Meeting_setUserNumber_125656282124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30884 = new Integer(-1605443550);
        Integer term30966 = new Integer(-735690372);
        Integer term30968 = new Integer(110644904);
        Integer term30983 = new Integer(-1457905205);
        term30883 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term30886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30891 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30937 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30883, term30883.getClass(), "id", term30884);
        setIntField(term30887, term30887.getClass(), "year", 2029);
        setShortField(term30887, term30887.getClass(), "month", (short) 11);
        setShortField(term30887, term30887.getClass(), "day", (short) 25);
        setField(term30886, term30886.getClass(), "date", term30887);
        setByteField(term30891, term30891.getClass(), "hour", (byte) 14);
        setByteField(term30891, term30891.getClass(), "minute", (byte) 49);
        setByteField(term30891, term30891.getClass(), "second", (byte) 17);
        setIntField(term30891, term30891.getClass(), "nano", 699722589);
        setField(term30886, term30886.getClass(), "time", term30891);
        setField(term30883, term30883.getClass(), "createTime", term30886);
        setField(term30883, term30883.getClass(), "name", "shcEVehnSj");
        setField(term30883, term30883.getClass(), "link", "ruwmVFHYcN");
        setField(term30883, term30883.getClass(), "introduce", "PwcPMvUxXL");
        setIntField(term30933, term30933.getClass(), "year", 2026);
        setShortField(term30933, term30933.getClass(), "month", (short) 10);
        setShortField(term30933, term30933.getClass(), "day", (short) 4);
        setField(term30932, term30932.getClass(), "date", term30933);
        setByteField(term30937, term30937.getClass(), "hour", (byte) 6);
        setByteField(term30937, term30937.getClass(), "minute", (byte) 41);
        setByteField(term30937, term30937.getClass(), "second", (byte) 50);
        setIntField(term30937, term30937.getClass(), "nano", 414376807);
        setField(term30932, term30932.getClass(), "time", term30937);
        setField(term30883, term30883.getClass(), "updateTime", term30932);
        setField(term30883, term30883.getClass(), "meetingTime", "fPUCoTSiln");
        setField(term30883, term30883.getClass(), "signTime", "KeYmAATqmS");
        setField(term30883, term30883.getClass(), "signNumber", term30966);
        setField(term30883, term30883.getClass(), "userNumber", term30968);
        setField(term30883, term30883.getClass(), "fileUrl", "aVDrDdxPOi");
        setBooleanField(term30883, term30883.getClass(), "online", true);
        setField(term30883, term30883.getClass(), "deleted", term30983);
        setField(term30883, term30883.getClass(), "host", "oITjUIRshR");
        term30997 = new Integer(1722454323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term30997;
        callMethod(klass, "setUserNumber", argTypes, term30883, args);
    }

};


