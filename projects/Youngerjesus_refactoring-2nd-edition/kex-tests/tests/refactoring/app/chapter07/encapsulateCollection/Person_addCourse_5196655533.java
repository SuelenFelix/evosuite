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

public class Person_addCourse_5196655533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term130;

    public Person_addCourse_5196655533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term119, term119.getClass(), "name", "");
        setBooleanField(term119, term119.getClass(), "isAdvanced", true);
        Object term122 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term122, term122.getClass(), "name", "");
        setBooleanField(term122, term122.getClass(), "isAdvanced", false);
        Object term125 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term125, term125.getClass(), "name", "");
        setBooleanField(term125, term125.getClass(), "isAdvanced", true);
        ArrayList term117 = new ArrayList();
        ((ArrayList) term117).add(term119);
        ((ArrayList) term117).add(term122);
        ((ArrayList) term117).add(term125);
        term104 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Person"));
        setField(term104, term104.getClass(), "name", "MxlszYVzRf");
        setField(term104, term104.getClass(), "courses", term117);
        term130 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term130, term130.getClass(), "name", "ZiaGIbnzTs");
        setBooleanField(term130, term130.getClass(), "isAdvanced", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.encapsulateCollection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter07.encapsulateCollection.Course");
        Object[] args = new Object[1];
        args[0] = term130;
        callMethod(klass, "addCourse", argTypes, term104, args);
    }

};


