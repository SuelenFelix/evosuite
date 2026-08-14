package com.pfa.app.service.impl;

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
import static com.pfa.app.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class LocationServiceImpl_update_367373773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;

    public LocationServiceImpl_update_367373773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term89 = new Integer(1135664017);
        HashMap term128 = new HashMap();
        Set<Object> term174 =  ((Map) term128).keySet();
        HashSet term127 = new HashSet((Collection<? extends Object>) term174);
        term88 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term88, term88.getClass(), "locationId", term89);
        setField(term88, term88.getClass(), "adr", "tShwQLRGNe");
        setField(term88, term88.getClass(), "postalCode", "LvtrsXUliU");
        setField(term88, term88.getClass(), "city", "xLbjWUgOIL");
        setField(term88, term88.getClass(), "departments", term127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.LocationServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.entity.Location");
        Object[] args = new Object[1];
        args[0] = term88;
        callMethod(klass, "update", argTypes, null, args);
    }

};


