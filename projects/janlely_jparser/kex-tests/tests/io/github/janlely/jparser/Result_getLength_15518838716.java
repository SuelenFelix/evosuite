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

public class Result_getLength_15518838716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14673;

    public Result_getLength_15518838716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14674 = new ArrayList();
        term14673 = newInstance(Class.forName("io.github.janlely.jparser.Result"));
        setField(term14673, term14673.getClass(), "result", term14674);
        setField(term14673, term14673.getClass(), "errorMsg", "xAWekqanqc");
        setIntField(term14673, term14673.getClass(), "length", 197109649);
        setIntField(term14673, term14673.getClass(), "pos", -1239406390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLength", argTypes, term14673, args);
    }

};


