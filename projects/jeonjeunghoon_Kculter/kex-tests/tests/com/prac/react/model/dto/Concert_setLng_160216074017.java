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
import java.lang.Double;

public class Concert_setLng_160216074017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20873;
     Object term20979;

    public Concert_setLng_160216074017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20873 = newInstance(Class.forName("com.prac.react.model.dto.Concert"));
        Object term20911 = newInstance(Class.forName("java.util.Date"));
        Object term20913 = newInstance(Class.forName("java.util.Date"));
        setIntField(term20873, term20873.getClass(), "concertNum", -20614472);
        setField(term20873, term20873.getClass(), "concertHash", "eMtshhmGEm");
        setField(term20873, term20873.getClass(), "concertName", "VJUbzHGOvg");
        setField(term20873, term20873.getClass(), "explain", "SiwcigIrfD");
        setLongField(term20911, term20911.getClass(), "fastTime", 1876872800559L);
        setField(term20911, term20911.getClass(), "cdate", null);
        setField(term20873, term20873.getClass(), "startDate", term20911);
        setLongField(term20913, term20913.getClass(), "fastTime", 1304532099366L);
        setField(term20913, term20913.getClass(), "cdate", null);
        setField(term20873, term20873.getClass(), "endDate", term20913);
        setDoubleField(term20873, term20873.getClass(), "lat", 0.4555542221910589);
        setDoubleField(term20873, term20873.getClass(), "lng", 0.9938727080758785);
        setIntField(term20873, term20873.getClass(), "starKey", 1126618861);
        setField(term20873, term20873.getClass(), "starHash", "MFIdGVLoDo");
        setField(term20873, term20873.getClass(), "imageUrl", "kbxgTcnXyU");
        setIntField(term20873, term20873.getClass(), "status", 947449400);
        setField(term20873, term20873.getClass(), "starName", "lnJvDbbuwo");
        setField(term20873, term20873.getClass(), "placeName", "KExnWkKGvF");
        setField(term20873, term20873.getClass(), "buySite", "luGUNfvmKk");
        term20979 = new Double(0.39416780533640805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Concert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term20979;
        callMethod(klass, "setLng", argTypes, term20873, args);
    }

};


