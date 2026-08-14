package com.voodoodyne.hattery;

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
import static com.voodoodyne.hattery.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Param_concat_13949259650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9341;
     Object term9426;

    public Param_concat_13949259650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9341 = (Object[]) newArray("com.voodoodyne.hattery.Param", 6);
        Object term9342 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9355 = newInstance(Class.forName("java.lang.Object"));
        Object term9356 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9369 = newInstance(Class.forName("java.lang.Object"));
        Object term9370 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9383 = newInstance(Class.forName("java.lang.Object"));
        Object term9384 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9397 = newInstance(Class.forName("java.lang.Object"));
        Object term9398 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9411 = newInstance(Class.forName("java.lang.Object"));
        Object term9412 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9425 = newInstance(Class.forName("java.lang.Object"));
        setField(term9342, term9342.getClass(), "name", "hoicvmsovO");
        setField(term9342, term9342.getClass(), "value", term9355);
        setElement(term9341, 0, term9342);
        setField(term9356, term9356.getClass(), "name", "eqJfYWRaEL");
        setField(term9356, term9356.getClass(), "value", term9369);
        setElement(term9341, 1, term9356);
        setField(term9370, term9370.getClass(), "name", "fhkbdRViHi");
        setField(term9370, term9370.getClass(), "value", term9383);
        setElement(term9341, 2, term9370);
        setField(term9384, term9384.getClass(), "name", "uWHnvSvaPl");
        setField(term9384, term9384.getClass(), "value", term9397);
        setElement(term9341, 3, term9384);
        setField(term9398, term9398.getClass(), "name", "kBdSllIBVz");
        setField(term9398, term9398.getClass(), "value", term9411);
        setElement(term9341, 4, term9398);
        setField(term9412, term9412.getClass(), "name", "TJmVBGfTML");
        setField(term9412, term9412.getClass(), "value", term9425);
        setElement(term9341, 5, term9412);
        term9426 = (Object[]) newArray("com.voodoodyne.hattery.Param", 7);
        Object term9427 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9440 = newInstance(Class.forName("java.lang.Object"));
        Object term9441 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9454 = newInstance(Class.forName("java.lang.Object"));
        Object term9455 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9468 = newInstance(Class.forName("java.lang.Object"));
        Object term9469 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9482 = newInstance(Class.forName("java.lang.Object"));
        Object term9483 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9496 = newInstance(Class.forName("java.lang.Object"));
        Object term9497 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9510 = newInstance(Class.forName("java.lang.Object"));
        Object term9511 = newInstance(Class.forName("com.voodoodyne.hattery.Param"));
        Object term9524 = newInstance(Class.forName("java.lang.Object"));
        setField(term9427, term9427.getClass(), "name", "tPlsykYBqO");
        setField(term9427, term9427.getClass(), "value", term9440);
        setElement(term9426, 0, term9427);
        setField(term9441, term9441.getClass(), "name", "bLPjGVBhlX");
        setField(term9441, term9441.getClass(), "value", term9454);
        setElement(term9426, 1, term9441);
        setField(term9455, term9455.getClass(), "name", "whBvTVIIlC");
        setField(term9455, term9455.getClass(), "value", term9468);
        setElement(term9426, 2, term9455);
        setField(term9469, term9469.getClass(), "name", "IgRJUzaCwW");
        setField(term9469, term9469.getClass(), "value", term9482);
        setElement(term9426, 3, term9469);
        setField(term9483, term9483.getClass(), "name", "JUmudUmaaV");
        setField(term9483, term9483.getClass(), "value", term9496);
        setElement(term9426, 4, term9483);
        setField(term9497, term9497.getClass(), "name", "KoyGrUJeJW");
        setField(term9497, term9497.getClass(), "value", term9510);
        setElement(term9426, 5, term9497);
        setField(term9511, term9511.getClass(), "name", "HqBOwkVqjD");
        setField(term9511, term9511.getClass(), "value", term9524);
        setElement(term9426, 6, term9511);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.voodoodyne.hattery.Param");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.voodoodyne.hattery.Param"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("com.voodoodyne.hattery.Param"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term9341;
        args[1] = term9426;
        callMethod(klass, "concat", argTypes, null, args);
    }

};


