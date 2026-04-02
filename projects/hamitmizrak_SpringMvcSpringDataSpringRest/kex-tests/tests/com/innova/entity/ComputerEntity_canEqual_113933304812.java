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

public class ComputerEntity_canEqual_113933304812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2143;
     Object term2173;

    public ComputerEntity_canEqual_113933304812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2144 = new Long(4044358158040652353L);
        term2143 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term2171 = newInstance(Class.forName("java.util.Date"));
        setField(term2143, term2143.getClass(), "computerId", term2144);
        setField(term2143, term2143.getClass(), "computerName", "VgZnGoIFwQ");
        setField(term2143, term2143.getClass(), "computerTrade", "jUbSRrkrYZ");
        setDoubleField(term2143, term2143.getClass(), "computerPrice", 0.8878841294187743);
        setLongField(term2171, term2171.getClass(), "fastTime", 1795936337628L);
        setField(term2171, term2171.getClass(), "cdate", null);
        setField(term2143, term2143.getClass(), "createdDate", term2171);
        term2173 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2173;
        callMethod(klass, "canEqual", argTypes, term2143, args);
    }

};


