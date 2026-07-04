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

public class UserMeeting_getCreateTime_1396110743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40019;

    public UserMeeting_getCreateTime_1396110743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40020 = new Integer(1237861885);
        Integer term40022 = new Integer(1433214025);
        Integer term40034 = new Integer(1424797105);
        Integer term40036 = new Integer(386281072);
        Integer term40058 = new Integer(-782180775);
        Integer term40070 = new Integer(-1971308334);
        term40019 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40029 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40038 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40039 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40043 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40053 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40060 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40061 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40065 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40019, term40019.getClass(), "id", term40020);
        setField(term40019, term40019.getClass(), "umPower", term40022);
        setIntField(term40025, term40025.getClass(), "year", 2023);
        setShortField(term40025, term40025.getClass(), "month", (short) 2);
        setShortField(term40025, term40025.getClass(), "day", (short) 6);
        setField(term40024, term40024.getClass(), "date", term40025);
        setByteField(term40029, term40029.getClass(), "hour", (byte) 13);
        setByteField(term40029, term40029.getClass(), "minute", (byte) 35);
        setByteField(term40029, term40029.getClass(), "second", (byte) 14);
        setIntField(term40029, term40029.getClass(), "nano", 917848995);
        setField(term40024, term40024.getClass(), "time", term40029);
        setField(term40019, term40019.getClass(), "createTime", term40024);
        setField(term40019, term40019.getClass(), "userId", term40034);
        setField(term40019, term40019.getClass(), "meetingId", term40036);
        setIntField(term40039, term40039.getClass(), "year", 2016);
        setShortField(term40039, term40039.getClass(), "month", (short) 5);
        setShortField(term40039, term40039.getClass(), "day", (short) 5);
        setField(term40038, term40038.getClass(), "date", term40039);
        setByteField(term40043, term40043.getClass(), "hour", (byte) 17);
        setByteField(term40043, term40043.getClass(), "minute", (byte) 12);
        setByteField(term40043, term40043.getClass(), "second", (byte) 48);
        setIntField(term40043, term40043.getClass(), "nano", 651546858);
        setField(term40038, term40038.getClass(), "time", term40043);
        setField(term40019, term40019.getClass(), "updateTime", term40038);
        setIntField(term40049, term40049.getClass(), "year", 2025);
        setShortField(term40049, term40049.getClass(), "month", (short) 1);
        setShortField(term40049, term40049.getClass(), "day", (short) 28);
        setField(term40048, term40048.getClass(), "date", term40049);
        setByteField(term40053, term40053.getClass(), "hour", (byte) 5);
        setByteField(term40053, term40053.getClass(), "minute", (byte) 55);
        setByteField(term40053, term40053.getClass(), "second", (byte) 9);
        setIntField(term40053, term40053.getClass(), "nano", 554633353);
        setField(term40048, term40048.getClass(), "time", term40053);
        setField(term40019, term40019.getClass(), "startTime", term40048);
        setField(term40019, term40019.getClass(), "state", term40058);
        setIntField(term40061, term40061.getClass(), "year", 2016);
        setShortField(term40061, term40061.getClass(), "month", (short) 4);
        setShortField(term40061, term40061.getClass(), "day", (short) 6);
        setField(term40060, term40060.getClass(), "date", term40061);
        setByteField(term40065, term40065.getClass(), "hour", (byte) 11);
        setByteField(term40065, term40065.getClass(), "minute", (byte) 33);
        setByteField(term40065, term40065.getClass(), "second", (byte) 12);
        setIntField(term40065, term40065.getClass(), "nano", 167392252);
        setField(term40060, term40060.getClass(), "time", term40065);
        setField(term40019, term40019.getClass(), "endTime", term40060);
        setField(term40019, term40019.getClass(), "deleted", term40070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term40019, args);
    }

};


