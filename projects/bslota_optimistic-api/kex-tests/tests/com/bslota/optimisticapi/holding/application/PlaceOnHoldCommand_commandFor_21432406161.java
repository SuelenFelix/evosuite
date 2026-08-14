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

public class PlaceOnHoldCommand_commandFor_21432406161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term130;

    public PlaceOnHoldCommand_commandFor_21432406161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term127 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term127, term127.getClass(), "mostSigBits", -6573104506744284592L);
        setLongField(term127, term127.getClass(), "leastSigBits", -4920224193275732920L);
        setField(term126, term126.getClass(), "value", term127);
        term130 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term131 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term131, term131.getClass(), "mostSigBits", 8428634514691209827L);
        setLongField(term131, term131.getClass(), "leastSigBits", -2585684163342970173L);
        setField(term130, term130.getClass(), "value", term131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.BookId");
        argTypes[1] = Class.forName("com.bslota.optimisticapi.holding.domain.PatronId");
        Object[] args = new Object[2];
        args[0] = term126;
        args[1] = term130;
        callMethod(klass, "commandFor", argTypes, null, args);
    }

};


