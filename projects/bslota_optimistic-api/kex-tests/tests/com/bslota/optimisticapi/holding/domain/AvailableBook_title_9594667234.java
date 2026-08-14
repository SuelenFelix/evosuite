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

public class AvailableBook_title_9594667234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310;

    public AvailableBook_title_9594667234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1310 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook"));
        Object term1311 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term1312 = newInstance(Class.forName("java.util.UUID"));
        Object term1315 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term1328 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term1341 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term1354 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term1312, term1312.getClass(), "mostSigBits", -6292278961887936280L);
        setLongField(term1312, term1312.getClass(), "leastSigBits", -6645965768855543712L);
        setField(term1311, term1311.getClass(), "value", term1312);
        setField(term1310, term1310.getClass(), "id", term1311);
        setField(term1315, term1315.getClass(), "name", "UiUYnPrcCi");
        setField(term1310, term1310.getClass(), "author", term1315);
        setField(term1328, term1328.getClass(), "title", "UoYtihxVaS");
        setField(term1310, term1310.getClass(), "title", term1328);
        setField(term1341, term1341.getClass(), "value", "JDswTTCZHV");
        setField(term1310, term1310.getClass(), "isbn", term1341);
        setLongField(term1354, term1354.getClass(), "value", 2535595959091595249L);
        setField(term1310, term1310.getClass(), "version", term1354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "title", argTypes, term1310, args);
    }

};


