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

public class Meeting_getCreateTime_6235405252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26701;

    public Meeting_getCreateTime_6235405252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26702 = new Integer(-545530498);
        Integer term26784 = new Integer(-1018874255);
        Integer term26786 = new Integer(-268930414);
        Integer term26801 = new Integer(1036231784);
        term26701 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term26704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26709 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26755 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26701, term26701.getClass(), "id", term26702);
        setIntField(term26705, term26705.getClass(), "year", 2017);
        setShortField(term26705, term26705.getClass(), "month", (short) 6);
        setShortField(term26705, term26705.getClass(), "day", (short) 3);
        setField(term26704, term26704.getClass(), "date", term26705);
        setByteField(term26709, term26709.getClass(), "hour", (byte) 20);
        setByteField(term26709, term26709.getClass(), "minute", (byte) 14);
        setByteField(term26709, term26709.getClass(), "second", (byte) 10);
        setIntField(term26709, term26709.getClass(), "nano", 594163001);
        setField(term26704, term26704.getClass(), "time", term26709);
        setField(term26701, term26701.getClass(), "createTime", term26704);
        setField(term26701, term26701.getClass(), "name", "nenRtMWwiS");
        setField(term26701, term26701.getClass(), "link", "KiauapEvQX");
        setField(term26701, term26701.getClass(), "introduce", "JFqCltusci");
        setIntField(term26751, term26751.getClass(), "year", 2014);
        setShortField(term26751, term26751.getClass(), "month", (short) 4);
        setShortField(term26751, term26751.getClass(), "day", (short) 9);
        setField(term26750, term26750.getClass(), "date", term26751);
        setByteField(term26755, term26755.getClass(), "hour", (byte) 0);
        setByteField(term26755, term26755.getClass(), "minute", (byte) 49);
        setByteField(term26755, term26755.getClass(), "second", (byte) 41);
        setIntField(term26755, term26755.getClass(), "nano", 379126669);
        setField(term26750, term26750.getClass(), "time", term26755);
        setField(term26701, term26701.getClass(), "updateTime", term26750);
        setField(term26701, term26701.getClass(), "meetingTime", "CQDMYzEnmt");
        setField(term26701, term26701.getClass(), "signTime", "MCCXNLKile");
        setField(term26701, term26701.getClass(), "signNumber", term26784);
        setField(term26701, term26701.getClass(), "userNumber", term26786);
        setField(term26701, term26701.getClass(), "fileUrl", "jUSBTYPPFt");
        setBooleanField(term26701, term26701.getClass(), "online", true);
        setField(term26701, term26701.getClass(), "deleted", term26801);
        setField(term26701, term26701.getClass(), "host", "jJtudqtLhf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term26701, args);
    }

};


