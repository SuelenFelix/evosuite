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

public class RParser_setQuoteId_6956482039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13158;
     Object term13171;

    public RParser_setQuoteId_6956482039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13174 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term13173 = ((Class) term13174).getDeclaredField((String) "PARSER");
        ((Field) term13173).setAccessible(true);
        Object enum43 = ((Field) term13173).get((Object) null);
        term13158 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term13158, term13158.getClass(), "type", enum43);
        setIntField(term13158, term13158.getClass(), "quoteId", -1530420153);
        setIntField(term13158, term13158.getClass(), "groupId", -469968304);
        setField(term13158, term13158.getClass(), "parser", null);
        setField(term13158, term13158.getClass(), "func", null);
        term13171 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13171;
        callMethod(klass, "setQuoteId", argTypes, term13158, args);
    }

};


