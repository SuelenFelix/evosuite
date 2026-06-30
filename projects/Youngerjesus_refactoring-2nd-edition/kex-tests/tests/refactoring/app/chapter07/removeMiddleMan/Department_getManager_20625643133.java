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

public class Department_getManager_20625643133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;

    public Department_getManager_20625643133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term67 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term80 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        Object term82 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Person"));
        Object term84 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        setIntField(term65, term65.getClass(), "chargeCode", -522618178);
        setField(term67, term67.getClass(), "name", "NRdvgJlhkX");
        setIntField(term80, term80.getClass(), "chargeCode", 1134449235);
        setField(term82, term82.getClass(), "name", "");
        setIntField(term84, term84.getClass(), "chargeCode", -883034806);
        setField(term84, term84.getClass(), "manager", null);
        setField(term82, term82.getClass(), "department", term84);
        setField(term80, term80.getClass(), "manager", term82);
        setField(term67, term67.getClass(), "department", term80);
        setField(term65, term65.getClass(), "manager", term67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.removeMiddleMan.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getManager", argTypes, term65, args);
    }

};


