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

public class Location_getLocationId_1720969722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9924;

    public Location_getLocationId_1720969722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9925 = new Integer(1689228897);
        HashMap term9964 = new HashMap();
        Set<Object> term10016 =  ((Map) term9964).keySet();
        HashSet term9963 = new HashSet((Collection<? extends Object>) term10016);
        term9924 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term9924, term9924.getClass(), "locationId", term9925);
        setField(term9924, term9924.getClass(), "adr", "IvxbsFCczM");
        setField(term9924, term9924.getClass(), "postalCode", "GkAaLUoaoL");
        setField(term9924, term9924.getClass(), "city", "VSmPzUiFzd");
        setField(term9924, term9924.getClass(), "departments", term9963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocationId", argTypes, term9924, args);
    }

};


