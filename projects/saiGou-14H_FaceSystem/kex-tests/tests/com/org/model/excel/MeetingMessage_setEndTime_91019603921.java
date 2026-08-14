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

public class MeetingMessage_setEndTime_91019603921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38703;
     Object term38776;

    public MeetingMessage_setEndTime_91019603921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38740 = new Integer(797166053);
        Integer term38742 = new Integer(-1145342603);
        term38703 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term38744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38749 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38759 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term38703, term38703.getClass(), "username", "QawFvvoVNe");
        setField(term38703, term38703.getClass(), "nickname", "JMmYwwRqLn");
        setField(term38703, term38703.getClass(), "sex", "wiHmWKChBU");
        setField(term38703, term38703.getClass(), "umPower", term38740);
        setField(term38703, term38703.getClass(), "state", term38742);
        setIntField(term38745, term38745.getClass(), "year", 2022);
        setShortField(term38745, term38745.getClass(), "month", (short) 9);
        setShortField(term38745, term38745.getClass(), "day", (short) 6);
        setField(term38744, term38744.getClass(), "date", term38745);
        setByteField(term38749, term38749.getClass(), "hour", (byte) 0);
        setByteField(term38749, term38749.getClass(), "minute", (byte) 36);
        setByteField(term38749, term38749.getClass(), "second", (byte) 57);
        setIntField(term38749, term38749.getClass(), "nano", 623892951);
        setField(term38744, term38744.getClass(), "time", term38749);
        setField(term38703, term38703.getClass(), "startTime", term38744);
        setIntField(term38755, term38755.getClass(), "year", 2014);
        setShortField(term38755, term38755.getClass(), "month", (short) 12);
        setShortField(term38755, term38755.getClass(), "day", (short) 12);
        setField(term38754, term38754.getClass(), "date", term38755);
        setByteField(term38759, term38759.getClass(), "hour", (byte) 8);
        setByteField(term38759, term38759.getClass(), "minute", (byte) 44);
        setByteField(term38759, term38759.getClass(), "second", (byte) 19);
        setIntField(term38759, term38759.getClass(), "nano", 16834354);
        setField(term38754, term38754.getClass(), "time", term38759);
        setField(term38703, term38703.getClass(), "endTime", term38754);
        setField(term38703, term38703.getClass(), "allTime", "slHIDqbhVK");
        term38776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38781 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term38777, term38777.getClass(), "year", 2012);
        setShortField(term38777, term38777.getClass(), "month", (short) 11);
        setShortField(term38777, term38777.getClass(), "day", (short) 5);
        setField(term38776, term38776.getClass(), "date", term38777);
        setByteField(term38781, term38781.getClass(), "hour", (byte) 16);
        setByteField(term38781, term38781.getClass(), "minute", (byte) 51);
        setByteField(term38781, term38781.getClass(), "second", (byte) 52);
        setIntField(term38781, term38781.getClass(), "nano", 794474514);
        setField(term38776, term38776.getClass(), "time", term38781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term38776;
        callMethod(klass, "setEndTime", argTypes, term38703, args);
    }

};


