package refactoring.app.chapter07.hideDelegate;

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
import static refactoring.app.chapter07.hideDelegate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Person_getDepartment_15250355241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public Person_getDepartment_15250355241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term36 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term38 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term51 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term53 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        setField(term23, term23.getClass(), "name", "sjlJAEtRrb");
        setIntField(term36, term36.getClass(), "chargeCode", 568599855);
        setField(term38, term38.getClass(), "name", "MuLcgQHgqz");
        setIntField(term51, term51.getClass(), "chargeCode", 1162663216);
        setField(term53, term53.getClass(), "name", null);
        setField(term53, term53.getClass(), "department", null);
        setField(term51, term51.getClass(), "manager", term53);
        setField(term38, term38.getClass(), "department", term51);
        setField(term36, term36.getClass(), "manager", term38);
        setField(term23, term23.getClass(), "department", term36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.hideDelegate.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepartment", argTypes, term23, args);
    }

};


