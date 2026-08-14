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

public class JohnsonShortestPath_prepare_13689871542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70875;

    public JohnsonShortestPath_prepare_13689871542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70875 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term70876 = (double[]) newDoubleArray(8);
        Object[] term70885 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 7);
        Object[] term70886 = (Object[]) newArray("[D", 9);
        double[] term70887 = (double[]) newDoubleArray(0);
        double[] term70888 = (double[]) newDoubleArray(8);
        double[] term70897 = (double[]) newDoubleArray(1);
        double[] term70899 = (double[]) newDoubleArray(1);
        double[] term70901 = (double[]) newDoubleArray(0);
        double[] term70902 = (double[]) newDoubleArray(3);
        double[] term70906 = (double[]) newDoubleArray(4);
        double[] term70911 = (double[]) newDoubleArray(3);
        double[] term70915 = (double[]) newDoubleArray(5);
        setField(term70875, term70875.getClass(), "auxGraph", null);
        setDoubleElement(term70876, 0, 0.3640313981384742);
        setDoubleElement(term70876, 1, 0.3631644261767958);
        setDoubleElement(term70876, 2, 0.21083669912532566);
        setDoubleElement(term70876, 3, 0.17106362166142974);
        setDoubleElement(term70876, 4, 0.8097475511505554);
        setDoubleElement(term70876, 5, 0.36953774224602587);
        setDoubleElement(term70876, 6, 0.3759537670771518);
        setDoubleElement(term70876, 7, 0.11447119612897705);
        setField(term70875, term70875.getClass(), "h", term70876);
        setField(term70875, term70875.getClass(), "algs", term70885);
        setElement(term70886, 0, term70887);
        setDoubleElement(term70888, 0, 0.1633988708293247);
        setDoubleElement(term70888, 1, 0.15749613494974468);
        setDoubleElement(term70888, 2, 0.593944857735906);
        setDoubleElement(term70888, 3, 0.9278772031337542);
        setDoubleElement(term70888, 4, 0.5089625295418937);
        setDoubleElement(term70888, 5, 0.09649864925058016);
        setDoubleElement(term70888, 6, 0.19338578181376676);
        setDoubleElement(term70888, 7, 0.4757762920897777);
        setElement(term70886, 1, term70888);
        setDoubleElement(term70897, 0, 0.1078413107326327);
        setElement(term70886, 2, term70897);
        setDoubleElement(term70899, 0, 0.15883477938608215);
        setElement(term70886, 3, term70899);
        setElement(term70886, 4, term70901);
        setDoubleElement(term70902, 0, 0.23149404924589168);
        setDoubleElement(term70902, 1, 0.9350987907192653);
        setDoubleElement(term70902, 2, 0.5169314436204561);
        setElement(term70886, 5, term70902);
        setDoubleElement(term70906, 0, 0.5080524150996917);
        setDoubleElement(term70906, 1, 0.0920650687099197);
        setDoubleElement(term70906, 2, 0.23295671299485676);
        setDoubleElement(term70906, 3, 0.6191021724050878);
        setElement(term70886, 6, term70906);
        setDoubleElement(term70911, 0, 0.6645388810973843);
        setDoubleElement(term70911, 1, 0.1967022456830514);
        setDoubleElement(term70911, 2, 0.4119610377446865);
        setElement(term70886, 7, term70911);
        setDoubleElement(term70915, 0, 0.6311811260898801);
        setDoubleElement(term70915, 1, 0.723749796302369);
        setDoubleElement(term70915, 2, 0.02187580529652211);
        setDoubleElement(term70915, 3, 0.029952217056399943);
        setDoubleElement(term70915, 4, 0.8234844266784933);
        setElement(term70886, 8, term70915);
        setField(term70875, term70875.getClass(), "weights", term70886);
        setField(term70875, term70875.getClass(), "graph", null);
        setBooleanField(term70875, term70875.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prepare", argTypes, term70875, args);
    }

};


