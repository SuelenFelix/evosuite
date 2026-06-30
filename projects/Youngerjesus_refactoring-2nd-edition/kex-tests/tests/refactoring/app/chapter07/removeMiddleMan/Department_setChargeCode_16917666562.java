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
import java.lang.Integer;

public class Department_setChargeCode_16917666562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;
     Object term53;

    public Department_setChargeCode_16917666562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term34 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term47 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term49 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term51 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        setIntField(term32, term32.getClass(), "chargeCode", -616727354);
        setField(term34, term34.getClass(), "name", "EGtDIRbSSb");
        setIntField(term47, term47.getClass(), "chargeCode", -1955890973);
        setField(term49, term49.getClass(), "name", "");
        setIntField(term51, term51.getClass(), "chargeCode", -2038273078);
        setField(term51, term51.getClass(), "manager", null);
        setField(term49, term49.getClass(), "department", term51);
        setField(term47, term47.getClass(), "manager", term49);
        setField(term34, term34.getClass(), "department", term47);
        setField(term32, term32.getClass(), "manager", term34);
        term53 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.removeMiddleMan.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53;
        callMethod(klass, "setChargeCode", argTypes, term32, args);
    }

};


