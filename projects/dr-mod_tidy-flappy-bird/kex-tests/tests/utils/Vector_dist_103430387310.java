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

public class Vector_dist_103430387310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54;
     Object term57;

    public Vector_dist_103430387310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term54, term54.getClass(), "x", 0.7254646F);
        setFloatField(term54, term54.getClass(), "y", 0.9828442F);
        term57 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term57, term57.getClass(), "x", 0.9472605F);
        setFloatField(term57, term57.getClass(), "y", 0.27797186F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("utils.Vector");
        Object[] args = new Object[1];
        args[0] = term57;
        callMethod(klass, "dist", argTypes, term54, args);
    }

};


