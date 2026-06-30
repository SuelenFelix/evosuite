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

public class Person_setDepartment_9950154262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74;
     Object term105;

    public Person_setDepartment_9950154262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term87 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term89 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term102 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term104 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        setField(term74, term74.getClass(), "name", "SzjVpOQTyS");
        setIntField(term87, term87.getClass(), "chargeCode", -616727354);
        setField(term89, term89.getClass(), "name", "MjGYSRKTNF");
        setIntField(term102, term102.getClass(), "chargeCode", -1955890973);
        setField(term104, term104.getClass(), "name", null);
        setField(term104, term104.getClass(), "department", null);
        setField(term102, term102.getClass(), "manager", term104);
        setField(term89, term89.getClass(), "department", term102);
        setField(term87, term87.getClass(), "manager", term89);
        setField(term74, term74.getClass(), "department", term87);
        term105 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term107 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term120 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term122 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term124 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        setIntField(term105, term105.getClass(), "chargeCode", 1725571209);
        setField(term107, term107.getClass(), "name", "uuaPigETmJ");
        setIntField(term120, term120.getClass(), "chargeCode", -522618178);
        setField(term122, term122.getClass(), "name", "");
        setIntField(term124, term124.getClass(), "chargeCode", 1134449235);
        setField(term124, term124.getClass(), "manager", null);
        setField(term122, term122.getClass(), "department", term124);
        setField(term120, term120.getClass(), "manager", term122);
        setField(term107, term107.getClass(), "department", term120);
        setField(term105, term105.getClass(), "manager", term107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.hideDelegate.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter07.hideDelegate.Department");
        Object[] args = new Object[1];
        args[0] = term105;
        callMethod(klass, "setDepartment", argTypes, term74, args);
    }

};


