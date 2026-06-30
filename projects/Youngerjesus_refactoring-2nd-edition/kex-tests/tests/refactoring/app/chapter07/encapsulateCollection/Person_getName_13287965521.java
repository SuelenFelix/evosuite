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

public class Person_getName_13287965521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public Person_getName_13287965521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term38, term38.getClass(), "name", "");
        setBooleanField(term38, term38.getClass(), "isAdvanced", false);
        Object term41 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term41, term41.getClass(), "name", "");
        setBooleanField(term41, term41.getClass(), "isAdvanced", false);
        Object term44 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term44, term44.getClass(), "name", "");
        setBooleanField(term44, term44.getClass(), "isAdvanced", false);
        Object term47 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term47, term47.getClass(), "name", "");
        setBooleanField(term47, term47.getClass(), "isAdvanced", false);
        Object term50 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term50, term50.getClass(), "name", "");
        setBooleanField(term50, term50.getClass(), "isAdvanced", true);
        ArrayList term36 = new ArrayList();
        ((ArrayList) term36).add(term38);
        ((ArrayList) term36).add(term41);
        ((ArrayList) term36).add(term44);
        ((ArrayList) term36).add(term47);
        ((ArrayList) term36).add(term50);
        term23 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Person"));
        setField(term23, term23.getClass(), "name", "sjlJAEtRrb");
        setField(term23, term23.getClass(), "courses", term36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.encapsulateCollection.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term23, args);
    }

};


