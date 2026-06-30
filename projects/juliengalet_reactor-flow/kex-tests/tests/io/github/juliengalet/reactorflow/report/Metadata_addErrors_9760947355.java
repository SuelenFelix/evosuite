package io.github.juliengalet.reactorflow.report;

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
import static io.github.juliengalet.reactorflow.report.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Metadata_addErrors_9760947355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301;
     Object term1310;

    public Metadata_addErrors_9760947355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1302 = new ArrayList();
        ((ArrayList) term1302).add((Object)null);
        ((ArrayList) term1302).add((Object)null);
        ((ArrayList) term1302).add((Object)null);
        ((ArrayList) term1302).add((Object)null);
        ((ArrayList) term1302).add((Object)null);
        ArrayList term1306 = new ArrayList();
        ((ArrayList) term1306).add((Object)null);
        ((ArrayList) term1306).add((Object)null);
        ((ArrayList) term1306).add((Object)null);
        ((ArrayList) term1306).add((Object)null);
        term1301 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Metadata"));
        setField(term1301, term1301.getClass(), "errors", term1302);
        setField(term1301, term1301.getClass(), "warnings", term1306);
        setField(term1301, term1301.getClass(), "data", null);
        term1310 = new LinkedList();
        ((LinkedList) term1310).add((Object)null);
        ((LinkedList) term1310).add((Object)null);
        ((LinkedList) term1310).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1310;
        callMethod(klass, "addErrors", argTypes, term1301, args);
    }

};


