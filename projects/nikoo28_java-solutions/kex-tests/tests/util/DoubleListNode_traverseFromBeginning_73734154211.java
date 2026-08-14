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

public class DoubleListNode_traverseFromBeginning_73734154211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1043;

    public DoubleListNode_traverseFromBeginning_73734154211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1043 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term1043, term1043.getClass(), "val", 0);
        setField(term1043, term1043.getClass(), "prev", null);
        setField(term1043, term1043.getClass(), "next", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.DoubleListNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "traverseFromBeginning", argTypes, term1043, args);
    }

};


