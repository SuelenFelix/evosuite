package refactoring.app.chapter07.removeMiddleMan;

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
import static refactoring.app.chapter07.removeMiddleMan.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Person_getDepartment_21411497561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;

    public Person_getDepartment_21411497561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term223 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term225 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term238 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term240 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        setField(term210, term210.getClass(), "name", "flxyYxBRtu");
        setIntField(term223, term223.getClass(), "chargeCode", 590364439);
        setField(term225, term225.getClass(), "name", "OclPbYPkcH");
        setIntField(term238, term238.getClass(), "chargeCode", 865208305);
        setField(term240, term240.getClass(), "name", null);
        setField(term240, term240.getClass(), "department", null);
        setField(term238, term238.getClass(), "manager", term240);
        setField(term225, term225.getClass(), "department", term238);
        setField(term223, term223.getClass(), "manager", term225);
        setField(term210, term210.getClass(), "department", term223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.removeMiddleMan.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepartment", argTypes, term210, args);
    }

};


