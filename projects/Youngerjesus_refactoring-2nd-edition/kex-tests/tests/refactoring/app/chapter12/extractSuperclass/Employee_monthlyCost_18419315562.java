package refactoring.app.chapter12.extractSuperclass;

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
import static refactoring.app.chapter12.extractSuperclass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Employee_monthlyCost_18419315562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334;

    public Employee_monthlyCost_18419315562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term335 = new Long(-6573104506744284592L);
        term334 = newInstance(Class.forName("refactoring.app.chapter12.extractSuperclass.Employee"));
        setField(term334, term334.getClass(), "id", term335);
        setIntField(term334, term334.getClass(), "monthlyCost", -2068769794);
        setField(term334, term334.getClass(), "name", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.extractSuperclass.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "monthlyCost", argTypes, term334, args);
    }

};


