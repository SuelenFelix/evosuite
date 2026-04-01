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

public class Place_setFileUrl_64701820525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8155;

    public Place_setFileUrl_64701820525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8155 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8155, term8155.getClass(), "placeNum", 1551099402);
        setField(term8155, term8155.getClass(), "keyHash", "hulYxtowxw");
        setIntField(term8155, term8155.getClass(), "placeType", -2027534003);
        setField(term8155, term8155.getClass(), "culture", "GNEmuHPNcU");
        setField(term8155, term8155.getClass(), "kpop", "IoSfuKDFRe");
        setDoubleField(term8155, term8155.getClass(), "lat", 0.11577948268926874);
        setDoubleField(term8155, term8155.getClass(), "lng", 0.5617009352394552);
        setIntField(term8155, term8155.getClass(), "status", 1063420942);
        setField(term8155, term8155.getClass(), "name", "AWYyZiNfsm");
        setField(term8155, term8155.getClass(), "explain", "ITRRYiuDwH");
        setField(term8155, term8155.getClass(), "address", "llRfwANcVF");
        setField(term8155, term8155.getClass(), "fileUrl", "sUEeHQTWkA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BDIRCxAWLA";
        callMethod(klass, "setFileUrl", argTypes, term8155, args);
    }

};


