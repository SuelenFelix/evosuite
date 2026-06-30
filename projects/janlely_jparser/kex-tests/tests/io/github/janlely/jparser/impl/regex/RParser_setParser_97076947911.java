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

public class RParser_setParser_97076947911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13784;

    public RParser_setParser_97076947911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13797 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term13796 = ((Class) term13797).getDeclaredField((String) "START");
        ((Field) term13796).setAccessible(true);
        Object enum45 = ((Field) term13796).get((Object) null);
        term13784 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term13784, term13784.getClass(), "type", enum45);
        setIntField(term13784, term13784.getClass(), "quoteId", -602026508);
        setIntField(term13784, term13784.getClass(), "groupId", -157887805);
        setField(term13784, term13784.getClass(), "parser", null);
        setField(term13784, term13784.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.Parser");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setParser", argTypes, term13784, args);
    }

};


