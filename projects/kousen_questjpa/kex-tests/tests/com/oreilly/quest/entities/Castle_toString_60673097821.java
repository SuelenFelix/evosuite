package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Castle_toString_60673097821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9499;

    public Castle_toString_60673097821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9500 = new Long(1215116475929634177L);
        HashMap term9541 = new HashMap();
        Set<Object> term9576 =  ((Map) term9541).keySet();
        HashSet term9540 = new HashSet((Collection<? extends Object>) term9576);
        term9499 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9499, term9499.getClass(), "id", term9500);
        setField(term9499, term9499.getClass(), "name", "vKQukfbJUd");
        setField(term9499, term9499.getClass(), "city", "lFRJFUMVbx");
        setField(term9499, term9499.getClass(), "state", "sZdUNdggUW");
        setDoubleField(term9499, term9499.getClass(), "latitude", 0.0022646783892913414);
        setDoubleField(term9499, term9499.getClass(), "longitude", 0.36226058076369927);
        setField(term9499, term9499.getClass(), "knights", term9540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9499, args);
    }

};


