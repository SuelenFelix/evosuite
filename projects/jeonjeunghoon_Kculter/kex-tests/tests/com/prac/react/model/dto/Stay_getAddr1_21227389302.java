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

public class Stay_getAddr1_21227389302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;

    public Stay_getAddr1_21227389302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term181, term181.getClass(), "addr1", "hRNSzYYIrc");
        setField(term181, term181.getClass(), "addr2", "RMFIsYGgne");
        setField(term181, term181.getClass(), "areaCode", "NRdvgJlhkX");
        setField(term181, term181.getClass(), "sigunguCode", "uuaPigETmJ");
        setField(term181, term181.getClass(), "representImg", "MxlszYVzRf");
        setField(term181, term181.getClass(), "sumnail", "LQFpaHEwXR");
        setDoubleField(term181, term181.getClass(), "lng", 0.5523635872663106);
        setDoubleField(term181, term181.getClass(), "lat", 0.544608645520025);
        setField(term181, term181.getClass(), "tel", "oVcInYnLWB");
        setField(term181, term181.getClass(), "title", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddr1", argTypes, term181, args);
    }

};


