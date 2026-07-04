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
import java.util.LinkedList;

public class Room_setFacilities_20529116812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5421;
     Object term5474;

    public Room_setFacilities_20529116812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5422 = new Integer(207213904);
        Integer term5448 = new Integer(-484303394);
        Integer term5450 = new Integer(-31125530);
        Integer term5455 = new Integer(1909773180);
        Object term5454 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5459 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5454, term5454.getClass(), "id", term5455);
        setField(term5454, term5454.getClass(), "facilityName", "");
        setField(term5454, term5454.getClass(), "facilityState", "");
        setField(term5459, term5459.getClass(), "date", null);
        setField(term5459, term5459.getClass(), "time", null);
        setField(term5454, term5454.getClass(), "buyTime", term5459);
        Integer term5461 = new Integer(-970417907);
        Object term5460 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5465 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5460, term5460.getClass(), "id", term5461);
        setField(term5460, term5460.getClass(), "facilityName", "");
        setField(term5460, term5460.getClass(), "facilityState", "");
        setField(term5465, term5465.getClass(), "date", null);
        setField(term5465, term5465.getClass(), "time", null);
        setField(term5460, term5460.getClass(), "buyTime", term5465);
        Integer term5467 = new Integer(1097894139);
        Object term5466 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5471 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5466, term5466.getClass(), "id", term5467);
        setField(term5466, term5466.getClass(), "facilityName", "");
        setField(term5466, term5466.getClass(), "facilityState", "");
        setField(term5471, term5471.getClass(), "date", null);
        setField(term5471, term5471.getClass(), "time", null);
        setField(term5466, term5466.getClass(), "buyTime", term5471);
        ArrayList term5452 = new ArrayList();
        ((ArrayList) term5452).add(term5454);
        ((ArrayList) term5452).add(term5460);
        ((ArrayList) term5452).add(term5466);
        term5421 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5421, term5421.getClass(), "id", term5422);
        setField(term5421, term5421.getClass(), "roomName", "fdBtFIcFIQ");
        setField(term5421, term5421.getClass(), "roomAddr", "XixxNbivtN");
        setField(term5421, term5421.getClass(), "peoples", term5448);
        setField(term5421, term5421.getClass(), "meetroomState", term5450);
        setField(term5421, term5421.getClass(), "facilities", term5452);
        Integer term5478 = new Integer(390256347);
        Object term5477 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5504 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5505 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5509 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5477, term5477.getClass(), "id", term5478);
        setField(term5477, term5477.getClass(), "facilityName", "WmLDnzSUcH");
        setField(term5477, term5477.getClass(), "facilityState", "jzYgniVftZ");
        setIntField(term5505, term5505.getClass(), "year", 2015);
        setShortField(term5505, term5505.getClass(), "month", (short) 10);
        setShortField(term5505, term5505.getClass(), "day", (short) 3);
        setField(term5504, term5504.getClass(), "date", term5505);
        setByteField(term5509, term5509.getClass(), "hour", (byte) 10);
        setByteField(term5509, term5509.getClass(), "minute", (byte) 45);
        setByteField(term5509, term5509.getClass(), "second", (byte) 18);
        setIntField(term5509, term5509.getClass(), "nano", 333457081);
        setField(term5504, term5504.getClass(), "time", term5509);
        setField(term5477, term5477.getClass(), "buyTime", term5504);
        Integer term5516 = new Integer(1471619998);
        Object term5515 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5520 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5515, term5515.getClass(), "id", term5516);
        setField(term5515, term5515.getClass(), "facilityName", "");
        setField(term5515, term5515.getClass(), "facilityState", "");
        setField(term5520, term5520.getClass(), "date", null);
        setField(term5520, term5520.getClass(), "time", null);
        setField(term5515, term5515.getClass(), "buyTime", term5520);
        Integer term5523 = new Integer(-1623489521);
        Object term5522 = newInstance(Class.forName("com.org.model.Facility"));
        setField(term5522, term5522.getClass(), "id", term5523);
        setField(term5522, term5522.getClass(), "facilityName", null);
        setField(term5522, term5522.getClass(), "facilityState", null);
        setField(term5522, term5522.getClass(), "buyTime", null);
        term5474 = new LinkedList();
        ((LinkedList) term5474).add(term5477);
        ((LinkedList) term5474).add(term5515);
        ((LinkedList) term5474).add(term5522);
        ((LinkedList) term5474).add((Object)null);
        ((LinkedList) term5474).add((Object)null);
        ((LinkedList) term5474).add((Object)null);
        ((LinkedList) term5474).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5474;
        callMethod(klass, "setFacilities", argTypes, term5421, args);
    }

};


