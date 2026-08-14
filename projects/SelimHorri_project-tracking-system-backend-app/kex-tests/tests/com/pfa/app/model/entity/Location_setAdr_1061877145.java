package com.pfa.app.model.entity;

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
import static com.pfa.app.model.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Location_setAdr_1061877145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10179;

    public Location_setAdr_1061877145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10180 = new Integer(-460657407);
        HashMap term10219 = new HashMap();
        Set<Object> term10271 =  ((Map) term10219).keySet();
        HashSet term10218 = new HashSet((Collection<? extends Object>) term10271);
        term10179 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term10179, term10179.getClass(), "locationId", term10180);
        setField(term10179, term10179.getClass(), "adr", "AbIDnsFOzO");
        setField(term10179, term10179.getClass(), "postalCode", "ekTUXbqVGx");
        setField(term10179, term10179.getClass(), "city", "ECPFDcnHIT");
        setField(term10179, term10179.getClass(), "departments", term10218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sqPZeXSusM";
        callMethod(klass, "setAdr", argTypes, term10179, args);
    }

};


