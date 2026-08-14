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

public class DoubleListNode_traverseFromBeginning_7373415421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698;
     Object term716;

    public DoubleListNode_traverseFromBeginning_7373415421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term698 = newInstance(Class.forName("util.DoubleListNode"));
        Object term700 = newInstance(Class.forName("util.DoubleListNode"));
        Object term702 = newInstance(Class.forName("util.DoubleListNode"));
        Object term704 = newInstance(Class.forName("util.DoubleListNode"));
        Object term706 = newInstance(Class.forName("util.DoubleListNode"));
        Object term708 = newInstance(Class.forName("util.DoubleListNode"));
        Object term710 = newInstance(Class.forName("util.DoubleListNode"));
        Object term712 = newInstance(Class.forName("util.DoubleListNode"));
        Object term714 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term698, term698.getClass(), "val", 842904495);
        setIntField(term700, term700.getClass(), "val", 1008080511);
        setIntField(term702, term702.getClass(), "val", 1935707624);
        setIntField(term704, term704.getClass(), "val", 1507074215);
        setIntField(term706, term706.getClass(), "val", -282881827);
        setField(term706, term706.getClass(), "prev", null);
        setField(term706, term706.getClass(), "next", term700);
        setField(term704, term704.getClass(), "prev", term706);
        setIntField(term708, term708.getClass(), "val", 49950830);
        setField(term708, term708.getClass(), "prev", null);
        setField(term708, term708.getClass(), "next", null);
        setField(term704, term704.getClass(), "next", term708);
        setField(term702, term702.getClass(), "prev", term704);
        setIntField(term710, term710.getClass(), "val", 267763294);
        setIntField(term712, term712.getClass(), "val", -1497710478);
        setField(term712, term712.getClass(), "prev", term708);
        setField(term712, term712.getClass(), "next", term698);
        setField(term710, term710.getClass(), "prev", term712);
        setIntField(term714, term714.getClass(), "val", -1183353915);
        setField(term714, term714.getClass(), "prev", null);
        setField(term714, term714.getClass(), "next", term700);
        setField(term710, term710.getClass(), "next", term714);
        setField(term702, term702.getClass(), "next", term710);
        setField(term700, term700.getClass(), "prev", term702);
        setField(term700, term700.getClass(), "next", term710);
        setField(term698, term698.getClass(), "prev", term700);
        setField(term698, term698.getClass(), "next", term706);
        term716 = newInstance(Class.forName("util.DoubleListNode"));
        Object term718 = newInstance(Class.forName("util.DoubleListNode"));
        Object term720 = newInstance(Class.forName("util.DoubleListNode"));
        Object term722 = newInstance(Class.forName("util.DoubleListNode"));
        Object term724 = newInstance(Class.forName("util.DoubleListNode"));
        Object term726 = newInstance(Class.forName("util.DoubleListNode"));
        Object term728 = newInstance(Class.forName("util.DoubleListNode"));
        Object term730 = newInstance(Class.forName("util.DoubleListNode"));
        Object term732 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term716, term716.getClass(), "val", -525257914);
        setIntField(term718, term718.getClass(), "val", 147209682);
        setIntField(term720, term720.getClass(), "val", 34470066);
        setIntField(term722, term722.getClass(), "val", 2058711405);
        setIntField(term724, term724.getClass(), "val", 1743683601);
        setField(term724, term724.getClass(), "prev", null);
        setField(term724, term724.getClass(), "next", term718);
        setField(term722, term722.getClass(), "prev", term724);
        setIntField(term726, term726.getClass(), "val", -129547140);
        setField(term726, term726.getClass(), "prev", null);
        setField(term726, term726.getClass(), "next", null);
        setField(term722, term722.getClass(), "next", term726);
        setField(term720, term720.getClass(), "prev", term722);
        setIntField(term728, term728.getClass(), "val", 515182546);
        setIntField(term730, term730.getClass(), "val", -936895502);
        setField(term730, term730.getClass(), "prev", term726);
        setField(term730, term730.getClass(), "next", term716);
        setField(term728, term728.getClass(), "prev", term730);
        setIntField(term732, term732.getClass(), "val", -945116798);
        setField(term732, term732.getClass(), "prev", null);
        setField(term732, term732.getClass(), "next", term718);
        setField(term728, term728.getClass(), "next", term732);
        setField(term720, term720.getClass(), "next", term728);
        setField(term718, term718.getClass(), "prev", term720);
        setField(term718, term718.getClass(), "next", term728);
        setField(term716, term716.getClass(), "prev", term718);
        setField(term716, term716.getClass(), "next", term724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = term716;
        callMethod(klass, "traverseFromBeginning", argTypes, term698, args);
    }

};


