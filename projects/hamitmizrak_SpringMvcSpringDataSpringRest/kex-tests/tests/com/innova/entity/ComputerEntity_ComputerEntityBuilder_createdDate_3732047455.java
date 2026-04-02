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

public class ComputerEntity_ComputerEntityBuilder_createdDate_3732047455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1374;
     Object term1404;

    public ComputerEntity_ComputerEntityBuilder_createdDate_3732047455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1375 = new Long(5262507301787091109L);
        term1374 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        Object term1402 = newInstance(Class.forName("java.util.Date"));
        setField(term1374, term1374.getClass(), "computerId", term1375);
        setField(term1374, term1374.getClass(), "computerName", "UiUYnPrcCi");
        setField(term1374, term1374.getClass(), "computerTrade", "UoYtihxVaS");
        setDoubleField(term1374, term1374.getClass(), "computerPrice", 0.5840714198152577);
        setLongField(term1402, term1402.getClass(), "fastTime", 1311560117361L);
        setField(term1402, term1402.getClass(), "cdate", null);
        setField(term1374, term1374.getClass(), "createdDate", term1402);
        term1404 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1404, term1404.getClass(), "fastTime", 1595517583842L);
        setField(term1404, term1404.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1404;
        callMethod(klass, "createdDate", argTypes, term1374, args);
    }

};


