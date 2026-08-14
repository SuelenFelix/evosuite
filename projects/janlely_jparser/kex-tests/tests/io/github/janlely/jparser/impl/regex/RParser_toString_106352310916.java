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

public class RParser_toString_106352310916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25168;

    public RParser_toString_106352310916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25181 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term25180 = ((Class) term25181).getDeclaredField((String) "QUOTE");
        ((Field) term25180).setAccessible(true);
        Object enum70 = ((Field) term25180).get((Object) null);
        term25168 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term25168, term25168.getClass(), "type", enum70);
        setIntField(term25168, term25168.getClass(), "quoteId", 1045547089);
        setIntField(term25168, term25168.getClass(), "groupId", -1122880881);
        setField(term25168, term25168.getClass(), "parser", null);
        setField(term25168, term25168.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term25168, args);
    }

};


