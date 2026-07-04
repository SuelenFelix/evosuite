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

public class UserMeeting_setEndTime_128763004119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40907;
     Object term40960;

    public UserMeeting_setEndTime_128763004119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40908 = new Integer(-1960290626);
        Integer term40910 = new Integer(-1941903722);
        Integer term40922 = new Integer(491009356);
        Integer term40924 = new Integer(1180952236);
        Integer term40946 = new Integer(1549827025);
        Integer term40958 = new Integer(523998499);
        term40907 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40931 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40941 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40953 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40907, term40907.getClass(), "id", term40908);
        setField(term40907, term40907.getClass(), "umPower", term40910);
        setIntField(term40913, term40913.getClass(), "year", 2015);
        setShortField(term40913, term40913.getClass(), "month", (short) 4);
        setShortField(term40913, term40913.getClass(), "day", (short) 6);
        setField(term40912, term40912.getClass(), "date", term40913);
        setByteField(term40917, term40917.getClass(), "hour", (byte) 6);
        setByteField(term40917, term40917.getClass(), "minute", (byte) 39);
        setByteField(term40917, term40917.getClass(), "second", (byte) 45);
        setIntField(term40917, term40917.getClass(), "nano", 97858819);
        setField(term40912, term40912.getClass(), "time", term40917);
        setField(term40907, term40907.getClass(), "createTime", term40912);
        setField(term40907, term40907.getClass(), "userId", term40922);
        setField(term40907, term40907.getClass(), "meetingId", term40924);
        setIntField(term40927, term40927.getClass(), "year", 2019);
        setShortField(term40927, term40927.getClass(), "month", (short) 3);
        setShortField(term40927, term40927.getClass(), "day", (short) 3);
        setField(term40926, term40926.getClass(), "date", term40927);
        setByteField(term40931, term40931.getClass(), "hour", (byte) 2);
        setByteField(term40931, term40931.getClass(), "minute", (byte) 9);
        setByteField(term40931, term40931.getClass(), "second", (byte) 44);
        setIntField(term40931, term40931.getClass(), "nano", 690452555);
        setField(term40926, term40926.getClass(), "time", term40931);
        setField(term40907, term40907.getClass(), "updateTime", term40926);
        setIntField(term40937, term40937.getClass(), "year", 2013);
        setShortField(term40937, term40937.getClass(), "month", (short) 9);
        setShortField(term40937, term40937.getClass(), "day", (short) 18);
        setField(term40936, term40936.getClass(), "date", term40937);
        setByteField(term40941, term40941.getClass(), "hour", (byte) 0);
        setByteField(term40941, term40941.getClass(), "minute", (byte) 40);
        setByteField(term40941, term40941.getClass(), "second", (byte) 5);
        setIntField(term40941, term40941.getClass(), "nano", 735661180);
        setField(term40936, term40936.getClass(), "time", term40941);
        setField(term40907, term40907.getClass(), "startTime", term40936);
        setField(term40907, term40907.getClass(), "state", term40946);
        setIntField(term40949, term40949.getClass(), "year", 2024);
        setShortField(term40949, term40949.getClass(), "month", (short) 4);
        setShortField(term40949, term40949.getClass(), "day", (short) 18);
        setField(term40948, term40948.getClass(), "date", term40949);
        setByteField(term40953, term40953.getClass(), "hour", (byte) 16);
        setByteField(term40953, term40953.getClass(), "minute", (byte) 24);
        setByteField(term40953, term40953.getClass(), "second", (byte) 38);
        setIntField(term40953, term40953.getClass(), "nano", 339757581);
        setField(term40948, term40948.getClass(), "time", term40953);
        setField(term40907, term40907.getClass(), "endTime", term40948);
        setField(term40907, term40907.getClass(), "deleted", term40958);
        term40960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40965 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term40961, term40961.getClass(), "year", 2013);
        setShortField(term40961, term40961.getClass(), "month", (short) 3);
        setShortField(term40961, term40961.getClass(), "day", (short) 23);
        setField(term40960, term40960.getClass(), "date", term40961);
        setByteField(term40965, term40965.getClass(), "hour", (byte) 11);
        setByteField(term40965, term40965.getClass(), "minute", (byte) 19);
        setByteField(term40965, term40965.getClass(), "second", (byte) 49);
        setIntField(term40965, term40965.getClass(), "nano", 671462460);
        setField(term40960, term40960.getClass(), "time", term40965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term40960;
        callMethod(klass, "setEndTime", argTypes, term40907, args);
    }

};


