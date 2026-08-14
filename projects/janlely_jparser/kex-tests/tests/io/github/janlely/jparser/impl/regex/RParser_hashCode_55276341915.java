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

public class RParser_hashCode_55276341915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24859;

    public RParser_hashCode_55276341915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24872 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term24871 = ((Class) term24872).getDeclaredField((String) "START");
        ((Field) term24871).setAccessible(true);
        Object enum69 = ((Field) term24871).get((Object) null);
        term24859 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term24859, term24859.getClass(), "type", enum69);
        setIntField(term24859, term24859.getClass(), "quoteId", -860131894);
        setIntField(term24859, term24859.getClass(), "groupId", -1022990421);
        setField(term24859, term24859.getClass(), "parser", null);
        setField(term24859, term24859.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term24859, args);
    }

};


