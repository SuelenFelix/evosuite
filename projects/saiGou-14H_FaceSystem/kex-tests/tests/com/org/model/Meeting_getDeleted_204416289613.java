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

public class Meeting_getDeleted_204416289613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28725;

    public Meeting_getDeleted_204416289613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28726 = new Integer(-929524036);
        Integer term28808 = new Integer(1539575963);
        Integer term28810 = new Integer(-381662221);
        Integer term28825 = new Integer(-1367263864);
        term28725 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term28728 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28729 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28733 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28779 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28725, term28725.getClass(), "id", term28726);
        setIntField(term28729, term28729.getClass(), "year", 2021);
        setShortField(term28729, term28729.getClass(), "month", (short) 10);
        setShortField(term28729, term28729.getClass(), "day", (short) 12);
        setField(term28728, term28728.getClass(), "date", term28729);
        setByteField(term28733, term28733.getClass(), "hour", (byte) 10);
        setByteField(term28733, term28733.getClass(), "minute", (byte) 35);
        setByteField(term28733, term28733.getClass(), "second", (byte) 54);
        setIntField(term28733, term28733.getClass(), "nano", 943613873);
        setField(term28728, term28728.getClass(), "time", term28733);
        setField(term28725, term28725.getClass(), "createTime", term28728);
        setField(term28725, term28725.getClass(), "name", "uMrJeSSvdc");
        setField(term28725, term28725.getClass(), "link", "pRVgwFARqj");
        setField(term28725, term28725.getClass(), "introduce", "mpLqtxGrAU");
        setIntField(term28775, term28775.getClass(), "year", 2014);
        setShortField(term28775, term28775.getClass(), "month", (short) 12);
        setShortField(term28775, term28775.getClass(), "day", (short) 24);
        setField(term28774, term28774.getClass(), "date", term28775);
        setByteField(term28779, term28779.getClass(), "hour", (byte) 14);
        setByteField(term28779, term28779.getClass(), "minute", (byte) 18);
        setByteField(term28779, term28779.getClass(), "second", (byte) 26);
        setIntField(term28779, term28779.getClass(), "nano", 945081214);
        setField(term28774, term28774.getClass(), "time", term28779);
        setField(term28725, term28725.getClass(), "updateTime", term28774);
        setField(term28725, term28725.getClass(), "meetingTime", "JKBkexwJQQ");
        setField(term28725, term28725.getClass(), "signTime", "GPXGjAdtoJ");
        setField(term28725, term28725.getClass(), "signNumber", term28808);
        setField(term28725, term28725.getClass(), "userNumber", term28810);
        setField(term28725, term28725.getClass(), "fileUrl", "rpotsMWMJb");
        setBooleanField(term28725, term28725.getClass(), "online", true);
        setField(term28725, term28725.getClass(), "deleted", term28825);
        setField(term28725, term28725.getClass(), "host", "cZzZwgyRsb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeleted", argTypes, term28725, args);
    }

};


