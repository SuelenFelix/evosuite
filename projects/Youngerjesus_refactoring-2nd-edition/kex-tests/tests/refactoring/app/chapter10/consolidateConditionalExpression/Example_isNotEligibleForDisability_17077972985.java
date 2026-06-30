package refactoring.app.chapter10.consolidateConditionalExpression;

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
import static refactoring.app.chapter10.consolidateConditionalExpression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Example_isNotEligibleForDisability_17077972985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;

    public Example_isNotEligibleForDisability_17077972985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("refactoring.app.chapter10.consolidateConditionalExpression.Example"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.consolidateConditionalExpression.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter10.consolidateConditionalExpression.Employee");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isNotEligibleForDisability", argTypes, term12, args);
    }

};


