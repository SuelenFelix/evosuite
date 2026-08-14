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

public class LocationServiceImpl_save_20262160192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public LocationServiceImpl_save_20262160192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4 = new Integer(1162663216);
        HashMap term43 = new HashMap();
        Set<Object> term87 =  ((Map) term43).keySet();
        HashSet term42 = new HashSet((Collection<? extends Object>) term87);
        term3 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term3, term3.getClass(), "locationId", term4);
        setField(term3, term3.getClass(), "adr", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "postalCode", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "city", "MuLcgQHgqz");
        setField(term3, term3.getClass(), "departments", term42);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.LocationServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.entity.Location");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "save", argTypes, null, args);
    }

};


