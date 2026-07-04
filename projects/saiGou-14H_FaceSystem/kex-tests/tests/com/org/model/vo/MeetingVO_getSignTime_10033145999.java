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

public class MeetingVO_getSignTime_10033145999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8425;

    public MeetingVO_getSignTime_10033145999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8426 = new Integer(1137624258);
        Integer term8464 = new Integer(977862393);
        Integer term8524 = new Integer(301401782);
        Integer term8536 = new Integer(1988605357);
        Integer term8538 = new Integer(808203320);
        term8425 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term8466 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8467 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8471 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8526 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8527 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8531 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8425, term8425.getClass(), "id", term8426);
        setField(term8425, term8425.getClass(), "name", "riXARUiigm");
        setField(term8425, term8425.getClass(), "host", "RbXhBDZbRT");
        setField(term8425, term8425.getClass(), "roomName", "QDaTqkWnGj");
        setField(term8425, term8425.getClass(), "online", term8464);
        setIntField(term8467, term8467.getClass(), "year", 2012);
        setShortField(term8467, term8467.getClass(), "month", (short) 8);
        setShortField(term8467, term8467.getClass(), "day", (short) 25);
        setField(term8466, term8466.getClass(), "date", term8467);
        setByteField(term8471, term8471.getClass(), "hour", (byte) 19);
        setByteField(term8471, term8471.getClass(), "minute", (byte) 49);
        setByteField(term8471, term8471.getClass(), "second", (byte) 8);
        setIntField(term8471, term8471.getClass(), "nano", 912685024);
        setField(term8466, term8466.getClass(), "time", term8471);
        setField(term8425, term8425.getClass(), "createTime", term8466);
        setField(term8425, term8425.getClass(), "link", "vNObzQvzxo");
        setField(term8425, term8425.getClass(), "meetingTime", "uyuWzXeJvn");
        setField(term8425, term8425.getClass(), "signTime", "jvQHxWAYDO");
        setField(term8425, term8425.getClass(), "introduce", "mntnLPfhte");
        setField(term8425, term8425.getClass(), "state", term8524);
        setIntField(term8527, term8527.getClass(), "year", 2012);
        setShortField(term8527, term8527.getClass(), "month", (short) 3);
        setShortField(term8527, term8527.getClass(), "day", (short) 27);
        setField(term8526, term8526.getClass(), "date", term8527);
        setByteField(term8531, term8531.getClass(), "hour", (byte) 17);
        setByteField(term8531, term8531.getClass(), "minute", (byte) 49);
        setByteField(term8531, term8531.getClass(), "second", (byte) 24);
        setIntField(term8531, term8531.getClass(), "nano", 530647398);
        setField(term8526, term8526.getClass(), "time", term8531);
        setField(term8425, term8425.getClass(), "updateTime", term8526);
        setField(term8425, term8425.getClass(), "userNumber", term8536);
        setField(term8425, term8425.getClass(), "signNumber", term8538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSignTime", argTypes, term8425, args);
    }

};


