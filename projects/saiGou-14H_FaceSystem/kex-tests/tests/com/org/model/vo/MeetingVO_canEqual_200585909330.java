package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class MeetingVO_canEqual_200585909330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52864;
     Object term52979;

    public MeetingVO_canEqual_200585909330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term52865 = new Integer(606206987);
        Integer term52903 = new Integer(-534930572);
        Integer term52963 = new Integer(-748140133);
        Integer term52975 = new Integer(795993216);
        Integer term52977 = new Integer(1583601182);
        term52864 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term52905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52910 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52970 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term52864, term52864.getClass(), "id", term52865);
        setField(term52864, term52864.getClass(), "name", "oMmWgfbmwS");
        setField(term52864, term52864.getClass(), "host", "QreFiHgQtA");
        setField(term52864, term52864.getClass(), "roomName", "BTPXZrdCMh");
        setField(term52864, term52864.getClass(), "online", term52903);
        setIntField(term52906, term52906.getClass(), "year", 2027);
        setShortField(term52906, term52906.getClass(), "month", (short) 7);
        setShortField(term52906, term52906.getClass(), "day", (short) 1);
        setField(term52905, term52905.getClass(), "date", term52906);
        setByteField(term52910, term52910.getClass(), "hour", (byte) 4);
        setByteField(term52910, term52910.getClass(), "minute", (byte) 33);
        setByteField(term52910, term52910.getClass(), "second", (byte) 13);
        setIntField(term52910, term52910.getClass(), "nano", 724808977);
        setField(term52905, term52905.getClass(), "time", term52910);
        setField(term52864, term52864.getClass(), "createTime", term52905);
        setField(term52864, term52864.getClass(), "link", "QsTeQoennG");
        setField(term52864, term52864.getClass(), "meetingTime", "usqBzmmwqY");
        setField(term52864, term52864.getClass(), "signTime", "JkifeWxvfj");
        setField(term52864, term52864.getClass(), "introduce", "OwqAVeoEmD");
        setField(term52864, term52864.getClass(), "state", term52963);
        setIntField(term52966, term52966.getClass(), "year", 2025);
        setShortField(term52966, term52966.getClass(), "month", (short) 9);
        setShortField(term52966, term52966.getClass(), "day", (short) 18);
        setField(term52965, term52965.getClass(), "date", term52966);
        setByteField(term52970, term52970.getClass(), "hour", (byte) 19);
        setByteField(term52970, term52970.getClass(), "minute", (byte) 22);
        setByteField(term52970, term52970.getClass(), "second", (byte) 53);
        setIntField(term52970, term52970.getClass(), "nano", 683362814);
        setField(term52965, term52965.getClass(), "time", term52970);
        setField(term52864, term52864.getClass(), "updateTime", term52965);
        setField(term52864, term52864.getClass(), "userNumber", term52975);
        setField(term52864, term52864.getClass(), "signNumber", term52977);
        term52979 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52979;
        callMethod(klass, "canEqual", argTypes, term52864, args);
    }

};


