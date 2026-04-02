package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ComputerEntity_ComputerEntityBuilder_computerName_8212053742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1178;

    public ComputerEntity_ComputerEntityBuilder_computerName_8212053742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1179 = new Long(2120084523938730454L);
        term1178 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        Object term1206 = newInstance(Class.forName("java.util.Date"));
        setField(term1178, term1178.getClass(), "computerId", term1179);
        setField(term1178, term1178.getClass(), "computerName", "hxCBltsObl");
        setField(term1178, term1178.getClass(), "computerTrade", "BndsHwAFMv");
        setDoubleField(term1178, term1178.getClass(), "computerPrice", 0.43692187681405226);
        setLongField(term1206, term1206.getClass(), "fastTime", 1876872800559L);
        setField(term1206, term1206.getClass(), "cdate", null);
        setField(term1178, term1178.getClass(), "createdDate", term1206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GzFkzHGYFt";
        callMethod(klass, "computerName", argTypes, term1178, args);
    }

};


