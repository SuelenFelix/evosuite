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

public class Place_getAddress_63635046622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7653;

    public Place_getAddress_63635046622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7653 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term7653, term7653.getClass(), "placeNum", -1588772968);
        setField(term7653, term7653.getClass(), "keyHash", "GPSEWEDSTo");
        setIntField(term7653, term7653.getClass(), "placeType", -93135961);
        setField(term7653, term7653.getClass(), "culture", "RCOqfVsRHt");
        setField(term7653, term7653.getClass(), "kpop", "TSyCeEZPaT");
        setDoubleField(term7653, term7653.getClass(), "lat", 0.3626177854778667);
        setDoubleField(term7653, term7653.getClass(), "lng", 0.3163771663728089);
        setIntField(term7653, term7653.getClass(), "status", -112921587);
        setField(term7653, term7653.getClass(), "name", "JeZFtaqkzW");
        setField(term7653, term7653.getClass(), "explain", "vOVuNSCCLe");
        setField(term7653, term7653.getClass(), "address", "fzeqPnzpnt");
        setField(term7653, term7653.getClass(), "fileUrl", "RxbhrFBjkO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term7653, args);
    }

};


