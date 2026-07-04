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

public class Room_getId_6479453441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4454;

    public Room_getId_6479453441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4455 = new Integer(1704024265);
        Integer term4481 = new Integer(501801161);
        Integer term4483 = new Integer(2103971768);
        Integer term4488 = new Integer(-939132796);
        Object term4487 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4492 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4487, term4487.getClass(), "id", term4488);
        setField(term4487, term4487.getClass(), "facilityName", "");
        setField(term4487, term4487.getClass(), "facilityState", "");
        setField(term4492, term4492.getClass(), "date", null);
        setField(term4492, term4492.getClass(), "time", null);
        setField(term4487, term4487.getClass(), "buyTime", term4492);
        Integer term4494 = new Integer(159279866);
        Object term4493 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4498 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4493, term4493.getClass(), "id", term4494);
        setField(term4493, term4493.getClass(), "facilityName", "");
        setField(term4493, term4493.getClass(), "facilityState", "");
        setField(term4498, term4498.getClass(), "date", null);
        setField(term4498, term4498.getClass(), "time", null);
        setField(term4493, term4493.getClass(), "buyTime", term4498);
        Integer term4500 = new Integer(138122227);
        Object term4499 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4504 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4499, term4499.getClass(), "id", term4500);
        setField(term4499, term4499.getClass(), "facilityName", "");
        setField(term4499, term4499.getClass(), "facilityState", "");
        setField(term4504, term4504.getClass(), "date", null);
        setField(term4504, term4504.getClass(), "time", null);
        setField(term4499, term4499.getClass(), "buyTime", term4504);
        Integer term4506 = new Integer(1795358995);
        Object term4505 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4510 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4505, term4505.getClass(), "id", term4506);
        setField(term4505, term4505.getClass(), "facilityName", "");
        setField(term4505, term4505.getClass(), "facilityState", "");
        setField(term4510, term4510.getClass(), "date", null);
        setField(term4510, term4510.getClass(), "time", null);
        setField(term4505, term4505.getClass(), "buyTime", term4510);
        ArrayList term4485 = new ArrayList();
        ((ArrayList) term4485).add(term4487);
        ((ArrayList) term4485).add(term4493);
        ((ArrayList) term4485).add(term4499);
        ((ArrayList) term4485).add(term4505);
        term4454 = newInstance(Class.forName("com.org.model.Room"));
        setField(term4454, term4454.getClass(), "id", term4455);
        setField(term4454, term4454.getClass(), "roomName", "oCLpbAHyax");
        setField(term4454, term4454.getClass(), "roomAddr", "nKWQlKSRtt");
        setField(term4454, term4454.getClass(), "peoples", term4481);
        setField(term4454, term4454.getClass(), "meetroomState", term4483);
        setField(term4454, term4454.getClass(), "facilities", term4485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4454, args);
    }

};


