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

public class Room_getFacilities_11109937666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4879;

    public Room_getFacilities_11109937666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4880 = new Integer(1203107925);
        Integer term4906 = new Integer(1825448944);
        Integer term4908 = new Integer(1769496642);
        Integer term4913 = new Integer(-947460705);
        Object term4912 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4917 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4912, term4912.getClass(), "id", term4913);
        setField(term4912, term4912.getClass(), "facilityName", "");
        setField(term4912, term4912.getClass(), "facilityState", "");
        setField(term4917, term4917.getClass(), "date", null);
        setField(term4917, term4917.getClass(), "time", null);
        setField(term4912, term4912.getClass(), "buyTime", term4917);
        Integer term4919 = new Integer(-1435758764);
        Object term4918 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4923 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4918, term4918.getClass(), "id", term4919);
        setField(term4918, term4918.getClass(), "facilityName", "");
        setField(term4918, term4918.getClass(), "facilityState", "");
        setField(term4923, term4923.getClass(), "date", null);
        setField(term4923, term4923.getClass(), "time", null);
        setField(term4918, term4918.getClass(), "buyTime", term4923);
        Integer term4925 = new Integer(752858379);
        Object term4924 = newInstance(Class.forName("com.org.model.Facility"));
        Object term4929 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term4924, term4924.getClass(), "id", term4925);
        setField(term4924, term4924.getClass(), "facilityName", "");
        setField(term4924, term4924.getClass(), "facilityState", "");
        setField(term4929, term4929.getClass(), "date", null);
        setField(term4929, term4929.getClass(), "time", null);
        setField(term4924, term4924.getClass(), "buyTime", term4929);
        ArrayList term4910 = new ArrayList();
        ((ArrayList) term4910).add(term4912);
        ((ArrayList) term4910).add(term4918);
        ((ArrayList) term4910).add(term4924);
        term4879 = newInstance(Class.forName("com.org.model.Room"));
        setField(term4879, term4879.getClass(), "id", term4880);
        setField(term4879, term4879.getClass(), "roomName", "NsaFgLGmdm");
        setField(term4879, term4879.getClass(), "roomAddr", "NpeQNuPyKD");
        setField(term4879, term4879.getClass(), "peoples", term4906);
        setField(term4879, term4879.getClass(), "meetroomState", term4908);
        setField(term4879, term4879.getClass(), "facilities", term4910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Room");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFacilities", argTypes, term4879, args);
    }

};


