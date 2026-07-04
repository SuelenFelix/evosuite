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

public class Room_getRoomName_2836704262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4533;

    public Room_getRoomName_2836704262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4534 = new Integer(-781185864);
        Integer term4560 = new Integer(340500914);
        Integer term4562 = new Integer(-2061712635);
        Integer term4567 = new Integer(1182911731);
        Object term4566 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4571 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4566, term4566.getClass(), "id", term4567);
        setField(term4566, term4566.getClass(), "facilityName", "");
        setField(term4566, term4566.getClass(), "facilityState", "");
        setField(term4571, term4571.getClass(), "date", null);
        setField(term4571, term4571.getClass(), "time", null);
        setField(term4566, term4566.getClass(), "buyTime", term4571);
        Integer term4573 = new Integer(644726932);
        Object term4572 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4577 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4572, term4572.getClass(), "id", term4573);
        setField(term4572, term4572.getClass(), "facilityName", "");
        setField(term4572, term4572.getClass(), "facilityState", "");
        setField(term4577, term4577.getClass(), "date", null);
        setField(term4577, term4577.getClass(), "time", null);
        setField(term4572, term4572.getClass(), "buyTime", term4577);
        Integer term4579 = new Integer(-1515977761);
        Object term4578 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4583 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4578, term4578.getClass(), "id", term4579);
        setField(term4578, term4578.getClass(), "facilityName", "");
        setField(term4578, term4578.getClass(), "facilityState", "");
        setField(term4583, term4583.getClass(), "date", null);
        setField(term4583, term4583.getClass(), "time", null);
        setField(term4578, term4578.getClass(), "buyTime", term4583);
        ArrayList term4564 = new ArrayList();
        ((ArrayList) term4564).add(term4566);
        ((ArrayList) term4564).add(term4572);
        ((ArrayList) term4564).add(term4578);
        term4533 = newInstance(Class.forName("com.org.model.Room"));
        setField(term4533, term4533.getClass(), "id", term4534);
        setField(term4533, term4533.getClass(), "roomName", "MaBKpYpsjS");
        setField(term4533, term4533.getClass(), "roomAddr", "kojhIAlLyo");
        setField(term4533, term4533.getClass(), "peoples", term4560);
        setField(term4533, term4533.getClass(), "meetroomState", term4562);
        setField(term4533, term4533.getClass(), "facilities", term4564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoomName", argTypes, term4533, args);
    }

};


