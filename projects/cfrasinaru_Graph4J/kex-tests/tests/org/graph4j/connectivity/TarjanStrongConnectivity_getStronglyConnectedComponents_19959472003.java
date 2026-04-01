package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Boolean;

public class TarjanStrongConnectivity_getStronglyConnectedComponents_19959472003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6077;

    public TarjanStrongConnectivity_getStronglyConnectedComponents_19959472003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6078 = new ArrayList();
        Boolean term6085 = new Boolean(true);
        term6077 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity"));
        int[] term6082 = (int[]) newIntArray(2);
        setField(term6077, term6077.getClass(), "compSets", term6078);
        setIntElement(term6082, 0, 55419591);
        setIntElement(term6082, 1, 1020931980);
        setField(term6077, term6077.getClass(), "vertexComp", term6082);
        setField(term6077, term6077.getClass(), "graph", null);
        setField(term6077, term6077.getClass(), "stronglyConnected", term6085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStronglyConnectedComponents", argTypes, term6077, args);
    }

};


