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

public class UserMeeting_getStartTime_15133635927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40231;

    public UserMeeting_getStartTime_15133635927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40232 = new Integer(1628668899);
        Integer term40234 = new Integer(-998305335);
        Integer term40246 = new Integer(2120008602);
        Integer term40248 = new Integer(1085966764);
        Integer term40270 = new Integer(-609882960);
        Integer term40282 = new Integer(-1690283734);
        term40231 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40241 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40255 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40265 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40277 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40231, term40231.getClass(), "id", term40232);
        setField(term40231, term40231.getClass(), "umPower", term40234);
        setIntField(term40237, term40237.getClass(), "year", 2020);
        setShortField(term40237, term40237.getClass(), "month", (short) 4);
        setShortField(term40237, term40237.getClass(), "day", (short) 29);
        setField(term40236, term40236.getClass(), "date", term40237);
        setByteField(term40241, term40241.getClass(), "hour", (byte) 2);
        setByteField(term40241, term40241.getClass(), "minute", (byte) 54);
        setByteField(term40241, term40241.getClass(), "second", (byte) 2);
        setIntField(term40241, term40241.getClass(), "nano", 314066531);
        setField(term40236, term40236.getClass(), "time", term40241);
        setField(term40231, term40231.getClass(), "createTime", term40236);
        setField(term40231, term40231.getClass(), "userId", term40246);
        setField(term40231, term40231.getClass(), "meetingId", term40248);
        setIntField(term40251, term40251.getClass(), "year", 2010);
        setShortField(term40251, term40251.getClass(), "month", (short) 2);
        setShortField(term40251, term40251.getClass(), "day", (short) 11);
        setField(term40250, term40250.getClass(), "date", term40251);
        setByteField(term40255, term40255.getClass(), "hour", (byte) 12);
        setByteField(term40255, term40255.getClass(), "minute", (byte) 49);
        setByteField(term40255, term40255.getClass(), "second", (byte) 35);
        setIntField(term40255, term40255.getClass(), "nano", 685384504);
        setField(term40250, term40250.getClass(), "time", term40255);
        setField(term40231, term40231.getClass(), "updateTime", term40250);
        setIntField(term40261, term40261.getClass(), "year", 2024);
        setShortField(term40261, term40261.getClass(), "month", (short) 8);
        setShortField(term40261, term40261.getClass(), "day", (short) 7);
        setField(term40260, term40260.getClass(), "date", term40261);
        setByteField(term40265, term40265.getClass(), "hour", (byte) 8);
        setByteField(term40265, term40265.getClass(), "minute", (byte) 41);
        setByteField(term40265, term40265.getClass(), "second", (byte) 36);
        setIntField(term40265, term40265.getClass(), "nano", 84091386);
        setField(term40260, term40260.getClass(), "time", term40265);
        setField(term40231, term40231.getClass(), "startTime", term40260);
        setField(term40231, term40231.getClass(), "state", term40270);
        setIntField(term40273, term40273.getClass(), "year", 2025);
        setShortField(term40273, term40273.getClass(), "month", (short) 2);
        setShortField(term40273, term40273.getClass(), "day", (short) 6);
        setField(term40272, term40272.getClass(), "date", term40273);
        setByteField(term40277, term40277.getClass(), "hour", (byte) 14);
        setByteField(term40277, term40277.getClass(), "minute", (byte) 28);
        setByteField(term40277, term40277.getClass(), "second", (byte) 25);
        setIntField(term40277, term40277.getClass(), "nano", 103816032);
        setField(term40272, term40272.getClass(), "time", term40277);
        setField(term40231, term40231.getClass(), "endTime", term40272);
        setField(term40231, term40231.getClass(), "deleted", term40282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term40231, args);
    }

};


