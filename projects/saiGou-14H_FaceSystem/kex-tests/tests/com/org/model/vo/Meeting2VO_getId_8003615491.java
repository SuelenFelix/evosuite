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

public class Meeting2VO_getId_8003615491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3995;

    public Meeting2VO_getId_8003615491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3996 = new Integer(568599855);
        Integer term4020 = new Integer(1162663216);
        term3995 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        Object term4010 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4011 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4015 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3995, term3995.getClass(), "id", term3996);
        setField(term3995, term3995.getClass(), "username", "wboNBMhRjP");
        setIntField(term4011, term4011.getClass(), "year", 2012);
        setShortField(term4011, term4011.getClass(), "month", (short) 8);
        setShortField(term4011, term4011.getClass(), "day", (short) 25);
        setField(term4010, term4010.getClass(), "date", term4011);
        setByteField(term4015, term4015.getClass(), "hour", (byte) 5);
        setByteField(term4015, term4015.getClass(), "minute", (byte) 20);
        setByteField(term4015, term4015.getClass(), "second", (byte) 50);
        setIntField(term4015, term4015.getClass(), "nano", 345595912);
        setField(term4010, term4010.getClass(), "time", term4015);
        setField(term3995, term3995.getClass(), "startTime", term4010);
        setField(term3995, term3995.getClass(), "state", term4020);
        setField(term3995, term3995.getClass(), "faceUrl", "HZODpafOGe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3995, args);
    }

};


