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

public class UserMeeting_getUserId_4125214284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40072;

    public UserMeeting_getUserId_4125214284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40073 = new Integer(-2070149565);
        Integer term40075 = new Integer(1682543276);
        Integer term40087 = new Integer(156914536);
        Integer term40089 = new Integer(-1745894636);
        Integer term40111 = new Integer(571282234);
        Integer term40123 = new Integer(1131350330);
        term40072 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40082 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40118 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40072, term40072.getClass(), "id", term40073);
        setField(term40072, term40072.getClass(), "umPower", term40075);
        setIntField(term40078, term40078.getClass(), "year", 2014);
        setShortField(term40078, term40078.getClass(), "month", (short) 7);
        setShortField(term40078, term40078.getClass(), "day", (short) 24);
        setField(term40077, term40077.getClass(), "date", term40078);
        setByteField(term40082, term40082.getClass(), "hour", (byte) 5);
        setByteField(term40082, term40082.getClass(), "minute", (byte) 31);
        setByteField(term40082, term40082.getClass(), "second", (byte) 45);
        setIntField(term40082, term40082.getClass(), "nano", 932508724);
        setField(term40077, term40077.getClass(), "time", term40082);
        setField(term40072, term40072.getClass(), "createTime", term40077);
        setField(term40072, term40072.getClass(), "userId", term40087);
        setField(term40072, term40072.getClass(), "meetingId", term40089);
        setIntField(term40092, term40092.getClass(), "year", 2022);
        setShortField(term40092, term40092.getClass(), "month", (short) 9);
        setShortField(term40092, term40092.getClass(), "day", (short) 29);
        setField(term40091, term40091.getClass(), "date", term40092);
        setByteField(term40096, term40096.getClass(), "hour", (byte) 15);
        setByteField(term40096, term40096.getClass(), "minute", (byte) 41);
        setByteField(term40096, term40096.getClass(), "second", (byte) 55);
        setIntField(term40096, term40096.getClass(), "nano", 811723850);
        setField(term40091, term40091.getClass(), "time", term40096);
        setField(term40072, term40072.getClass(), "updateTime", term40091);
        setIntField(term40102, term40102.getClass(), "year", 2017);
        setShortField(term40102, term40102.getClass(), "month", (short) 3);
        setShortField(term40102, term40102.getClass(), "day", (short) 7);
        setField(term40101, term40101.getClass(), "date", term40102);
        setByteField(term40106, term40106.getClass(), "hour", (byte) 17);
        setByteField(term40106, term40106.getClass(), "minute", (byte) 3);
        setByteField(term40106, term40106.getClass(), "second", (byte) 1);
        setIntField(term40106, term40106.getClass(), "nano", 107604440);
        setField(term40101, term40101.getClass(), "time", term40106);
        setField(term40072, term40072.getClass(), "startTime", term40101);
        setField(term40072, term40072.getClass(), "state", term40111);
        setIntField(term40114, term40114.getClass(), "year", 2010);
        setShortField(term40114, term40114.getClass(), "month", (short) 4);
        setShortField(term40114, term40114.getClass(), "day", (short) 22);
        setField(term40113, term40113.getClass(), "date", term40114);
        setByteField(term40118, term40118.getClass(), "hour", (byte) 16);
        setByteField(term40118, term40118.getClass(), "minute", (byte) 6);
        setByteField(term40118, term40118.getClass(), "second", (byte) 12);
        setIntField(term40118, term40118.getClass(), "nano", 46820039);
        setField(term40113, term40113.getClass(), "time", term40118);
        setField(term40072, term40072.getClass(), "endTime", term40113);
        setField(term40072, term40072.getClass(), "deleted", term40123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term40072, args);
    }

};


