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

public class UserMeeting_setDeleted_125668606320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40970;
     Object term41023;

    public UserMeeting_setDeleted_125668606320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term40971 = new Integer(-808741755);
        Integer term40973 = new Integer(-1088446142);
        Integer term40985 = new Integer(342337914);
        Integer term40987 = new Integer(920216419);
        Integer term41009 = new Integer(-1576226952);
        Integer term41021 = new Integer(1555746325);
        term40970 = newInstance(Class.forName("com.org.model.UserMeeting"));
        Object term40975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40980 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41004 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41016 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term40970, term40970.getClass(), "id", term40971);
        setField(term40970, term40970.getClass(), "umPower", term40973);
        setIntField(term40976, term40976.getClass(), "year", 2025);
        setShortField(term40976, term40976.getClass(), "month", (short) 5);
        setShortField(term40976, term40976.getClass(), "day", (short) 12);
        setField(term40975, term40975.getClass(), "date", term40976);
        setByteField(term40980, term40980.getClass(), "hour", (byte) 14);
        setByteField(term40980, term40980.getClass(), "minute", (byte) 27);
        setByteField(term40980, term40980.getClass(), "second", (byte) 18);
        setIntField(term40980, term40980.getClass(), "nano", 530044969);
        setField(term40975, term40975.getClass(), "time", term40980);
        setField(term40970, term40970.getClass(), "createTime", term40975);
        setField(term40970, term40970.getClass(), "userId", term40985);
        setField(term40970, term40970.getClass(), "meetingId", term40987);
        setIntField(term40990, term40990.getClass(), "year", 2028);
        setShortField(term40990, term40990.getClass(), "month", (short) 10);
        setShortField(term40990, term40990.getClass(), "day", (short) 11);
        setField(term40989, term40989.getClass(), "date", term40990);
        setByteField(term40994, term40994.getClass(), "hour", (byte) 1);
        setByteField(term40994, term40994.getClass(), "minute", (byte) 5);
        setByteField(term40994, term40994.getClass(), "second", (byte) 29);
        setIntField(term40994, term40994.getClass(), "nano", 688086203);
        setField(term40989, term40989.getClass(), "time", term40994);
        setField(term40970, term40970.getClass(), "updateTime", term40989);
        setIntField(term41000, term41000.getClass(), "year", 2029);
        setShortField(term41000, term41000.getClass(), "month", (short) 4);
        setShortField(term41000, term41000.getClass(), "day", (short) 26);
        setField(term40999, term40999.getClass(), "date", term41000);
        setByteField(term41004, term41004.getClass(), "hour", (byte) 19);
        setByteField(term41004, term41004.getClass(), "minute", (byte) 30);
        setByteField(term41004, term41004.getClass(), "second", (byte) 13);
        setIntField(term41004, term41004.getClass(), "nano", 883683186);
        setField(term40999, term40999.getClass(), "time", term41004);
        setField(term40970, term40970.getClass(), "startTime", term40999);
        setField(term40970, term40970.getClass(), "state", term41009);
        setIntField(term41012, term41012.getClass(), "year", 2014);
        setShortField(term41012, term41012.getClass(), "month", (short) 9);
        setShortField(term41012, term41012.getClass(), "day", (short) 25);
        setField(term41011, term41011.getClass(), "date", term41012);
        setByteField(term41016, term41016.getClass(), "hour", (byte) 11);
        setByteField(term41016, term41016.getClass(), "minute", (byte) 31);
        setByteField(term41016, term41016.getClass(), "second", (byte) 8);
        setIntField(term41016, term41016.getClass(), "nano", 872565929);
        setField(term41011, term41011.getClass(), "time", term41016);
        setField(term40970, term40970.getClass(), "endTime", term41011);
        setField(term40970, term40970.getClass(), "deleted", term41021);
        term41023 = new Integer(-1910031809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.UserMeeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term41023;
        callMethod(klass, "setDeleted", argTypes, term40970, args);
    }

};


