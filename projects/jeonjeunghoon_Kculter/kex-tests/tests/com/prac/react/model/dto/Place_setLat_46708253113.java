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
import java.lang.Double;

public class Place_setLat_46708253113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6163;
     Object term6253;

    public Place_setLat_46708253113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6163 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term6163, term6163.getClass(), "placeNum", -1145578966);
        setField(term6163, term6163.getClass(), "keyHash", "SPtPatHeOm");
        setIntField(term6163, term6163.getClass(), "placeType", 679763016);
        setField(term6163, term6163.getClass(), "culture", "ywmcuThdfL");
        setField(term6163, term6163.getClass(), "kpop", "GBOEuByOfr");
        setDoubleField(term6163, term6163.getClass(), "lat", 0.7154795600170818);
        setDoubleField(term6163, term6163.getClass(), "lng", 0.6355029654528058);
        setIntField(term6163, term6163.getClass(), "status", 1962444399);
        setField(term6163, term6163.getClass(), "name", "NHbOFFjyVK");
        setField(term6163, term6163.getClass(), "explain", "zaloBqlrSo");
        setField(term6163, term6163.getClass(), "address", "vvoLrMGCoN");
        setField(term6163, term6163.getClass(), "fileUrl", "pXdglvyrQe");
        term6253 = new Double(0.0022646783892913414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term6253;
        callMethod(klass, "setLat", argTypes, term6163, args);
    }

};


