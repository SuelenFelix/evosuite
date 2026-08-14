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

public class ShortestPathExample_createUserModel_3330231262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743;

    public ShortestPathExample_createUserModel_3330231262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term749 = new HashMap();
        Object term747 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term747, term747.getClass(), "name", "");
        setField(term747, term747.getClass(), "neighbors", term749);
        HashMap term756 = new HashMap();
        Object term754 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term754, term754.getClass(), "name", "");
        setField(term754, term754.getClass(), "neighbors", term756);
        HashMap term763 = new HashMap();
        Object term761 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term761, term761.getClass(), "name", "");
        setField(term761, term761.getClass(), "neighbors", term763);
        HashMap term770 = new HashMap();
        Object term768 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term768, term768.getClass(), "name", "");
        setField(term768, term768.getClass(), "neighbors", term770);
        HashMap term777 = new HashMap();
        Object term775 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term775, term775.getClass(), "name", "");
        setField(term775, term775.getClass(), "neighbors", term777);
        HashMap term784 = new HashMap();
        Object term782 = newInstance(Class.forName("org.graph4j.examples.Location"));
        setField(term782, term782.getClass(), "name", "");
        setField(term782, term782.getClass(), "neighbors", term784);
        ArrayList term745 = new ArrayList();
        ((ArrayList) term745).add(term747);
        ((ArrayList) term745).add(term754);
        ((ArrayList) term745).add(term761);
        ((ArrayList) term745).add(term747);
        ((ArrayList) term745).add(term768);
        ((ArrayList) term745).add(term775);
        ((ArrayList) term745).add(term782);
        term743 = newInstance(Class.forName("org.graph4j.examples.ShortestPathExample"));
        setIntField(term743, term743.getClass(), "numLocations", 100);
        setField(term743, term743.getClass(), "locations", term745);
        setField(term743, term743.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.ShortestPathExample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createUserModel", argTypes, term743, args);
    }

};


