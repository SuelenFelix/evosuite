package net.byteseek.utils.collections;

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
import static net.byteseek.utils.collections.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BlockModifyArrayList_replace_35784010512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term69;
     Object term71;
     Object term73;

    public BlockModifyArrayList_replace_35784010512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("net.byteseek.utils.collections.BlockModifyArrayList"));
        setFloatField(term65, term65.getClass(), "growMultiplier", 0.0F);
        setField(term65, term65.getClass(), "elements", null);
        setIntField(term65, term65.getClass(), "size", 0);
        setIntField(term65, term65.getClass(), "modCount", 0);
        term69 = new Integer(0);
        term71 = new Integer(0);
        term73 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.utils.collections.BlockModifyArrayList");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.Enumeration");
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term69;
        args[1] = term71;
        args[2] = null;
        args[3] = term73;
        callMethod(klass, "replace", argTypes, term65, args);
    }

};


