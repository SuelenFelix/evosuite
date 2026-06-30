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

public class Department_getChargeCode_10818543881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;

    public Department_getChargeCode_10818543881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term212 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term225 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        Object term227 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Person"));
        Object term229 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        setIntField(term210, term210.getClass(), "chargeCode", -655067527);
        setField(term212, term212.getClass(), "name", "RkybSrpybU");
        setIntField(term225, term225.getClass(), "chargeCode", -6029667);
        setField(term227, term227.getClass(), "name", "");
        setIntField(term229, term229.getClass(), "chargeCode", -2068769794);
        setField(term229, term229.getClass(), "manager", null);
        setField(term227, term227.getClass(), "department", term229);
        setField(term225, term225.getClass(), "manager", term227);
        setField(term212, term212.getClass(), "department", term225);
        setField(term210, term210.getClass(), "manager", term212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.hideDelegate.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChargeCode", argTypes, term210, args);
    }

};


