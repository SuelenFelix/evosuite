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

public class Room_getMeetroomState_12584397365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4794;

    public Room_getMeetroomState_12584397365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4795 = new Integer(1608000247);
        Integer term4821 = new Integer(1354560887);
        Integer term4823 = new Integer(-749474542);
        Integer term4828 = new Integer(-47907780);
        Object term4827 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4832 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4827, term4827.getClass(), "id", term4828);
        setField(term4827, term4827.getClass(), "facilityName", "");
        setField(term4827, term4827.getClass(), "facilityState", "");
        setField(term4832, term4832.getClass(), "date", null);
        setField(term4832, term4832.getClass(), "time", null);
        setField(term4827, term4827.getClass(), "buyTime", term4832);
        Integer term4834 = new Integer(1131462369);
        Object term4833 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4838 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4833, term4833.getClass(), "id", term4834);
        setField(term4833, term4833.getClass(), "facilityName", "");
        setField(term4833, term4833.getClass(), "facilityState", "");
        setField(term4838, term4838.getClass(), "date", null);
        setField(term4838, term4838.getClass(), "time", null);
        setField(term4833, term4833.getClass(), "buyTime", term4838);
        Integer term4840 = new Integer(-1161206731);
        Object term4839 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4844 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4839, term4839.getClass(), "id", term4840);
        setField(term4839, term4839.getClass(), "facilityName", "");
        setField(term4839, term4839.getClass(), "facilityState", "");
        setField(term4844, term4844.getClass(), "date", null);
        setField(term4844, term4844.getClass(), "time", null);
        setField(term4839, term4839.getClass(), "buyTime", term4844);
        Integer term4846 = new Integer(-992847709);
        Object term4845 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4850 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4845, term4845.getClass(), "id", term4846);
        setField(term4845, term4845.getClass(), "facilityName", "");
        setField(term4845, term4845.getClass(), "facilityState", "");
        setField(term4850, term4850.getClass(), "date", null);
        setField(term4850, term4850.getClass(), "time", null);
        setField(term4845, term4845.getClass(), "buyTime", term4850);
        Integer term4852 = new Integer(1125156671);
        Object term4851 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4856 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4851, term4851.getClass(), "id", term4852);
        setField(term4851, term4851.getClass(), "facilityName", "");
        setField(term4851, term4851.getClass(), "facilityState", "");
        setField(term4856, term4856.getClass(), "date", null);
        setField(term4856, term4856.getClass(), "time", null);
        setField(term4851, term4851.getClass(), "buyTime", term4856);
        ArrayList term4825 = new ArrayList();
        ((ArrayList) term4825).add(term4827);
        ((ArrayList) term4825).add(term4833);
        ((ArrayList) term4825).add(term4839);
        ((ArrayList) term4825).add(term4845);
        ((ArrayList) term4825).add(term4851);
        term4794 = newInstance(Class.forName("com.org.model.Room"));
        setField(term4794, term4794.getClass(), "id", term4795);
        setField(term4794, term4794.getClass(), "roomName", "AgLTAjLwXk");
        setField(term4794, term4794.getClass(), "roomAddr", "INoAjOhMEq");
        setField(term4794, term4794.getClass(), "peoples", term4821);
        setField(term4794, term4794.getClass(), "meetroomState", term4823);
        setField(term4794, term4794.getClass(), "facilities", term4825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeetroomState", argTypes, term4794, args);
    }

};


