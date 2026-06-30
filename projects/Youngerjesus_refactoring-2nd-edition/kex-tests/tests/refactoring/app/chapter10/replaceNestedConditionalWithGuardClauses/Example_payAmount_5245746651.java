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

public class Example_payAmount_5245746651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term10;

    public Example_payAmount_5245746651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.Example"));
        term10 = newInstance(Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.Employee"));
        setBooleanField(term10, term10.getClass(), "isSeparated", false);
        setBooleanField(term10, term10.getClass(), "isRetired", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter10.replaceNestedConditionalWithGuardClauses.Employee");
        Object[] args = new Object[1];
        args[0] = term10;
        callMethod(klass, "payAmount", argTypes, term9, args);
    }

};


