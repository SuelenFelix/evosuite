package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class CopyListWithRandomPointer_copyRandomList_8618148961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5855;
     Object term5861;

    public CopyListWithRandomPointer_copyRandomList_8618148961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5856 = new HashMap();
        term5855 = newInstance(Class.forName("leetcode.CopyListWithRandomPointer"));
        setField(term5855, term5855.getClass(), "oldNodeNewNodeMap", term5856);
        term5861 = newInstance(Class.forName("leetcode.Node"));
        Object term5863 = newInstance(Class.forName("leetcode.Node"));
        Object term5865 = newInstance(Class.forName("leetcode.Node"));
        Object term5867 = newInstance(Class.forName("leetcode.Node"));
        Object term5869 = newInstance(Class.forName("leetcode.Node"));
        Object term5871 = newInstance(Class.forName("leetcode.Node"));
        Object term5873 = newInstance(Class.forName("leetcode.Node"));
        Object term5875 = newInstance(Class.forName("leetcode.Node"));
        Object term5877 = newInstance(Class.forName("leetcode.Node"));
        setIntField(term5861, term5861.getClass(), "val", 399302934);
        setIntField(term5863, term5863.getClass(), "val", -1823255084);
        setIntField(term5865, term5865.getClass(), "val", 793345010);
        setIntField(term5867, term5867.getClass(), "val", -2092117838);
        setIntField(term5869, term5869.getClass(), "val", 1524590776);
        setField(term5869, term5869.getClass(), "next", null);
        setField(term5869, term5869.getClass(), "random", term5863);
        setField(term5867, term5867.getClass(), "next", term5869);
        setIntField(term5871, term5871.getClass(), "val", -974923743);
        setField(term5871, term5871.getClass(), "next", null);
        setField(term5871, term5871.getClass(), "random", null);
        setField(term5867, term5867.getClass(), "random", term5871);
        setField(term5865, term5865.getClass(), "next", term5867);
        setIntField(term5873, term5873.getClass(), "val", 919994471);
        setIntField(term5875, term5875.getClass(), "val", 183531701);
        setField(term5875, term5875.getClass(), "next", term5871);
        setField(term5875, term5875.getClass(), "random", term5861);
        setField(term5873, term5873.getClass(), "next", term5875);
        setIntField(term5877, term5877.getClass(), "val", 1523896653);
        setField(term5877, term5877.getClass(), "next", null);
        setField(term5877, term5877.getClass(), "random", term5863);
        setField(term5873, term5873.getClass(), "random", term5877);
        setField(term5865, term5865.getClass(), "random", term5873);
        setField(term5863, term5863.getClass(), "next", term5865);
        setField(term5863, term5863.getClass(), "random", term5873);
        setField(term5861, term5861.getClass(), "next", term5863);
        setField(term5861, term5861.getClass(), "random", term5869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.CopyListWithRandomPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("leetcode.Node");
        Object[] args = new Object[1];
        args[0] = term5861;
        callMethod(klass, "copyRandomList", argTypes, term5855, args);
    }

};


