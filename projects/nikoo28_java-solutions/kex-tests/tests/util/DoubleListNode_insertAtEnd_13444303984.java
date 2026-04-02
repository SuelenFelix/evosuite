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

public class DoubleListNode_insertAtEnd_13444303984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808;
     Object term826;
     Object term844;

    public DoubleListNode_insertAtEnd_13444303984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term808 = newInstance(Class.forName("util.DoubleListNode"));
        Object term810 = newInstance(Class.forName("util.DoubleListNode"));
        Object term812 = newInstance(Class.forName("util.DoubleListNode"));
        Object term814 = newInstance(Class.forName("util.DoubleListNode"));
        Object term816 = newInstance(Class.forName("util.DoubleListNode"));
        Object term818 = newInstance(Class.forName("util.DoubleListNode"));
        Object term820 = newInstance(Class.forName("util.DoubleListNode"));
        Object term822 = newInstance(Class.forName("util.DoubleListNode"));
        Object term824 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term808, term808.getClass(), "val", -1404350380);
        setIntField(term810, term810.getClass(), "val", -2013924238);
        setIntField(term812, term812.getClass(), "val", 579006268);
        setIntField(term814, term814.getClass(), "val", -1694747156);
        setIntField(term816, term816.getClass(), "val", 1466373988);
        setField(term816, term816.getClass(), "prev", null);
        setField(term816, term816.getClass(), "next", term810);
        setField(term814, term814.getClass(), "prev", term816);
        setIntField(term818, term818.getClass(), "val", 278355793);
        setField(term818, term818.getClass(), "prev", null);
        setField(term818, term818.getClass(), "next", null);
        setField(term814, term814.getClass(), "next", term818);
        setField(term812, term812.getClass(), "prev", term814);
        setIntField(term820, term820.getClass(), "val", 954660603);
        setIntField(term822, term822.getClass(), "val", -1351605385);
        setField(term822, term822.getClass(), "prev", term818);
        setField(term822, term822.getClass(), "next", term808);
        setField(term820, term820.getClass(), "prev", term822);
        setIntField(term824, term824.getClass(), "val", -358526505);
        setField(term824, term824.getClass(), "prev", null);
        setField(term824, term824.getClass(), "next", term810);
        setField(term820, term820.getClass(), "next", term824);
        setField(term812, term812.getClass(), "next", term820);
        setField(term810, term810.getClass(), "prev", term812);
        setField(term810, term810.getClass(), "next", term820);
        setField(term808, term808.getClass(), "prev", term810);
        setField(term808, term808.getClass(), "next", term816);
        term826 = newInstance(Class.forName("util.DoubleListNode"));
        Object term828 = newInstance(Class.forName("util.DoubleListNode"));
        Object term830 = newInstance(Class.forName("util.DoubleListNode"));
        Object term832 = newInstance(Class.forName("util.DoubleListNode"));
        Object term834 = newInstance(Class.forName("util.DoubleListNode"));
        Object term836 = newInstance(Class.forName("util.DoubleListNode"));
        Object term838 = newInstance(Class.forName("util.DoubleListNode"));
        Object term840 = newInstance(Class.forName("util.DoubleListNode"));
        Object term842 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term826, term826.getClass(), "val", -310648604);
        setIntField(term828, term828.getClass(), "val", -648200466);
        setIntField(term830, term830.getClass(), "val", 2007134147);
        setIntField(term832, term832.getClass(), "val", 993388358);
        setIntField(term834, term834.getClass(), "val", -765191335);
        setField(term834, term834.getClass(), "prev", null);
        setField(term834, term834.getClass(), "next", term828);
        setField(term832, term832.getClass(), "prev", term834);
        setIntField(term836, term836.getClass(), "val", 1215150180);
        setField(term836, term836.getClass(), "prev", null);
        setField(term836, term836.getClass(), "next", null);
        setField(term832, term832.getClass(), "next", term836);
        setField(term830, term830.getClass(), "prev", term832);
        setIntField(term838, term838.getClass(), "val", -1891015523);
        setIntField(term840, term840.getClass(), "val", -1560631747);
        setField(term840, term840.getClass(), "prev", term836);
        setField(term840, term840.getClass(), "next", term826);
        setField(term838, term838.getClass(), "prev", term840);
        setIntField(term842, term842.getClass(), "val", -1697741155);
        setField(term842, term842.getClass(), "prev", null);
        setField(term842, term842.getClass(), "next", term828);
        setField(term838, term838.getClass(), "next", term842);
        setField(term830, term830.getClass(), "next", term838);
        setField(term828, term828.getClass(), "prev", term830);
        setField(term828, term828.getClass(), "next", term838);
        setField(term826, term826.getClass(), "prev", term828);
        setField(term826, term826.getClass(), "next", term834);
        term844 = new Integer(-1422859977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.DoubleListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term826;
        args[1] = term844;
        callMethod(klass, "insertAtEnd", argTypes, term808, args);
    }

};


