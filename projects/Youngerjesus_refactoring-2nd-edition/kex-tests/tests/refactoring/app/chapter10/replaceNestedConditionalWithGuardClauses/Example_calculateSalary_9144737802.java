package refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses;

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
import static refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Example_calculateSalary_9144737802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public Example_calculateSalary_9144737802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.Example"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.Example");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculateSalary", argTypes, term13, args);
    }

};


