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

public class UserMeeting_getId_14740202471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39913;

    public UserMeeting_getId_14740202471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39914 = new Integer(1274665398);
        Integer term39916 = new Integer(-1093564935);
        Integer term39928 = new Integer(-1092739931);
        Integer term39930 = new Integer(859336834);
        Integer term39952 = new Integer(-924154861);
        Integer term39964 = new Integer(-1878694006);
        term39913 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term39918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39923 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39947 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39959 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term39913, term39913.getClass(), "id", term39914);
        setField(term39913, term39913.getClass(), "umPower", term39916);
        setIntField(term39919, term39919.getClass(), "year", 2015);
        setShortField(term39919, term39919.getClass(), "month", (short) 1);
        setShortField(term39919, term39919.getClass(), "day", (short) 20);
        setField(term39918, term39918.getClass(), "date", term39919);
        setByteField(term39923, term39923.getClass(), "hour", (byte) 6);
        setByteField(term39923, term39923.getClass(), "minute", (byte) 8);
        setByteField(term39923, term39923.getClass(), "second", (byte) 2);
        setIntField(term39923, term39923.getClass(), "nano", 595295831);
        setField(term39918, term39918.getClass(), "time", term39923);
        setField(term39913, term39913.getClass(), "createTime", term39918);
        setField(term39913, term39913.getClass(), "userId", term39928);
        setField(term39913, term39913.getClass(), "meetingId", term39930);
        setIntField(term39933, term39933.getClass(), "year", 2020);
        setShortField(term39933, term39933.getClass(), "month", (short) 12);
        setShortField(term39933, term39933.getClass(), "day", (short) 3);
        setField(term39932, term39932.getClass(), "date", term39933);
        setByteField(term39937, term39937.getClass(), "hour", (byte) 21);
        setByteField(term39937, term39937.getClass(), "minute", (byte) 9);
        setByteField(term39937, term39937.getClass(), "second", (byte) 18);
        setIntField(term39937, term39937.getClass(), "nano", 913732377);
        setField(term39932, term39932.getClass(), "time", term39937);
        setField(term39913, term39913.getClass(), "updateTime", term39932);
        setIntField(term39943, term39943.getClass(), "year", 2018);
        setShortField(term39943, term39943.getClass(), "month", (short) 12);
        setShortField(term39943, term39943.getClass(), "day", (short) 2);
        setField(term39942, term39942.getClass(), "date", term39943);
        setByteField(term39947, term39947.getClass(), "hour", (byte) 15);
        setByteField(term39947, term39947.getClass(), "minute", (byte) 7);
        setByteField(term39947, term39947.getClass(), "second", (byte) 32);
        setIntField(term39947, term39947.getClass(), "nano", 109301383);
        setField(term39942, term39942.getClass(), "time", term39947);
        setField(term39913, term39913.getClass(), "startTime", term39942);
        setField(term39913, term39913.getClass(), "state", term39952);
        setIntField(term39955, term39955.getClass(), "year", 2017);
        setShortField(term39955, term39955.getClass(), "month", (short) 9);
        setShortField(term39955, term39955.getClass(), "day", (short) 8);
        setField(term39954, term39954.getClass(), "date", term39955);
        setByteField(term39959, term39959.getClass(), "hour", (byte) 6);
        setByteField(term39959, term39959.getClass(), "minute", (byte) 20);
        setByteField(term39959, term39959.getClass(), "second", (byte) 45);
        setIntField(term39959, term39959.getClass(), "nano", 768981890);
        setField(term39954, term39954.getClass(), "time", term39959);
        setField(term39913, term39913.getClass(), "endTime", term39954);
        setField(term39913, term39913.getClass(), "deleted", term39964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term39913, args);
    }

};


