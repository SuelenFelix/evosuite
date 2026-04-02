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
import java.lang.Integer;

public class DoubleListNode_insertAtBeginning_2514976603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770;
     Object term788;
     Object term806;

    public DoubleListNode_insertAtBeginning_2514976603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770 = newInstance(Class.forName("util.DoubleListNode"));
        Object term772 = newInstance(Class.forName("util.DoubleListNode"));
        Object term774 = newInstance(Class.forName("util.DoubleListNode"));
        Object term776 = newInstance(Class.forName("util.DoubleListNode"));
        Object term778 = newInstance(Class.forName("util.DoubleListNode"));
        Object term780 = newInstance(Class.forName("util.DoubleListNode"));
        Object term782 = newInstance(Class.forName("util.DoubleListNode"));
        Object term784 = newInstance(Class.forName("util.DoubleListNode"));
        Object term786 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term770, term770.getClass(), "val", -1467089634);
        setIntField(term772, term772.getClass(), "val", 413548937);
        setIntField(term774, term774.getClass(), "val", 1901317214);
        setIntField(term776, term776.getClass(), "val", 1166710220);
        setIntField(term778, term778.getClass(), "val", -1070592289);
        setField(term778, term778.getClass(), "prev", null);
        setField(term778, term778.getClass(), "next", term772);
        setField(term776, term776.getClass(), "prev", term778);
        setIntField(term780, term780.getClass(), "val", 574481092);
        setField(term780, term780.getClass(), "prev", null);
        setField(term780, term780.getClass(), "next", null);
        setField(term776, term776.getClass(), "next", term780);
        setField(term774, term774.getClass(), "prev", term776);
        setIntField(term782, term782.getClass(), "val", 1768204942);
        setIntField(term784, term784.getClass(), "val", 1252951645);
        setField(term784, term784.getClass(), "prev", term780);
        setField(term784, term784.getClass(), "next", term770);
        setField(term782, term782.getClass(), "prev", term784);
        setIntField(term786, term786.getClass(), "val", -1464172784);
        setField(term786, term786.getClass(), "prev", null);
        setField(term786, term786.getClass(), "next", term772);
        setField(term782, term782.getClass(), "next", term786);
        setField(term774, term774.getClass(), "next", term782);
        setField(term772, term772.getClass(), "prev", term774);
        setField(term772, term772.getClass(), "next", term782);
        setField(term770, term770.getClass(), "prev", term772);
        setField(term770, term770.getClass(), "next", term778);
        term788 = newInstance(Class.forName("util.DoubleListNode"));
        Object term790 = newInstance(Class.forName("util.DoubleListNode"));
        Object term792 = newInstance(Class.forName("util.DoubleListNode"));
        Object term794 = newInstance(Class.forName("util.DoubleListNode"));
        Object term796 = newInstance(Class.forName("util.DoubleListNode"));
        Object term798 = newInstance(Class.forName("util.DoubleListNode"));
        Object term800 = newInstance(Class.forName("util.DoubleListNode"));
        Object term802 = newInstance(Class.forName("util.DoubleListNode"));
        Object term804 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term788, term788.getClass(), "val", -310528004);
        setIntField(term790, term790.getClass(), "val", -634976996);
        setIntField(term792, term792.getClass(), "val", -1015274146);
        setIntField(term794, term794.getClass(), "val", -49052672);
        setIntField(term796, term796.getClass(), "val", 339372704);
        setField(term796, term796.getClass(), "prev", null);
        setField(term796, term796.getClass(), "next", term790);
        setField(term794, term794.getClass(), "prev", term796);
        setIntField(term798, term798.getClass(), "val", -1362856620);
        setField(term798, term798.getClass(), "prev", null);
        setField(term798, term798.getClass(), "next", null);
        setField(term794, term794.getClass(), "next", term798);
        setField(term792, term792.getClass(), "prev", term794);
        setIntField(term800, term800.getClass(), "val", 76929641);
        setIntField(term802, term802.getClass(), "val", -2003192918);
        setField(term802, term802.getClass(), "prev", term798);
        setField(term802, term802.getClass(), "next", term788);
        setField(term800, term800.getClass(), "prev", term802);
        setIntField(term804, term804.getClass(), "val", -851097944);
        setField(term804, term804.getClass(), "prev", null);
        setField(term804, term804.getClass(), "next", term790);
        setField(term800, term800.getClass(), "next", term804);
        setField(term792, term792.getClass(), "next", term800);
        setField(term790, term790.getClass(), "prev", term792);
        setField(term790, term790.getClass(), "next", term800);
        setField(term788, term788.getClass(), "prev", term790);
        setField(term788, term788.getClass(), "next", term796);
        term806 = new Integer(-1835839814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.DoubleListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term788;
        args[1] = term806;
        callMethod(klass, "insertAtBeginning", argTypes, term770, args);
    }

};


