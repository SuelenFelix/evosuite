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
import java.lang.Integer;
import java.lang.Object;
import java.lang.Double;

public class Weighted_getEdgeData_13109415813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106683;
     Object term106685;

    public Weighted_getEdgeData_13109415813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106683 = new Integer(325287087);
        Double term106690 = new Double(0.6131087144069463);
        Double term106692 = new Double(0.4961600023778727);
        Double term106694 = new Double(0.15336192373549007);
        Double term106696 = new Double(0.9148125806219113);
        Double term106698 = new Double(0.5424105805193429);
        Double term106700 = new Double(0.961202697260254);
        Double term106702 = new Double(0.6198565030073423);
        term106685 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term106689 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term106685, term106685.getClass(), "directed", false);
        setIntField(term106685, term106685.getClass(), "source", -43935060);
        setIntField(term106685, term106685.getClass(), "target", -1302688690);
        setElement(term106689, 0, term106690);
        setElement(term106689, 1, term106692);
        setElement(term106689, 2, term106694);
        setElement(term106689, 3, term106696);
        setElement(term106689, 4, term106698);
        setElement(term106689, 5, term106700);
        setElement(term106689, 6, term106702);
        setField(term106685, term106685.getClass(), "data", term106689);
        setField(term106685, term106685.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Weighted");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[2];
        args[0] = term106683;
        args[1] = term106685;
        callMethod(klass, "getEdgeData", argTypes, null, args);
    }

};


