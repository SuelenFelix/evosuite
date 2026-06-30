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
import java.lang.Integer;

public class Result_incLen_4997207888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14517;
     Object term14536;

    public Result_incLen_4997207888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14518 = new ArrayList();
        term14517 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term14517, term14517.getClass(), "result", term14518);
        setField(term14517, term14517.getClass(), "errorMsg", "qxhOsmyyjm");
        setIntField(term14517, term14517.getClass(), "length", -1002370457);
        setIntField(term14517, term14517.getClass(), "pos", -2014576105);
        term14536 = new Integer(1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14536;
        callMethod(klass, "incLen", argTypes, term14517, args);
    }

};


