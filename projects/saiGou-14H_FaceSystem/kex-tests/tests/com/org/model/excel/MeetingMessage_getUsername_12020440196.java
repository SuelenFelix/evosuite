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

public class MeetingMessage_getUsername_12020440196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590;

    public MeetingMessage_getUsername_12020440196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term627 = new Integer(1725571209);
        Integer term629 = new Integer(-522618178);
        term590 = newInstance(Class.forName("com.org.model.excel.MeetingMessage"));
        Object term631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term636 = newInstance(Class.forName("java.time.LocalTime"));
        Object term641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term646 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term590, term590.getClass(), "username", "RkybSrpybU");
        setField(term590, term590.getClass(), "nickname", "xOEqzGAmDU");
        setField(term590, term590.getClass(), "sex", "eZFUvlxvGV");
        setField(term590, term590.getClass(), "umPower", term627);
        setField(term590, term590.getClass(), "state", term629);
        setIntField(term632, term632.getClass(), "year", 2019);
        setShortField(term632, term632.getClass(), "month", (short) 2);
        setShortField(term632, term632.getClass(), "day", (short) 21);
        setField(term631, term631.getClass(), "date", term632);
        setByteField(term636, term636.getClass(), "hour", (byte) 5);
        setByteField(term636, term636.getClass(), "minute", (byte) 41);
        setByteField(term636, term636.getClass(), "second", (byte) 11);
        setIntField(term636, term636.getClass(), "nano", 859829782);
        setField(term631, term631.getClass(), "time", term636);
        setField(term590, term590.getClass(), "startTime", term631);
        setIntField(term642, term642.getClass(), "year", 2018);
        setShortField(term642, term642.getClass(), "month", (short) 9);
        setShortField(term642, term642.getClass(), "day", (short) 28);
        setField(term641, term641.getClass(), "date", term642);
        setByteField(term646, term646.getClass(), "hour", (byte) 3);
        setByteField(term646, term646.getClass(), "minute", (byte) 37);
        setByteField(term646, term646.getClass(), "second", (byte) 46);
        setIntField(term646, term646.getClass(), "nano", 763326845);
        setField(term641, term641.getClass(), "time", term646);
        setField(term590, term590.getClass(), "endTime", term641);
        setField(term590, term590.getClass(), "allTime", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.excel.MeetingMessage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term590, args);
    }

};


