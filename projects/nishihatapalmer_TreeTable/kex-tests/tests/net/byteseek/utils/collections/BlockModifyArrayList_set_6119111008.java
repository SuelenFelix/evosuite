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

public class BlockModifyArrayList_set_6119111008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term41;

    public BlockModifyArrayList_set_6119111008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("net.byteseek.utils.collections.BlockModifyArrayList"));
        setFloatField(term37, term37.getClass(), "growMultiplier", 0.0F);
        setField(term37, term37.getClass(), "elements", null);
        setIntField(term37, term37.getClass(), "size", 0);
        setIntField(term37, term37.getClass(), "modCount", 0);
        term41 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.utils.collections.BlockModifyArrayList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term41;
        args[1] = null;
        callMethod(klass, "set", argTypes, term37, args);
    }

};


