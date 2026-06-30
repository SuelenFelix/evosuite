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

public class Example_client2_1218855922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;

    public Example_client2_1218855922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205 = newInstance(Class.forName("refactoring.app.chapter11.replaceConstructorWithFactoryFunction.Example"));
        Object term206 = newInstance(Class.forName("refactoring.app.chapter11.replaceConstructorWithFactoryFunction.Document"));
        setField(term206, term206.getClass(), "name", "RMFIsYGgne");
        setField(term206, term206.getClass(), "empType", "NRdvgJlhkX");
        setField(term206, term206.getClass(), "leadEngineer", "uuaPigETmJ");
        setField(term205, term205.getClass(), "document", term206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceConstructorWithFactoryFunction.Example");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "client2", argTypes, term205, args);
    }

};


