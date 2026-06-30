package refactoring.app.chapter07.encapsulateCollection;

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
import static refactoring.app.chapter07.encapsulateCollection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Person_getCourses_14376204022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;

    public Person_getCourses_14376204022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term80, term80.getClass(), "name", "");
        setBooleanField(term80, term80.getClass(), "isAdvanced", true);
        Object term83 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term83, term83.getClass(), "name", "");
        setBooleanField(term83, term83.getClass(), "isAdvanced", true);
        Object term86 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term86, term86.getClass(), "name", "");
        setBooleanField(term86, term86.getClass(), "isAdvanced", true);
        Object term89 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term89, term89.getClass(), "name", "");
        setBooleanField(term89, term89.getClass(), "isAdvanced", false);
        ArrayList term78 = new ArrayList();
        ((ArrayList) term78).add(term80);
        ((ArrayList) term78).add(term83);
        ((ArrayList) term78).add(term86);
        ((ArrayList) term78).add(term89);
        term65 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Person"));
        setField(term65, term65.getClass(), "name", "MjGYSRKTNF");
        setField(term65, term65.getClass(), "courses", term78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.encapsulateCollection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourses", argTypes, term65, args);
    }

};


