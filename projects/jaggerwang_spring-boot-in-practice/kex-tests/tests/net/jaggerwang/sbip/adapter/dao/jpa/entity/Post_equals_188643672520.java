package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_equals_188643672520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10124;
     Object term10184;

    public Post_equals_188643672520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10125 = new Long(7017605765544766728L);
        Long term10127 = new Long(-6078481855513028760L);
        Class<? extends Object> term10186 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term10185 = ((Class) term10186).getDeclaredField((String) "IMAGE");
        ((Field) term10185).setAccessible(true);
        Object enum30 = ((Field) term10185).get((Object) null);
        Long term10152 = new Long(-6985556670871089725L);
        Long term10154 = new Long(-8469818909085103606L);
        Long term10156 = new Long(11315815278355083L);
        Long term10158 = new Long(7735460540091431012L);
        ArrayList term10150 = new ArrayList();
        ((ArrayList) term10150).add(term10152);
        ((ArrayList) term10150).add(term10154);
        ((ArrayList) term10150).add(term10156);
        ((ArrayList) term10150).add(term10158);
        Long term10162 = new Long(1346299551708610248L);
        term10124 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term10164 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10165 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10169 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10179 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10124, term10124.getClass(), "id", term10125);
        setField(term10124, term10124.getClass(), "userId", term10127);
        setField(term10124, term10124.getClass(), "type", enum30);
        setField(term10124, term10124.getClass(), "text", "fhkbdRViHi");
        setField(term10124, term10124.getClass(), "imageIds", term10150);
        setField(term10124, term10124.getClass(), "videoId", term10162);
        setIntField(term10165, term10165.getClass(), "year", 2014);
        setShortField(term10165, term10165.getClass(), "month", (short) 1);
        setShortField(term10165, term10165.getClass(), "day", (short) 26);
        setField(term10164, term10164.getClass(), "date", term10165);
        setByteField(term10169, term10169.getClass(), "hour", (byte) 3);
        setByteField(term10169, term10169.getClass(), "minute", (byte) 31);
        setByteField(term10169, term10169.getClass(), "second", (byte) 56);
        setIntField(term10169, term10169.getClass(), "nano", 100873602);
        setField(term10164, term10164.getClass(), "time", term10169);
        setField(term10124, term10124.getClass(), "createdAt", term10164);
        setIntField(term10175, term10175.getClass(), "year", 2021);
        setShortField(term10175, term10175.getClass(), "month", (short) 12);
        setShortField(term10175, term10175.getClass(), "day", (short) 1);
        setField(term10174, term10174.getClass(), "date", term10175);
        setByteField(term10179, term10179.getClass(), "hour", (byte) 15);
        setByteField(term10179, term10179.getClass(), "minute", (byte) 30);
        setByteField(term10179, term10179.getClass(), "second", (byte) 5);
        setIntField(term10179, term10179.getClass(), "nano", 996341606);
        setField(term10174, term10174.getClass(), "time", term10179);
        setField(term10124, term10124.getClass(), "updatedAt", term10174);
        term10184 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10184;
        callMethod(klass, "equals", argTypes, term10124, args);
    }

};


