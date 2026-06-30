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

public class FooBar_toString_6269776668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;

    public FooBar_toString_6269776668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293 = newInstance(Class.forName("programmerzamannow.spring.core.data.FooBar"));
        Object term294 = newInstance(Class.forName("programmerzamannow.spring.core.data.Foo"));
        Object term295 = newInstance(Class.forName("programmerzamannow.spring.core.data.Bar"));
        setField(term293, term293.getClass(), "foo", term294);
        setField(term293, term293.getClass(), "bar", term295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.FooBar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term293, args);
    }

};


