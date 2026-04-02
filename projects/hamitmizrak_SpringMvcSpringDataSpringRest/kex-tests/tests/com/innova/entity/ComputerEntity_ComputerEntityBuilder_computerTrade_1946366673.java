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

public class ComputerEntity_ComputerEntityBuilder_computerTrade_1946366673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1250;

    public ComputerEntity_ComputerEntityBuilder_computerTrade_1946366673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1251 = new Long(6855071767938501807L);
        term1250 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        Object term1278 = newInstance(Class.forName("java.util.Date"));
        setField(term1250, term1250.getClass(), "computerId", term1251);
        setField(term1250, term1250.getClass(), "computerName", "tShwQLRGNe");
        setField(term1250, term1250.getClass(), "computerTrade", "LvtrsXUliU");
        setDoubleField(term1250, term1250.getClass(), "computerPrice", 0.7633268466829064);
        setLongField(term1278, term1278.getClass(), "fastTime", 1304532099366L);
        setField(term1278, term1278.getClass(), "cdate", null);
        setField(term1250, term1250.getClass(), "createdDate", term1278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        callMethod(klass, "computerTrade", argTypes, term1250, args);
    }

};


