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

public class DijkstraShortestPathHeap_postUpdate_6478156132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1739;
     Object term1807;

    public DijkstraShortestPathHeap_postUpdate_6478156132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1739 = newInstance(Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap"));
        Object term1740 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term1741 = (int[]) newIntArray(9);
        int[] term1751 = (int[]) newIntArray(8);
        int[] term1762 = (int[]) newIntArray(9);
        double[] term1772 = (double[]) newDoubleArray(7);
        int[] term1780 = (int[]) newIntArray(8);
        int[] term1789 = (int[]) newIntArray(9);
        boolean[] term1799 = (boolean[]) newBooleanArray(5);
        setField(term1740, term1740.getClass(), "graph", null);
        setField(term1740, term1740.getClass(), "comparator", null);
        setIntElement(term1741, 0, 1236004505);
        setIntElement(term1741, 1, 1050765721);
        setIntElement(term1741, 2, 474518942);
        setIntElement(term1741, 3, -1656687479);
        setIntElement(term1741, 4, -249614216);
        setIntElement(term1741, 5, 1870727665);
        setIntElement(term1741, 6, -519881101);
        setIntElement(term1741, 7, -680920524);
        setIntElement(term1741, 8, -916335264);
        setField(term1740, term1740.getClass(), "keys", term1741);
        setIntElement(term1751, 0, -919416536);
        setIntElement(term1751, 1, -43417861);
        setIntElement(term1751, 2, -1533843432);
        setIntElement(term1751, 3, -123338791);
        setIntElement(term1751, 4, -1467089634);
        setIntElement(term1751, 5, 413548937);
        setIntElement(term1751, 6, 1901317214);
        setIntElement(term1751, 7, 1166710220);
        setField(term1740, term1740.getClass(), "positions", term1751);
        setIntField(term1740, term1740.getClass(), "size", -1070592289);
        setField(term1739, term1739.getClass(), "heap", term1740);
        setIntField(term1739, term1739.getClass(), "source", -1464172784);
        setIntElement(term1762, 0, 32185364);
        setIntElement(term1762, 1, 1768204942);
        setIntElement(term1762, 2, 1252951645);
        setIntElement(term1762, 3, 574481092);
        setIntElement(term1762, 4, -310528004);
        setIntElement(term1762, 5, -634976996);
        setIntElement(term1762, 6, -1015274146);
        setIntElement(term1762, 7, -49052672);
        setIntElement(term1762, 8, 339372704);
        setField(term1739, term1739.getClass(), "vertices", term1762);
        setDoubleElement(term1772, 0, 0.7286890609225415);
        setDoubleElement(term1772, 1, 0.5548341997020813);
        setDoubleElement(term1772, 2, 0.4059165385720548);
        setDoubleElement(term1772, 3, 0.3800208987762318);
        setDoubleElement(term1772, 4, 0.6329228631168875);
        setDoubleElement(term1772, 5, 0.06928634128023836);
        setDoubleElement(term1772, 6, 0.16828712051665362);
        setField(term1739, term1739.getClass(), "cost", term1772);
        setIntElement(term1780, 0, -851097944);
        setIntElement(term1780, 1, 803925431);
        setIntElement(term1780, 2, 76929641);
        setIntElement(term1780, 3, -2003192918);
        setIntElement(term1780, 4, -1362856620);
        setIntElement(term1780, 5, -1835839814);
        setIntElement(term1780, 6, -1404350380);
        setIntElement(term1780, 7, -2013924238);
        setField(term1739, term1739.getClass(), "before", term1780);
        setIntElement(term1789, 0, 579006268);
        setIntElement(term1789, 1, -1694747156);
        setIntElement(term1789, 2, 1466373988);
        setIntElement(term1789, 3, -358526505);
        setIntElement(term1789, 4, 1843268026);
        setIntElement(term1789, 5, 954660603);
        setIntElement(term1789, 6, -1351605385);
        setIntElement(term1789, 7, 278355793);
        setIntElement(term1789, 8, -310648604);
        setField(term1739, term1739.getClass(), "size", term1789);
        setBooleanElement(term1799, 0, true);
        setBooleanElement(term1799, 1, true);
        setBooleanElement(term1799, 2, true);
        setBooleanElement(term1799, 4, true);
        setField(term1739, term1739.getClass(), "solved", term1799);
        setIntField(term1739, term1739.getClass(), "numSolved", -648200466);
        setField(term1739, term1739.getClass(), "graph", null);
        setBooleanField(term1739, term1739.getClass(), "directed", true);
        term1807 = new Integer(2007134147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.DijkstraShortestPathHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1807;
        callMethod(klass, "postUpdate", argTypes, term1739, args);
    }

};


