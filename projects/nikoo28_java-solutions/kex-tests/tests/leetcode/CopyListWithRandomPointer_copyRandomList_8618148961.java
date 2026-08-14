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
     Object term5830;
     Object term5836;

    public CopyListWithRandomPointer_copyRandomList_8618148961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5831 = new HashMap();
        term5830 = newInstance(Class.forName("leetcode.CopyListWithRandomPointer"));
        setField(term5830, term5830.getClass(), "oldNodeNewNodeMap", term5831);
        term5836 = newInstance(Class.forName("leetcode.Node"));
        Object term5838 = newInstance(Class.forName("leetcode.Node"));
        Object term5840 = newInstance(Class.forName("leetcode.Node"));
        Object term5842 = newInstance(Class.forName("leetcode.Node"));
        Object term5844 = newInstance(Class.forName("leetcode.Node"));
        Object term5846 = newInstance(Class.forName("leetcode.Node"));
        Object term5848 = newInstance(Class.forName("leetcode.Node"));
        Object term5850 = newInstance(Class.forName("leetcode.Node"));
        Object term5852 = newInstance(Class.forName("leetcode.Node"));
        setIntField(term5836, term5836.getClass(), "val", -2003607923);
        setIntField(term5838, term5838.getClass(), "val", 1378805929);
        setIntField(term5840, term5840.getClass(), "val", 695052304);
        setIntField(term5842, term5842.getClass(), "val", -179937218);
        setIntField(term5844, term5844.getClass(), "val", 940896043);
        setField(term5844, term5844.getClass(), "next", null);
        setField(term5844, term5844.getClass(), "random", term5838);
        setField(term5842, term5842.getClass(), "next", term5844);
        setIntField(term5846, term5846.getClass(), "val", -1414233013);
        setField(term5846, term5846.getClass(), "next", null);
        setField(term5846, term5846.getClass(), "random", null);
        setField(term5842, term5842.getClass(), "random", term5846);
        setField(term5840, term5840.getClass(), "next", term5842);
        setIntField(term5848, term5848.getClass(), "val", -1661200819);
        setIntField(term5850, term5850.getClass(), "val", -235039141);
        setField(term5850, term5850.getClass(), "next", term5846);
        setField(term5850, term5850.getClass(), "random", term5836);
        setField(term5848, term5848.getClass(), "next", term5850);
        setIntField(term5852, term5852.getClass(), "val", -1156002984);
        setField(term5852, term5852.getClass(), "next", null);
        setField(term5852, term5852.getClass(), "random", term5838);
        setField(term5848, term5848.getClass(), "random", term5852);
        setField(term5840, term5840.getClass(), "random", term5848);
        setField(term5838, term5838.getClass(), "next", term5840);
        setField(term5838, term5838.getClass(), "random", term5848);
        setField(term5836, term5836.getClass(), "next", term5838);
        setField(term5836, term5836.getClass(), "random", term5844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.CopyListWithRandomPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("leetcode.Node");
        Object[] args = new Object[1];
        args[0] = term5836;
        callMethod(klass, "copyRandomList", argTypes, term5830, args);
    }

};


