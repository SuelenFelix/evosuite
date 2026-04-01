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

public class BlockModifyArrayList_checkResize_42401818819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term115;

    public BlockModifyArrayList_checkResize_42401818819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = newInstance(Class.forName("net.byteseek.utils.collections.BlockModifyArrayList"));
        setFloatField(term111, term111.getClass(), "growMultiplier", 0.0F);
        setField(term111, term111.getClass(), "elements", null);
        setIntField(term111, term111.getClass(), "size", 0);
        setIntField(term111, term111.getClass(), "modCount", 0);
        term115 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.utils.collections.BlockModifyArrayList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term115;
        callMethod(klass, "checkResize", argTypes, term111, args);
    }

};


