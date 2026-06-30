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

public class Example_fivePercentRaise_3171417752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;
     Object term49;

    public Example_fivePercentRaise_3171417752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("refactoring.app.chapter11.parameterizeFunction.Example"));
        term49 = newInstance(Class.forName("refactoring.app.chapter11.parameterizeFunction.Person"));
        setIntField(term49, term49.getClass(), "salary", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.parameterizeFunction.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter11.parameterizeFunction.Person");
        Object[] args = new Object[1];
        args[0] = term49;
        callMethod(klass, "fivePercentRaise", argTypes, term48, args);
    }

};


