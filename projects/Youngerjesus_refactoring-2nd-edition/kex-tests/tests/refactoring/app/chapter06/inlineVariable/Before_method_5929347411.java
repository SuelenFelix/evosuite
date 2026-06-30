package refactoring.app.chapter06.inlineVariable;

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
import static refactoring.app.chapter06.inlineVariable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Before_method_5929347411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Before_method_5929347411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter06.inlineVariable.Before"));
        term2 = newInstance(Class.forName("refactoring.app.chapter06.inlineVariable.Order"));
        setIntField(term2, term2.getClass(), "basePrice", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.inlineVariable.Before");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter06.inlineVariable.Order");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "method", argTypes, term1, args);
    }

};


