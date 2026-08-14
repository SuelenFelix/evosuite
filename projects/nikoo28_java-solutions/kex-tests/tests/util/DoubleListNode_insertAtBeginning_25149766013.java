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
import java.lang.Integer;

public class DoubleListNode_insertAtBeginning_25149766013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1047;
     Object term1049;

    public DoubleListNode_insertAtBeginning_25149766013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1047 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term1047, term1047.getClass(), "val", 0);
        setField(term1047, term1047.getClass(), "prev", null);
        setField(term1047, term1047.getClass(), "next", null);
        term1049 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.DoubleListNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1049;
        callMethod(klass, "insertAtBeginning", argTypes, term1047, args);
    }

};


