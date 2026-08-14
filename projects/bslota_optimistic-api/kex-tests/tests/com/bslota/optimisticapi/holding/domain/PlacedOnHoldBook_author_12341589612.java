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

public class PlacedOnHoldBook_author_12341589612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term514;

    public PlacedOnHoldBook_author_12341589612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term514 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook"));
        Object term515 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term516 = newInstance(Class.forName("java.util.UUID"));
        Object term519 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term532 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term545 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term558 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term559 = newInstance(Class.forName("java.util.UUID"));
        Object term562 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term516, term516.getClass(), "mostSigBits", -7237588299778557629L);
        setLongField(term516, term516.getClass(), "leastSigBits", 6967924379644551255L);
        setField(term515, term515.getClass(), "value", term516);
        setField(term514, term514.getClass(), "id", term515);
        setField(term519, term519.getClass(), "name", "RkybSrpybU");
        setField(term514, term514.getClass(), "author", term519);
        setField(term532, term532.getClass(), "title", "xOEqzGAmDU");
        setField(term514, term514.getClass(), "title", term532);
        setField(term545, term545.getClass(), "value", "eZFUvlxvGV");
        setField(term514, term514.getClass(), "isbn", term545);
        setLongField(term559, term559.getClass(), "mostSigBits", -2813493605142626659L);
        setLongField(term559, term559.getClass(), "leastSigBits", -8885298608300233488L);
        setField(term558, term558.getClass(), "value", term559);
        setField(term514, term514.getClass(), "patronId", term558);
        setLongField(term562, term562.getClass(), "value", -8257434502486459194L);
        setField(term514, term514.getClass(), "version", term562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "author", argTypes, term514, args);
    }

};


