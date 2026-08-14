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

public class FloydWarshallShortestPath_createPathBetween_12798503097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1430;
     Object term1490;
     Object term1492;

    public FloydWarshallShortestPath_createPathBetween_12798503097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1430 = newInstance(Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath"));
        Object[] term1431 = (Object[]) newArray("[D", 6);
        double[] term1432 = (double[]) newDoubleArray(8);
        double[] term1441 = (double[]) newDoubleArray(5);
        double[] term1447 = (double[]) newDoubleArray(2);
        double[] term1450 = (double[]) newDoubleArray(6);
        double[] term1457 = (double[]) newDoubleArray(1);
        double[] term1459 = (double[]) newDoubleArray(2);
        Object[] term1462 = (Object[]) newArray("[I", 7);
        int[] term1463 = (int[]) newIntArray(3);
        int[] term1467 = (int[]) newIntArray(3);
        int[] term1471 = (int[]) newIntArray(4);
        int[] term1476 = (int[]) newIntArray(6);
        int[] term1483 = (int[]) newIntArray(1);
        int[] term1485 = (int[]) newIntArray(2);
        int[] term1488 = (int[]) newIntArray(0);
        setDoubleElement(term1432, 0, 0.246784352391756);
        setDoubleElement(term1432, 1, 0.6746769370801629);
        setDoubleElement(term1432, 2, 0.09436531082165778);
        setDoubleElement(term1432, 3, 0.1882701721081318);
        setDoubleElement(term1432, 4, 0.20230843747579808);
        setDoubleElement(term1432, 5, 0.4995447078885714);
        setDoubleElement(term1432, 6, 0.19855958465701706);
        setDoubleElement(term1432, 7, 0.6202418999768349);
        setElement(term1431, 0, term1432);
        setDoubleElement(term1441, 0, 0.9848907582209794);
        setDoubleElement(term1441, 1, 0.9658751931880928);
        setDoubleElement(term1441, 2, 0.6990187833274262);
        setDoubleElement(term1441, 3, 0.6970994777067232);
        setDoubleElement(term1441, 4, 0.4309992370378436);
        setElement(term1431, 1, term1441);
        setDoubleElement(term1447, 0, 0.4228091725302011);
        setDoubleElement(term1447, 1, 0.9148340457558121);
        setElement(term1431, 2, term1447);
        setDoubleElement(term1450, 0, 0.5671889474210299);
        setDoubleElement(term1450, 1, 0.12331301462770328);
        setDoubleElement(term1450, 2, 0.07338333983034873);
        setDoubleElement(term1450, 3, 0.9205377491648612);
        setDoubleElement(term1450, 4, 0.5496976557562384);
        setDoubleElement(term1450, 5, 0.528799251950027);
        setElement(term1431, 3, term1450);
        setDoubleElement(term1457, 0, 0.8870518852812378);
        setElement(term1431, 4, term1457);
        setDoubleElement(term1459, 0, 0.8540665765438992);
        setDoubleElement(term1459, 1, 0.7936653683273087);
        setElement(term1431, 5, term1459);
        setField(term1430, term1430.getClass(), "cost", term1431);
        setIntElement(term1463, 0, -1347358701);
        setIntElement(term1463, 1, 806595993);
        setIntElement(term1463, 2, 548228925);
        setElement(term1462, 0, term1463);
        setIntElement(term1467, 0, -749861210);
        setIntElement(term1467, 1, 1694224101);
        setIntElement(term1467, 2, 937859191);
        setElement(term1462, 1, term1467);
        setIntElement(term1471, 0, -916584829);
        setIntElement(term1471, 1, -2131181468);
        setIntElement(term1471, 2, 282916351);
        setIntElement(term1471, 3, 880977281);
        setElement(term1462, 2, term1471);
        setIntElement(term1476, 0, 371943306);
        setIntElement(term1476, 1, 982388293);
        setIntElement(term1476, 2, -159494544);
        setIntElement(term1476, 3, -75206835);
        setIntElement(term1476, 4, -1618206977);
        setIntElement(term1476, 5, -1747406163);
        setElement(term1462, 3, term1476);
        setIntElement(term1483, 0, 388157121);
        setElement(term1462, 4, term1483);
        setIntElement(term1485, 0, 1684998508);
        setIntElement(term1485, 1, -1476644457);
        setElement(term1462, 5, term1485);
        setElement(term1462, 6, term1488);
        setField(term1430, term1430.getClass(), "before", term1462);
        setField(term1430, term1430.getClass(), "graph", null);
        setBooleanField(term1430, term1430.getClass(), "directed", false);
        term1490 = new Integer(1270666529);
        term1492 = new Integer(-1146679443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1490;
        args[1] = term1492;
        callMethod(klass, "createPathBetween", argTypes, term1430, args);
    }

};


