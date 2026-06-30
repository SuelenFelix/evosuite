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

public class Employee_isPrivileged_2440215657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;

    public Employee_isPrivileged_2440215657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("refactoring.app.chapter12.pullUpConstructorBody.Employee"));
        setField(term210, term210.getClass(), "id", null);
        setIntField(term210, term210.getClass(), "monthlyCost", 0);
        setField(term210, term210.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.pullUpConstructorBody.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrivileged", argTypes, term210, args);
    }

};


