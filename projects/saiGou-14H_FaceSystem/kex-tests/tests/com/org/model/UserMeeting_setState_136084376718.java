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

public class UserMeeting_setState_136084376718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40852;
     Object term40905;

    public UserMeeting_setState_136084376718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40853 = new Integer(1145540785);
        Integer term40855 = new Integer(-1255440898);
        Integer term40867 = new Integer(-1185096329);
        Integer term40869 = new Integer(-2051822073);
        Integer term40891 = new Integer(-838891056);
        Integer term40903 = new Integer(-2133180225);
        term40852 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40862 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40886 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40898 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40852, term40852.getClass(), "id", term40853);
        setField(term40852, term40852.getClass(), "umPower", term40855);
        setIntField(term40858, term40858.getClass(), "year", 2021);
        setShortField(term40858, term40858.getClass(), "month", (short) 3);
        setShortField(term40858, term40858.getClass(), "day", (short) 14);
        setField(term40857, term40857.getClass(), "date", term40858);
        setByteField(term40862, term40862.getClass(), "hour", (byte) 19);
        setByteField(term40862, term40862.getClass(), "minute", (byte) 26);
        setByteField(term40862, term40862.getClass(), "second", (byte) 19);
        setIntField(term40862, term40862.getClass(), "nano", 18560091);
        setField(term40857, term40857.getClass(), "time", term40862);
        setField(term40852, term40852.getClass(), "createTime", term40857);
        setField(term40852, term40852.getClass(), "userId", term40867);
        setField(term40852, term40852.getClass(), "meetingId", term40869);
        setIntField(term40872, term40872.getClass(), "year", 2022);
        setShortField(term40872, term40872.getClass(), "month", (short) 7);
        setShortField(term40872, term40872.getClass(), "day", (short) 30);
        setField(term40871, term40871.getClass(), "date", term40872);
        setByteField(term40876, term40876.getClass(), "hour", (byte) 14);
        setByteField(term40876, term40876.getClass(), "minute", (byte) 34);
        setByteField(term40876, term40876.getClass(), "second", (byte) 38);
        setIntField(term40876, term40876.getClass(), "nano", 597227850);
        setField(term40871, term40871.getClass(), "time", term40876);
        setField(term40852, term40852.getClass(), "updateTime", term40871);
        setIntField(term40882, term40882.getClass(), "year", 2012);
        setShortField(term40882, term40882.getClass(), "month", (short) 10);
        setShortField(term40882, term40882.getClass(), "day", (short) 1);
        setField(term40881, term40881.getClass(), "date", term40882);
        setByteField(term40886, term40886.getClass(), "hour", (byte) 19);
        setByteField(term40886, term40886.getClass(), "minute", (byte) 43);
        setByteField(term40886, term40886.getClass(), "second", (byte) 49);
        setIntField(term40886, term40886.getClass(), "nano", 81513180);
        setField(term40881, term40881.getClass(), "time", term40886);
        setField(term40852, term40852.getClass(), "startTime", term40881);
        setField(term40852, term40852.getClass(), "state", term40891);
        setIntField(term40894, term40894.getClass(), "year", 2028);
        setShortField(term40894, term40894.getClass(), "month", (short) 2);
        setShortField(term40894, term40894.getClass(), "day", (short) 2);
        setField(term40893, term40893.getClass(), "date", term40894);
        setByteField(term40898, term40898.getClass(), "hour", (byte) 17);
        setByteField(term40898, term40898.getClass(), "minute", (byte) 55);
        setByteField(term40898, term40898.getClass(), "second", (byte) 40);
        setIntField(term40898, term40898.getClass(), "nano", 907692691);
        setField(term40893, term40893.getClass(), "time", term40898);
        setField(term40852, term40852.getClass(), "endTime", term40893);
        setField(term40852, term40852.getClass(), "deleted", term40903);
        term40905 = new Integer(-1486915040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term40905;
        callMethod(klass, "setState", argTypes, term40852, args);
    }

};


