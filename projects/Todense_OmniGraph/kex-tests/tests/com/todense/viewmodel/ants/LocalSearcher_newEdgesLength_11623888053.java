package com.todense.viewmodel.ants;

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
import static com.todense.viewmodel.ants.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Object;

public class LocalSearcher_newEdgesLength_11623888053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;
     Object term121;
     Object term143;
     Object term145;
     Object term147;
     Object term149;
     Object term151;
     Object term153;

    public LocalSearcher_newEdgesLength_11623888053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120 = newInstance(Class.forName("com.todense.viewmodel.ants.LocalSearcher"));
        Integer term123 = new Integer(568599855);
        Integer term125 = new Integer(1162663216);
        Integer term127 = new Integer(1484323161);
        Integer term129 = new Integer(391863371);
        Integer term131 = new Integer(-1922583790);
        Integer term133 = new Integer(-616727354);
        Integer term135 = new Integer(-1955890973);
        Integer term137 = new Integer(-2038273078);
        Integer term139 = new Integer(1227103734);
        term121 = new ArrayList();
        ((ArrayList) term121).add(term123);
        ((ArrayList) term121).add(term125);
        ((ArrayList) term121).add(term127);
        ((ArrayList) term121).add(term129);
        ((ArrayList) term121).add(term131);
        ((ArrayList) term121).add(term133);
        ((ArrayList) term121).add(term135);
        ((ArrayList) term121).add(term137);
        ((ArrayList) term121).add(term139);
        term143 = new Integer(1484323161);
        term145 = new Integer(391863371);
        term147 = new Integer(-1922583790);
        term149 = new Integer(-616727354);
        term151 = new Integer(-1955890973);
        term153 = (Object[]) newArray("[D", 5);
        double[] term154 = (double[]) newDoubleArray(5);
        double[] term160 = (double[]) newDoubleArray(4);
        double[] term165 = (double[]) newDoubleArray(1);
        double[] term167 = (double[]) newDoubleArray(2);
        double[] term170 = (double[]) newDoubleArray(6);
        setDoubleElement(term154, 0, 0.13481025392611334);
        setDoubleElement(term154, 1, 0.3800088629986428);
        setDoubleElement(term154, 2, 0.5840714198152577);
        setDoubleElement(term154, 3, 0.7559240768573477);
        setDoubleElement(term154, 4, 0.10667076642995188);
        setElement(term153, 0, term154);
        setDoubleElement(term160, 0, 0.11493000848982304);
        setDoubleElement(term160, 1, 0.37161417339133307);
        setDoubleElement(term160, 2, 0.6805867182029153);
        setDoubleElement(term160, 3, 0.2852810965221698);
        setElement(term153, 1, term160);
        setDoubleElement(term165, 0, 0.6300849762307866);
        setElement(term153, 2, term165);
        setDoubleElement(term167, 0, 0.9737083944266686);
        setDoubleElement(term167, 1, 0.0668892744806211);
        setElement(term153, 3, term167);
        setDoubleElement(term170, 0, 0.3587267442738795);
        setDoubleElement(term170, 1, 0.07802449704920456);
        setDoubleElement(term170, 2, 0.5279279537140873);
        setDoubleElement(term170, 3, 0.3202192021706908);
        setDoubleElement(term170, 4, 0.22651340641904605);
        setDoubleElement(term170, 5, 0.8878841294187743);
        setElement(term153, 4, term170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.ants.LocalSearcher");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[7];
        args[0] = term121;
        args[1] = term143;
        args[2] = term145;
        args[3] = term147;
        args[4] = term149;
        args[5] = term151;
        args[6] = term153;
        callMethod(klass, "newEdgesLength", argTypes, term120, args);
    }

};


