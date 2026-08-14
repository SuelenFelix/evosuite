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

public class Location_setPostalCode_12385553757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10369;

    public Location_setPostalCode_12385553757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10370 = new Integer(-1954860951);
        HashMap term10409 = new HashMap();
        Set<Object> term10461 =  ((Map) term10409).keySet();
        HashSet term10408 = new HashSet((Collection<? extends Object>) term10461);
        term10369 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term10369, term10369.getClass(), "locationId", term10370);
        setField(term10369, term10369.getClass(), "adr", "aJlxWEbXVP");
        setField(term10369, term10369.getClass(), "postalCode", "pxpYGruvWy");
        setField(term10369, term10369.getClass(), "city", "BMskFMPoeb");
        setField(term10369, term10369.getClass(), "departments", term10408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QdBJxwpNcu";
        callMethod(klass, "setPostalCode", argTypes, term10369, args);
    }

};


