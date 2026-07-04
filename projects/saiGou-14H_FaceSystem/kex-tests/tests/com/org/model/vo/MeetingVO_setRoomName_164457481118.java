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

public class MeetingVO_setRoomName_164457481118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10136;

    public MeetingVO_setRoomName_164457481118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10137 = new Integer(1638851942);
        Integer term10175 = new Integer(1374790203);
        Integer term10235 = new Integer(1160010161);
        Integer term10247 = new Integer(-423900705);
        Integer term10249 = new Integer(-525570815);
        term10136 = newInstance(Class.forName("com.org.model.vo.MeetingVO"));
        Object term10177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10182 = newInstance(Class.forName("java.time.LocalTime"));
        Object term10237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term10238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10242 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term10136, term10136.getClass(), "id", term10137);
        setField(term10136, term10136.getClass(), "name", "sGfzmhpQEH");
        setField(term10136, term10136.getClass(), "host", "FqGkFGXAbg");
        setField(term10136, term10136.getClass(), "roomName", "SSWEZgFiFO");
        setField(term10136, term10136.getClass(), "online", term10175);
        setIntField(term10178, term10178.getClass(), "year", 2011);
        setShortField(term10178, term10178.getClass(), "month", (short) 10);
        setShortField(term10178, term10178.getClass(), "day", (short) 25);
        setField(term10177, term10177.getClass(), "date", term10178);
        setByteField(term10182, term10182.getClass(), "hour", (byte) 10);
        setByteField(term10182, term10182.getClass(), "minute", (byte) 33);
        setByteField(term10182, term10182.getClass(), "second", (byte) 8);
        setIntField(term10182, term10182.getClass(), "nano", 268304014);
        setField(term10177, term10177.getClass(), "time", term10182);
        setField(term10136, term10136.getClass(), "createTime", term10177);
        setField(term10136, term10136.getClass(), "link", "spphrCslQA");
        setField(term10136, term10136.getClass(), "meetingTime", "EPkEFVlZrY");
        setField(term10136, term10136.getClass(), "signTime", "jySnpYEVPv");
        setField(term10136, term10136.getClass(), "introduce", "VdHqujFzSo");
        setField(term10136, term10136.getClass(), "state", term10235);
        setIntField(term10238, term10238.getClass(), "year", 2024);
        setShortField(term10238, term10238.getClass(), "month", (short) 5);
        setShortField(term10238, term10238.getClass(), "day", (short) 6);
        setField(term10237, term10237.getClass(), "date", term10238);
        setByteField(term10242, term10242.getClass(), "hour", (byte) 20);
        setByteField(term10242, term10242.getClass(), "minute", (byte) 14);
        setByteField(term10242, term10242.getClass(), "second", (byte) 27);
        setIntField(term10242, term10242.getClass(), "nano", 900636101);
        setField(term10237, term10237.getClass(), "time", term10242);
        setField(term10136, term10136.getClass(), "updateTime", term10237);
        setField(term10136, term10136.getClass(), "userNumber", term10247);
        setField(term10136, term10136.getClass(), "signNumber", term10249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.MeetingVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cZbOKEdKPs";
        callMethod(klass, "setRoomName", argTypes, term10136, args);
    }

};


