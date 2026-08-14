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

public class BlockModifyArrayList_lastIndexOf_11498422015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;

    public BlockModifyArrayList_lastIndexOf_11498422015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89 = newInstance(Class.forName("net.byteseek.utils.collections.BlockModifyArrayList"));
        setFloatField(term89, term89.getClass(), "growMultiplier", 0.0F);
        setField(term89, term89.getClass(), "elements", null);
        setIntField(term89, term89.getClass(), "size", 0);
        setIntField(term89, term89.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.utils.collections.BlockModifyArrayList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "lastIndexOf", argTypes, term89, args);
    }

};


