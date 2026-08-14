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

public class TournamentSupport_checkTournament_8111703362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6168;

    public TournamentSupport_checkTournament_8111703362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term6169 = new Boolean(true);
        Boolean term6171 = new Boolean(true);
        term6168 = newInstance(Class.forName("org.graph4j.support.TournamentSupport"));
        setField(term6168, term6168.getClass(), "tournament", term6169);
        setField(term6168, term6168.getClass(), "graph", null);
        setField(term6168, term6168.getClass(), "stronglyConnected", term6171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.TournamentSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkTournament", argTypes, term6168, args);
    }

};


