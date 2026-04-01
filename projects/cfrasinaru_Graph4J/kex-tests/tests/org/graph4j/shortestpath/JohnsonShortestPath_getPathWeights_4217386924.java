package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JohnsonShortestPath_getPathWeights_4217386924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798;

    public JohnsonShortestPath_getPathWeights_4217386924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term799 = (double[]) newDoubleArray(1);
        Object[] term801 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 1);
        Object[] term802 = (Object[]) newArray("[D", 6);
        double[] term803 = (double[]) newDoubleArray(7);
        double[] term811 = (double[]) newDoubleArray(0);
        double[] term812 = (double[]) newDoubleArray(7);
        double[] term820 = (double[]) newDoubleArray(1);
        double[] term822 = (double[]) newDoubleArray(6);
        double[] term829 = (double[]) newDoubleArray(4);
        setField(term798, term798.getClass(), "auxGraph", null);
        setDoubleElement(term799, 0, 0.7046974927834232);
        setField(term798, term798.getClass(), "h", term799);
        setField(term798, term798.getClass(), "algs", term801);
        setDoubleElement(term803, 0, 0.6896952303224777);
        setDoubleElement(term803, 1, 0.6693176553622628);
        setDoubleElement(term803, 2, 0.2962868255626906);
        setDoubleElement(term803, 3, 0.25474180574060834);
        setDoubleElement(term803, 4, 0.9957585718901875);
        setDoubleElement(term803, 5, 0.16755811343784477);
        setDoubleElement(term803, 6, 0.9090793968999221);
        setElement(term802, 0, term803);
        setElement(term802, 1, term811);
        setDoubleElement(term812, 0, 0.25997329921466494);
        setDoubleElement(term812, 1, 0.7814864708383836);
        setDoubleElement(term812, 2, 0.5657654165545906);
        setDoubleElement(term812, 3, 0.6382060245198228);
        setDoubleElement(term812, 4, 0.1849998667663698);
        setDoubleElement(term812, 5, 0.36312400202399575);
        setDoubleElement(term812, 6, 0.5485690030548175);
        setElement(term802, 2, term812);
        setDoubleElement(term820, 0, 0.9765248027281291);
        setElement(term802, 3, term820);
        setDoubleElement(term822, 0, 0.9184034277897645);
        setDoubleElement(term822, 1, 0.9457448635091538);
        setDoubleElement(term822, 2, 0.3238255203811462);
        setDoubleElement(term822, 3, 0.2843894095932772);
        setDoubleElement(term822, 4, 0.2382345237223229);
        setDoubleElement(term822, 5, 0.6037093070161561);
        setElement(term802, 4, term822);
        setDoubleElement(term829, 0, 0.48050706663913145);
        setDoubleElement(term829, 1, 0.4990217874180345);
        setDoubleElement(term829, 2, 0.22767631814145395);
        setDoubleElement(term829, 3, 0.4630082575704827);
        setElement(term802, 5, term829);
        setField(term798, term798.getClass(), "weights", term802);
        setField(term798, term798.getClass(), "graph", null);
        setBooleanField(term798, term798.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeights", argTypes, term798, args);
    }

};


