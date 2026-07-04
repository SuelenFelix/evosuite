package com.org.model.excel;

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
import static com.org.model.excel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingMessage_hashCode_9660101854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364;

    public MeetingMessage_hashCode_9660101854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term401 = new Integer(-1955890973);
        Integer term403 = new Integer(-2038273078);
        term364 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term405 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term406 = newInstance(Class.forName("java.time.LocalDate"));
        Object term410 = newInstance(Class.forName("java.time.LocalTime"));
        Object term415 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term416 = newInstance(Class.forName("java.time.LocalDate"));
        Object term420 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term364, term364.getClass(), "username", "LQFpaHEwXR");
        setField(term364, term364.getClass(), "nickname", "oVcInYnLWB");
        setField(term364, term364.getClass(), "sex", "aJlieCFVtF");
        setField(term364, term364.getClass(), "umPower", term401);
        setField(term364, term364.getClass(), "state", term403);
        setIntField(term406, term406.getClass(), "year", 2025);
        setShortField(term406, term406.getClass(), "month", (short) 4);
        setShortField(term406, term406.getClass(), "day", (short) 24);
        setField(term405, term405.getClass(), "date", term406);
        setByteField(term410, term410.getClass(), "hour", (byte) 18);
        setByteField(term410, term410.getClass(), "minute", (byte) 11);
        setByteField(term410, term410.getClass(), "second", (byte) 40);
        setIntField(term410, term410.getClass(), "nano", 137454929);
        setField(term405, term405.getClass(), "time", term410);
        setField(term364, term364.getClass(), "startTime", term405);
        setIntField(term416, term416.getClass(), "year", 2024);
        setShortField(term416, term416.getClass(), "month", (short) 1);
        setShortField(term416, term416.getClass(), "day", (short) 24);
        setField(term415, term415.getClass(), "date", term416);
        setByteField(term420, term420.getClass(), "hour", (byte) 20);
        setByteField(term420, term420.getClass(), "minute", (byte) 28);
        setByteField(term420, term420.getClass(), "second", (byte) 39);
        setIntField(term420, term420.getClass(), "nano", 952728177);
        setField(term415, term415.getClass(), "time", term420);
        setField(term364, term364.getClass(), "endTime", term415);
        setField(term364, term364.getClass(), "allTime", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term364, args);
    }

};


