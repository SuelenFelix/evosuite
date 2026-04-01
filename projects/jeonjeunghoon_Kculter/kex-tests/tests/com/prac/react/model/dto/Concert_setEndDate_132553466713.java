package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Concert_setEndDate_132553466713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20125;
     Object term20231;

    public Concert_setEndDate_132553466713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20125 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term20163 = newInstance(Class.forName("java.util.Date"));
        Object term20165 = newInstance(Class.forName("java.util.Date"));
        setIntField(term20125, term20125.getClass(), "concertNum", 1065595802);
        setField(term20125, term20125.getClass(), "concertHash", "jWOWtrhVkA");
        setField(term20125, term20125.getClass(), "concertName", "IyOhWYyaDV");
        setField(term20125, term20125.getClass(), "explain", "omWrkCSFzy");
        setLongField(term20163, term20163.getClass(), "fastTime", 1502158153899L);
        setField(term20163, term20163.getClass(), "cdate", null);
        setField(term20125, term20125.getClass(), "startDate", term20163);
        setLongField(term20165, term20165.getClass(), "fastTime", 1630952644759L);
        setField(term20165, term20165.getClass(), "cdate", null);
        setField(term20125, term20125.getClass(), "endDate", term20165);
        setDoubleField(term20125, term20125.getClass(), "lat", 0.22059525284415726);
        setDoubleField(term20125, term20125.getClass(), "lng", 0.281059649526194);
        setIntField(term20125, term20125.getClass(), "starKey", 21031843);
        setField(term20125, term20125.getClass(), "starHash", "VFYvUTgYFB");
        setField(term20125, term20125.getClass(), "imageUrl", "BrWqhEIUUj");
        setIntField(term20125, term20125.getClass(), "status", -380787857);
        setField(term20125, term20125.getClass(), "starName", "WfUmxdiHcU");
        setField(term20125, term20125.getClass(), "placeName", "BRrftvRvmF");
        setField(term20125, term20125.getClass(), "buySite", "fvoyRbZTsm");
        term20231 = newInstance(Class.forName("java.util.Date"));
        setLongField(term20231, term20231.getClass(), "fastTime", 1739417792956L);
        setField(term20231, term20231.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term20231;
        callMethod(klass, "setEndDate", argTypes, term20125, args);
    }

};


