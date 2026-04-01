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

public class BlockModifyArrayList_replace_182554457011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term61;
     Object term63;

    public BlockModifyArrayList_replace_182554457011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("net.byteseek.utils.collections.BlockModifyArrayList"));
        setFloatField(term57, term57.getClass(), "growMultiplier", 0.0F);
        setField(term57, term57.getClass(), "elements", null);
        setIntField(term57, term57.getClass(), "size", 0);
        setIntField(term57, term57.getClass(), "modCount", 0);
        term61 = new Integer(0);
        term63 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.utils.collections.BlockModifyArrayList");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term61;
        args[1] = term63;
        args[2] = null;
        callMethod(klass, "replace", argTypes, term57, args);
    }

};


