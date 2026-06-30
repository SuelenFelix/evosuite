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

public class Department_setManager_4622583934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305;
     Object term326;

    public Department_setManager_4622583934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term307 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term320 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term322 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term324 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        setIntField(term305, term305.getClass(), "chargeCode", -1530420153);
        setField(term307, term307.getClass(), "name", "xrwlQZdwCp");
        setIntField(term320, term320.getClass(), "chargeCode", -469968304);
        setField(term322, term322.getClass(), "name", "");
        setIntField(term324, term324.getClass(), "chargeCode", -1145578966);
        setField(term324, term324.getClass(), "manager", null);
        setField(term322, term322.getClass(), "department", term324);
        setField(term320, term320.getClass(), "manager", term322);
        setField(term307, term307.getClass(), "department", term320);
        setField(term305, term305.getClass(), "manager", term307);
        term326 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term339 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term341 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term354 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term356 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        setField(term326, term326.getClass(), "name", "UlajhuVLaP");
        setIntField(term339, term339.getClass(), "chargeCode", 767834723);
        setField(term341, term341.getClass(), "name", "gGSMzuGICf");
        setIntField(term354, term354.getClass(), "chargeCode", -602026508);
        setField(term356, term356.getClass(), "name", null);
        setField(term356, term356.getClass(), "department", null);
        setField(term354, term354.getClass(), "manager", term356);
        setField(term341, term341.getClass(), "department", term354);
        setField(term339, term339.getClass(), "manager", term341);
        setField(term326, term326.getClass(), "department", term339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.hideDelegate.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter07.hideDelegate.Person");
        Object[] args = new Object[1];
        args[0] = term326;
        callMethod(klass, "setManager", argTypes, term305, args);
    }

};


