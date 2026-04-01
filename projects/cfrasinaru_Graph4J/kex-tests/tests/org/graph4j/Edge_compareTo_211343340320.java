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
     Object term108395;
     Object term108412;

    public Edge_compareTo_211343340320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108400 = new Double(0.8058692746281759);
        Double term108402 = new Double(0.09981780078534064);
        Double term108404 = new Double(0.7820943194486873);
        Double term108406 = new Double(0.26216865675155776);
        Double term108408 = new Double(0.5086784040916195);
        Double term108410 = new Double(0.5349035289029883);
        term108395 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108399 = (Object[]) newArray("java.lang.Double", 6);
        setBooleanField(term108395, term108395.getClass(), "directed", false);
        setIntField(term108395, term108395.getClass(), "source", -538478573);
        setIntField(term108395, term108395.getClass(), "target", 121445721);
        setElement(term108399, 0, term108400);
        setElement(term108399, 1, term108402);
        setElement(term108399, 2, term108404);
        setElement(term108399, 3, term108406);
        setElement(term108399, 4, term108408);
        setElement(term108399, 5, term108410);
        setField(term108395, term108395.getClass(), "data", term108399);
        setField(term108395, term108395.getClass(), "label", null);
        Double term108417 = new Double(0.8355679479881373);
        Double term108419 = new Double(0.13327625409903998);
        term108412 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108416 = (Object[]) newArray("java.lang.Double", 2);
        setBooleanField(term108412, term108412.getClass(), "directed", true);
        setIntField(term108412, term108412.getClass(), "source", 2068943350);
        setIntField(term108412, term108412.getClass(), "target", 1680566581);
        setElement(term108416, 0, term108417);
        setElement(term108416, 1, term108419);
        setField(term108412, term108412.getClass(), "data", term108416);
        setField(term108412, term108412.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term108412;
        callMethod(klass, "compareTo", argTypes, term108395, args);
    }

};


