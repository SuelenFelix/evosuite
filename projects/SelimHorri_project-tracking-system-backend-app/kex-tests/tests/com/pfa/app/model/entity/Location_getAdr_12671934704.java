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

public class Location_getAdr_12671934704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10100;

    public Location_getAdr_12671934704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10101 = new Integer(1734759369);
        HashMap term10140 = new HashMap();
        Set<Object> term10178 =  ((Map) term10140).keySet();
        HashSet term10139 = new HashSet((Collection<? extends Object>) term10178);
        term10100 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term10100, term10100.getClass(), "locationId", term10101);
        setField(term10100, term10100.getClass(), "adr", "MVMiGQdgnX");
        setField(term10100, term10100.getClass(), "postalCode", "cQnJIENJHe");
        setField(term10100, term10100.getClass(), "city", "ExjdCvAxlG");
        setField(term10100, term10100.getClass(), "departments", term10139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAdr", argTypes, term10100, args);
    }

};


