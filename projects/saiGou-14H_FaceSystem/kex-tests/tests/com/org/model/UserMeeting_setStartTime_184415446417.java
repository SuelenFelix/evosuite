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

public class UserMeeting_setStartTime_184415446417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40789;
     Object term40842;

    public UserMeeting_setStartTime_184415446417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40790 = new Integer(1056759659);
        Integer term40792 = new Integer(-233313895);
        Integer term40804 = new Integer(2014416586);
        Integer term40806 = new Integer(1614071253);
        Integer term40828 = new Integer(-548611489);
        Integer term40840 = new Integer(792588182);
        term40789 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40794 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40795 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40799 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40808 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40809 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40813 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40818 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40819 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40823 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40835 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40789, term40789.getClass(), "id", term40790);
        setField(term40789, term40789.getClass(), "umPower", term40792);
        setIntField(term40795, term40795.getClass(), "year", 2013);
        setShortField(term40795, term40795.getClass(), "month", (short) 5);
        setShortField(term40795, term40795.getClass(), "day", (short) 10);
        setField(term40794, term40794.getClass(), "date", term40795);
        setByteField(term40799, term40799.getClass(), "hour", (byte) 8);
        setByteField(term40799, term40799.getClass(), "minute", (byte) 51);
        setByteField(term40799, term40799.getClass(), "second", (byte) 38);
        setIntField(term40799, term40799.getClass(), "nano", 326978944);
        setField(term40794, term40794.getClass(), "time", term40799);
        setField(term40789, term40789.getClass(), "createTime", term40794);
        setField(term40789, term40789.getClass(), "userId", term40804);
        setField(term40789, term40789.getClass(), "meetingId", term40806);
        setIntField(term40809, term40809.getClass(), "year", 2028);
        setShortField(term40809, term40809.getClass(), "month", (short) 12);
        setShortField(term40809, term40809.getClass(), "day", (short) 5);
        setField(term40808, term40808.getClass(), "date", term40809);
        setByteField(term40813, term40813.getClass(), "hour", (byte) 0);
        setByteField(term40813, term40813.getClass(), "minute", (byte) 4);
        setByteField(term40813, term40813.getClass(), "second", (byte) 24);
        setIntField(term40813, term40813.getClass(), "nano", 25841507);
        setField(term40808, term40808.getClass(), "time", term40813);
        setField(term40789, term40789.getClass(), "updateTime", term40808);
        setIntField(term40819, term40819.getClass(), "year", 2012);
        setShortField(term40819, term40819.getClass(), "month", (short) 2);
        setShortField(term40819, term40819.getClass(), "day", (short) 25);
        setField(term40818, term40818.getClass(), "date", term40819);
        setByteField(term40823, term40823.getClass(), "hour", (byte) 23);
        setByteField(term40823, term40823.getClass(), "minute", (byte) 35);
        setByteField(term40823, term40823.getClass(), "second", (byte) 51);
        setIntField(term40823, term40823.getClass(), "nano", 181227985);
        setField(term40818, term40818.getClass(), "time", term40823);
        setField(term40789, term40789.getClass(), "startTime", term40818);
        setField(term40789, term40789.getClass(), "state", term40828);
        setIntField(term40831, term40831.getClass(), "year", 2019);
        setShortField(term40831, term40831.getClass(), "month", (short) 1);
        setShortField(term40831, term40831.getClass(), "day", (short) 9);
        setField(term40830, term40830.getClass(), "date", term40831);
        setByteField(term40835, term40835.getClass(), "hour", (byte) 16);
        setByteField(term40835, term40835.getClass(), "minute", (byte) 39);
        setByteField(term40835, term40835.getClass(), "second", (byte) 1);
        setIntField(term40835, term40835.getClass(), "nano", 715938448);
        setField(term40830, term40830.getClass(), "time", term40835);
        setField(term40789, term40789.getClass(), "endTime", term40830);
        setField(term40789, term40789.getClass(), "deleted", term40840);
        term40842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40847 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term40843, term40843.getClass(), "year", 2014);
        setShortField(term40843, term40843.getClass(), "month", (short) 8);
        setShortField(term40843, term40843.getClass(), "day", (short) 3);
        setField(term40842, term40842.getClass(), "date", term40843);
        setByteField(term40847, term40847.getClass(), "hour", (byte) 5);
        setByteField(term40847, term40847.getClass(), "minute", (byte) 41);
        setByteField(term40847, term40847.getClass(), "second", (byte) 29);
        setIntField(term40847, term40847.getClass(), "nano", 782499753);
        setField(term40842, term40842.getClass(), "time", term40847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term40842;
        callMethod(klass, "setStartTime", argTypes, term40789, args);
    }

};


