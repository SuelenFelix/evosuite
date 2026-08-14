package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class KSeparator_init_15345514533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66329;
     Object term66332;
     Object term66344;

    public KSeparator_init_15345514533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66329 = newInstance(Class.forName("java.awt.Dimension"));
        setIntField(term66329, term66329.getClass(), "width", 86041387);
        setIntField(term66329, term66329.getClass(), "height", 1010721666);
        term66332 = newInstance(Class.forName("java.awt.Color"));
        float[] term66334 = (float[]) newFloatArray(3);
        float[] term66338 = (float[]) newFloatArray(4);
        setIntField(term66332, term66332.getClass(), "value", 27043781);
        setFloatElement(term66334, 0, 0.7080134F);
        setFloatElement(term66334, 1, 0.74126697F);
        setFloatElement(term66334, 2, 0.60597336F);
        setField(term66332, term66332.getClass(), "frgbvalue", term66334);
        setFloatElement(term66338, 0, 0.11164951F);
        setFloatElement(term66338, 1, 0.30746937F);
        setFloatElement(term66338, 2, 0.9695807F);
        setFloatElement(term66338, 3, 0.124525845F);
        setField(term66332, term66332.getClass(), "fvalue", term66338);
        setFloatField(term66332, term66332.getClass(), "falpha", 0.45613784F);
        setField(term66332, term66332.getClass(), "cs", null);
        term66344 = new Integer(-1367122405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KSeparator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Dimension");
        argTypes[1] = Class.forName("java.awt.Color");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term66329;
        args[1] = term66332;
        args[2] = term66344;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


