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

public class MeetingMessage_getAllTime_62049845713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1381;

    public MeetingMessage_getAllTime_62049845713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1418 = new Integer(-1007160944);
        Integer term1420 = new Integer(1135664017);
        term1381 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term1422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1427 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1437 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1381, term1381.getClass(), "username", "jDtqGUpnZN");
        setField(term1381, term1381.getClass(), "nickname", "nGKItKLYNC");
        setField(term1381, term1381.getClass(), "sex", "UiUYnPrcCi");
        setField(term1381, term1381.getClass(), "umPower", term1418);
        setField(term1381, term1381.getClass(), "state", term1420);
        setIntField(term1423, term1423.getClass(), "year", 2025);
        setShortField(term1423, term1423.getClass(), "month", (short) 3);
        setShortField(term1423, term1423.getClass(), "day", (short) 9);
        setField(term1422, term1422.getClass(), "date", term1423);
        setByteField(term1427, term1427.getClass(), "hour", (byte) 5);
        setByteField(term1427, term1427.getClass(), "minute", (byte) 49);
        setByteField(term1427, term1427.getClass(), "second", (byte) 12);
        setIntField(term1427, term1427.getClass(), "nano", 791695028);
        setField(term1422, term1422.getClass(), "time", term1427);
        setField(term1381, term1381.getClass(), "startTime", term1422);
        setIntField(term1433, term1433.getClass(), "year", 2023);
        setShortField(term1433, term1433.getClass(), "month", (short) 9);
        setShortField(term1433, term1433.getClass(), "day", (short) 23);
        setField(term1432, term1432.getClass(), "date", term1433);
        setByteField(term1437, term1437.getClass(), "hour", (byte) 12);
        setByteField(term1437, term1437.getClass(), "minute", (byte) 55);
        setByteField(term1437, term1437.getClass(), "second", (byte) 58);
        setIntField(term1437, term1437.getClass(), "nano", 159178396);
        setField(term1432, term1432.getClass(), "time", term1437);
        setField(term1381, term1381.getClass(), "endTime", term1432);
        setField(term1381, term1381.getClass(), "allTime", "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllTime", argTypes, term1381, args);
    }

};


