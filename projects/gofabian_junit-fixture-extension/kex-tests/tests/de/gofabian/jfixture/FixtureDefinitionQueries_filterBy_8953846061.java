package de.gofabian.jfixture;

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
import static de.gofabian.jfixture.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class FixtureDefinitionQueries_filterBy_8953846061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public FixtureDefinitionQueries_filterBy_8953846061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10 = new ArrayList();
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        ((ArrayList) term10).add((Object)null);
        term9 = newInstance(Class.forName("de.gofabian.jfixture.FixtureDefinitionQueries"));
        setField(term9, term9.getClass(), "definitions", term10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureDefinitionQueries");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Predicate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "filterBy", argTypes, term9, args);
    }

};


