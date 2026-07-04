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

public class UserMeeting_getUmPower_1624727212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39966;

    public UserMeeting_getUmPower_1624727212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39967 = new Integer(1950167487);
        Integer term39969 = new Integer(1031826708);
        Integer term39981 = new Integer(-735726273);
        Integer term39983 = new Integer(1618278091);
        Integer term40005 = new Integer(-548967985);
        Integer term40017 = new Integer(-1923425156);
        term39966 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term39971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39976 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39990 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39995 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39996 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40000 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40012 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term39966, term39966.getClass(), "id", term39967);
        setField(term39966, term39966.getClass(), "umPower", term39969);
        setIntField(term39972, term39972.getClass(), "year", 2024);
        setShortField(term39972, term39972.getClass(), "month", (short) 7);
        setShortField(term39972, term39972.getClass(), "day", (short) 3);
        setField(term39971, term39971.getClass(), "date", term39972);
        setByteField(term39976, term39976.getClass(), "hour", (byte) 8);
        setByteField(term39976, term39976.getClass(), "minute", (byte) 6);
        setByteField(term39976, term39976.getClass(), "second", (byte) 33);
        setIntField(term39976, term39976.getClass(), "nano", 210450276);
        setField(term39971, term39971.getClass(), "time", term39976);
        setField(term39966, term39966.getClass(), "createTime", term39971);
        setField(term39966, term39966.getClass(), "userId", term39981);
        setField(term39966, term39966.getClass(), "meetingId", term39983);
        setIntField(term39986, term39986.getClass(), "year", 2028);
        setShortField(term39986, term39986.getClass(), "month", (short) 4);
        setShortField(term39986, term39986.getClass(), "day", (short) 5);
        setField(term39985, term39985.getClass(), "date", term39986);
        setByteField(term39990, term39990.getClass(), "hour", (byte) 14);
        setByteField(term39990, term39990.getClass(), "minute", (byte) 57);
        setByteField(term39990, term39990.getClass(), "second", (byte) 16);
        setIntField(term39990, term39990.getClass(), "nano", 963050998);
        setField(term39985, term39985.getClass(), "time", term39990);
        setField(term39966, term39966.getClass(), "updateTime", term39985);
        setIntField(term39996, term39996.getClass(), "year", 2027);
        setShortField(term39996, term39996.getClass(), "month", (short) 12);
        setShortField(term39996, term39996.getClass(), "day", (short) 25);
        setField(term39995, term39995.getClass(), "date", term39996);
        setByteField(term40000, term40000.getClass(), "hour", (byte) 19);
        setByteField(term40000, term40000.getClass(), "minute", (byte) 4);
        setByteField(term40000, term40000.getClass(), "second", (byte) 19);
        setIntField(term40000, term40000.getClass(), "nano", 237686859);
        setField(term39995, term39995.getClass(), "time", term40000);
        setField(term39966, term39966.getClass(), "startTime", term39995);
        setField(term39966, term39966.getClass(), "state", term40005);
        setIntField(term40008, term40008.getClass(), "year", 2025);
        setShortField(term40008, term40008.getClass(), "month", (short) 2);
        setShortField(term40008, term40008.getClass(), "day", (short) 11);
        setField(term40007, term40007.getClass(), "date", term40008);
        setByteField(term40012, term40012.getClass(), "hour", (byte) 22);
        setByteField(term40012, term40012.getClass(), "minute", (byte) 56);
        setByteField(term40012, term40012.getClass(), "second", (byte) 10);
        setIntField(term40012, term40012.getClass(), "nano", 94699593);
        setField(term40007, term40007.getClass(), "time", term40012);
        setField(term39966, term39966.getClass(), "endTime", term40007);
        setField(term39966, term39966.getClass(), "deleted", term40017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUmPower", argTypes, term39966, args);
    }

};


