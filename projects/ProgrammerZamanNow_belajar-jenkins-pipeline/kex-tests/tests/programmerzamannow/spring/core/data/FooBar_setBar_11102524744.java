package programmerzamannow.spring.core.data;

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
import static programmerzamannow.spring.core.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FooBar_setBar_11102524744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;
     Object term281;

    public FooBar_setBar_11102524744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278 = newInstance(Class.forName("programmerzamannow.spring.core.data.FooBar"));
        Object term279 = newInstance(Class.forName("programmerzamannow.spring.core.data.Foo"));
        Object term280 = newInstance(Class.forName("programmerzamannow.spring.core.data.Bar"));
        setField(term278, term278.getClass(), "foo", term279);
        setField(term278, term278.getClass(), "bar", term280);
        term281 = newInstance(Class.forName("programmerzamannow.spring.core.data.Bar"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.FooBar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.data.Bar");
        Object[] args = new Object[1];
        args[0] = term281;
        callMethod(klass, "setBar", argTypes, term278, args);
    }

};


