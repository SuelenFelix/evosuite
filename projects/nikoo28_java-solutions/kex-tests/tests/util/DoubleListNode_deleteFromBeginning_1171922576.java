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

public class DoubleListNode_deleteFromBeginning_1171922576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886;
     Object term904;

    public DoubleListNode_deleteFromBeginning_1171922576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886 = newInstance(Class.forName("util.DoubleListNode"));
        Object term888 = newInstance(Class.forName("util.DoubleListNode"));
        Object term890 = newInstance(Class.forName("util.DoubleListNode"));
        Object term892 = newInstance(Class.forName("util.DoubleListNode"));
        Object term894 = newInstance(Class.forName("util.DoubleListNode"));
        Object term896 = newInstance(Class.forName("util.DoubleListNode"));
        Object term898 = newInstance(Class.forName("util.DoubleListNode"));
        Object term900 = newInstance(Class.forName("util.DoubleListNode"));
        Object term902 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term886, term886.getClass(), "val", 1272542218);
        setIntField(term888, term888.getClass(), "val", 1209799204);
        setIntField(term890, term890.getClass(), "val", 1094107751);
        setIntField(term892, term892.getClass(), "val", 844222656);
        setIntField(term894, term894.getClass(), "val", -18216811);
        setField(term894, term894.getClass(), "prev", null);
        setField(term894, term894.getClass(), "next", term888);
        setField(term892, term892.getClass(), "prev", term894);
        setIntField(term896, term896.getClass(), "val", -1667482829);
        setField(term896, term896.getClass(), "prev", null);
        setField(term896, term896.getClass(), "next", null);
        setField(term892, term892.getClass(), "next", term896);
        setField(term890, term890.getClass(), "prev", term892);
        setIntField(term898, term898.getClass(), "val", -1516995753);
        setIntField(term900, term900.getClass(), "val", -390501023);
        setField(term900, term900.getClass(), "prev", term896);
        setField(term900, term900.getClass(), "next", term886);
        setField(term898, term898.getClass(), "prev", term900);
        setIntField(term902, term902.getClass(), "val", -1813280137);
        setField(term902, term902.getClass(), "prev", null);
        setField(term902, term902.getClass(), "next", term888);
        setField(term898, term898.getClass(), "next", term902);
        setField(term890, term890.getClass(), "next", term898);
        setField(term888, term888.getClass(), "prev", term890);
        setField(term888, term888.getClass(), "next", term898);
        setField(term886, term886.getClass(), "prev", term888);
        setField(term886, term886.getClass(), "next", term894);
        term904 = newInstance(Class.forName("util.DoubleListNode"));
        Object term906 = newInstance(Class.forName("util.DoubleListNode"));
        Object term908 = newInstance(Class.forName("util.DoubleListNode"));
        Object term910 = newInstance(Class.forName("util.DoubleListNode"));
        Object term912 = newInstance(Class.forName("util.DoubleListNode"));
        Object term914 = newInstance(Class.forName("util.DoubleListNode"));
        Object term916 = newInstance(Class.forName("util.DoubleListNode"));
        Object term918 = newInstance(Class.forName("util.DoubleListNode"));
        Object term920 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term904, term904.getClass(), "val", 1116576792);
        setIntField(term906, term906.getClass(), "val", -942194446);
        setIntField(term908, term908.getClass(), "val", -938508470);
        setIntField(term910, term910.getClass(), "val", 1242676024);
        setIntField(term912, term912.getClass(), "val", -1865023308);
        setField(term912, term912.getClass(), "prev", null);
        setField(term912, term912.getClass(), "next", term906);
        setField(term910, term910.getClass(), "prev", term912);
        setIntField(term914, term914.getClass(), "val", -434468428);
        setField(term914, term914.getClass(), "prev", null);
        setField(term914, term914.getClass(), "next", null);
        setField(term910, term910.getClass(), "next", term914);
        setField(term908, term908.getClass(), "prev", term910);
        setIntField(term916, term916.getClass(), "val", 1303442927);
        setIntField(term918, term918.getClass(), "val", 794568325);
        setField(term918, term918.getClass(), "prev", term914);
        setField(term918, term918.getClass(), "next", term904);
        setField(term916, term916.getClass(), "prev", term918);
        setIntField(term920, term920.getClass(), "val", 1698510819);
        setField(term920, term920.getClass(), "prev", null);
        setField(term920, term920.getClass(), "next", term906);
        setField(term916, term916.getClass(), "next", term920);
        setField(term908, term908.getClass(), "next", term916);
        setField(term906, term906.getClass(), "prev", term908);
        setField(term906, term906.getClass(), "next", term916);
        setField(term904, term904.getClass(), "prev", term906);
        setField(term904, term904.getClass(), "next", term912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = term904;
        callMethod(klass, "deleteFromBeginning", argTypes, term886, args);
    }

};


