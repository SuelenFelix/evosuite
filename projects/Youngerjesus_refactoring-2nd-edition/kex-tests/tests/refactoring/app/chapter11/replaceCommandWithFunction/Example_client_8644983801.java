package refactoring.app.chapter11.replaceCommandWithFunction;

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
import static refactoring.app.chapter11.replaceCommandWithFunction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Example_client_8644983801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term4;
     Object term6;

    public Example_client_8644983801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Example"));
        term2 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Customer"));
        setDoubleField(term2, term2.getClass(), "baseRate", 0.13238746331190498);
        term4 = new Integer(568599855);
        term6 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Provider"));
        setDoubleField(term6, term6.getClass(), "connectionCharge", 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Example");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Customer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Provider");
        Object[] args = new Object[3];
        args[0] = term2;
        args[1] = term4;
        args[2] = term6;
        callMethod(klass, "client", argTypes, term1, args);
    }

};


