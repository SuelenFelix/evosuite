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
import java.lang.Integer;

public class Edge_dataOrDefault_211621937512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108249;
     Object term108270;
     Object term108272;

    public Edge_dataOrDefault_211621937512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108254 = new Double(0.24532916475451183);
        Double term108256 = new Double(0.2821279199094008);
        Double term108258 = new Double(0.7198652890536935);
        Double term108260 = new Double(0.010833029141803951);
        Double term108262 = new Double(0.1708539695203959);
        Double term108264 = new Double(0.46630440467911727);
        Double term108266 = new Double(0.6135021698139438);
        Double term108268 = new Double(0.9744854247738662);
        term108249 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108253 = (Object[]) newArray("java.lang.Double", 8);
        setBooleanField(term108249, term108249.getClass(), "directed", false);
        setIntField(term108249, term108249.getClass(), "source", 1218208288);
        setIntField(term108249, term108249.getClass(), "target", -1723555071);
        setElement(term108253, 0, term108254);
        setElement(term108253, 1, term108256);
        setElement(term108253, 2, term108258);
        setElement(term108253, 3, term108260);
        setElement(term108253, 4, term108262);
        setElement(term108253, 5, term108264);
        setElement(term108253, 6, term108266);
        setElement(term108253, 7, term108268);
        setField(term108249, term108249.getClass(), "data", term108253);
        setField(term108249, term108249.getClass(), "label", null);
        term108270 = new Integer(-253585217);
        term108272 = new Integer(-43905294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term108270;
        args[1] = term108272;
        callMethod(klass, "dataOrDefault", argTypes, term108249, args);
    }

};


