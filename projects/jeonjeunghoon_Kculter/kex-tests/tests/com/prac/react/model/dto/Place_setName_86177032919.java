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

public class Place_setName_86177032919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7129;

    public Place_setName_86177032919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7129 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term7129, term7129.getClass(), "placeNum", -184153539);
        setField(term7129, term7129.getClass(), "keyHash", "IlvgFINwIa");
        setIntField(term7129, term7129.getClass(), "placeType", 493620644);
        setField(term7129, term7129.getClass(), "culture", "GEJABPlHSI");
        setField(term7129, term7129.getClass(), "kpop", "aQFUvuaYxd");
        setDoubleField(term7129, term7129.getClass(), "lat", 0.53094494792755);
        setDoubleField(term7129, term7129.getClass(), "lng", 0.146431486357265);
        setIntField(term7129, term7129.getClass(), "status", 1328271830);
        setField(term7129, term7129.getClass(), "name", "zNFLXMifnS");
        setField(term7129, term7129.getClass(), "explain", "HHQcYMSBVc");
        setField(term7129, term7129.getClass(), "address", "wdoqITnaAP");
        setField(term7129, term7129.getClass(), "fileUrl", "rIPMBcrNqB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UDaboHZHhz";
        callMethod(klass, "setName", argTypes, term7129, args);
    }

};


