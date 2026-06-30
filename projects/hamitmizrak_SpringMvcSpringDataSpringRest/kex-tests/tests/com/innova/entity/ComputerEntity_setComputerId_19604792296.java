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

public class ComputerEntity_setComputerId_19604792296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1792;
     Object term1822;

    public ComputerEntity_setComputerId_19604792296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1793 = new Long(4178434741742309755L);
        term1792 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term1820 = newInstance(Class.forName("java.util.Date"));
        setField(term1792, term1792.getClass(), "computerId", term1793);
        setField(term1792, term1792.getClass(), "computerName", "TJmVBGfTML");
        setField(term1792, term1792.getClass(), "computerTrade", "tPlsykYBqO");
        setDoubleField(term1792, term1792.getClass(), "computerPrice", 0.9737083944266686);
        setLongField(term1820, term1820.getClass(), "fastTime", 1819191638549L);
        setField(term1820, term1820.getClass(), "cdate", null);
        setField(term1792, term1792.getClass(), "createdDate", term1820);
        term1822 = new Long(-2068172595987555756L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1822;
        callMethod(klass, "setComputerId", argTypes, term1792, args);
    }

};


