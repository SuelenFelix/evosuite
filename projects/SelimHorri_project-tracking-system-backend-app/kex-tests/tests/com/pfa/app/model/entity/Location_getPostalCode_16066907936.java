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

public class Location_getPostalCode_16066907936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10282;

    public Location_getPostalCode_16066907936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10283 = new Integer(-1271598018);
        HashMap term10322 = new HashMap();
        Set<Object> term10368 =  ((Map) term10322).keySet();
        HashSet term10321 = new HashSet((Collection<? extends Object>) term10368);
        term10282 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term10282, term10282.getClass(), "locationId", term10283);
        setField(term10282, term10282.getClass(), "adr", "mUCxMstoOT");
        setField(term10282, term10282.getClass(), "postalCode", "LroMhmrHbv");
        setField(term10282, term10282.getClass(), "city", "nUWkEhozFC");
        setField(term10282, term10282.getClass(), "departments", term10321);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostalCode", argTypes, term10282, args);
    }

};


