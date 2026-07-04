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

public class UserMeeting_setUserId_71486214214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40616;
     Object term40669;

    public UserMeeting_setUserId_71486214214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40617 = new Integer(1366246744);
        Integer term40619 = new Integer(-369295588);
        Integer term40631 = new Integer(728215296);
        Integer term40633 = new Integer(-1236147031);
        Integer term40655 = new Integer(2030051112);
        Integer term40667 = new Integer(1023614449);
        term40616 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40635 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40636 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40640 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40645 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40646 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40650 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40662 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40616, term40616.getClass(), "id", term40617);
        setField(term40616, term40616.getClass(), "umPower", term40619);
        setIntField(term40622, term40622.getClass(), "year", 2014);
        setShortField(term40622, term40622.getClass(), "month", (short) 8);
        setShortField(term40622, term40622.getClass(), "day", (short) 10);
        setField(term40621, term40621.getClass(), "date", term40622);
        setByteField(term40626, term40626.getClass(), "hour", (byte) 17);
        setByteField(term40626, term40626.getClass(), "minute", (byte) 8);
        setByteField(term40626, term40626.getClass(), "second", (byte) 32);
        setIntField(term40626, term40626.getClass(), "nano", 120357006);
        setField(term40621, term40621.getClass(), "time", term40626);
        setField(term40616, term40616.getClass(), "createTime", term40621);
        setField(term40616, term40616.getClass(), "userId", term40631);
        setField(term40616, term40616.getClass(), "meetingId", term40633);
        setIntField(term40636, term40636.getClass(), "year", 2029);
        setShortField(term40636, term40636.getClass(), "month", (short) 5);
        setShortField(term40636, term40636.getClass(), "day", (short) 3);
        setField(term40635, term40635.getClass(), "date", term40636);
        setByteField(term40640, term40640.getClass(), "hour", (byte) 21);
        setByteField(term40640, term40640.getClass(), "minute", (byte) 41);
        setByteField(term40640, term40640.getClass(), "second", (byte) 9);
        setIntField(term40640, term40640.getClass(), "nano", 699417700);
        setField(term40635, term40635.getClass(), "time", term40640);
        setField(term40616, term40616.getClass(), "updateTime", term40635);
        setIntField(term40646, term40646.getClass(), "year", 2012);
        setShortField(term40646, term40646.getClass(), "month", (short) 6);
        setShortField(term40646, term40646.getClass(), "day", (short) 1);
        setField(term40645, term40645.getClass(), "date", term40646);
        setByteField(term40650, term40650.getClass(), "hour", (byte) 14);
        setByteField(term40650, term40650.getClass(), "minute", (byte) 57);
        setByteField(term40650, term40650.getClass(), "second", (byte) 0);
        setIntField(term40650, term40650.getClass(), "nano", 965303069);
        setField(term40645, term40645.getClass(), "time", term40650);
        setField(term40616, term40616.getClass(), "startTime", term40645);
        setField(term40616, term40616.getClass(), "state", term40655);
        setIntField(term40658, term40658.getClass(), "year", 2027);
        setShortField(term40658, term40658.getClass(), "month", (short) 1);
        setShortField(term40658, term40658.getClass(), "day", (short) 31);
        setField(term40657, term40657.getClass(), "date", term40658);
        setByteField(term40662, term40662.getClass(), "hour", (byte) 16);
        setByteField(term40662, term40662.getClass(), "minute", (byte) 7);
        setByteField(term40662, term40662.getClass(), "second", (byte) 38);
        setIntField(term40662, term40662.getClass(), "nano", 713069905);
        setField(term40657, term40657.getClass(), "time", term40662);
        setField(term40616, term40616.getClass(), "endTime", term40657);
        setField(term40616, term40616.getClass(), "deleted", term40667);
        term40669 = new Integer(-717220010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term40669;
        callMethod(klass, "setUserId", argTypes, term40616, args);
    }

};


