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

public class EdgeArray_init_5432224722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61519;

    public EdgeArray_init_5432224722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61519 = (Object[]) newArray("[I", 9);
        int[] term61520 = (int[]) newIntArray(8);
        int[] term61529 = (int[]) newIntArray(6);
        int[] term61536 = (int[]) newIntArray(4);
        int[] term61541 = (int[]) newIntArray(1);
        int[] term61543 = (int[]) newIntArray(5);
        int[] term61549 = (int[]) newIntArray(7);
        int[] term61557 = (int[]) newIntArray(5);
        int[] term61563 = (int[]) newIntArray(4);
        int[] term61568 = (int[]) newIntArray(0);
        setIntElement(term61520, 0, 1687786689);
        setIntElement(term61520, 1, -1847861460);
        setIntElement(term61520, 2, 772896495);
        setIntElement(term61520, 3, -1637788067);
        setIntElement(term61520, 4, 1784675310);
        setIntElement(term61520, 5, 87847958);
        setIntElement(term61520, 6, -2087513809);
        setIntElement(term61520, 7, 107693459);
        setElement(term61519, 0, term61520);
        setIntElement(term61529, 0, -179154974);
        setIntElement(term61529, 1, 1618115246);
        setIntElement(term61529, 2, -465989702);
        setIntElement(term61529, 3, -1643433512);
        setIntElement(term61529, 4, 2101799999);
        setIntElement(term61529, 5, -318818284);
        setElement(term61519, 1, term61529);
        setIntElement(term61536, 0, 1083983871);
        setIntElement(term61536, 1, -520406359);
        setIntElement(term61536, 2, 139050513);
        setIntElement(term61536, 3, -1340996500);
        setElement(term61519, 2, term61536);
        setIntElement(term61541, 0, 1324448192);
        setElement(term61519, 3, term61541);
        setIntElement(term61543, 0, 816936644);
        setIntElement(term61543, 1, 1987306855);
        setIntElement(term61543, 2, -1124921628);
        setIntElement(term61543, 3, -1169204034);
        setIntElement(term61543, 4, 525500871);
        setElement(term61519, 4, term61543);
        setIntElement(term61549, 0, 564354084);
        setIntElement(term61549, 1, -645407244);
        setIntElement(term61549, 2, 1896076723);
        setIntElement(term61549, 3, 9224215);
        setIntElement(term61549, 4, -670714346);
        setIntElement(term61549, 5, 1047072744);
        setIntElement(term61549, 6, -360839548);
        setElement(term61519, 5, term61549);
        setIntElement(term61557, 0, -1920369405);
        setIntElement(term61557, 1, 1275481671);
        setIntElement(term61557, 2, -579526757);
        setIntElement(term61557, 3, 1833184694);
        setIntElement(term61557, 4, 743393064);
        setElement(term61519, 6, term61557);
        setIntElement(term61563, 0, -1134463597);
        setIntElement(term61563, 1, 1984180612);
        setIntElement(term61563, 2, 1176733985);
        setIntElement(term61563, 3, -1966919914);
        setElement(term61519, 7, term61563);
        setElement(term61519, 8, term61568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term61519;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


