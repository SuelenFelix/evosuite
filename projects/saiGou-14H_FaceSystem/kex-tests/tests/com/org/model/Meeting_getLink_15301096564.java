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

public class Meeting_getLink_15301096564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27069;

    public Meeting_getLink_15301096564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27070 = new Integer(2125774573);
        Integer term27152 = new Integer(-1338560431);
        Integer term27154 = new Integer(1768827963);
        Integer term27169 = new Integer(-456155591);
        term27069 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term27072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27077 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27123 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27069, term27069.getClass(), "id", term27070);
        setIntField(term27073, term27073.getClass(), "year", 2018);
        setShortField(term27073, term27073.getClass(), "month", (short) 1);
        setShortField(term27073, term27073.getClass(), "day", (short) 24);
        setField(term27072, term27072.getClass(), "date", term27073);
        setByteField(term27077, term27077.getClass(), "hour", (byte) 11);
        setByteField(term27077, term27077.getClass(), "minute", (byte) 50);
        setByteField(term27077, term27077.getClass(), "second", (byte) 41);
        setIntField(term27077, term27077.getClass(), "nano", 402572098);
        setField(term27072, term27072.getClass(), "time", term27077);
        setField(term27069, term27069.getClass(), "createTime", term27072);
        setField(term27069, term27069.getClass(), "name", "EznFFdnKQD");
        setField(term27069, term27069.getClass(), "link", "tvBudEtoqr");
        setField(term27069, term27069.getClass(), "introduce", "ExUWFRqPXf");
        setIntField(term27119, term27119.getClass(), "year", 2021);
        setShortField(term27119, term27119.getClass(), "month", (short) 11);
        setShortField(term27119, term27119.getClass(), "day", (short) 14);
        setField(term27118, term27118.getClass(), "date", term27119);
        setByteField(term27123, term27123.getClass(), "hour", (byte) 3);
        setByteField(term27123, term27123.getClass(), "minute", (byte) 30);
        setByteField(term27123, term27123.getClass(), "second", (byte) 36);
        setIntField(term27123, term27123.getClass(), "nano", 680228713);
        setField(term27118, term27118.getClass(), "time", term27123);
        setField(term27069, term27069.getClass(), "updateTime", term27118);
        setField(term27069, term27069.getClass(), "meetingTime", "AKmeKdDdvP");
        setField(term27069, term27069.getClass(), "signTime", "kqtcoMBiTN");
        setField(term27069, term27069.getClass(), "signNumber", term27152);
        setField(term27069, term27069.getClass(), "userNumber", term27154);
        setField(term27069, term27069.getClass(), "fileUrl", "JpjXzcwToy");
        setBooleanField(term27069, term27069.getClass(), "online", false);
        setField(term27069, term27069.getClass(), "deleted", term27169);
        setField(term27069, term27069.getClass(), "host", "yctcpaluhv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLink", argTypes, term27069, args);
    }

};


