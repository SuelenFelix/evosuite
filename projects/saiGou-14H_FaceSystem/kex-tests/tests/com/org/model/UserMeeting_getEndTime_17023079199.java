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

public class UserMeeting_getEndTime_17023079199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40337;

    public UserMeeting_getEndTime_17023079199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40338 = new Integer(-2087065864);
        Integer term40340 = new Integer(-169812741);
        Integer term40352 = new Integer(-1015119737);
        Integer term40354 = new Integer(1479117665);
        Integer term40376 = new Integer(766065097);
        Integer term40388 = new Integer(1703658250);
        term40337 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40342 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40343 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40347 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40361 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40366 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40367 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40371 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40378 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40379 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40383 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40337, term40337.getClass(), "id", term40338);
        setField(term40337, term40337.getClass(), "umPower", term40340);
        setIntField(term40343, term40343.getClass(), "year", 2024);
        setShortField(term40343, term40343.getClass(), "month", (short) 9);
        setShortField(term40343, term40343.getClass(), "day", (short) 7);
        setField(term40342, term40342.getClass(), "date", term40343);
        setByteField(term40347, term40347.getClass(), "hour", (byte) 10);
        setByteField(term40347, term40347.getClass(), "minute", (byte) 12);
        setByteField(term40347, term40347.getClass(), "second", (byte) 46);
        setIntField(term40347, term40347.getClass(), "nano", 856869732);
        setField(term40342, term40342.getClass(), "time", term40347);
        setField(term40337, term40337.getClass(), "createTime", term40342);
        setField(term40337, term40337.getClass(), "userId", term40352);
        setField(term40337, term40337.getClass(), "meetingId", term40354);
        setIntField(term40357, term40357.getClass(), "year", 2023);
        setShortField(term40357, term40357.getClass(), "month", (short) 5);
        setShortField(term40357, term40357.getClass(), "day", (short) 31);
        setField(term40356, term40356.getClass(), "date", term40357);
        setByteField(term40361, term40361.getClass(), "hour", (byte) 3);
        setByteField(term40361, term40361.getClass(), "minute", (byte) 15);
        setByteField(term40361, term40361.getClass(), "second", (byte) 34);
        setIntField(term40361, term40361.getClass(), "nano", 794699238);
        setField(term40356, term40356.getClass(), "time", term40361);
        setField(term40337, term40337.getClass(), "updateTime", term40356);
        setIntField(term40367, term40367.getClass(), "year", 2013);
        setShortField(term40367, term40367.getClass(), "month", (short) 10);
        setShortField(term40367, term40367.getClass(), "day", (short) 1);
        setField(term40366, term40366.getClass(), "date", term40367);
        setByteField(term40371, term40371.getClass(), "hour", (byte) 21);
        setByteField(term40371, term40371.getClass(), "minute", (byte) 9);
        setByteField(term40371, term40371.getClass(), "second", (byte) 5);
        setIntField(term40371, term40371.getClass(), "nano", 986326309);
        setField(term40366, term40366.getClass(), "time", term40371);
        setField(term40337, term40337.getClass(), "startTime", term40366);
        setField(term40337, term40337.getClass(), "state", term40376);
        setIntField(term40379, term40379.getClass(), "year", 2025);
        setShortField(term40379, term40379.getClass(), "month", (short) 5);
        setShortField(term40379, term40379.getClass(), "day", (short) 29);
        setField(term40378, term40378.getClass(), "date", term40379);
        setByteField(term40383, term40383.getClass(), "hour", (byte) 14);
        setByteField(term40383, term40383.getClass(), "minute", (byte) 31);
        setByteField(term40383, term40383.getClass(), "second", (byte) 17);
        setIntField(term40383, term40383.getClass(), "nano", 808113660);
        setField(term40378, term40378.getClass(), "time", term40383);
        setField(term40337, term40337.getClass(), "endTime", term40378);
        setField(term40337, term40337.getClass(), "deleted", term40388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndTime", argTypes, term40337, args);
    }

};


