package com.oreilly.quest.json;

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
import static com.oreilly.quest.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Response_getResults_5337095491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Response_getResults_5337095491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term6 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term4, term4.getClass(), "formattedAddress", "");
        setField(term6, term6.getClass(), "location", null);
        setField(term4, term4.getClass(), "geometry", term6);
        Object term7 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term9 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term7, term7.getClass(), "formattedAddress", "");
        setField(term9, term9.getClass(), "location", null);
        setField(term7, term7.getClass(), "geometry", term9);
        Object term10 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term12 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term10, term10.getClass(), "formattedAddress", "");
        setField(term12, term12.getClass(), "location", null);
        setField(term10, term10.getClass(), "geometry", term12);
        Object term13 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term15 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term13, term13.getClass(), "formattedAddress", "");
        setField(term15, term15.getClass(), "location", null);
        setField(term13, term13.getClass(), "geometry", term15);
        Object term16 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term18 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        setField(term16, term16.getClass(), "formattedAddress", "");
        setField(term18, term18.getClass(), "location", null);
        setField(term16, term16.getClass(), "geometry", term18);
        ArrayList term2 = new ArrayList();
        ((ArrayList) term2).add(term4);
        ((ArrayList) term2).add(term7);
        ((ArrayList) term2).add(term10);
        ((ArrayList) term2).add(term13);
        ((ArrayList) term2).add(term16);
        term1 = newInstance(Class.forName("com.oreilly.quest.json.Response"));
        setField(term1, term1.getClass(), "results", term2);
        setField(term1, term1.getClass(), "status", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Response");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResults", argTypes, term1, args);
    }

};


