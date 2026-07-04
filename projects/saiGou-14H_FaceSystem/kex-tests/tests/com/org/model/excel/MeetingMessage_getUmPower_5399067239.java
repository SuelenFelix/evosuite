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

public class MeetingMessage_getUmPower_5399067239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term929;

    public MeetingMessage_getUmPower_5399067239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term966 = new Integer(-1685132342);
        Integer term968 = new Integer(-1456670397);
        term929 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term975 = newInstance(Class.forName("java.time.LocalTime"));
        Object term980 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term981 = newInstance(Class.forName("java.time.LocalDate"));
        Object term985 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term929, term929.getClass(), "username", "SbAoxhfrkn");
        setField(term929, term929.getClass(), "nickname", "kuTXqwMtDB");
        setField(term929, term929.getClass(), "sex", "Ghbwtircqb");
        setField(term929, term929.getClass(), "umPower", term966);
        setField(term929, term929.getClass(), "state", term968);
        setIntField(term971, term971.getClass(), "year", 2015);
        setShortField(term971, term971.getClass(), "month", (short) 9);
        setShortField(term971, term971.getClass(), "day", (short) 16);
        setField(term970, term970.getClass(), "date", term971);
        setByteField(term975, term975.getClass(), "hour", (byte) 6);
        setByteField(term975, term975.getClass(), "minute", (byte) 19);
        setByteField(term975, term975.getClass(), "second", (byte) 42);
        setIntField(term975, term975.getClass(), "nano", 630084975);
        setField(term970, term970.getClass(), "time", term975);
        setField(term929, term929.getClass(), "startTime", term970);
        setIntField(term981, term981.getClass(), "year", 2029);
        setShortField(term981, term981.getClass(), "month", (short) 6);
        setShortField(term981, term981.getClass(), "day", (short) 23);
        setField(term980, term980.getClass(), "date", term981);
        setByteField(term985, term985.getClass(), "hour", (byte) 21);
        setByteField(term985, term985.getClass(), "minute", (byte) 55);
        setByteField(term985, term985.getClass(), "second", (byte) 27);
        setIntField(term985, term985.getClass(), "nano", 66889274);
        setField(term980, term980.getClass(), "time", term985);
        setField(term929, term929.getClass(), "endTime", term980);
        setField(term929, term929.getClass(), "allTime", "xrwlQZdwCp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUmPower", argTypes, term929, args);
    }

};


