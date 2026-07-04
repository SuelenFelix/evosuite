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

public class MeetingVO_setSignTime_58302784123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11139;

    public MeetingVO_setSignTime_58302784123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11140 = new Integer(-1252345779);
        Integer term11178 = new Integer(-2063365430);
        Integer term11238 = new Integer(812570053);
        Integer term11250 = new Integer(-1488938905);
        Integer term11252 = new Integer(1916544127);
        term11139 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term11180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11185 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11245 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11139, term11139.getClass(), "id", term11140);
        setField(term11139, term11139.getClass(), "name", "QnZKCwkmMh");
        setField(term11139, term11139.getClass(), "host", "RVQbteztJx");
        setField(term11139, term11139.getClass(), "roomName", "yjmUdvwSdd");
        setField(term11139, term11139.getClass(), "online", term11178);
        setIntField(term11181, term11181.getClass(), "year", 2016);
        setShortField(term11181, term11181.getClass(), "month", (short) 2);
        setShortField(term11181, term11181.getClass(), "day", (short) 25);
        setField(term11180, term11180.getClass(), "date", term11181);
        setByteField(term11185, term11185.getClass(), "hour", (byte) 8);
        setByteField(term11185, term11185.getClass(), "minute", (byte) 54);
        setByteField(term11185, term11185.getClass(), "second", (byte) 40);
        setIntField(term11185, term11185.getClass(), "nano", 124525896);
        setField(term11180, term11180.getClass(), "time", term11185);
        setField(term11139, term11139.getClass(), "createTime", term11180);
        setField(term11139, term11139.getClass(), "link", "COsGswsrtI");
        setField(term11139, term11139.getClass(), "meetingTime", "ebUWnoVDmk");
        setField(term11139, term11139.getClass(), "signTime", "wCcojFgWKb");
        setField(term11139, term11139.getClass(), "introduce", "iHtqLPNWTt");
        setField(term11139, term11139.getClass(), "state", term11238);
        setIntField(term11241, term11241.getClass(), "year", 2029);
        setShortField(term11241, term11241.getClass(), "month", (short) 1);
        setShortField(term11241, term11241.getClass(), "day", (short) 10);
        setField(term11240, term11240.getClass(), "date", term11241);
        setByteField(term11245, term11245.getClass(), "hour", (byte) 8);
        setByteField(term11245, term11245.getClass(), "minute", (byte) 46);
        setByteField(term11245, term11245.getClass(), "second", (byte) 35);
        setIntField(term11245, term11245.getClass(), "nano", 58807194);
        setField(term11240, term11240.getClass(), "time", term11245);
        setField(term11139, term11139.getClass(), "updateTime", term11240);
        setField(term11139, term11139.getClass(), "userNumber", term11250);
        setField(term11139, term11139.getClass(), "signNumber", term11252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TQgECVDMEf";
        callMethod(klass, "setSignTime", argTypes, term11139, args);
    }

};


