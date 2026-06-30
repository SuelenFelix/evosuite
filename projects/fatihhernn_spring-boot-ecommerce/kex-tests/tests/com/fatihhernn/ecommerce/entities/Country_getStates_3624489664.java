package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Country_getStates_3624489664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5650;

    public Country_getStates_3624489664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5678 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5681 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5678, term5678.getClass(), "id", 908108726);
        setField(term5678, term5678.getClass(), "name", "");
        setIntField(term5681, term5681.getClass(), "id", 1023209512);
        setField(term5681, term5681.getClass(), "code", null);
        setField(term5681, term5681.getClass(), "name", null);
        setField(term5681, term5681.getClass(), "states", null);
        setField(term5678, term5678.getClass(), "country", term5681);
        Object term5683 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5686 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5683, term5683.getClass(), "id", 1084849225);
        setField(term5683, term5683.getClass(), "name", "");
        setIntField(term5686, term5686.getClass(), "id", -1702055571);
        setField(term5686, term5686.getClass(), "code", null);
        setField(term5686, term5686.getClass(), "name", null);
        setField(term5686, term5686.getClass(), "states", null);
        setField(term5683, term5683.getClass(), "country", term5686);
        Object term5688 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5691 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5688, term5688.getClass(), "id", 1137624258);
        setField(term5688, term5688.getClass(), "name", "");
        setIntField(term5691, term5691.getClass(), "id", 977862393);
        setField(term5691, term5691.getClass(), "code", null);
        setField(term5691, term5691.getClass(), "name", null);
        setField(term5691, term5691.getClass(), "states", null);
        setField(term5688, term5688.getClass(), "country", term5691);
        ArrayList term5676 = new ArrayList();
        ((ArrayList) term5676).add(term5678);
        ((ArrayList) term5676).add(term5683);
        ((ArrayList) term5676).add(term5688);
        term5650 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5650, term5650.getClass(), "id", 1221443226);
        setField(term5650, term5650.getClass(), "code", "jlyFvaZlmv");
        setField(term5650, term5650.getClass(), "name", "sofyLEfomV");
        setField(term5650, term5650.getClass(), "states", term5676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStates", argTypes, term5650, args);
    }

};


