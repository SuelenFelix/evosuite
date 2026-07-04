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

public class Meeting_setSignTime_188642403222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30491;

    public Meeting_setSignTime_188642403222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30492 = new Integer(1727889509);
        Integer term30574 = new Integer(-159961860);
        Integer term30576 = new Integer(-1656685141);
        Integer term30591 = new Integer(-1550347560);
        term30491 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term30494 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30495 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30499 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30545 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30491, term30491.getClass(), "id", term30492);
        setIntField(term30495, term30495.getClass(), "year", 2028);
        setShortField(term30495, term30495.getClass(), "month", (short) 10);
        setShortField(term30495, term30495.getClass(), "day", (short) 5);
        setField(term30494, term30494.getClass(), "date", term30495);
        setByteField(term30499, term30499.getClass(), "hour", (byte) 0);
        setByteField(term30499, term30499.getClass(), "minute", (byte) 53);
        setByteField(term30499, term30499.getClass(), "second", (byte) 18);
        setIntField(term30499, term30499.getClass(), "nano", 567999687);
        setField(term30494, term30494.getClass(), "time", term30499);
        setField(term30491, term30491.getClass(), "createTime", term30494);
        setField(term30491, term30491.getClass(), "name", "oZYHhFZGXx");
        setField(term30491, term30491.getClass(), "link", "DRDfOzZyDb");
        setField(term30491, term30491.getClass(), "introduce", "FMSzTGVPul");
        setIntField(term30541, term30541.getClass(), "year", 2029);
        setShortField(term30541, term30541.getClass(), "month", (short) 7);
        setShortField(term30541, term30541.getClass(), "day", (short) 30);
        setField(term30540, term30540.getClass(), "date", term30541);
        setByteField(term30545, term30545.getClass(), "hour", (byte) 23);
        setByteField(term30545, term30545.getClass(), "minute", (byte) 35);
        setByteField(term30545, term30545.getClass(), "second", (byte) 35);
        setIntField(term30545, term30545.getClass(), "nano", 848673909);
        setField(term30540, term30540.getClass(), "time", term30545);
        setField(term30491, term30491.getClass(), "updateTime", term30540);
        setField(term30491, term30491.getClass(), "meetingTime", "qSFkTIyPfh");
        setField(term30491, term30491.getClass(), "signTime", "tbYTpFYzqZ");
        setField(term30491, term30491.getClass(), "signNumber", term30574);
        setField(term30491, term30491.getClass(), "userNumber", term30576);
        setField(term30491, term30491.getClass(), "fileUrl", "BNLfzlakIC");
        setBooleanField(term30491, term30491.getClass(), "online", true);
        setField(term30491, term30491.getClass(), "deleted", term30591);
        setField(term30491, term30491.getClass(), "host", "nzqaGEtJND");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XXuiaNeQqM";
        callMethod(klass, "setSignTime", argTypes, term30491, args);
    }

};


