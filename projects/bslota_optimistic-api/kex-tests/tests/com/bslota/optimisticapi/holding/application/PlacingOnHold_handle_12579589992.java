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

public class PlacingOnHold_handle_12579589992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term14;

    public PlacingOnHold_handle_12579589992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlacingOnHold"));
        setField(term13, term13.getClass(), "bookRepository", null);
        term14 = newInstance(Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand"));
        Object term15 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term16 = newInstance(Class.forName("java.util.UUID"));
        Object term19 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term20 = newInstance(Class.forName("java.util.UUID"));
        Object term23 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term16, term16.getClass(), "mostSigBits", 5270370404989704783L);
        setLongField(term16, term16.getClass(), "leastSigBits", 7411271909051562686L);
        setField(term15, term15.getClass(), "value", term16);
        setField(term14, term14.getClass(), "bookId", term15);
        setLongField(term20, term20.getClass(), "mostSigBits", 4872422362414183754L);
        setLongField(term20, term20.getClass(), "leastSigBits", 6811161968424632369L);
        setField(term19, term19.getClass(), "value", term20);
        setField(term14, term14.getClass(), "patronId", term19);
        setLongField(term23, term23.getClass(), "value", -8400487765614892086L);
        setField(term14, term14.getClass(), "version", term23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.application.PlacingOnHold");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.application.PlaceOnHoldCommand");
        argTypes[1] = Class.forName("com.bslota.optimisticapi.holding.domain.Book");
        Object[] args = new Object[2];
        args[0] = term14;
        args[1] = null;
        callMethod(klass, "handle", argTypes, term13, args);
    }

};


