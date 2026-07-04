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

public class Meeting_setName_99514649517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29473;

    public Meeting_setName_99514649517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29474 = new Integer(110090057);
        Integer term29556 = new Integer(1975165299);
        Integer term29558 = new Integer(-1320712215);
        Integer term29573 = new Integer(-619414497);
        term29473 = newInstance(Class.forName("com.org.model.Meeting"));
        Object term29476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29527 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29473, term29473.getClass(), "id", term29474);
        setIntField(term29477, term29477.getClass(), "year", 2010);
        setShortField(term29477, term29477.getClass(), "month", (short) 4);
        setShortField(term29477, term29477.getClass(), "day", (short) 5);
        setField(term29476, term29476.getClass(), "date", term29477);
        setByteField(term29481, term29481.getClass(), "hour", (byte) 6);
        setByteField(term29481, term29481.getClass(), "minute", (byte) 31);
        setByteField(term29481, term29481.getClass(), "second", (byte) 49);
        setIntField(term29481, term29481.getClass(), "nano", 665880484);
        setField(term29476, term29476.getClass(), "time", term29481);
        setField(term29473, term29473.getClass(), "createTime", term29476);
        setField(term29473, term29473.getClass(), "name", "jwGtShAOZR");
        setField(term29473, term29473.getClass(), "link", "HqxxvASIJq");
        setField(term29473, term29473.getClass(), "introduce", "MBJxaagZhg");
        setIntField(term29523, term29523.getClass(), "year", 2025);
        setShortField(term29523, term29523.getClass(), "month", (short) 2);
        setShortField(term29523, term29523.getClass(), "day", (short) 15);
        setField(term29522, term29522.getClass(), "date", term29523);
        setByteField(term29527, term29527.getClass(), "hour", (byte) 4);
        setByteField(term29527, term29527.getClass(), "minute", (byte) 17);
        setByteField(term29527, term29527.getClass(), "second", (byte) 28);
        setIntField(term29527, term29527.getClass(), "nano", 251651317);
        setField(term29522, term29522.getClass(), "time", term29527);
        setField(term29473, term29473.getClass(), "updateTime", term29522);
        setField(term29473, term29473.getClass(), "meetingTime", "cpHleFahfl");
        setField(term29473, term29473.getClass(), "signTime", "fWZbsaquDq");
        setField(term29473, term29473.getClass(), "signNumber", term29556);
        setField(term29473, term29473.getClass(), "userNumber", term29558);
        setField(term29473, term29473.getClass(), "fileUrl", "HZUfvLLZWl");
        setBooleanField(term29473, term29473.getClass(), "online", false);
        setField(term29473, term29473.getClass(), "deleted", term29573);
        setField(term29473, term29473.getClass(), "host", "uRtTKxfUmc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Meeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iMwYcIBemV";
        callMethod(klass, "setName", argTypes, term29473, args);
    }

};


