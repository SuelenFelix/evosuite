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
import java.lang.Integer;

public class Country_setId_16405143775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5715;
     Object term5765;

    public Country_setId_16405143775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5743 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5746 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5743, term5743.getClass(), "id", -1849105286);
        setField(term5743, term5743.getClass(), "name", "");
        setIntField(term5746, term5746.getClass(), "id", 1334483645);
        setField(term5746, term5746.getClass(), "code", null);
        setField(term5746, term5746.getClass(), "name", null);
        setField(term5746, term5746.getClass(), "states", null);
        setField(term5743, term5743.getClass(), "country", term5746);
        Object term5748 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5751 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5748, term5748.getClass(), "id", -1284825282);
        setField(term5748, term5748.getClass(), "name", "");
        setIntField(term5751, term5751.getClass(), "id", 0);
        setField(term5751, term5751.getClass(), "code", null);
        setField(term5751, term5751.getClass(), "name", null);
        setField(term5751, term5751.getClass(), "states", null);
        setField(term5748, term5748.getClass(), "country", term5751);
        Object term5753 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5756 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5753, term5753.getClass(), "id", 320711637);
        setField(term5753, term5753.getClass(), "name", "");
        setIntField(term5756, term5756.getClass(), "id", 1241164745);
        setField(term5756, term5756.getClass(), "code", null);
        setField(term5756, term5756.getClass(), "name", null);
        setField(term5756, term5756.getClass(), "states", null);
        setField(term5753, term5753.getClass(), "country", term5756);
        Object term5758 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5761 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5758, term5758.getClass(), "id", 1723148410);
        setField(term5758, term5758.getClass(), "name", "");
        setIntField(term5761, term5761.getClass(), "id", 0);
        setField(term5761, term5761.getClass(), "code", null);
        setField(term5761, term5761.getClass(), "name", null);
        setField(term5761, term5761.getClass(), "states", null);
        setField(term5758, term5758.getClass(), "country", term5761);
        ArrayList term5741 = new ArrayList();
        ((ArrayList) term5741).add(term5743);
        ((ArrayList) term5741).add(term5748);
        ((ArrayList) term5741).add(term5753);
        ((ArrayList) term5741).add(term5758);
        term5715 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5715, term5715.getClass(), "id", -439048495);
        setField(term5715, term5715.getClass(), "code", "OWglDUWQYb");
        setField(term5715, term5715.getClass(), "name", "FiqETbKjpv");
        setField(term5715, term5715.getClass(), "states", term5741);
        term5765 = new Integer(-1941343035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5765;
        callMethod(klass, "setId", argTypes, term5715, args);
    }

};


