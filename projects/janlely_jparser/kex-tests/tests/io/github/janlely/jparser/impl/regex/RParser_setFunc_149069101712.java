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
import java.lang.String;
import java.lang.Object;

public class RParser_setFunc_149069101712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14093;

    public RParser_setFunc_149069101712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14106 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term14105 = ((Class) term14106).getDeclaredField((String) "GROUP");
        ((Field) term14105).setAccessible(true);
        Object enum46 = ((Field) term14105).get((Object) null);
        term14093 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term14093, term14093.getClass(), "type", enum46);
        setIntField(term14093, term14093.getClass(), "quoteId", 1876565163);
        setIntField(term14093, term14093.getClass(), "groupId", -817164822);
        setField(term14093, term14093.getClass(), "parser", null);
        setField(term14093, term14093.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.function.Function");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFunc", argTypes, term14093, args);
    }

};


