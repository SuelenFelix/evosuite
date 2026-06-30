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

public class Result_ResultBuilder_length_16594983113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2464;
     Object term2483;

    public Result_ResultBuilder_length_16594983113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2465 = new ArrayList();
        term2464 = newInstance(Class.forName("io.github.janlely.jparser.Result$ResultBuilder"));
        setField(term2464, term2464.getClass(), "result", term2465);
        setField(term2464, term2464.getClass(), "errorMsg", "oVcInYnLWB");
        setIntField(term2464, term2464.getClass(), "length", 1324040357);
        setIntField(term2464, term2464.getClass(), "pos", -1588772968);
        term2483 = new Integer(-93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.Result$ResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2483;
        callMethod(klass, "length", argTypes, term2464, args);
    }

};


