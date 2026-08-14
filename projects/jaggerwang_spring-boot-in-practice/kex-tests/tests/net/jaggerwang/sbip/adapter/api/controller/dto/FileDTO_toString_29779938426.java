package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class FileDTO_toString_29779938426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27303;

    public FileDTO_toString_29779938426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27304 = new Long(185544001230120339L);
        Long term27306 = new Long(4096288569907305445L);
        Class<? extends Object> term27412 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term27411 = ((Class) term27412).getDeclaredField((String) "LOCAL");
        ((Field) term27411).setAccessible(true);
        Object enum55 = ((Field) term27411).get((Object) null);
        Long term27354 = new Long(6940486570215409900L);
        HashMap term27400 = new HashMap();
        term27303 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term27341 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term27368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27373 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27378 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27379 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27383 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27303, term27303.getClass(), "id", term27304);
        setField(term27303, term27303.getClass(), "userId", term27306);
        setField(term27303, term27303.getClass(), "region", enum55);
        setField(term27303, term27303.getClass(), "bucket", "vqnBkkxoIa");
        setField(term27303, term27303.getClass(), "path", "bycpZjxXFn");
        setField(term27341, term27341.getClass(), "name", "jQWttOAiwL");
        setField(term27341, term27341.getClass(), "size", term27354);
        setField(term27341, term27341.getClass(), "type", "DzKFxEuEEC");
        setField(term27303, term27303.getClass(), "meta", term27341);
        setIntField(term27369, term27369.getClass(), "year", 2022);
        setShortField(term27369, term27369.getClass(), "month", (short) 8);
        setShortField(term27369, term27369.getClass(), "day", (short) 16);
        setField(term27368, term27368.getClass(), "date", term27369);
        setByteField(term27373, term27373.getClass(), "hour", (byte) 4);
        setByteField(term27373, term27373.getClass(), "minute", (byte) 38);
        setByteField(term27373, term27373.getClass(), "second", (byte) 51);
        setIntField(term27373, term27373.getClass(), "nano", 348952212);
        setField(term27368, term27368.getClass(), "time", term27373);
        setField(term27303, term27303.getClass(), "createdAt", term27368);
        setIntField(term27379, term27379.getClass(), "year", 2016);
        setShortField(term27379, term27379.getClass(), "month", (short) 7);
        setShortField(term27379, term27379.getClass(), "day", (short) 21);
        setField(term27378, term27378.getClass(), "date", term27379);
        setByteField(term27383, term27383.getClass(), "hour", (byte) 22);
        setByteField(term27383, term27383.getClass(), "minute", (byte) 2);
        setByteField(term27383, term27383.getClass(), "second", (byte) 21);
        setIntField(term27383, term27383.getClass(), "nano", 729266668);
        setField(term27378, term27378.getClass(), "time", term27383);
        setField(term27303, term27303.getClass(), "updatedAt", term27378);
        setField(term27303, term27303.getClass(), "url", "CAMnvfDLJL");
        setField(term27303, term27303.getClass(), "thumbs", term27400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27303, args);
    }

};


