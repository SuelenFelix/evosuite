package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GraphBuilderBase_adjList_118975212210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58738;

    public GraphBuilderBase_adjList_118975212210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58738 = (Object[]) newArray("[I", 9);
        int[] term58739 = (int[]) newIntArray(4);
        int[] term58744 = (int[]) newIntArray(1);
        int[] term58746 = (int[]) newIntArray(0);
        int[] term58747 = (int[]) newIntArray(5);
        int[] term58753 = (int[]) newIntArray(9);
        int[] term58763 = (int[]) newIntArray(2);
        int[] term58766 = (int[]) newIntArray(9);
        int[] term58776 = (int[]) newIntArray(0);
        int[] term58777 = (int[]) newIntArray(7);
        setIntElement(term58739, 0, -277091079);
        setIntElement(term58739, 1, 421713339);
        setIntElement(term58739, 2, -998894691);
        setIntElement(term58739, 3, -334578847);
        setElement(term58738, 0, term58739);
        setIntElement(term58744, 0, -1048098682);
        setElement(term58738, 1, term58744);
        setElement(term58738, 2, term58746);
        setIntElement(term58747, 0, -1887879558);
        setIntElement(term58747, 1, 333645088);
        setIntElement(term58747, 2, 154374104);
        setIntElement(term58747, 3, 852769097);
        setIntElement(term58747, 4, -1958995134);
        setElement(term58738, 3, term58747);
        setIntElement(term58753, 0, -2134940262);
        setIntElement(term58753, 1, 1543999925);
        setIntElement(term58753, 2, -1587400954);
        setIntElement(term58753, 3, 822645894);
        setIntElement(term58753, 4, -1570295297);
        setIntElement(term58753, 5, 823152755);
        setIntElement(term58753, 6, 929229690);
        setIntElement(term58753, 7, -454507797);
        setIntElement(term58753, 8, 304461972);
        setElement(term58738, 4, term58753);
        setIntElement(term58763, 0, 907796752);
        setIntElement(term58763, 1, -1758084707);
        setElement(term58738, 5, term58763);
        setIntElement(term58766, 0, -1982548161);
        setIntElement(term58766, 1, 1329279958);
        setIntElement(term58766, 2, 469543205);
        setIntElement(term58766, 3, -12516056);
        setIntElement(term58766, 4, 1697090986);
        setIntElement(term58766, 5, -1830375526);
        setIntElement(term58766, 6, 936265526);
        setIntElement(term58766, 7, -495686058);
        setIntElement(term58766, 8, 611713058);
        setElement(term58738, 6, term58766);
        setElement(term58738, 7, term58776);
        setIntElement(term58777, 0, -1354326923);
        setIntElement(term58777, 1, -986698677);
        setIntElement(term58777, 2, -1381534227);
        setIntElement(term58777, 3, -115921884);
        setIntElement(term58777, 4, 69514589);
        setIntElement(term58777, 5, 1016576703);
        setIntElement(term58777, 6, -1816990337);
        setElement(term58738, 8, term58777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphBuilderBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term58738;
        callMethod(klass, "adjList", argTypes, null, args);
    }

};


