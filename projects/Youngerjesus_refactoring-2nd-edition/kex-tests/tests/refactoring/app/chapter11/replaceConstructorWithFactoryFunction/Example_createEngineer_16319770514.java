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

public class Example_createEngineer_16319770514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;

    public Example_createEngineer_16319770514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385 = newInstance(Class.forName("refactoring.app.chapter11.replaceConstructorWithFactoryFunction.Example"));
        Object term386 = newInstance(Class.forName("refactoring.app.chapter11.replaceConstructorWithFactoryFunction.Document"));
        setField(term386, term386.getClass(), "name", "tbcdzjIfER");
        setField(term386, term386.getClass(), "empType", "HyxfbSQYBe");
        setField(term386, term386.getClass(), "leadEngineer", "pCTimMblYc");
        setField(term385, term385.getClass(), "document", term386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceConstructorWithFactoryFunction.Example");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "createEngineer", argTypes, term385, args);
    }

};


