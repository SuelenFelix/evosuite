package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GraphColoring_main_16985731112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1935;

    public GraphColoring_main_16985731112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1935 = (Object[]) newArray("java.lang.String", 9);
        setElement(term1935, 0, "nyiiPDVjAc");
        setElement(term1935, 1, "aKnKipADSo");
        setElement(term1935, 2, "wSQxaModmm");
        setElement(term1935, 3, "UlajhuVLaP");
        setElement(term1935, 4, "gGSMzuGICf");
        setElement(term1935, 5, "hxCBltsObl");
        setElement(term1935, 6, "BndsHwAFMv");
        setElement(term1935, 7, "GzFkzHGYFt");
        setElement(term1935, 8, "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.GraphColoring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1935;
        callMethod(klass, "main", argTypes, null, args);
    }

};


