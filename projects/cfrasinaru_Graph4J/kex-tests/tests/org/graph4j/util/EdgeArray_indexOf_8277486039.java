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

public class EdgeArray_indexOf_8277486039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61821;
     Object term61873;
     Object term61875;
     Object term61877;

    public EdgeArray_indexOf_8277486039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61821 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term61822 = (Object[]) newArray("[I", 9);
        int[] term61823 = (int[]) newIntArray(3);
        int[] term61827 = (int[]) newIntArray(6);
        int[] term61834 = (int[]) newIntArray(0);
        int[] term61835 = (int[]) newIntArray(6);
        int[] term61842 = (int[]) newIntArray(8);
        int[] term61851 = (int[]) newIntArray(1);
        int[] term61853 = (int[]) newIntArray(5);
        int[] term61859 = (int[]) newIntArray(4);
        int[] term61864 = (int[]) newIntArray(7);
        setField(term61821, term61821.getClass(), "graph", null);
        setIntElement(term61823, 0, 1167601196);
        setIntElement(term61823, 1, 1489040264);
        setIntElement(term61823, 2, 1289652116);
        setElement(term61822, 0, term61823);
        setIntElement(term61827, 0, -1858752303);
        setIntElement(term61827, 1, 1593556104);
        setIntElement(term61827, 2, -1885334834);
        setIntElement(term61827, 3, 2085947852);
        setIntElement(term61827, 4, 1307739693);
        setIntElement(term61827, 5, -1344952093);
        setElement(term61822, 1, term61827);
        setElement(term61822, 2, term61834);
        setIntElement(term61835, 0, 275140854);
        setIntElement(term61835, 1, 342655355);
        setIntElement(term61835, 2, -553978498);
        setIntElement(term61835, 3, 617878322);
        setIntElement(term61835, 4, -353426707);
        setIntElement(term61835, 5, -253812858);
        setElement(term61822, 3, term61835);
        setIntElement(term61842, 0, 712815497);
        setIntElement(term61842, 1, -1214671637);
        setIntElement(term61842, 2, -1325475544);
        setIntElement(term61842, 3, 1004795738);
        setIntElement(term61842, 4, -1747791244);
        setIntElement(term61842, 5, -1374498853);
        setIntElement(term61842, 6, -814553112);
        setIntElement(term61842, 7, 1599790039);
        setElement(term61822, 4, term61842);
        setIntElement(term61851, 0, 1889930669);
        setElement(term61822, 5, term61851);
        setIntElement(term61853, 0, -1483368907);
        setIntElement(term61853, 1, 1828188096);
        setIntElement(term61853, 2, -1247504501);
        setIntElement(term61853, 3, 1466658826);
        setIntElement(term61853, 4, 994181101);
        setElement(term61822, 6, term61853);
        setIntElement(term61859, 0, -1812379052);
        setIntElement(term61859, 1, 1506407459);
        setIntElement(term61859, 2, 1873066034);
        setIntElement(term61859, 3, 969867590);
        setElement(term61822, 7, term61859);
        setIntElement(term61864, 0, 779493218);
        setIntElement(term61864, 1, -1446558435);
        setIntElement(term61864, 2, -1399316678);
        setIntElement(term61864, 3, -1519298903);
        setIntElement(term61864, 4, 1252279814);
        setIntElement(term61864, 5, 2029611458);
        setIntElement(term61864, 6, -1637128814);
        setElement(term61822, 8, term61864);
        setField(term61821, term61821.getClass(), "edges", term61822);
        setIntField(term61821, term61821.getClass(), "numEdges", -299574855);
        term61873 = new Integer(1862891065);
        term61875 = new Integer(-1627096493);
        term61877 = new Integer(1307068962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term61873;
        args[1] = term61875;
        args[2] = term61877;
        callMethod(klass, "indexOf", argTypes, term61821, args);
    }

};


