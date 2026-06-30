package utils;

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
import static utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class Vector_div_82597512647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220;
     Object term223;

    public Vector_div_82597512647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term220, term220.getClass(), "x", 0.0F);
        setFloatField(term220, term220.getClass(), "y", 0.0F);
        term223 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term223;
        callMethod(klass, "div", argTypes, term220, args);
    }

};


