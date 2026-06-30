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

public class KSeparator_init_13495107275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66325;
     Object term66328;

    public KSeparator_init_13495107275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66325 = newInstance(Class.forName("java.awt.Dimension"));
        setIntField(term66325, term66325.getClass(), "width", 1648665618);
        setIntField(term66325, term66325.getClass(), "height", 633765954);
        term66328 = newInstance(Class.forName("java.awt.Color"));
        float[] term66330 = (float[]) newFloatArray(2);
        float[] term66333 = (float[]) newFloatArray(0);
        setIntField(term66328, term66328.getClass(), "value", 269110087);
        setFloatElement(term66330, 0, 0.450692F);
        setFloatElement(term66330, 1, 0.35089302F);
        setField(term66328, term66328.getClass(), "frgbvalue", term66330);
        setField(term66328, term66328.getClass(), "fvalue", term66333);
        setFloatField(term66328, term66328.getClass(), "falpha", 0.9341364F);
        setField(term66328, term66328.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KSeparator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Dimension");
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = term66325;
        args[1] = term66328;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


