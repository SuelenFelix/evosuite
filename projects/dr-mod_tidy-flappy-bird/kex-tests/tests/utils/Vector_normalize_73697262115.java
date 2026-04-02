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

public class Vector_normalize_73697262115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term90;

    public Vector_normalize_73697262115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term87, term87.getClass(), "x", 0.5840714F);
        setFloatField(term87, term87.getClass(), "y", 0.478669F);
        term90 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term90, term90.getClass(), "x", 0.75592405F);
        setFloatField(term90, term90.getClass(), "y", 0.068145275F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("utils.Vector");
        Object[] args = new Object[1];
        args[0] = term90;
        callMethod(klass, "normalize", argTypes, term87, args);
    }

};


