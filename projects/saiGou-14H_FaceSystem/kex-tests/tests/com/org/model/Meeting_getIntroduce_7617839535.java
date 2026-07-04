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

public class Meeting_getIntroduce_7617839535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27253;

    public Meeting_getIntroduce_7617839535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27254 = new Integer(-678946365);
        Integer term27336 = new Integer(2121147631);
        Integer term27338 = new Integer(878122723);
        Integer term27353 = new Integer(1612267814);
        term27253 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term27256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27261 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27307 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27253, term27253.getClass(), "id", term27254);
        setIntField(term27257, term27257.getClass(), "year", 2011);
        setShortField(term27257, term27257.getClass(), "month", (short) 4);
        setShortField(term27257, term27257.getClass(), "day", (short) 30);
        setField(term27256, term27256.getClass(), "date", term27257);
        setByteField(term27261, term27261.getClass(), "hour", (byte) 5);
        setByteField(term27261, term27261.getClass(), "minute", (byte) 2);
        setByteField(term27261, term27261.getClass(), "second", (byte) 59);
        setIntField(term27261, term27261.getClass(), "nano", 800923694);
        setField(term27256, term27256.getClass(), "time", term27261);
        setField(term27253, term27253.getClass(), "createTime", term27256);
        setField(term27253, term27253.getClass(), "name", "ZTEEpjBRFm");
        setField(term27253, term27253.getClass(), "link", "eGQdWVhZFd");
        setField(term27253, term27253.getClass(), "introduce", "rJCWXHswOA");
        setIntField(term27303, term27303.getClass(), "year", 2027);
        setShortField(term27303, term27303.getClass(), "month", (short) 5);
        setShortField(term27303, term27303.getClass(), "day", (short) 8);
        setField(term27302, term27302.getClass(), "date", term27303);
        setByteField(term27307, term27307.getClass(), "hour", (byte) 4);
        setByteField(term27307, term27307.getClass(), "minute", (byte) 0);
        setByteField(term27307, term27307.getClass(), "second", (byte) 19);
        setIntField(term27307, term27307.getClass(), "nano", 400713347);
        setField(term27302, term27302.getClass(), "time", term27307);
        setField(term27253, term27253.getClass(), "updateTime", term27302);
        setField(term27253, term27253.getClass(), "meetingTime", "wCsHrkJTEg");
        setField(term27253, term27253.getClass(), "signTime", "iAhGpxznud");
        setField(term27253, term27253.getClass(), "signNumber", term27336);
        setField(term27253, term27253.getClass(), "userNumber", term27338);
        setField(term27253, term27253.getClass(), "fileUrl", "oIZYdVpStA");
        setBooleanField(term27253, term27253.getClass(), "online", false);
        setField(term27253, term27253.getClass(), "deleted", term27353);
        setField(term27253, term27253.getClass(), "host", "WOBYQpSKJt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntroduce", argTypes, term27253, args);
    }

};


