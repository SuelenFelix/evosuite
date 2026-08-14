package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class PostBO_setType_95821783711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16124;
     Object enum44;

    public PostBO_setType_95821783711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16125 = new Long(-6521561238735301071L);
        Long term16127 = new Long(-6609679920238945303L);
        Class<? extends Object> term16195 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term16194 = ((Class) term16195).getDeclaredField((String) "IMAGE");
        ((Field) term16194).setAccessible(true);
        Object enum43 = ((Field) term16194).get((Object) null);
        Long term16152 = new Long(-7296330380944173376L);
        Long term16154 = new Long(-8890284990655172580L);
        Long term16156 = new Long(-5951743062322506095L);
        Long term16158 = new Long(768144790810175653L);
        Long term16160 = new Long(-1497280900081695731L);
        ArrayList term16150 = new ArrayList();
        ((ArrayList) term16150).add(term16152);
        ((ArrayList) term16150).add(term16154);
        ((ArrayList) term16150).add(term16156);
        ((ArrayList) term16150).add(term16158);
        ((ArrayList) term16150).add(term16160);
        Long term16164 = new Long(-3602825674339018793L);
        term16124 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term16166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16171 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16181 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16124, term16124.getClass(), "id", term16125);
        setField(term16124, term16124.getClass(), "userId", term16127);
        setField(term16124, term16124.getClass(), "type", enum43);
        setField(term16124, term16124.getClass(), "text", "XYtryyobou");
        setField(term16124, term16124.getClass(), "imageIds", term16150);
        setField(term16124, term16124.getClass(), "videoId", term16164);
        setIntField(term16167, term16167.getClass(), "year", 2026);
        setShortField(term16167, term16167.getClass(), "month", (short) 9);
        setShortField(term16167, term16167.getClass(), "day", (short) 18);
        setField(term16166, term16166.getClass(), "date", term16167);
        setByteField(term16171, term16171.getClass(), "hour", (byte) 14);
        setByteField(term16171, term16171.getClass(), "minute", (byte) 51);
        setByteField(term16171, term16171.getClass(), "second", (byte) 41);
        setIntField(term16171, term16171.getClass(), "nano", 830322169);
        setField(term16166, term16166.getClass(), "time", term16171);
        setField(term16124, term16124.getClass(), "createdAt", term16166);
        setIntField(term16177, term16177.getClass(), "year", 2024);
        setShortField(term16177, term16177.getClass(), "month", (short) 3);
        setShortField(term16177, term16177.getClass(), "day", (short) 17);
        setField(term16176, term16176.getClass(), "date", term16177);
        setByteField(term16181, term16181.getClass(), "hour", (byte) 5);
        setByteField(term16181, term16181.getClass(), "minute", (byte) 21);
        setByteField(term16181, term16181.getClass(), "second", (byte) 47);
        setIntField(term16181, term16181.getClass(), "nano", 798433252);
        setField(term16176, term16176.getClass(), "time", term16181);
        setField(term16124, term16124.getClass(), "updatedAt", term16176);
        Class<? extends Object> term16417 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term16416 = ((Class) term16417).getDeclaredField((String) "TEXT");
        ((Field) term16416).setAccessible(true);
        enum44 = ((Field) term16416).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostBO$Type");
        Object[] args = new Object[1];
        args[0] = enum44;
        callMethod(klass, "setType", argTypes, term16124, args);
    }

};


