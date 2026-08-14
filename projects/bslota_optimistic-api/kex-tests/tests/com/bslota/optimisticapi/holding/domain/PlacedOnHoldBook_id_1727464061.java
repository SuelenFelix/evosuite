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

public class PlacedOnHoldBook_id_1727464061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434;

    public PlacedOnHoldBook_id_1727464061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook"));
        Object term435 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term436 = newInstance(Class.forName("java.util.UUID"));
        Object term439 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term452 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term465 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term478 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term479 = newInstance(Class.forName("java.util.UUID"));
        Object term482 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term436, term436.getClass(), "mostSigBits", 5270370404989704783L);
        setLongField(term436, term436.getClass(), "leastSigBits", 7411271909051562686L);
        setField(term435, term435.getClass(), "value", term436);
        setField(term434, term434.getClass(), "id", term435);
        setField(term439, term439.getClass(), "name", "HyxfbSQYBe");
        setField(term434, term434.getClass(), "author", term439);
        setField(term452, term452.getClass(), "title", "pCTimMblYc");
        setField(term434, term434.getClass(), "title", term452);
        setField(term465, term465.getClass(), "value", "hNxWaHcfhY");
        setField(term434, term434.getClass(), "isbn", term465);
        setLongField(term479, term479.getClass(), "mostSigBits", 4872422362414183754L);
        setLongField(term479, term479.getClass(), "leastSigBits", 6811161968424632369L);
        setField(term478, term478.getClass(), "value", term479);
        setField(term434, term434.getClass(), "patronId", term478);
        setLongField(term482, term482.getClass(), "value", 6375119433582206027L);
        setField(term434, term434.getClass(), "version", term482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "id", argTypes, term434, args);
    }

};


