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

public class KSeparator_init_626610894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66353;
     Object term66355;

    public KSeparator_init_626610894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66353 = new Integer(-1703625118);
        term66355 = newInstance(Class.forName("java.awt.Color"));
        float[] term66357 = (float[]) newFloatArray(6);
        float[] term66364 = (float[]) newFloatArray(1);
        setIntField(term66355, term66355.getClass(), "value", 1104108112);
        setFloatElement(term66357, 0, 0.95118606F);
        setFloatElement(term66357, 1, 0.111205876F);
        setFloatElement(term66357, 2, 0.058807194F);
        setFloatElement(term66357, 3, 0.013315558F);
        setFloatElement(term66357, 4, 0.34010088F);
        setFloatElement(term66357, 5, 0.40587604F);
        setField(term66355, term66355.getClass(), "frgbvalue", term66357);
        setFloatElement(term66364, 0, 0.19625396F);
        setField(term66355, term66355.getClass(), "fvalue", term66364);
        setFloatField(term66355, term66355.getClass(), "falpha", 0.234712F);
        setField(term66355, term66355.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KSeparator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = term66353;
        args[1] = term66355;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


