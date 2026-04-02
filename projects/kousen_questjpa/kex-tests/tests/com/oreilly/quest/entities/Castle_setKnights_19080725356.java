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

public class Castle_setKnights_19080725356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8242;
     Object term8289;

    public Castle_setKnights_19080725356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8243 = new Long(6689117472719450333L);
        HashMap term8284 = new HashMap();
        Set<Object> term8332 =  ((Map) term8284).keySet();
        HashSet term8283 = new HashSet((Collection<? extends Object>) term8332);
        term8242 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term8242, term8242.getClass(), "id", term8243);
        setField(term8242, term8242.getClass(), "name", "wfaXBpWAUH");
        setField(term8242, term8242.getClass(), "city", "VMeAzAHwZj");
        setField(term8242, term8242.getClass(), "state", "PznxWXsZME");
        setDoubleField(term8242, term8242.getClass(), "latitude", 0.5279279537140873);
        setDoubleField(term8242, term8242.getClass(), "longitude", 0.3202192021706908);
        setField(term8242, term8242.getClass(), "knights", term8283);
        HashMap term8290 = new HashMap();
        Set<Object> term8333 =  ((Map) term8290).keySet();
        term8289 = new HashSet((Collection<? extends Object>) term8333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term8289;
        callMethod(klass, "setKnights", argTypes, term8242, args);
    }

};


