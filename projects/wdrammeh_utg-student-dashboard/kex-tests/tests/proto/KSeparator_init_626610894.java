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
     Object term66304;
     Object term66306;

    public KSeparator_init_626610894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66304 = new Integer(-1703625118);
        term66306 = newInstance(Class.forName("java.awt.Color"));
        float[] term66308 = (float[]) newFloatArray(6);
        float[] term66315 = (float[]) newFloatArray(1);
        setIntField(term66306, term66306.getClass(), "value", 1104108112);
        setFloatElement(term66308, 0, 0.95118606F);
        setFloatElement(term66308, 1, 0.111205876F);
        setFloatElement(term66308, 2, 0.058807194F);
        setFloatElement(term66308, 3, 0.013315558F);
        setFloatElement(term66308, 4, 0.34010088F);
        setFloatElement(term66308, 5, 0.40587604F);
        setField(term66306, term66306.getClass(), "frgbvalue", term66308);
        setFloatElement(term66315, 0, 0.19625396F);
        setField(term66306, term66306.getClass(), "fvalue", term66315);
        setFloatField(term66306, term66306.getClass(), "falpha", 0.234712F);
        setField(term66306, term66306.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KSeparator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.awt.Color");
        Object[] args = new Object[2];
        args[0] = term66304;
        args[1] = term66306;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


