package refactoring.app.chapter11.replaceConstructorWithFactoryFunction;

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
import static refactoring.app.chapter11.replaceConstructorWithFactoryFunction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Example_createEmployee_653933473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273;

    public Example_createEmployee_653933473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273 = newInstance(Class.forName("refactoring.app.chapter11.replaceConstructorWithFactoryFunction.Example"));
        Object term274 = newInstance(Class.forName("refactoring.app.chapter11.replaceConstructorWithFactoryFunction.Document"));
        setField(term274, term274.getClass(), "name", "MxlszYVzRf");
        setField(term274, term274.getClass(), "empType", "LQFpaHEwXR");
        setField(term274, term274.getClass(), "leadEngineer", "oVcInYnLWB");
        setField(term273, term273.getClass(), "document", term274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceConstructorWithFactoryFunction.Example");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "aJlieCFVtF";
        args[1] = "ZiaGIbnzTs";
        callMethod(klass, "createEmployee", argTypes, term273, args);
    }

};


