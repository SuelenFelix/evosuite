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

public class Person_removeCourse_1005065084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;
     Object term193;

    public Person_removeCourse_1005065084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term179 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term179, term179.getClass(), "name", "");
        setBooleanField(term179, term179.getClass(), "isAdvanced", true);
        Object term182 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term182, term182.getClass(), "name", "");
        setBooleanField(term182, term182.getClass(), "isAdvanced", false);
        Object term185 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term185, term185.getClass(), "name", "");
        setBooleanField(term185, term185.getClass(), "isAdvanced", false);
        Object term188 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term188, term188.getClass(), "name", "");
        setBooleanField(term188, term188.getClass(), "isAdvanced", true);
        ArrayList term177 = new ArrayList();
        ((ArrayList) term177).add(term179);
        ((ArrayList) term177).add(term182);
        ((ArrayList) term177).add(term185);
        ((ArrayList) term177).add(term188);
        term164 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Person"));
        setField(term164, term164.getClass(), "name", "tbcdzjIfER");
        setField(term164, term164.getClass(), "courses", term177);
        term193 = newInstance(Class.forName("refactoring.app.chapter07.encapsulateCollection.Course"));
        setField(term193, term193.getClass(), "name", "xOEqzGAmDU");
        setBooleanField(term193, term193.getClass(), "isAdvanced", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.encapsulateCollection.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter07.encapsulateCollection.Course");
        Object[] args = new Object[1];
        args[0] = term193;
        callMethod(klass, "removeCourse", argTypes, term164, args);
    }

};


