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

public class RParser_hashCode_55276341916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15025;

    public RParser_hashCode_55276341916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15038 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term15037 = ((Class) term15038).getDeclaredField((String) "QUOTE");
        ((Field) term15037).setAccessible(true);
        Object enum49 = ((Field) term15037).get((Object) null);
        term15025 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term15025, term15025.getClass(), "type", enum49);
        setIntField(term15025, term15025.getClass(), "quoteId", 1632125673);
        setIntField(term15025, term15025.getClass(), "groupId", 454281060);
        setField(term15025, term15025.getClass(), "parser", null);
        setField(term15025, term15025.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term15025, args);
    }

};


