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
     Object term108246;
     Object term108267;
     Object term108269;

    public Edge_dataOrDefault_211621937512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108251 = new Double(0.24532916475451183);
        Double term108253 = new Double(0.2821279199094008);
        Double term108255 = new Double(0.7198652890536935);
        Double term108257 = new Double(0.010833029141803951);
        Double term108259 = new Double(0.1708539695203959);
        Double term108261 = new Double(0.46630440467911727);
        Double term108263 = new Double(0.6135021698139438);
        Double term108265 = new Double(0.9744854247738662);
        term108246 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108250 = (Object[]) newArray("java.lang.Double", 8);
        setBooleanField(term108246, term108246.getClass(), "directed", false);
        setIntField(term108246, term108246.getClass(), "source", 1218208288);
        setIntField(term108246, term108246.getClass(), "target", -1723555071);
        setElement(term108250, 0, term108251);
        setElement(term108250, 1, term108253);
        setElement(term108250, 2, term108255);
        setElement(term108250, 3, term108257);
        setElement(term108250, 4, term108259);
        setElement(term108250, 5, term108261);
        setElement(term108250, 6, term108263);
        setElement(term108250, 7, term108265);
        setField(term108246, term108246.getClass(), "data", term108250);
        setField(term108246, term108246.getClass(), "label", null);
        term108267 = new Integer(-253585217);
        term108269 = new Integer(-43905294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term108267;
        args[1] = term108269;
        callMethod(klass, "dataOrDefault", argTypes, term108246, args);
    }

};


