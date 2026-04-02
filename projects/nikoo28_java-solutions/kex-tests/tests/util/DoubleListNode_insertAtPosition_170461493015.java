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

public class DoubleListNode_insertAtPosition_170461493015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1055;
     Object term1057;
     Object term1059;

    public DoubleListNode_insertAtPosition_170461493015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1055 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term1055, term1055.getClass(), "val", 0);
        setField(term1055, term1055.getClass(), "prev", null);
        setField(term1055, term1055.getClass(), "next", null);
        term1057 = new Integer(0);
        term1059 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.DoubleListNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1057;
        args[2] = term1059;
        callMethod(klass, "insertAtPosition", argTypes, term1055, args);
    }

};


