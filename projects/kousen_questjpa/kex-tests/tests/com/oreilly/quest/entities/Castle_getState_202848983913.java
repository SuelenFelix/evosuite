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

public class Castle_getState_202848983913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8848;

    public Castle_getState_202848983913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8849 = new Long(-1832940336320585644L);
        HashMap term8890 = new HashMap();
        Set<Object> term8925 =  ((Map) term8890).keySet();
        HashSet term8889 = new HashSet((Collection<? extends Object>) term8925);
        term8848 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term8848, term8848.getClass(), "id", term8849);
        setField(term8848, term8848.getClass(), "name", "WzFopsaDuG");
        setField(term8848, term8848.getClass(), "city", "PapWxkhEWe");
        setField(term8848, term8848.getClass(), "state", "smnHEqRFRx");
        setDoubleField(term8848, term8848.getClass(), "latitude", 0.8566567697571895);
        setDoubleField(term8848, term8848.getClass(), "longitude", 0.9203805380592256);
        setField(term8848, term8848.getClass(), "knights", term8889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term8848, args);
    }

};


