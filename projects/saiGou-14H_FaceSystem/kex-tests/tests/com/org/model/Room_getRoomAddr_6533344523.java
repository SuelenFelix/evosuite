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

public class Room_getRoomAddr_6533344523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4606;

    public Room_getRoomAddr_6533344523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4607 = new Integer(-1476037190);
        Integer term4633 = new Integer(-718204437);
        Integer term4635 = new Integer(468974358);
        Integer term4640 = new Integer(346282818);
        Object term4639 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4644 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4639, term4639.getClass(), "id", term4640);
        setField(term4639, term4639.getClass(), "facilityName", "");
        setField(term4639, term4639.getClass(), "facilityState", "");
        setField(term4644, term4644.getClass(), "date", null);
        setField(term4644, term4644.getClass(), "time", null);
        setField(term4639, term4639.getClass(), "buyTime", term4644);
        Integer term4646 = new Integer(-857876056);
        Object term4645 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4650 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4645, term4645.getClass(), "id", term4646);
        setField(term4645, term4645.getClass(), "facilityName", "");
        setField(term4645, term4645.getClass(), "facilityState", "");
        setField(term4650, term4650.getClass(), "date", null);
        setField(term4650, term4650.getClass(), "time", null);
        setField(term4645, term4645.getClass(), "buyTime", term4650);
        Integer term4652 = new Integer(1392910876);
        Object term4651 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4656 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4651, term4651.getClass(), "id", term4652);
        setField(term4651, term4651.getClass(), "facilityName", "");
        setField(term4651, term4651.getClass(), "facilityState", "");
        setField(term4656, term4656.getClass(), "date", null);
        setField(term4656, term4656.getClass(), "time", null);
        setField(term4651, term4651.getClass(), "buyTime", term4656);
        Integer term4658 = new Integer(1086383182);
        Object term4657 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4662 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4657, term4657.getClass(), "id", term4658);
        setField(term4657, term4657.getClass(), "facilityName", "");
        setField(term4657, term4657.getClass(), "facilityState", "");
        setField(term4662, term4662.getClass(), "date", null);
        setField(term4662, term4662.getClass(), "time", null);
        setField(term4657, term4657.getClass(), "buyTime", term4662);
        Integer term4664 = new Integer(1425319286);
        Object term4663 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4668 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4663, term4663.getClass(), "id", term4664);
        setField(term4663, term4663.getClass(), "facilityName", "");
        setField(term4663, term4663.getClass(), "facilityState", "");
        setField(term4668, term4668.getClass(), "date", null);
        setField(term4668, term4668.getClass(), "time", null);
        setField(term4663, term4663.getClass(), "buyTime", term4668);
        ArrayList term4637 = new ArrayList();
        ((ArrayList) term4637).add(term4639);
        ((ArrayList) term4637).add(term4645);
        ((ArrayList) term4637).add(term4651);
        ((ArrayList) term4637).add(term4657);
        ((ArrayList) term4637).add(term4663);
        term4606 = newInstance(Class.forName("com.org.model.Room"));
        setField(term4606, term4606.getClass(), "id", term4607);
        setField(term4606, term4606.getClass(), "roomName", "CaYUiktPks");
        setField(term4606, term4606.getClass(), "roomAddr", "xSNRqymNqF");
        setField(term4606, term4606.getClass(), "peoples", term4633);
        setField(term4606, term4606.getClass(), "meetroomState", term4635);
        setField(term4606, term4606.getClass(), "facilities", term4637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoomAddr", argTypes, term4606, args);
    }

};


