package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Edge_compareTo_211343340320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108398;
     Object term108415;

    public Edge_compareTo_211343340320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108403 = new Double(0.8058692746281759);
        Double term108405 = new Double(0.09981780078534064);
        Double term108407 = new Double(0.7820943194486873);
        Double term108409 = new Double(0.26216865675155776);
        Double term108411 = new Double(0.5086784040916195);
        Double term108413 = new Double(0.5349035289029883);
        term108398 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108402 = (Object[]) newArray("java.lang.Double", 6);
        setBooleanField(term108398, term108398.getClass(), "directed", false);
        setIntField(term108398, term108398.getClass(), "source", -538478573);
        setIntField(term108398, term108398.getClass(), "target", 121445721);
        setElement(term108402, 0, term108403);
        setElement(term108402, 1, term108405);
        setElement(term108402, 2, term108407);
        setElement(term108402, 3, term108409);
        setElement(term108402, 4, term108411);
        setElement(term108402, 5, term108413);
        setField(term108398, term108398.getClass(), "data", term108402);
        setField(term108398, term108398.getClass(), "label", null);
        Double term108420 = new Double(0.8355679479881373);
        Double term108422 = new Double(0.13327625409903998);
        term108415 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108419 = (Object[]) newArray("java.lang.Double", 2);
        setBooleanField(term108415, term108415.getClass(), "directed", true);
        setIntField(term108415, term108415.getClass(), "source", 2068943350);
        setIntField(term108415, term108415.getClass(), "target", 1680566581);
        setElement(term108419, 0, term108420);
        setElement(term108419, 1, term108422);
        setField(term108415, term108415.getClass(), "data", term108419);
        setField(term108415, term108415.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term108415;
        callMethod(klass, "compareTo", argTypes, term108398, args);
    }

};


