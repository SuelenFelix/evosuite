package org.graph4j.examples;

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
import static org.graph4j.examples.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class ShortestPathExample_findShortestPath_1215454245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846;
     Object term887;
     Object term911;

    public ShortestPathExample_findShortestPath_1215454245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term852 = new HashMap();
        Object term850 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term850, term850.getClass(), "name", "");
        setField(term850, term850.getClass(), "neighbors", term852);
        HashMap term859 = new HashMap();
        Object term857 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term857, term857.getClass(), "name", "");
        setField(term857, term857.getClass(), "neighbors", term859);
        HashMap term866 = new HashMap();
        Object term864 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term864, term864.getClass(), "name", "");
        setField(term864, term864.getClass(), "neighbors", term866);
        HashMap term873 = new HashMap();
        Object term871 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term871, term871.getClass(), "name", "");
        setField(term871, term871.getClass(), "neighbors", term873);
        HashMap term880 = new HashMap();
        Object term878 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term878, term878.getClass(), "name", "");
        setField(term878, term878.getClass(), "neighbors", term880);
        ArrayList term848 = new ArrayList();
        ((ArrayList) term848).add(term850);
        ((ArrayList) term848).add(term857);
        ((ArrayList) term848).add(term864);
        ((ArrayList) term848).add(term850);
        ((ArrayList) term848).add(term871);
        ((ArrayList) term848).add(term878);
        term846 = newInstance(Class.forName("org.graph4j.examples.ShortestPathExample"));
        setIntField(term846, term846.getClass(), "numLocations", 100);
        setField(term846, term846.getClass(), "locations", term848);
        setField(term846, term846.getClass(), "graph", null);
        HashMap term900 = new HashMap();
        term887 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term887, term887.getClass(), "name", "OYbzXylRWW");
        setField(term887, term887.getClass(), "neighbors", term900);
        HashMap term924 = new HashMap();
        term911 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term911, term911.getClass(), "name", "jXzmYyrnnT");
        setField(term911, term911.getClass(), "neighbors", term924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.ShortestPathExample");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.examples.Location");
        argTypes[1] = Class.forName("org.graph4j.examples.Location");
        Object[] args = new Object[2];
        args[0] = term887;
        args[1] = term911;
        callMethod(klass, "findShortestPath", argTypes, term846, args);
    }

};


