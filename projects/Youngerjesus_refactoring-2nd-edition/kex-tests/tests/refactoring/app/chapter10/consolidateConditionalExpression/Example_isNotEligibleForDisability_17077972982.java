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

public class Example_isNotEligibleForDisability_17077972982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;
     Object term7;

    public Example_isNotEligibleForDisability_17077972982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("refactoring.app.chapter10.consolidateConditionalExpression.Example"));
        term7 = newInstance(Class.forName("refactoring.app.chapter10.consolidateConditionalExpression.Employee"));
        setIntField(term7, term7.getClass(), "seniority", 1484323161);
        setIntField(term7, term7.getClass(), "monthDisabled", 391863371);
        setBooleanField(term7, term7.getClass(), "isPartTime", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.consolidateConditionalExpression.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter10.consolidateConditionalExpression.Employee");
        Object[] args = new Object[1];
        args[0] = term7;
        callMethod(klass, "isNotEligibleForDisability", argTypes, term6, args);
    }

};


