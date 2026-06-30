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
     Object term66280;
     Object term66283;
     Object term66295;

    public KSeparator_init_15345514533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66280 = newInstance(Class.forName("java.awt.Dimension"));
        setIntField(term66280, term66280.getClass(), "width", 86041387);
        setIntField(term66280, term66280.getClass(), "height", 1010721666);
        term66283 = newInstance(Class.forName("java.awt.Color"));
        float[] term66285 = (float[]) newFloatArray(3);
        float[] term66289 = (float[]) newFloatArray(4);
        setIntField(term66283, term66283.getClass(), "value", 27043781);
        setFloatElement(term66285, 0, 0.7080134F);
        setFloatElement(term66285, 1, 0.74126697F);
        setFloatElement(term66285, 2, 0.60597336F);
        setField(term66283, term66283.getClass(), "frgbvalue", term66285);
        setFloatElement(term66289, 0, 0.11164951F);
        setFloatElement(term66289, 1, 0.30746937F);
        setFloatElement(term66289, 2, 0.9695807F);
        setFloatElement(term66289, 3, 0.124525845F);
        setField(term66283, term66283.getClass(), "fvalue", term66289);
        setFloatField(term66283, term66283.getClass(), "falpha", 0.45613784F);
        setField(term66283, term66283.getClass(), "cs", null);
        term66295 = new Integer(-1367122405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KSeparator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Dimension");
        argTypes[1] = Class.forName("java.awt.Color");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term66280;
        args[1] = term66283;
        args[2] = term66295;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


