package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class FailedState_equals_4521485952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4567;
     Object term4653;

    public FailedState_equals_4521485952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4571 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4573 = (int[]) newIntArray(4);
        int[] term4578 = (int[]) newIntArray(5);
        setIntField(term4571, term4571.getClass(), "vertex", 1253334988);
        setIntElement(term4573, 0, 1086709736);
        setIntElement(term4573, 1, -1606698075);
        setIntElement(term4573, 2, 90996421);
        setIntElement(term4573, 3, -1805802783);
        setField(term4571, term4571.getClass(), "values", term4573);
        setIntElement(term4578, 0, -529831900);
        setIntElement(term4578, 1, 1574493440);
        setIntElement(term4578, 2, 1854694585);
        setIntElement(term4578, 3, -1260562836);
        setIntElement(term4578, 4, 694100722);
        setField(term4571, term4571.getClass(), "positions", term4578);
        setIntField(term4571, term4571.getClass(), "size", -680529431);
        Object term4585 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4587 = (int[]) newIntArray(0);
        int[] term4588 = (int[]) newIntArray(6);
        setIntField(term4585, term4585.getClass(), "vertex", 212698793);
        setField(term4585, term4585.getClass(), "values", term4587);
        setIntElement(term4588, 0, 1169519385);
        setIntElement(term4588, 1, 1846078344);
        setIntElement(term4588, 2, 1692543802);
        setIntElement(term4588, 3, 376341151);
        setIntElement(term4588, 4, -1607267243);
        setIntElement(term4588, 5, 1641377218);
        setField(term4585, term4585.getClass(), "positions", term4588);
        setIntField(term4585, term4585.getClass(), "size", 1235375204);
        Object term4596 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4598 = (int[]) newIntArray(0);
        int[] term4599 = (int[]) newIntArray(2);
        setIntField(term4596, term4596.getClass(), "vertex", 258334639);
        setField(term4596, term4596.getClass(), "values", term4598);
        setIntElement(term4599, 0, 1432187207);
        setIntElement(term4599, 1, -91068927);
        setField(term4596, term4596.getClass(), "positions", term4599);
        setIntField(term4596, term4596.getClass(), "size", 680714112);
        Object term4603 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4605 = (int[]) newIntArray(6);
        int[] term4612 = (int[]) newIntArray(2);
        setIntField(term4603, term4603.getClass(), "vertex", 385297023);
        setIntElement(term4605, 0, -134092543);
        setIntElement(term4605, 1, -1703642288);
        setIntElement(term4605, 2, 2075139747);
        setIntElement(term4605, 3, 2092881418);
        setIntElement(term4605, 4, 1732410866);
        setIntElement(term4605, 5, 1084102599);
        setField(term4603, term4603.getClass(), "values", term4605);
        setIntElement(term4612, 0, -1743503755);
        setIntElement(term4612, 1, 1641342112);
        setField(term4603, term4603.getClass(), "positions", term4612);
        setIntField(term4603, term4603.getClass(), "size", -1551790945);
        Object term4616 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4618 = (int[]) newIntArray(8);
        int[] term4627 = (int[]) newIntArray(7);
        setIntField(term4616, term4616.getClass(), "vertex", 2039538484);
        setIntElement(term4618, 0, 1235736068);
        setIntElement(term4618, 1, 329424176);
        setIntElement(term4618, 2, -1897199214);
        setIntElement(term4618, 3, -1016478729);
        setIntElement(term4618, 4, -206889003);
        setIntElement(term4618, 5, 638046409);
        setIntElement(term4618, 6, 427274898);
        setIntElement(term4618, 7, -1654552020);
        setField(term4616, term4616.getClass(), "values", term4618);
        setIntElement(term4627, 0, -1049546692);
        setIntElement(term4627, 1, 1397781598);
        setIntElement(term4627, 2, -44720365);
        setIntElement(term4627, 3, 1963632911);
        setIntElement(term4627, 4, -1100497683);
        setIntElement(term4627, 5, 155423433);
        setIntElement(term4627, 6, -815471632);
        setField(term4616, term4616.getClass(), "positions", term4627);
        setIntField(term4616, term4616.getClass(), "size", -1469668708);
        Object term4636 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4638 = (int[]) newIntArray(3);
        int[] term4642 = (int[]) newIntArray(7);
        setIntField(term4636, term4636.getClass(), "vertex", 1796950482);
        setIntElement(term4638, 0, -945759470);
        setIntElement(term4638, 1, 657342039);
        setIntElement(term4638, 2, 1483999606);
        setField(term4636, term4636.getClass(), "values", term4638);
        setIntElement(term4642, 0, 1871761182);
        setIntElement(term4642, 1, 233983728);
        setIntElement(term4642, 2, -1650132476);
        setIntElement(term4642, 3, 1719680265);
        setIntElement(term4642, 4, -1890898783);
        setIntElement(term4642, 5, 1357632911);
        setIntElement(term4642, 6, 1768195761);
        setField(term4636, term4636.getClass(), "positions", term4642);
        setIntField(term4636, term4636.getClass(), "size", -1382661134);
        ArrayList term4569 = new ArrayList();
        ((ArrayList) term4569).add(term4571);
        ((ArrayList) term4569).add(term4585);
        ((ArrayList) term4569).add(term4596);
        ((ArrayList) term4569).add(term4603);
        ((ArrayList) term4569).add(term4616);
        ((ArrayList) term4569).add(term4636);
        term4567 = newInstance(Class.forName("org.graph4j.coloring.FailedState"));
        setIntField(term4567, term4567.getClass(), "vertex", -111082612);
        setField(term4567, term4567.getClass(), "domains", term4569);
        term4653 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.FailedState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4653;
        callMethod(klass, "equals", argTypes, term4567, args);
    }

};


