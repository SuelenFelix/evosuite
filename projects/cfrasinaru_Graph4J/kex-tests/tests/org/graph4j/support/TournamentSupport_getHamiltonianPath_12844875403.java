package org.graph4j.support;

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
import static org.graph4j.support.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class TournamentSupport_getHamiltonianPath_12844875403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157897;

    public TournamentSupport_getHamiltonianPath_12844875403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term157898 = new Boolean(true);
        Boolean term157900 = new Boolean(true);
        term157897 = newInstance(Class.forName("org.graph4j.support.TournamentSupport"));
        setField(term157897, term157897.getClass(), "tournament", term157898);
        setField(term157897, term157897.getClass(), "graph", null);
        setField(term157897, term157897.getClass(), "stronglyConnected", term157900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.TournamentSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHamiltonianPath", argTypes, term157897, args);
    }

};


