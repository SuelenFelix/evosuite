package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Reply_ReplyBuilder_toString_6336808087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45464;

    public Reply_ReplyBuilder_toString_6336808087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45713 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term45712 = ((Class) term45713).getDeclaredField((String) "USER");
        ((Field) term45712).setAccessible(true);
        Object enum96 = ((Field) term45712).get((Object) null);
        Object term45563 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term45563, term45563.getClass(), "id", -773707674);
        setField(term45563, term45563.getClass(), "content", null);
        setField(term45563, term45563.getClass(), "board", null);
        setField(term45563, term45563.getClass(), "user", null);
        setField(term45563, term45563.getClass(), "createDate", null);
        Object term45565 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term45565, term45565.getClass(), "id", 0);
        setField(term45565, term45565.getClass(), "content", null);
        setField(term45565, term45565.getClass(), "board", null);
        setField(term45565, term45565.getClass(), "user", null);
        setField(term45565, term45565.getClass(), "createDate", null);
        Object term45567 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term45567, term45567.getClass(), "id", 0);
        setField(term45567, term45567.getClass(), "content", null);
        setField(term45567, term45567.getClass(), "board", null);
        setField(term45567, term45567.getClass(), "user", null);
        setField(term45567, term45567.getClass(), "createDate", null);
        Object term45569 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term45569, term45569.getClass(), "id", 0);
        setField(term45569, term45569.getClass(), "content", null);
        setField(term45569, term45569.getClass(), "board", null);
        setField(term45569, term45569.getClass(), "user", null);
        setField(term45569, term45569.getClass(), "createDate", null);
        Object term45571 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term45571, term45571.getClass(), "id", 1097894139);
        setField(term45571, term45571.getClass(), "content", null);
        setField(term45571, term45571.getClass(), "board", null);
        setField(term45571, term45571.getClass(), "user", null);
        setField(term45571, term45571.getClass(), "createDate", null);
        Object term45573 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term45573, term45573.getClass(), "id", 0);
        setField(term45573, term45573.getClass(), "content", null);
        setField(term45573, term45573.getClass(), "board", null);
        setField(term45573, term45573.getClass(), "user", null);
        setField(term45573, term45573.getClass(), "createDate", null);
        Object term45575 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term45575, term45575.getClass(), "id", -484303394);
        setField(term45575, term45575.getClass(), "content", null);
        setField(term45575, term45575.getClass(), "board", null);
        setField(term45575, term45575.getClass(), "user", null);
        setField(term45575, term45575.getClass(), "createDate", null);
        ArrayList term45561 = new ArrayList();
        ((ArrayList) term45561).add(term45563);
        ((ArrayList) term45561).add(term45565);
        ((ArrayList) term45561).add(term45567);
        ((ArrayList) term45561).add(term45569);
        ((ArrayList) term45561).add(term45571);
        ((ArrayList) term45561).add(term45565);
        ((ArrayList) term45561).add(term45573);
        ((ArrayList) term45561).add(term45575);
        term45464 = newInstance(Class.forName("com.cos.blog.model.Reply$ReplyBuilder"));
        Object term45478 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term45505 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term45558 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term45579 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45580 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45584 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45589 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term45639 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term45642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45647 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term45464, term45464.getClass(), "id", 686286032);
        setField(term45464, term45464.getClass(), "content", "RDqKYQTmEE");
        setIntField(term45478, term45478.getClass(), "id", -1277201854);
        setField(term45478, term45478.getClass(), "title", "MrUUMyYAHK");
        setField(term45478, term45478.getClass(), "content", "mltJfFDGWB");
        setIntField(term45478, term45478.getClass(), "count", 1691516034);
        setIntField(term45505, term45505.getClass(), "id", 335681723);
        setField(term45505, term45505.getClass(), "username", "jXearfyNpX");
        setField(term45505, term45505.getClass(), "password", "BhmFDzFKBZ");
        setField(term45505, term45505.getClass(), "email", "LfhJOBaMfN");
        setField(term45505, term45505.getClass(), "role", enum96);
        setField(term45505, term45505.getClass(), "oauth", "gTpNrKjAOw");
        setIntField(term45558, term45558.getClass(), "nanos", 997000000);
        setLongField(term45558, term45558.getClass(), "fastTime", 1748659582000L);
        setField(term45558, term45558.getClass(), "cdate", null);
        setField(term45505, term45505.getClass(), "createDate", term45558);
        setField(term45478, term45478.getClass(), "user", term45505);
        setField(term45478, term45478.getClass(), "replys", term45561);
        setIntField(term45580, term45580.getClass(), "year", 2010);
        setShortField(term45580, term45580.getClass(), "month", (short) 5);
        setShortField(term45580, term45580.getClass(), "day", (short) 27);
        setField(term45579, term45579.getClass(), "date", term45580);
        setByteField(term45584, term45584.getClass(), "hour", (byte) 20);
        setByteField(term45584, term45584.getClass(), "minute", (byte) 55);
        setByteField(term45584, term45584.getClass(), "second", (byte) 13);
        setIntField(term45584, term45584.getClass(), "nano", 375773979);
        setField(term45579, term45579.getClass(), "time", term45584);
        setField(term45478, term45478.getClass(), "createDate", term45579);
        setField(term45464, term45464.getClass(), "board", term45478);
        setIntField(term45589, term45589.getClass(), "id", 1435572720);
        setField(term45589, term45589.getClass(), "username", "ZHBibLHikD");
        setField(term45589, term45589.getClass(), "password", "ytpYllcFQh");
        setField(term45589, term45589.getClass(), "email", "VogiBHEnKP");
        setField(term45589, term45589.getClass(), "role", enum96);
        setField(term45589, term45589.getClass(), "oauth", "PCeXUuZyQa");
        setIntField(term45639, term45639.getClass(), "nanos", 731000000);
        setLongField(term45639, term45639.getClass(), "fastTime", 1818327280000L);
        setField(term45639, term45639.getClass(), "cdate", null);
        setField(term45589, term45589.getClass(), "createDate", term45639);
        setField(term45464, term45464.getClass(), "user", term45589);
        setIntField(term45643, term45643.getClass(), "year", 2023);
        setShortField(term45643, term45643.getClass(), "month", (short) 5);
        setShortField(term45643, term45643.getClass(), "day", (short) 21);
        setField(term45642, term45642.getClass(), "date", term45643);
        setByteField(term45647, term45647.getClass(), "hour", (byte) 7);
        setByteField(term45647, term45647.getClass(), "minute", (byte) 54);
        setByteField(term45647, term45647.getClass(), "second", (byte) 55);
        setIntField(term45647, term45647.getClass(), "nano", 241590130);
        setField(term45642, term45642.getClass(), "time", term45647);
        setField(term45464, term45464.getClass(), "createDate", term45642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply$ReplyBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term45464, args);
    }

};


