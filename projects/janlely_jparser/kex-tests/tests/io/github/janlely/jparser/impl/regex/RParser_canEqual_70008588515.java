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

public class RParser_canEqual_70008588515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14715;
     Object term14727;

    public RParser_canEqual_70008588515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14729 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term14728 = ((Class) term14729).getDeclaredField((String) "START");
        ((Field) term14728).setAccessible(true);
        Object enum48 = ((Field) term14728).get((Object) null);
        term14715 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term14715, term14715.getClass(), "type", enum48);
        setIntField(term14715, term14715.getClass(), "quoteId", 579005622);
        setIntField(term14715, term14715.getClass(), "groupId", -14890619);
        setField(term14715, term14715.getClass(), "parser", null);
        setField(term14715, term14715.getClass(), "func", null);
        term14727 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14727;
        callMethod(klass, "canEqual", argTypes, term14715, args);
    }

};


