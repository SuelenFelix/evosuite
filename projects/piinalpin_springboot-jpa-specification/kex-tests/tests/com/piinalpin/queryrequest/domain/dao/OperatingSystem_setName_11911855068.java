package com.piinalpin.queryrequest.domain.dao;

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
import static com.piinalpin.queryrequest.domain.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class OperatingSystem_setName_11911855068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306;

    public OperatingSystem_setName_11911855068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1307 = new Long(5127676408959197577L);
        Integer term1355 = new Integer(-1685132342);
        term1306 = newInstance(Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem"));
        Object term1345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1350 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1306, term1306.getClass(), "id", term1307);
        setField(term1306, term1306.getClass(), "name", "xLbjWUgOIL");
        setField(term1306, term1306.getClass(), "version", "jDtqGUpnZN");
        setField(term1306, term1306.getClass(), "kernel", "nGKItKLYNC");
        setIntField(term1346, term1346.getClass(), "year", 2015);
        setShortField(term1346, term1346.getClass(), "month", (short) 9);
        setShortField(term1346, term1346.getClass(), "day", (short) 16);
        setField(term1345, term1345.getClass(), "date", term1346);
        setByteField(term1350, term1350.getClass(), "hour", (byte) 6);
        setByteField(term1350, term1350.getClass(), "minute", (byte) 19);
        setByteField(term1350, term1350.getClass(), "second", (byte) 42);
        setIntField(term1350, term1350.getClass(), "nano", 630084975);
        setField(term1345, term1345.getClass(), "time", term1350);
        setField(term1306, term1306.getClass(), "releaseDate", term1345);
        setField(term1306, term1306.getClass(), "usages", term1355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.piinalpin.queryrequest.domain.dao.OperatingSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "setName", argTypes, term1306, args);
    }

};


