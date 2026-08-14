package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DoubleListNode_traverseFromEnd_3121215762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734;
     Object term752;

    public DoubleListNode_traverseFromEnd_3121215762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734 = newInstance(Class.forName("util.DoubleListNode"));
        Object term736 = newInstance(Class.forName("util.DoubleListNode"));
        Object term738 = newInstance(Class.forName("util.DoubleListNode"));
        Object term740 = newInstance(Class.forName("util.DoubleListNode"));
        Object term742 = newInstance(Class.forName("util.DoubleListNode"));
        Object term744 = newInstance(Class.forName("util.DoubleListNode"));
        Object term746 = newInstance(Class.forName("util.DoubleListNode"));
        Object term748 = newInstance(Class.forName("util.DoubleListNode"));
        Object term750 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term734, term734.getClass(), "val", 199287428);
        setIntField(term736, term736.getClass(), "val", -1195339592);
        setIntField(term738, term738.getClass(), "val", -376422566);
        setIntField(term740, term740.getClass(), "val", 306847454);
        setIntField(term742, term742.getClass(), "val", 1745276158);
        setField(term742, term742.getClass(), "prev", null);
        setField(term742, term742.getClass(), "next", term736);
        setField(term740, term740.getClass(), "prev", term742);
        setIntField(term744, term744.getClass(), "val", 474518942);
        setField(term744, term744.getClass(), "prev", null);
        setField(term744, term744.getClass(), "next", null);
        setField(term740, term740.getClass(), "next", term744);
        setField(term738, term738.getClass(), "prev", term740);
        setIntField(term746, term746.getClass(), "val", 1236004505);
        setIntField(term748, term748.getClass(), "val", 1050765721);
        setField(term748, term748.getClass(), "prev", term744);
        setField(term748, term748.getClass(), "next", term734);
        setField(term746, term746.getClass(), "prev", term748);
        setIntField(term750, term750.getClass(), "val", 2009020256);
        setField(term750, term750.getClass(), "prev", null);
        setField(term750, term750.getClass(), "next", term736);
        setField(term746, term746.getClass(), "next", term750);
        setField(term738, term738.getClass(), "next", term746);
        setField(term736, term736.getClass(), "prev", term738);
        setField(term736, term736.getClass(), "next", term746);
        setField(term734, term734.getClass(), "prev", term736);
        setField(term734, term734.getClass(), "next", term742);
        term752 = newInstance(Class.forName("util.DoubleListNode"));
        Object term754 = newInstance(Class.forName("util.DoubleListNode"));
        Object term756 = newInstance(Class.forName("util.DoubleListNode"));
        Object term758 = newInstance(Class.forName("util.DoubleListNode"));
        Object term760 = newInstance(Class.forName("util.DoubleListNode"));
        Object term762 = newInstance(Class.forName("util.DoubleListNode"));
        Object term764 = newInstance(Class.forName("util.DoubleListNode"));
        Object term766 = newInstance(Class.forName("util.DoubleListNode"));
        Object term768 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term752, term752.getClass(), "val", -1656687479);
        setIntField(term754, term754.getClass(), "val", -249614216);
        setIntField(term756, term756.getClass(), "val", 1870727665);
        setIntField(term758, term758.getClass(), "val", -519881101);
        setIntField(term760, term760.getClass(), "val", -680920524);
        setField(term760, term760.getClass(), "prev", null);
        setField(term760, term760.getClass(), "next", term754);
        setField(term758, term758.getClass(), "prev", term760);
        setIntField(term762, term762.getClass(), "val", -123338791);
        setField(term762, term762.getClass(), "prev", null);
        setField(term762, term762.getClass(), "next", null);
        setField(term758, term758.getClass(), "next", term762);
        setField(term756, term756.getClass(), "prev", term758);
        setIntField(term764, term764.getClass(), "val", -43417861);
        setIntField(term766, term766.getClass(), "val", -1533843432);
        setField(term766, term766.getClass(), "prev", term762);
        setField(term766, term766.getClass(), "next", term752);
        setField(term764, term764.getClass(), "prev", term766);
        setIntField(term768, term768.getClass(), "val", -916335264);
        setField(term768, term768.getClass(), "prev", null);
        setField(term768, term768.getClass(), "next", term754);
        setField(term764, term764.getClass(), "next", term768);
        setField(term756, term756.getClass(), "next", term764);
        setField(term754, term754.getClass(), "prev", term756);
        setField(term754, term754.getClass(), "next", term764);
        setField(term752, term752.getClass(), "prev", term754);
        setField(term752, term752.getClass(), "next", term760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = term752;
        callMethod(klass, "traverseFromEnd", argTypes, term734, args);
    }

};


