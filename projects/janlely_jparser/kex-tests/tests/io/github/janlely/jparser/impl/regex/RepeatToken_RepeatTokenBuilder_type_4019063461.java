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

public class RepeatToken_RepeatTokenBuilder_type_4019063461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9016;
     Object enum30;

    public RepeatToken_RepeatTokenBuilder_type_4019063461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9039 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term9038 = ((Class) term9039).getDeclaredField((String) "OPTIONAL");
        ((Field) term9038).setAccessible(true);
        Object enum29 = ((Field) term9038).get((Object) null);
        term9016 = newInstance(Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken$RepeatTokenBuilder"));
        Object term9029 = newInstance(Class.forName("java.lang.Object"));
        setField(term9016, term9016.getClass(), "type", enum29);
        setField(term9016, term9016.getClass(), "value", term9029);
        Class<? extends Object> term9305 = Class.forName((String) "io.github.janlely.jparser.impl.regex.RepeatType");
        Field term9304 = ((Class) term9305).getDeclaredField((String) "MANY");
        ((Field) term9304).setAccessible(true);
        enum30 = ((Field) term9304).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.regex.RepeatToken$RepeatTokenBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.janlely.jparser.impl.regex.RepeatType");
        Object[] args = new Object[1];
        args[0] = enum30;
        callMethod(klass, "type", argTypes, term9016, args);
    }

};


