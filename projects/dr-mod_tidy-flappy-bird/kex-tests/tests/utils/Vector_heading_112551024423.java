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

public class Vector_heading_112551024423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;

    public Vector_heading_112551024423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("utils.Vector"));
        setFloatField(term126, term126.getClass(), "x", 0.52792794F);
        setFloatField(term126, term126.getClass(), "y", 0.24759698F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("utils.Vector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "heading", argTypes, term126, args);
    }

};


