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

public class Room_setFacilities_20529116813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5422;
     Object term5475;

    public Room_setFacilities_20529116813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5423 = new Integer(207213904);
        Integer term5449 = new Integer(-484303394);
        Integer term5451 = new Integer(-31125530);
        Integer term5456 = new Integer(1909773180);
        Object term5455 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5460 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5455, term5455.getClass(), "id", term5456);
        setField(term5455, term5455.getClass(), "facilityName", "");
        setField(term5455, term5455.getClass(), "facilityState", "");
        setField(term5460, term5460.getClass(), "date", null);
        setField(term5460, term5460.getClass(), "time", null);
        setField(term5455, term5455.getClass(), "buyTime", term5460);
        Integer term5462 = new Integer(-970417907);
        Object term5461 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5466 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5461, term5461.getClass(), "id", term5462);
        setField(term5461, term5461.getClass(), "facilityName", "");
        setField(term5461, term5461.getClass(), "facilityState", "");
        setField(term5466, term5466.getClass(), "date", null);
        setField(term5466, term5466.getClass(), "time", null);
        setField(term5461, term5461.getClass(), "buyTime", term5466);
        Integer term5468 = new Integer(1097894139);
        Object term5467 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5472 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5467, term5467.getClass(), "id", term5468);
        setField(term5467, term5467.getClass(), "facilityName", "");
        setField(term5467, term5467.getClass(), "facilityState", "");
        setField(term5472, term5472.getClass(), "date", null);
        setField(term5472, term5472.getClass(), "time", null);
        setField(term5467, term5467.getClass(), "buyTime", term5472);
        ArrayList term5453 = new ArrayList();
        ((ArrayList) term5453).add(term5455);
        ((ArrayList) term5453).add(term5461);
        ((ArrayList) term5453).add(term5467);
        term5422 = newInstance(Class.forName("com.org.model.Room"));
        setField(term5422, term5422.getClass(), "id", term5423);
        setField(term5422, term5422.getClass(), "roomName", "fdBtFIcFIQ");
        setField(term5422, term5422.getClass(), "roomAddr", "XixxNbivtN");
        setField(term5422, term5422.getClass(), "peoples", term5449);
        setField(term5422, term5422.getClass(), "meetroomState", term5451);
        setField(term5422, term5422.getClass(), "facilities", term5453);
        Integer term5479 = new Integer(390256347);
        Object term5478 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5505 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5506 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5510 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term5478, term5478.getClass(), "id", term5479);
        setField(term5478, term5478.getClass(), "facilityName", "WmLDnzSUcH");
        setField(term5478, term5478.getClass(), "facilityState", "jzYgniVftZ");
        setIntField(term5506, term5506.getClass(), "year", 2015);
        setShortField(term5506, term5506.getClass(), "month", (short) 10);
        setShortField(term5506, term5506.getClass(), "day", (short) 3);
        setField(term5505, term5505.getClass(), "date", term5506);
        setByteField(term5510, term5510.getClass(), "hour", (byte) 10);
        setByteField(term5510, term5510.getClass(), "minute", (byte) 45);
        setByteField(term5510, term5510.getClass(), "second", (byte) 18);
        setIntField(term5510, term5510.getClass(), "nano", 333457081);
        setField(term5505, term5505.getClass(), "time", term5510);
        setField(term5478, term5478.getClass(), "buyTime", term5505);
        Integer term5517 = new Integer(1471619998);
        Object term5516 = newInstance(Class.forName("com.org.model.Facility"));
        Object term5521 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term5516, term5516.getClass(), "id", term5517);
        setField(term5516, term5516.getClass(), "facilityName", "");
        setField(term5516, term5516.getClass(), "facilityState", "");
        setField(term5521, term5521.getClass(), "date", null);
        setField(term5521, term5521.getClass(), "time", null);
        setField(term5516, term5516.getClass(), "buyTime", term5521);
        Integer term5524 = new Integer(-1623489521);
        Object term5523 = newInstance(Class.forName("com.org.model.Facility"));
        setField(term5523, term5523.getClass(), "id", term5524);
        setField(term5523, term5523.getClass(), "facilityName", null);
        setField(term5523, term5523.getClass(), "facilityState", null);
        setField(term5523, term5523.getClass(), "buyTime", null);
        term5475 = new LinkedList();
        ((LinkedList) term5475).add(term5478);
        ((LinkedList) term5475).add(term5516);
        ((LinkedList) term5475).add(term5523);
        ((LinkedList) term5475).add((Object)null);
        ((LinkedList) term5475).add((Object)null);
        ((LinkedList) term5475).add((Object)null);
        ((LinkedList) term5475).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term5475;
        callMethod(klass, "setFacilities", argTypes, term5422, args);
    }

};


