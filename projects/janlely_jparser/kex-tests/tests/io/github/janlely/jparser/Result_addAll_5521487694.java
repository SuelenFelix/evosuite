package io.github.janlely.jparser;

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
import static io.github.janlely.jparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.Object;

public class Result_addAll_5521487694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14420;
     Object term14439;

    public Result_addAll_5521487694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14421 = new ArrayList();
        term14420 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term14420, term14420.getClass(), "result", term14421);
        setField(term14420, term14420.getClass(), "errorMsg", "xypryEkUPF");
        setIntField(term14420, term14420.getClass(), "length", -523949691);
        setIntField(term14420, term14420.getClass(), "pos", 1398204340);
        Object term14442 = newInstance(Class.forName("java.lang.Object"));
        Object term14444 = newInstance(Class.forName("java.lang.Object"));
        Object term14446 = newInstance(Class.forName("java.lang.Object"));
        term14439 = new LinkedList();
        ((LinkedList) term14439).add(term14442);
        ((LinkedList) term14439).add(term14444);
        ((LinkedList) term14439).add(term14446);
        ((LinkedList) term14439).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term14439;
        callMethod(klass, "addAll", argTypes, term14420, args);
    }

};


