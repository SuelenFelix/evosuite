package com.bslota.optimisticapi.holding.domain;

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
import static com.bslota.optimisticapi.holding.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AvailableBook_placeOnHoldBy_20974041311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1078;
     Object term1124;

    public AvailableBook_placeOnHoldBy_20974041311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1078 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook"));
        Object term1079 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term1080 = newInstance(Class.forName("java.util.UUID"));
        Object term1083 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term1096 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term1109 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term1122 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term1080, term1080.getClass(), "mostSigBits", -484994522244390100L);
        setLongField(term1080, term1080.getClass(), "leastSigBits", 1233889271256172047L);
        setField(term1079, term1079.getClass(), "value", term1080);
        setField(term1078, term1078.getClass(), "id", term1079);
        setField(term1083, term1083.getClass(), "name", "gGSMzuGICf");
        setField(term1078, term1078.getClass(), "author", term1083);
        setField(term1096, term1096.getClass(), "title", "hxCBltsObl");
        setField(term1078, term1078.getClass(), "title", term1096);
        setField(term1109, term1109.getClass(), "value", "BndsHwAFMv");
        setField(term1078, term1078.getClass(), "isbn", term1109);
        setLongField(term1122, term1122.getClass(), "value", -2813493605142626659L);
        setField(term1078, term1078.getClass(), "version", term1122);
        term1124 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term1125 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term1125, term1125.getClass(), "mostSigBits", 6617340557564669657L);
        setLongField(term1125, term1125.getClass(), "leastSigBits", 1439298019805881866L);
        setField(term1124, term1124.getClass(), "value", term1125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.PatronId");
        Object[] args = new Object[1];
        args[0] = term1124;
        callMethod(klass, "placeOnHoldBy", argTypes, term1078, args);
    }

};


