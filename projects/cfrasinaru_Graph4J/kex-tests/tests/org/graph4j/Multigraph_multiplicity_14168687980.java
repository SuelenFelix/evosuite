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

public class Multigraph_multiplicity_14168687980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73187;

    public Multigraph_multiplicity_14168687980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term73192 = new Double(0.6920122631901948);
        Double term73194 = new Double(0.8856493266514555);
        Double term73196 = new Double(0.35949348580116536);
        Double term73198 = new Double(0.9044080113158133);
        Double term73200 = new Double(0.7709248376486527);
        term73187 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term73191 = (Object[]) newArray("java.lang.Double", 5);
        setBooleanField(term73187, term73187.getClass(), "directed", true);
        setIntField(term73187, term73187.getClass(), "source", -1191611854);
        setIntField(term73187, term73187.getClass(), "target", -1527549440);
        setElement(term73191, 0, term73192);
        setElement(term73191, 1, term73194);
        setElement(term73191, 2, term73196);
        setElement(term73191, 3, term73198);
        setElement(term73191, 4, term73200);
        setField(term73187, term73187.getClass(), "data", term73191);
        setField(term73187, term73187.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Multigraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term73187;
        callMethod(klass, "multiplicity", argTypes, null, args);
    }

};


