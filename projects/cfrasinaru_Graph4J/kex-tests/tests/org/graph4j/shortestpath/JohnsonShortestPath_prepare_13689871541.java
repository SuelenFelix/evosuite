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

public class JohnsonShortestPath_prepare_13689871541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647;

    public JohnsonShortestPath_prepare_13689871541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term648 = (double[]) newDoubleArray(9);
        Object[] term658 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 7);
        Object[] term659 = (Object[]) newArray("[D", 6);
        double[] term660 = (double[]) newDoubleArray(7);
        double[] term668 = (double[]) newDoubleArray(9);
        double[] term678 = (double[]) newDoubleArray(7);
        double[] term686 = (double[]) newDoubleArray(6);
        double[] term693 = (double[]) newDoubleArray(6);
        double[] term700 = (double[]) newDoubleArray(0);
        setField(term647, term647.getClass(), "auxGraph", null);
        setDoubleElement(term648, 0, 0.6561919196821765);
        setDoubleElement(term648, 1, 0.7330178886612495);
        setDoubleElement(term648, 2, 0.7618164754425794);
        setDoubleElement(term648, 3, 0.7385589312559342);
        setDoubleElement(term648, 4, 0.7080134263823477);
        setDoubleElement(term648, 5, 0.6059734092898602);
        setDoubleElement(term648, 6, 0.3074693824288357);
        setDoubleElement(term648, 7, 0.1245258965512791);
        setDoubleElement(term648, 8, 0.9511861072660375);
        setField(term647, term647.getClass(), "h", term648);
        setField(term647, term647.getClass(), "algs", term658);
        setDoubleElement(term660, 0, 0.05880719443135807);
        setDoubleElement(term660, 1, 0.34010089048558567);
        setDoubleElement(term660, 2, 0.19625398866403143);
        setDoubleElement(term660, 3, 0.45069204793711093);
        setDoubleElement(term660, 4, 0.9341364461850963);
        setDoubleElement(term660, 5, 0.9022041121474429);
        setDoubleElement(term660, 6, 0.6512870939318848);
        setElement(term659, 0, term660);
        setDoubleElement(term668, 0, 0.8777038609128434);
        setDoubleElement(term668, 1, 0.008025683154629148);
        setDoubleElement(term668, 2, 0.40598298281353484);
        setDoubleElement(term668, 3, 0.3710067290060264);
        setDoubleElement(term668, 4, 0.7818620200430967);
        setDoubleElement(term668, 5, 0.04640022995603543);
        setDoubleElement(term668, 6, 0.9123572866833729);
        setDoubleElement(term668, 7, 0.40635376375558196);
        setDoubleElement(term668, 8, 0.4772043271031934);
        setElement(term659, 1, term668);
        setDoubleElement(term678, 0, 0.2446504549754045);
        setDoubleElement(term678, 1, 0.6142723998707854);
        setDoubleElement(term678, 2, 0.4355627280318103);
        setDoubleElement(term678, 3, 0.841460835734741);
        setDoubleElement(term678, 4, 0.7859316615744082);
        setDoubleElement(term678, 5, 0.6428742553484879);
        setDoubleElement(term678, 6, 0.6584165706677267);
        setElement(term659, 2, term678);
        setDoubleElement(term686, 0, 0.44268490778872205);
        setDoubleElement(term686, 1, 0.7507333108648018);
        setDoubleElement(term686, 2, 0.007493740494434409);
        setDoubleElement(term686, 3, 0.29172553321356776);
        setDoubleElement(term686, 4, 0.9276995636844321);
        setDoubleElement(term686, 5, 0.7636130748477434);
        setElement(term659, 3, term686);
        setDoubleElement(term693, 0, 0.07901636960861558);
        setDoubleElement(term693, 1, 0.18717846301066243);
        setDoubleElement(term693, 2, 0.5335953039331021);
        setDoubleElement(term693, 3, 0.5725602309856443);
        setDoubleElement(term693, 4, 0.5310967137636303);
        setDoubleElement(term693, 5, 0.6054109236809134);
        setElement(term659, 4, term693);
        setElement(term659, 5, term700);
        setField(term647, term647.getClass(), "weights", term659);
        setField(term647, term647.getClass(), "graph", null);
        setBooleanField(term647, term647.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prepare", argTypes, term647, args);
    }

};


