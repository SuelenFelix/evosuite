package org.mozilla.universalchardet.prober;

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
import static org.mozilla.universalchardet.prober.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class HebrewProber_handleData_2683523485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97610;
     Object term97616;
     Object term97624;
     Object term97626;

    public HebrewProber_handleData_2683523485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97610 = newInstance(Class.forName("org.mozilla.universalchardet.prober.HebrewProber"));
        setIntField(term97610, term97610.getClass(), "finalCharLogicalScore", 590364439);
        setIntField(term97610, term97610.getClass(), "finalCharVisualScore", 865208305);
        setByteField(term97610, term97610.getClass(), "prev", (byte) 32);
        setByteField(term97610, term97610.getClass(), "beforePrev", (byte) 32);
        setField(term97610, term97610.getClass(), "logicalProber", null);
        setField(term97610, term97610.getClass(), "visualProber", null);
        setBooleanField(term97610, term97610.getClass(), "active", true);
        term97616 = (byte[]) newByteArray(7);
        setByteElement(term97616, 0, (byte) -15);
        setByteElement(term97616, 1, (byte) 36);
        setByteElement(term97616, 2, (byte) 118);
        setByteElement(term97616, 3, (byte) 106);
        setByteElement(term97616, 4, (byte) 98);
        setByteElement(term97616, 5, (byte) 67);
        setByteElement(term97616, 6, (byte) 66);
        term97624 = new Integer(-1275173084);
        term97626 = new Integer(-244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.HebrewProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term97616;
        args[1] = term97624;
        args[2] = term97626;
        callMethod(klass, "handleData", argTypes, term97610, args);
    }

};


