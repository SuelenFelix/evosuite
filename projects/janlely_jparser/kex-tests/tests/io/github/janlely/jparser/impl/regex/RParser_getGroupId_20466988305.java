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

public class RParser_getGroupId_20466988305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11612;

    public RParser_getGroupId_20466988305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11625 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term11624 = ((Class) term11625).getDeclaredField((String) "QUOTE");
        ((Field) term11624).setAccessible(true);
        Object enum38 = ((Field) term11624).get((Object) null);
        term11612 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term11612, term11612.getClass(), "type", enum38);
        setIntField(term11612, term11612.getClass(), "quoteId", -1275173084);
        setIntField(term11612, term11612.getClass(), "groupId", -244121226);
        setField(term11612, term11612.getClass(), "parser", null);
        setField(term11612, term11612.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupId", argTypes, term11612, args);
    }

};


