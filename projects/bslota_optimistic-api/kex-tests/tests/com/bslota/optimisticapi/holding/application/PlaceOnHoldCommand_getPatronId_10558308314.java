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

public class PlaceOnHoldCommand_getPatronId_10558308314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2774;

    public PlaceOnHoldCommand_getPatronId_10558308314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2774 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        Object term2775 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term2776 = newInstance(Class.forName("java.util.UUID"));
        Object term2779 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term2780 = newInstance(Class.forName("java.util.UUID"));
        Object term2783 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term2776, term2776.getClass(), "mostSigBits", -8708192233349544946L);
        setLongField(term2776, term2776.getClass(), "leastSigBits", 5907001541142728739L);
        setField(term2775, term2775.getClass(), "value", term2776);
        setField(term2774, term2774.getClass(), "bookId", term2775);
        setLongField(term2780, term2780.getClass(), "mostSigBits", 4178434741742309755L);
        setLongField(term2780, term2780.getClass(), "leastSigBits", -2068172595987555756L);
        setField(term2779, term2779.getClass(), "value", term2780);
        setField(term2774, term2774.getClass(), "patronId", term2779);
        setLongField(term2783, term2783.getClass(), "value", -7672528020740371001L);
        setField(term2774, term2774.getClass(), "version", term2783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPatronId", argTypes, term2774, args);
    }

};


