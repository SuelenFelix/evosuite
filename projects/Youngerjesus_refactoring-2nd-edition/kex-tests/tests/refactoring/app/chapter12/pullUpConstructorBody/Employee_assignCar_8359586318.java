package refactoring.app.chapter12.pullUpConstructorBody;

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
import static refactoring.app.chapter12.pullUpConstructorBody.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Employee_assignCar_8359586318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212;

    public Employee_assignCar_8359586318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212 = newInstance(Class.forName("refactoring.app.chapter12.pullUpConstructorBody.Employee"));
        setField(term212, term212.getClass(), "id", null);
        setIntField(term212, term212.getClass(), "monthlyCost", 0);
        setField(term212, term212.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.pullUpConstructorBody.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignCar", argTypes, term212, args);
    }

};


