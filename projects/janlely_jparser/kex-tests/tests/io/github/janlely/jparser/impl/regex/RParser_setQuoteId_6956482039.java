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
     Object term22995;
     Object term23007;

    public RParser_setQuoteId_6956482039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23010 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term23009 = ((Class) term23010).getDeclaredField((String) "QUOTE");
        ((Field) term23009).setAccessible(true);
        Object enum63 = ((Field) term23009).get((Object) null);
        term22995 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term22995, term22995.getClass(), "type", enum63);
        setIntField(term22995, term22995.getClass(), "quoteId", -2131181468);
        setIntField(term22995, term22995.getClass(), "groupId", 282916351);
        setField(term22995, term22995.getClass(), "parser", null);
        setField(term22995, term22995.getClass(), "func", null);
        term23007 = new Integer(880977281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23007;
        callMethod(klass, "setQuoteId", argTypes, term22995, args);
    }

};


