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
import java.lang.Integer;

public class FloydWarshallShortestPath_createCycleBetween_1553573618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1537;
     Object term1594;
     Object term1596;

    public FloydWarshallShortestPath_createCycleBetween_1553573618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1537 = newInstance(Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath"));
        Object[] term1538 = (Object[]) newArray("[D", 6);
        double[] term1539 = (double[]) newDoubleArray(1);
        double[] term1541 = (double[]) newDoubleArray(2);
        double[] term1544 = (double[]) newDoubleArray(4);
        double[] term1549 = (double[]) newDoubleArray(4);
        double[] term1554 = (double[]) newDoubleArray(8);
        double[] term1563 = (double[]) newDoubleArray(7);
        Object[] term1571 = (Object[]) newArray("[I", 5);
        int[] term1572 = (int[]) newIntArray(5);
        int[] term1578 = (int[]) newIntArray(2);
        int[] term1581 = (int[]) newIntArray(0);
        int[] term1582 = (int[]) newIntArray(7);
        int[] term1590 = (int[]) newIntArray(2);
        setDoubleElement(term1539, 0, 0.6999892183282963);
        setElement(term1538, 0, term1539);
        setDoubleElement(term1541, 0, 0.4376587023760947);
        setDoubleElement(term1541, 1, 0.5498407122477659);
        setElement(term1538, 1, term1541);
        setDoubleElement(term1544, 0, 0.3715546102192131);
        setDoubleElement(term1544, 1, 0.07818003953962671);
        setDoubleElement(term1544, 2, 0.3737994354904751);
        setDoubleElement(term1544, 3, 0.4912523542152032);
        setElement(term1538, 2, term1544);
        setDoubleElement(term1549, 0, 0.5987936532910646);
        setDoubleElement(term1549, 1, 0.5124845253152773);
        setDoubleElement(term1549, 2, 0.12402111287123307);
        setDoubleElement(term1549, 3, 0.6051772835079735);
        setElement(term1538, 3, term1549);
        setDoubleElement(term1554, 0, 0.3443365004594303);
        setDoubleElement(term1554, 1, 0.3400963645349382);
        setDoubleElement(term1554, 2, 0.7410646003910566);
        setDoubleElement(term1554, 3, 0.6056930022403243);
        setDoubleElement(term1554, 4, 0.977168525811686);
        setDoubleElement(term1554, 5, 0.2608334566667111);
        setDoubleElement(term1554, 6, 0.4973631574706634);
        setDoubleElement(term1554, 7, 0.4350078021366608);
        setElement(term1538, 4, term1554);
        setDoubleElement(term1563, 0, 0.3798178439996389);
        setDoubleElement(term1563, 1, 0.7829673903208142);
        setDoubleElement(term1563, 2, 0.9582677413519696);
        setDoubleElement(term1563, 3, 0.8466752101793942);
        setDoubleElement(term1563, 4, 0.1523167696274942);
        setDoubleElement(term1563, 5, 0.21754273979933092);
        setDoubleElement(term1563, 6, 0.7799781775636547);
        setElement(term1538, 5, term1563);
        setField(term1537, term1537.getClass(), "cost", term1538);
        setIntElement(term1572, 0, -860131894);
        setIntElement(term1572, 1, -1022990421);
        setIntElement(term1572, 2, 1045547089);
        setIntElement(term1572, 3, -1122880881);
        setIntElement(term1572, 4, -542712742);
        setElement(term1571, 0, term1572);
        setIntElement(term1578, 0, -1254072822);
        setIntElement(term1578, 1, -1111249833);
        setElement(term1571, 1, term1578);
        setElement(term1571, 2, term1581);
        setIntElement(term1582, 0, -1692331299);
        setIntElement(term1582, 1, 479531250);
        setIntElement(term1582, 2, 1320570890);
        setIntElement(term1582, 3, -130649791);
        setIntElement(term1582, 4, 534834644);
        setIntElement(term1582, 5, 1959097203);
        setIntElement(term1582, 6, -209654048);
        setElement(term1571, 3, term1582);
        setIntElement(term1590, 0, 477625804);
        setIntElement(term1590, 1, 252575029);
        setElement(term1571, 4, term1590);
        setField(term1537, term1537.getClass(), "before", term1571);
        setField(term1537, term1537.getClass(), "graph", null);
        setBooleanField(term1537, term1537.getClass(), "directed", true);
        term1594 = new Integer(57189932);
        term1596 = new Integer(1460722225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1594;
        args[1] = term1596;
        callMethod(klass, "createCycleBetween", argTypes, term1537, args);
    }

};


