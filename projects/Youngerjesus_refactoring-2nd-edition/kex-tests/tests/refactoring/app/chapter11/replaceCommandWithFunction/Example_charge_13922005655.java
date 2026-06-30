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

public class Example_charge_13922005655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18;
     Object term19;

    public Example_charge_13922005655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Example"));
        term19 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Example");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Customer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Provider");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term19;
        args[2] = null;
        callMethod(klass, "charge", argTypes, term18, args);
    }

};


