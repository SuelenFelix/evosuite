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
import java.lang.Integer;

public class EdgeArray_indexOf_8295956458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61735;
     Object term61782;
     Object term61784;

    public EdgeArray_indexOf_8295956458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61735 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term61736 = (Object[]) newArray("[I", 9);
        int[] term61737 = (int[]) newIntArray(8);
        int[] term61746 = (int[]) newIntArray(4);
        int[] term61751 = (int[]) newIntArray(1);
        int[] term61753 = (int[]) newIntArray(0);
        int[] term61754 = (int[]) newIntArray(4);
        int[] term61759 = (int[]) newIntArray(3);
        int[] term61763 = (int[]) newIntArray(5);
        int[] term61769 = (int[]) newIntArray(6);
        int[] term61776 = (int[]) newIntArray(4);
        setField(term61735, term61735.getClass(), "graph", null);
        setIntElement(term61737, 0, 2012914024);
        setIntElement(term61737, 1, 1961729999);
        setIntElement(term61737, 2, -416107422);
        setIntElement(term61737, 3, -228328293);
        setIntElement(term61737, 4, 885509363);
        setIntElement(term61737, 5, -862435164);
        setIntElement(term61737, 6, -740189750);
        setIntElement(term61737, 7, 1647753845);
        setElement(term61736, 0, term61737);
        setIntElement(term61746, 0, 1254146348);
        setIntElement(term61746, 1, -1378706259);
        setIntElement(term61746, 2, -1235562139);
        setIntElement(term61746, 3, -1993040450);
        setElement(term61736, 1, term61746);
        setIntElement(term61751, 0, -94347451);
        setElement(term61736, 2, term61751);
        setElement(term61736, 3, term61753);
        setIntElement(term61754, 0, -2116864554);
        setIntElement(term61754, 1, -1803798879);
        setIntElement(term61754, 2, 1556834892);
        setIntElement(term61754, 3, -2054196178);
        setElement(term61736, 4, term61754);
        setIntElement(term61759, 0, 25643073);
        setIntElement(term61759, 1, 1688642873);
        setIntElement(term61759, 2, 1898736730);
        setElement(term61736, 5, term61759);
        setIntElement(term61763, 0, 1609363715);
        setIntElement(term61763, 1, 1241179059);
        setIntElement(term61763, 2, 1762765002);
        setIntElement(term61763, 3, 1075655306);
        setIntElement(term61763, 4, -797133114);
        setElement(term61736, 6, term61763);
        setIntElement(term61769, 0, -1598462161);
        setIntElement(term61769, 1, 1207046565);
        setIntElement(term61769, 2, 646669357);
        setIntElement(term61769, 3, 986376526);
        setIntElement(term61769, 4, 1699678944);
        setIntElement(term61769, 5, 397705958);
        setElement(term61736, 7, term61769);
        setIntElement(term61776, 0, -2020526142);
        setIntElement(term61776, 1, -1006830210);
        setIntElement(term61776, 2, -599874501);
        setIntElement(term61776, 3, -1593160251);
        setElement(term61736, 8, term61776);
        setField(term61735, term61735.getClass(), "edges", term61736);
        setIntField(term61735, term61735.getClass(), "numEdges", -2106831428);
        term61782 = new Integer(975763128);
        term61784 = new Integer(1330448484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term61782;
        args[1] = term61784;
        callMethod(klass, "indexOf", argTypes, term61735, args);
    }

};


