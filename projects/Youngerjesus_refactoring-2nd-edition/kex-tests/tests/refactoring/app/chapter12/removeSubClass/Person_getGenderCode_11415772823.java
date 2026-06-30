package refactoring.app.chapter12.removeSubClass;

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
import static refactoring.app.chapter12.removeSubClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Person_getGenderCode_11415772823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379;

    public Person_getGenderCode_11415772823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379 = newInstance(Class.forName("refactoring.app.chapter12.removeSubClass.Person"));
        setField(term379, term379.getClass(), "name", "eZFUvlxvGV");
        setField(term379, term379.getClass(), "gender", "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.removeSubClass.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenderCode", argTypes, term379, args);
    }

};


