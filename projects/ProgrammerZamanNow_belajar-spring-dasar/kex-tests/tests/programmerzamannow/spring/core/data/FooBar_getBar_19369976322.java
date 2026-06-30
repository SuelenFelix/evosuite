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

public class FooBar_getBar_19369976322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;

    public FooBar_getBar_19369976322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271 = newInstance(Class.forName("programmerzamannow.spring.core.data.FooBar"));
        Object term272 = newInstance(Class.forName("programmerzamannow.spring.core.data.Foo"));
        Object term273 = newInstance(Class.forName("programmerzamannow.spring.core.data.Bar"));
        setField(term271, term271.getClass(), "foo", term272);
        setField(term271, term271.getClass(), "bar", term273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.FooBar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBar", argTypes, term271, args);
    }

};


