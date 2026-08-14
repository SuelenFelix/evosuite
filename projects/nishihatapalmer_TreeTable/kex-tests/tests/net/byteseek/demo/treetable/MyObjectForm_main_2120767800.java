package net.byteseek.demo.treetable;

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
import static net.byteseek.demo.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MyObjectForm_main_2120767800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term752;

    public MyObjectForm_main_2120767800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term752 = (Object[]) newArray("java.lang.String", 7);
        setElement(term752, 0, "xOcJIiQQDu");
        setElement(term752, 1, "GVizqqzXpy");
        setElement(term752, 2, "JqXGgAhZPl");
        setElement(term752, 3, "jiKYgYHqIS");
        setElement(term752, 4, "DfISiziTgG");
        setElement(term752, 5, "XqgfKFvPSD");
        setElement(term752, 6, "JiVRgTZvKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term752;
        callMethod(klass, "main", argTypes, null, args);
    }

};


