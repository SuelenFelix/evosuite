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

public class Location_getCity_14151536428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10472;

    public Location_getCity_14151536428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10473 = new Integer(-974923743);
        HashMap term10512 = new HashMap();
        Set<Object> term10558 =  ((Map) term10512).keySet();
        HashSet term10511 = new HashSet((Collection<? extends Object>) term10558);
        term10472 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term10472, term10472.getClass(), "locationId", term10473);
        setField(term10472, term10472.getClass(), "adr", "jdwewuUtBW");
        setField(term10472, term10472.getClass(), "postalCode", "CXekzSdVWc");
        setField(term10472, term10472.getClass(), "city", "heJZxFqAJC");
        setField(term10472, term10472.getClass(), "departments", term10511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term10472, args);
    }

};


