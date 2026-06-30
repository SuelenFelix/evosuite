package io.github.janlely.jparser.impl.regex;

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
import static io.github.janlely.jparser.impl.regex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RepeatToken_RepeatTokenBuilder_type_4019063466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10371;

    public RepeatToken_RepeatTokenBuilder_type_4019063466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10371 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken$RepeatTokenBuilder"));
        setField(term10371, term10371.getClass(), "type", null);
        setField(term10371, term10371.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken$RepeatTokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.regex.RepeatType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "type", argTypes, term10371, args);
    }

};


