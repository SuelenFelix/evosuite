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

public class PlaceOnHoldCommand_getVersion_3054361525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2785;

    public PlaceOnHoldCommand_getVersion_3054361525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2785 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        Object term2786 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term2787 = newInstance(Class.forName("java.util.UUID"));
        Object term2790 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term2791 = newInstance(Class.forName("java.util.UUID"));
        Object term2794 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term2787, term2787.getClass(), "mostSigBits", -6292278961887936280L);
        setLongField(term2787, term2787.getClass(), "leastSigBits", -6645965768855543712L);
        setField(term2786, term2786.getClass(), "value", term2787);
        setField(term2785, term2785.getClass(), "bookId", term2786);
        setLongField(term2791, term2791.getClass(), "mostSigBits", 4784595517102746672L);
        setLongField(term2791, term2791.getClass(), "leastSigBits", -7612550318181586304L);
        setField(term2790, term2790.getClass(), "value", term2791);
        setField(term2785, term2785.getClass(), "patronId", term2790);
        setLongField(term2794, term2794.getClass(), "value", 1967728129628047933L);
        setField(term2785, term2785.getClass(), "version", term2794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term2785, args);
    }

};


