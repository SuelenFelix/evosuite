package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class EdgeArray_remove_72808430114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1691;
     Object term1730;

    public EdgeArray_remove_72808430114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1691 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1692 = (Object[]) newArray("[I", 5);
        int[] term1693 = (int[]) newIntArray(9);
        int[] term1703 = (int[]) newIntArray(7);
        int[] term1711 = (int[]) newIntArray(9);
        int[] term1721 = (int[]) newIntArray(5);
        int[] term1727 = (int[]) newIntArray(1);
        setField(term1691, term1691.getClass(), "graph", null);
        setIntElement(term1693, 0, -1793950607);
        setIntElement(term1693, 1, 1091954101);
        setIntElement(term1693, 2, 1895143076);
        setIntElement(term1693, 3, 1981860404);
        setIntElement(term1693, 4, 732174235);
        setIntElement(term1693, 5, 470895808);
        setIntElement(term1693, 6, 1787325291);
        setIntElement(term1693, 7, 1470349147);
        setIntElement(term1693, 8, -255317272);
        setElement(term1692, 0, term1693);
        setIntElement(term1703, 0, -706253892);
        setIntElement(term1703, 1, -1341439819);
        setIntElement(term1703, 2, -728760750);
        setIntElement(term1703, 3, -1617383807);
        setIntElement(term1703, 4, -1244386281);
        setIntElement(term1703, 5, -885788574);
        setIntElement(term1703, 6, -865722613);
        setElement(term1692, 1, term1703);
        setIntElement(term1711, 0, -1551355284);
        setIntElement(term1711, 1, -1381970335);
        setIntElement(term1711, 2, 1213549815);
        setIntElement(term1711, 3, -1518419301);
        setIntElement(term1711, 4, 674879025);
        setIntElement(term1711, 5, -1538936030);
        setIntElement(term1711, 6, -752870423);
        setIntElement(term1711, 7, -1698809299);
        setIntElement(term1711, 8, 401512128);
        setElement(term1692, 2, term1711);
        setIntElement(term1721, 0, -2069930777);
        setIntElement(term1721, 1, 1543696412);
        setIntElement(term1721, 2, -1385748168);
        setIntElement(term1721, 3, -270592367);
        setIntElement(term1721, 4, 178847646);
        setElement(term1692, 3, term1721);
        setIntElement(term1727, 0, 273590437);
        setElement(term1692, 4, term1727);
        setField(term1691, term1691.getClass(), "edges", term1692);
        setIntField(term1691, term1691.getClass(), "numEdges", -348612876);
        Double term1735 = new Double(0.5279279537140873);
        term1730 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1734 = (Object[]) newArray("java.lang.Double", 1);
        setBooleanField(term1730, term1730.getClass(), "directed", false);
        setIntField(term1730, term1730.getClass(), "source", 1302807565);
        setIntField(term1730, term1730.getClass(), "target", -838848221);
        setElement(term1734, 0, term1735);
        setField(term1730, term1730.getClass(), "data", term1734);
        setField(term1730, term1730.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term1730;
        callMethod(klass, "remove", argTypes, term1691, args);
    }

};


