package refactoring.app.chapter11.parameterizeFunction;

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
import static refactoring.app.chapter11.parameterizeFunction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class Example_raise_12087374213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;
     Object term52;
     Object term54;

    public Example_raise_12087374213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("refactoring.app.chapter11.parameterizeFunction.Example"));
        term52 = newInstance(Class.forName("refactoring.app.chapter11.parameterizeFunction.Person"));
        setIntField(term52, term52.getClass(), "salary", 1725571209);
        term54 = new Double(0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.parameterizeFunction.Example");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter11.parameterizeFunction.Person");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term52;
        args[1] = term54;
        callMethod(klass, "raise", argTypes, term51, args);
    }

};


