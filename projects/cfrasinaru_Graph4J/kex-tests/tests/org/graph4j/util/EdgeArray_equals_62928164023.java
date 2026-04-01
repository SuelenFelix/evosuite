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

public class EdgeArray_equals_62928164023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62669;
     Object term62725;

    public EdgeArray_equals_62928164023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62669 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62670 = (Object[]) newArray("[I", 9);
        int[] term62671 = (int[]) newIntArray(1);
        int[] term62673 = (int[]) newIntArray(3);
        int[] term62677 = (int[]) newIntArray(5);
        int[] term62683 = (int[]) newIntArray(9);
        int[] term62693 = (int[]) newIntArray(1);
        int[] term62695 = (int[]) newIntArray(7);
        int[] term62703 = (int[]) newIntArray(8);
        int[] term62712 = (int[]) newIntArray(1);
        int[] term62714 = (int[]) newIntArray(9);
        setField(term62669, term62669.getClass(), "graph", null);
        setIntElement(term62671, 0, -968061478);
        setElement(term62670, 0, term62671);
        setIntElement(term62673, 0, -1731545429);
        setIntElement(term62673, 1, 1529459552);
        setIntElement(term62673, 2, -319743898);
        setElement(term62670, 1, term62673);
        setIntElement(term62677, 0, 1259713000);
        setIntElement(term62677, 1, -56433677);
        setIntElement(term62677, 2, -362651319);
        setIntElement(term62677, 3, -1194579845);
        setIntElement(term62677, 4, 423662191);
        setElement(term62670, 2, term62677);
        setIntElement(term62683, 0, -1353912745);
        setIntElement(term62683, 1, -1991138903);
        setIntElement(term62683, 2, -1011499047);
        setIntElement(term62683, 3, 1739555012);
        setIntElement(term62683, 4, -648034125);
        setIntElement(term62683, 5, 463060109);
        setIntElement(term62683, 6, 1272416881);
        setIntElement(term62683, 7, -1392505419);
        setIntElement(term62683, 8, -1881547807);
        setElement(term62670, 3, term62683);
        setIntElement(term62693, 0, -2118350031);
        setElement(term62670, 4, term62693);
        setIntElement(term62695, 0, 1226740323);
        setIntElement(term62695, 1, -913955707);
        setIntElement(term62695, 2, -1375658129);
        setIntElement(term62695, 3, -1851280223);
        setIntElement(term62695, 4, 1587309016);
        setIntElement(term62695, 5, -2135993804);
        setIntElement(term62695, 6, 1633651090);
        setElement(term62670, 5, term62695);
        setIntElement(term62703, 0, 1253413026);
        setIntElement(term62703, 1, -1393517042);
        setIntElement(term62703, 2, 1002224898);
        setIntElement(term62703, 3, -855504293);
        setIntElement(term62703, 4, -1726032687);
        setIntElement(term62703, 5, 7194547);
        setIntElement(term62703, 6, -509177802);
        setIntElement(term62703, 7, -1731230168);
        setElement(term62670, 6, term62703);
        setIntElement(term62712, 0, -34115571);
        setElement(term62670, 7, term62712);
        setIntElement(term62714, 0, 2098121847);
        setIntElement(term62714, 1, 870572059);
        setIntElement(term62714, 2, -1255111844);
        setIntElement(term62714, 3, -1114425326);
        setIntElement(term62714, 4, 512107996);
        setIntElement(term62714, 5, 838748747);
        setIntElement(term62714, 6, 429358930);
        setIntElement(term62714, 7, 1691700582);
        setIntElement(term62714, 8, -1661320880);
        setElement(term62670, 8, term62714);
        setField(term62669, term62669.getClass(), "edges", term62670);
        setIntField(term62669, term62669.getClass(), "numEdges", -1500981713);
        term62725 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term62725;
        callMethod(klass, "equals", argTypes, term62669, args);
    }

};


