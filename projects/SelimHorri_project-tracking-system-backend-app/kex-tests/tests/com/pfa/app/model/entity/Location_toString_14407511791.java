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

public class Location_toString_14407511791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9843;

    public Location_toString_14407511791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9844 = new Integer(48047085);
        HashMap term9883 = new HashMap();
        Set<Object> term9923 =  ((Map) term9883).keySet();
        HashSet term9882 = new HashSet((Collection<? extends Object>) term9923);
        term9843 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term9843, term9843.getClass(), "locationId", term9844);
        setField(term9843, term9843.getClass(), "adr", "DCSMbuGiaM");
        setField(term9843, term9843.getClass(), "postalCode", "wtOVzMPrFU");
        setField(term9843, term9843.getClass(), "city", "CBnamgJrJS");
        setField(term9843, term9843.getClass(), "departments", term9882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9843, args);
    }

};


