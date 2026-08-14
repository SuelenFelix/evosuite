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
     Object term66374;
     Object term66377;

    public KSeparator_init_13495107275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66374 = newInstance(Class.forName("java.awt.Dimension"));
        setIntField(term66374, term66374.getClass(), "width", 1648665618);
        setIntField(term66374, term66374.getClass(), "height", 633765954);
        term66377 = newInstance(Class.forName("java.awt.Color"));
        float[] term66379 = (float[]) newFloatArray(2);
        float[] term66382 = (float[]) newFloatArray(0);
        setIntField(term66377, term66377.getClass(), "value", 269110087);
        setFloatElement(term66379, 0, 0.450692F);
        setFloatElement(term66379, 1, 0.35089302F);
        setField(term66377, term66377.getClass(), "frgbvalue", term66379);
        setField(term66377, term66377.getClass(), "fvalue", term66382);
        setFloatField(term66377, term66377.getClass(), "falpha", 0.9341364F);
        setField(term66377, term66377.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KSeparator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Dimension");
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = term66374;
        args[1] = term66377;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


