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
import java.lang.Integer;

public class RParser_setGroupId_69564858410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13473;
     Object term13485;

    public RParser_setGroupId_69564858410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13488 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term13487 = ((Class) term13488).getDeclaredField((String) "START");
        ((Field) term13487).setAccessible(true);
        Object enum44 = ((Field) term13487).get((Object) null);
        term13473 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term13473, term13473.getClass(), "type", enum44);
        setIntField(term13473, term13473.getClass(), "quoteId", 679763016);
        setIntField(term13473, term13473.getClass(), "groupId", 1962444399);
        setField(term13473, term13473.getClass(), "parser", null);
        setField(term13473, term13473.getClass(), "func", null);
        term13485 = new Integer(767834723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13485;
        callMethod(klass, "setGroupId", argTypes, term13473, args);
    }

};


