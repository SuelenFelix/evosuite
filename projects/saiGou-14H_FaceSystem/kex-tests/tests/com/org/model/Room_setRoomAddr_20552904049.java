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
import java.util.ArrayList;
import java.lang.Object;

public class Room_setRoomAddr_20552904049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5182;

    public Room_setRoomAddr_20552904049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5183 = new Integer(-2033952124);
        Integer term5209 = new Integer(560401653);
        Integer term5211 = new Integer(1633691536);
        Integer term5216 = new Integer(898165245);
        Object term5215 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5220 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5215, term5215.getClass(), "id", term5216);
        setField(term5215, term5215.getClass(), "facilityName", "");
        setField(term5215, term5215.getClass(), "facilityState", "");
        setField(term5220, term5220.getClass(), "date", null);
        setField(term5220, term5220.getClass(), "time", null);
        setField(term5215, term5215.getClass(), "buyTime", term5220);
        Integer term5222 = new Integer(1810754549);
        Object term5221 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5226 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5221, term5221.getClass(), "id", term5222);
        setField(term5221, term5221.getClass(), "facilityName", "");
        setField(term5221, term5221.getClass(), "facilityState", "");
        setField(term5226, term5226.getClass(), "date", null);
        setField(term5226, term5226.getClass(), "time", null);
        setField(term5221, term5221.getClass(), "buyTime", term5226);
        Integer term5228 = new Integer(338342107);
        Object term5227 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5232 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5227, term5227.getClass(), "id", term5228);
        setField(term5227, term5227.getClass(), "facilityName", "");
        setField(term5227, term5227.getClass(), "facilityState", "");
        setField(term5232, term5232.getClass(), "date", null);
        setField(term5232, term5232.getClass(), "time", null);
        setField(term5227, term5227.getClass(), "buyTime", term5232);
        Integer term5234 = new Integer(-650288950);
        Object term5233 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5238 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5233, term5233.getClass(), "id", term5234);
        setField(term5233, term5233.getClass(), "facilityName", "");
        setField(term5233, term5233.getClass(), "facilityState", "");
        setField(term5238, term5238.getClass(), "date", null);
        setField(term5238, term5238.getClass(), "time", null);
        setField(term5233, term5233.getClass(), "buyTime", term5238);
        Integer term5240 = new Integer(433039357);
        Object term5239 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5244 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5239, term5239.getClass(), "id", term5240);
        setField(term5239, term5239.getClass(), "facilityName", "");
        setField(term5239, term5239.getClass(), "facilityState", "");
        setField(term5244, term5244.getClass(), "date", null);
        setField(term5244, term5244.getClass(), "time", null);
        setField(term5239, term5239.getClass(), "buyTime", term5244);
        Integer term5246 = new Integer(1469939797);
        Object term5245 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5250 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5245, term5245.getClass(), "id", term5246);
        setField(term5245, term5245.getClass(), "facilityName", "");
        setField(term5245, term5245.getClass(), "facilityState", "");
        setField(term5250, term5250.getClass(), "date", null);
        setField(term5250, term5250.getClass(), "time", null);
        setField(term5245, term5245.getClass(), "buyTime", term5250);
        Integer term5252 = new Integer(252799294);
        Object term5251 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5256 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5251, term5251.getClass(), "id", term5252);
        setField(term5251, term5251.getClass(), "facilityName", "");
        setField(term5251, term5251.getClass(), "facilityState", "");
        setField(term5256, term5256.getClass(), "date", null);
        setField(term5256, term5256.getClass(), "time", null);
        setField(term5251, term5251.getClass(), "buyTime", term5256);
        ArrayList term5213 = new ArrayList();
        ((ArrayList) term5213).add(term5215);
        ((ArrayList) term5213).add(term5221);
        ((ArrayList) term5213).add(term5227);
        ((ArrayList) term5213).add(term5233);
        ((ArrayList) term5213).add(term5239);
        ((ArrayList) term5213).add(term5245);
        ((ArrayList) term5213).add(term5251);
        term5182 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5182, term5182.getClass(), "id", term5183);
        setField(term5182, term5182.getClass(), "roomName", "llUdMgKbEf");
        setField(term5182, term5182.getClass(), "roomAddr", "BqtmlODLQw");
        setField(term5182, term5182.getClass(), "peoples", term5209);
        setField(term5182, term5182.getClass(), "meetroomState", term5211);
        setField(term5182, term5182.getClass(), "facilities", term5213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LIheLKvBPl";
        callMethod(klass, "setRoomAddr", argTypes, term5182, args);
    }

};


