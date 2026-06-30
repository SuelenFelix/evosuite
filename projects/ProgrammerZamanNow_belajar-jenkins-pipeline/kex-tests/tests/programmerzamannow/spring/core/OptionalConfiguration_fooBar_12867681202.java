package programmerzamannow.spring.core;

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
import static programmerzamannow.spring.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OptionalConfiguration_fooBar_12867681202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term410;
     Object term412;

    public OptionalConfiguration_fooBar_12867681202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("programmerzamannow.spring.core.OptionalConfiguration"));
        term410 = newInstance(Class.forName("java.util.Optional"));
        Object term411 = newInstance(Class.forName("programmerzamannow.spring.core.data.Foo"));
        setField(term410, term410.getClass(), "value", term411);
        term412 = newInstance(Class.forName("java.util.Optional"));
        Object term413 = newInstance(Class.forName("programmerzamannow.spring.core.data.Bar"));
        setField(term412, term412.getClass(), "value", term413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.OptionalConfiguration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Optional");
        argTypes[1] = Class.forName("java.util.Optional");
        Object[] args = new Object[2];
        args[0] = term410;
        args[1] = term412;
        callMethod(klass, "fooBar", argTypes, term409, args);
    }

};


