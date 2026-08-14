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

public class PlacedOnHoldBook_title_1032891673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594;

    public PlacedOnHoldBook_title_1032891673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook"));
        Object term595 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term596 = newInstance(Class.forName("java.util.UUID"));
        Object term599 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term612 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term625 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term638 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.PatronId"));
        Object term639 = newInstance(Class.forName("java.util.UUID"));
        Object term642 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term596, term596.getClass(), "mostSigBits", -4325723315152823407L);
        setLongField(term596, term596.getClass(), "leastSigBits", 2535595959091595249L);
        setField(term595, term595.getClass(), "value", term596);
        setField(term594, term594.getClass(), "id", term595);
        setField(term599, term599.getClass(), "name", "BYqFIqCKAV");
        setField(term594, term594.getClass(), "author", term599);
        setField(term612, term612.getClass(), "title", "vrQLuWIDJX");
        setField(term594, term594.getClass(), "title", term612);
        setField(term625, term625.getClass(), "value", "flxyYxBRtu");
        setField(term594, term594.getClass(), "isbn", term625);
        setLongField(term639, term639.getClass(), "mostSigBits", -5476826692763582090L);
        setLongField(term639, term639.getClass(), "leastSigBits", -872011222785455006L);
        setField(term638, term638.getClass(), "value", term639);
        setField(term594, term594.getClass(), "patronId", term638);
        setLongField(term642, term642.getClass(), "value", -8400487765614892086L);
        setField(term594, term594.getClass(), "version", term642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.PlacedOnHoldBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "title", argTypes, term594, args);
    }

};


