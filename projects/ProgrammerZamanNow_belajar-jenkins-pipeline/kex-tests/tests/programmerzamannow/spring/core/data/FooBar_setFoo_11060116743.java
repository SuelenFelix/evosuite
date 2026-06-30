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

public class FooBar_setFoo_11060116743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;
     Object term277;

    public FooBar_setFoo_11060116743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274 = newInstance(Class.forName("programmerzamannow.spring.core.data.FooBar"));
        Object term275 = newInstance(Class.forName("programmerzamannow.spring.core.data.Foo"));
        Object term276 = newInstance(Class.forName("programmerzamannow.spring.core.data.Bar"));
        setField(term274, term274.getClass(), "foo", term275);
        setField(term274, term274.getClass(), "bar", term276);
        term277 = newInstance(Class.forName("programmerzamannow.spring.core.data.Foo"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.FooBar");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.data.Foo");
        Object[] args = new Object[1];
        args[0] = term277;
        callMethod(klass, "setFoo", argTypes, term274, args);
    }

};


