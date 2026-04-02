package com.mozen.springbootkeycloack.model;

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
import static com.mozen.springbootkeycloack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_canEqual_55206369114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1003;
     Object term1045;

    public Plant_canEqual_55206369114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1004 = new Long(2535595959091595249L);
        term1003 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term1042 = newInstance(Class.forName("java.time.Instant"));
        setField(term1003, term1003.getClass(), "id", term1004);
        setField(term1003, term1003.getClass(), "name", "gGSMzuGICf");
        setField(term1003, term1003.getClass(), "scientificName", "hxCBltsObl");
        setField(term1003, term1003.getClass(), "family", "BndsHwAFMv");
        setLongField(term1042, term1042.getClass(), "seconds", 1775105657L);
        setIntField(term1042, term1042.getClass(), "nanos", 479219000);
        setField(term1003, term1003.getClass(), "createdAt", term1042);
        term1045 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1045;
        callMethod(klass, "canEqual", argTypes, term1003, args);
    }

};


