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
     Object term6173;

    public TournamentSupport_getHamiltonianPath_12844875403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term6174 = new Boolean(true);
        Boolean term6176 = new Boolean(false);
        term6173 = newInstance(Class.forName("org.graph4j.support.TournamentSupport"));
        setField(term6173, term6173.getClass(), "tournament", term6174);
        setField(term6173, term6173.getClass(), "graph", null);
        setField(term6173, term6173.getClass(), "stronglyConnected", term6176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.TournamentSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHamiltonianPath", argTypes, term6173, args);
    }

};


