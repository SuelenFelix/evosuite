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

public class Room_setRoomAddr_205529040410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5183;

    public Room_setRoomAddr_205529040410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5184 = new Integer(-2033952124);
        Integer term5210 = new Integer(560401653);
        Integer term5212 = new Integer(1633691536);
        Integer term5217 = new Integer(898165245);
        Object term5216 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5221 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5216, term5216.getClass(), "id", term5217);
        setField(term5216, term5216.getClass(), "facilityName", "");
        setField(term5216, term5216.getClass(), "facilityState", "");
        setField(term5221, term5221.getClass(), "date", null);
        setField(term5221, term5221.getClass(), "time", null);
        setField(term5216, term5216.getClass(), "buyTime", term5221);
        Integer term5223 = new Integer(1810754549);
        Object term5222 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5227 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5222, term5222.getClass(), "id", term5223);
        setField(term5222, term5222.getClass(), "facilityName", "");
        setField(term5222, term5222.getClass(), "facilityState", "");
        setField(term5227, term5227.getClass(), "date", null);
        setField(term5227, term5227.getClass(), "time", null);
        setField(term5222, term5222.getClass(), "buyTime", term5227);
        Integer term5229 = new Integer(338342107);
        Object term5228 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5233 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5228, term5228.getClass(), "id", term5229);
        setField(term5228, term5228.getClass(), "facilityName", "");
        setField(term5228, term5228.getClass(), "facilityState", "");
        setField(term5233, term5233.getClass(), "date", null);
        setField(term5233, term5233.getClass(), "time", null);
        setField(term5228, term5228.getClass(), "buyTime", term5233);
        Integer term5235 = new Integer(-650288950);
        Object term5234 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5239 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5234, term5234.getClass(), "id", term5235);
        setField(term5234, term5234.getClass(), "facilityName", "");
        setField(term5234, term5234.getClass(), "facilityState", "");
        setField(term5239, term5239.getClass(), "date", null);
        setField(term5239, term5239.getClass(), "time", null);
        setField(term5234, term5234.getClass(), "buyTime", term5239);
        Integer term5241 = new Integer(433039357);
        Object term5240 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5245 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5240, term5240.getClass(), "id", term5241);
        setField(term5240, term5240.getClass(), "facilityName", "");
        setField(term5240, term5240.getClass(), "facilityState", "");
        setField(term5245, term5245.getClass(), "date", null);
        setField(term5245, term5245.getClass(), "time", null);
        setField(term5240, term5240.getClass(), "buyTime", term5245);
        Integer term5247 = new Integer(1469939797);
        Object term5246 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5251 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5246, term5246.getClass(), "id", term5247);
        setField(term5246, term5246.getClass(), "facilityName", "");
        setField(term5246, term5246.getClass(), "facilityState", "");
        setField(term5251, term5251.getClass(), "date", null);
        setField(term5251, term5251.getClass(), "time", null);
        setField(term5246, term5246.getClass(), "buyTime", term5251);
        Integer term5253 = new Integer(252799294);
        Object term5252 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5257 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5252, term5252.getClass(), "id", term5253);
        setField(term5252, term5252.getClass(), "facilityName", "");
        setField(term5252, term5252.getClass(), "facilityState", "");
        setField(term5257, term5257.getClass(), "date", null);
        setField(term5257, term5257.getClass(), "time", null);
        setField(term5252, term5252.getClass(), "buyTime", term5257);
        ArrayList term5214 = new ArrayList();
        ((ArrayList) term5214).add(term5216);
        ((ArrayList) term5214).add(term5222);
        ((ArrayList) term5214).add(term5228);
        ((ArrayList) term5214).add(term5234);
        ((ArrayList) term5214).add(term5240);
        ((ArrayList) term5214).add(term5246);
        ((ArrayList) term5214).add(term5252);
        term5183 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5183, term5183.getClass(), "id", term5184);
        setField(term5183, term5183.getClass(), "roomName", "llUdMgKbEf");
        setField(term5183, term5183.getClass(), "roomAddr", "BqtmlODLQw");
        setField(term5183, term5183.getClass(), "peoples", term5210);
        setField(term5183, term5183.getClass(), "meetroomState", term5212);
        setField(term5183, term5183.getClass(), "facilities", term5214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LIheLKvBPl";
        callMethod(klass, "setRoomAddr", argTypes, term5183, args);
    }

};


