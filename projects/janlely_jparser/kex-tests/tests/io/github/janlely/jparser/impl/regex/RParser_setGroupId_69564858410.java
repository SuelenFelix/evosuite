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

public class RParser_setGroupId_69564858410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23306;
     Object term23319;

    public RParser_setGroupId_69564858410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23322 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RParser$ParserType");
        Field term23321 = ((Class) term23322).getDeclaredField((String) "PARSER");
        ((Field) term23321).setAccessible(true);
        Object enum64 = ((Field) term23321).get((Object) null);
        term23306 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RParser"));
        setField(term23306, term23306.getClass(), "type", enum64);
        setIntField(term23306, term23306.getClass(), "quoteId", 371943306);
        setIntField(term23306, term23306.getClass(), "groupId", 982388293);
        setField(term23306, term23306.getClass(), "parser", null);
        setField(term23306, term23306.getClass(), "func", null);
        term23319 = new Integer(-159494544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term23319;
        callMethod(klass, "setGroupId", argTypes, term23306, args);
    }

};


