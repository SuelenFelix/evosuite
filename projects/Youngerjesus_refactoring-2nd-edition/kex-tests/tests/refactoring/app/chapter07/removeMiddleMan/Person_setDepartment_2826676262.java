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

public class Person_setDepartment_2826676262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;
     Object term292;

    public Person_setDepartment_2826676262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term274 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term276 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term289 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term291 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        setField(term261, term261.getClass(), "name", "dWRymuLBtr");
        setIntField(term274, term274.getClass(), "chargeCode", -1179120542);
        setField(term276, term276.getClass(), "name", "AijpHYOFuy");
        setIntField(term289, term289.getClass(), "chargeCode", -73683645);
        setField(term291, term291.getClass(), "name", null);
        setField(term291, term291.getClass(), "department", null);
        setField(term289, term289.getClass(), "manager", term291);
        setField(term276, term276.getClass(), "department", term289);
        setField(term274, term274.getClass(), "manager", term276);
        setField(term261, term261.getClass(), "department", term274);
        term292 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term294 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term307 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term309 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term311 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        setIntField(term292, term292.getClass(), "chargeCode", -1530420153);
        setField(term294, term294.getClass(), "name", "xrwlQZdwCp");
        setIntField(term307, term307.getClass(), "chargeCode", -469968304);
        setField(term309, term309.getClass(), "name", "");
        setIntField(term311, term311.getClass(), "chargeCode", -1145578966);
        setField(term311, term311.getClass(), "manager", null);
        setField(term309, term309.getClass(), "department", term311);
        setField(term307, term307.getClass(), "manager", term309);
        setField(term294, term294.getClass(), "department", term307);
        setField(term292, term292.getClass(), "manager", term294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.removeMiddleMan.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter07.removeMiddleMan.Department");
        Object[] args = new Object[1];
        args[0] = term292;
        callMethod(klass, "setDepartment", argTypes, term261, args);
    }

};


