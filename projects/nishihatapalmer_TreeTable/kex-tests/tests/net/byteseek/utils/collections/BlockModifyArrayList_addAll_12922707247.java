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

public class BlockModifyArrayList_addAll_12922707247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term35;

    public BlockModifyArrayList_addAll_12922707247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31 = newInstance(Class.forName("net.byteseek.utils.collections.BlockModifyArrayList"));
        setFloatField(term31, term31.getClass(), "growMultiplier", 0.0F);
        setField(term31, term31.getClass(), "elements", null);
        setIntField(term31, term31.getClass(), "size", 0);
        setIntField(term31, term31.getClass(), "modCount", 0);
        term35 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.utils.collections.BlockModifyArrayList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = term35;
        args[1] = null;
        callMethod(klass, "addAll", argTypes, term31, args);
    }

};


