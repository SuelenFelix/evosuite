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

public class Department_getManager_15163929853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public Department_getManager_15163929853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term276 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term289 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term291 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term293 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        setIntField(term274, term274.getClass(), "chargeCode", -1179120542);
        setField(term276, term276.getClass(), "name", "dWRymuLBtr");
        setIntField(term289, term289.getClass(), "chargeCode", -73683645);
        setField(term291, term291.getClass(), "name", "");
        setIntField(term293, term293.getClass(), "chargeCode", -226514366);
        setField(term293, term293.getClass(), "manager", null);
        setField(term291, term291.getClass(), "department", term293);
        setField(term289, term289.getClass(), "manager", term291);
        setField(term276, term276.getClass(), "department", term289);
        setField(term274, term274.getClass(), "manager", term276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.hideDelegate.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getManager", argTypes, term274, args);
    }

};


