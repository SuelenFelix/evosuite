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

public class EdgeArray_removeFromPos_213502865016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62377;
     Object term62417;

    public EdgeArray_removeFromPos_213502865016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62377 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62378 = (Object[]) newArray("[I", 6);
        int[] term62379 = (int[]) newIntArray(6);
        int[] term62386 = (int[]) newIntArray(3);
        int[] term62390 = (int[]) newIntArray(6);
        int[] term62397 = (int[]) newIntArray(8);
        int[] term62406 = (int[]) newIntArray(2);
        int[] term62409 = (int[]) newIntArray(6);
        setField(term62377, term62377.getClass(), "graph", null);
        setIntElement(term62379, 0, 312394553);
        setIntElement(term62379, 1, -1525147416);
        setIntElement(term62379, 2, -1385830514);
        setIntElement(term62379, 3, 459609873);
        setIntElement(term62379, 4, 1965021427);
        setIntElement(term62379, 5, 1701555080);
        setElement(term62378, 0, term62379);
        setIntElement(term62386, 0, 954901997);
        setIntElement(term62386, 1, -1011081721);
        setIntElement(term62386, 2, -1158219481);
        setElement(term62378, 1, term62386);
        setIntElement(term62390, 0, 1963971471);
        setIntElement(term62390, 1, 188111384);
        setIntElement(term62390, 2, 1383690151);
        setIntElement(term62390, 3, 680948243);
        setIntElement(term62390, 4, 1325070569);
        setIntElement(term62390, 5, -325130467);
        setElement(term62378, 2, term62390);
        setIntElement(term62397, 0, -1728816604);
        setIntElement(term62397, 1, -759660487);
        setIntElement(term62397, 2, 214806173);
        setIntElement(term62397, 3, 1931596545);
        setIntElement(term62397, 4, -571015375);
        setIntElement(term62397, 5, -1932607282);
        setIntElement(term62397, 6, 960249702);
        setIntElement(term62397, 7, 1578244544);
        setElement(term62378, 3, term62397);
        setIntElement(term62406, 0, 302433460);
        setIntElement(term62406, 1, 1057744472);
        setElement(term62378, 4, term62406);
        setIntElement(term62409, 0, -374607997);
        setIntElement(term62409, 1, 1319218321);
        setIntElement(term62409, 2, 888577209);
        setIntElement(term62409, 3, 2135004050);
        setIntElement(term62409, 4, -1451096117);
        setIntElement(term62409, 5, -1964170899);
        setElement(term62378, 5, term62409);
        setField(term62377, term62377.getClass(), "edges", term62378);
        setIntField(term62377, term62377.getClass(), "numEdges", 658593960);
        term62417 = new Integer(-1492746094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term62417;
        callMethod(klass, "removeFromPos", argTypes, term62377, args);
    }

};


