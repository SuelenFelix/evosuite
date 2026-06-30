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
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class RegexParser_toRepeat_162031924517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1221;
     Object term1234;
     Object term1244;

    public RegexParser_toRepeat_162031924517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1224 = new HashMap();
        HashMap term1229 = new HashMap();
        term1221 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term1222 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term1222, term1222.getClass(), "value", 0);
        setField(term1221, term1221.getClass(), "groupId", term1222);
        setField(term1221, term1221.getClass(), "groupResult", term1224);
        setField(term1221, term1221.getClass(), "finalGroup", term1229);
        setField(term1221, term1221.getClass(), "compiledParser", null);
        Class<? extends Object> term1304 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term1303 = ((Class) term1304).getDeclaredField((String) "MANY");
        ((Field) term1303).setAccessible(true);
        Object enum3 = ((Field) term1303).get((Object) null);
        term1234 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken"));
        Object term1243 = newInstance(Class.forName("java.lang.Object"));
        setField(term1234, term1234.getClass(), "type", enum3);
        setField(term1234, term1234.getClass(), "value", term1243);
        Class<? extends Object> term1558 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term1557 = ((Class) term1558).getDeclaredField((String) "QUOTE");
        ((Field) term1557).setAccessible(true);
        Object enum4 = ((Field) term1557).get((Object) null);
        term1244 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term1244, term1244.getClass(), "type", enum4);
        setIntField(term1244, term1244.getClass(), "quoteId", 1484323161);
        setIntField(term1244, term1244.getClass(), "groupId", 391863371);
        setField(term1244, term1244.getClass(), "parser", null);
        setField(term1244, term1244.getClass(), "func", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken");
        argTypes[1] = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Object[] args = new Object[2];
        args[0] = term1234;
        args[1] = term1244;
        callMethod(klass, "toRepeat", argTypes, term1221, args);
    }

};


