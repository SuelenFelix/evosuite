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

public class KSeparator_init_627206711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66253;

    public KSeparator_init_627206711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66253 = newInstance(Class.forName("java.awt.Color"));
        float[] term66255 = (float[]) newFloatArray(7);
        float[] term66263 = (float[]) newFloatArray(3);
        setIntField(term66253, term66253.getClass(), "value", 993627098);
        setFloatElement(term66255, 0, 0.59315026F);
        setFloatElement(term66255, 1, 0.09037483F);
        setFloatElement(term66255, 2, 0.39231926F);
        setFloatElement(term66255, 3, 0.6561919F);
        setFloatElement(term66255, 4, 0.2958501F);
        setFloatElement(term66255, 5, 0.73301786F);
        setFloatElement(term66255, 6, 0.7997349F);
        setField(term66253, term66253.getClass(), "frgbvalue", term66255);
        setFloatElement(term66263, 0, 0.76181644F);
        setFloatElement(term66263, 1, 0.24343538F);
        setFloatElement(term66263, 2, 0.7385589F);
        setField(term66253, term66253.getClass(), "fvalue", term66263);
        setFloatField(term66253, term66253.getClass(), "falpha", 0.8736398F);
        setField(term66253, term66253.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Color");
        Object[] args = new Object[1];
        args[0] = term66253;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


