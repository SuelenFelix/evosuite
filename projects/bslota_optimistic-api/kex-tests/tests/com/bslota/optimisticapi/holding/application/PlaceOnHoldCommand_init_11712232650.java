package com.bslota.optimisticapi.holding.application;

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
import static com.bslota.optimisticapi.holding.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PlaceOnHoldCommand_init_11712232650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116;
     Object term120;
     Object term124;

    public PlaceOnHoldCommand_init_11712232650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term117 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term117, term117.getClass(), "mostSigBits", -5476826692763582090L);
        setLongField(term117, term117.getClass(), "leastSigBits", -872011222785455006L);
        setField(term116, term116.getClass(), "value", term117);
        term120 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term121 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term121, term121.getClass(), "mostSigBits", -316468845751588286L);
        setLongField(term121, term121.getClass(), "leastSigBits", 5127676408959197577L);
        setField(term120, term120.getClass(), "value", term121);
        term124 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term124, term124.getClass(), "value", 6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.BookId");
        argTypes[1] = Class.forName("com.bslota.optimisticapi.holding.domain.PatronId");
        argTypes[2] = Class.forName("com.bslota.optimisticapi.holding.aggregate.Version");
        Object[] args = new Object[3];
        args[0] = term116;
        args[1] = term120;
        args[2] = term124;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


