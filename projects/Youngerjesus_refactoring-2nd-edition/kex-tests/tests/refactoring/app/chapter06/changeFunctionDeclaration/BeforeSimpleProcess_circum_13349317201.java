package refactoring.app.chapter06.changeFunctionDeclaration;

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
import static refactoring.app.chapter06.changeFunctionDeclaration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class BeforeSimpleProcess_circum_13349317201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term15;

    public BeforeSimpleProcess_circum_13349317201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.BeforeSimpleProcess"));
        term15 = new Double(0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.changeFunctionDeclaration.BeforeSimpleProcess");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term15;
        callMethod(klass, "circum", argTypes, term14, args);
    }

};


