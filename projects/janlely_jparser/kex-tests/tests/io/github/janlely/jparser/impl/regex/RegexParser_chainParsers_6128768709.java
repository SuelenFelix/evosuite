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
import java.util.LinkedList;
import java.lang.String;

public class RegexParser_chainParsers_6128768709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term754;
     Object term767;

    public RegexParser_chainParsers_6128768709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term757 = new HashMap();
        HashMap term762 = new HashMap();
        term754 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RegexParser"));
        Object term755 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term755, term755.getClass(), "value", 0);
        setField(term754, term754.getClass(), "groupId", term755);
        setField(term754, term754.getClass(), "groupResult", term757);
        setField(term754, term754.getClass(), "finalGroup", term762);
        setField(term754, term754.getClass(), "compiledParser", null);
        Class<? extends Object> term778 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term777 = ((Class) term778).getDeclaredField((String) "PARSER");
        ((Field) term777).setAccessible(true);
        Object enum2 = ((Field) term777).get((Object) null);
        Object term770 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term770, term770.getClass(), "type", enum2);
        setIntField(term770, term770.getClass(), "quoteId", 568599855);
        setIntField(term770, term770.getClass(), "groupId", 1162663216);
        setField(term770, term770.getClass(), "parser", null);
        setField(term770, term770.getClass(), "func", null);
        term767 = new LinkedList();
        ((LinkedList) term767).add(term770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RegexParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term767;
        callMethod(klass, "chainParsers", argTypes, term754, args);
    }

};


