package refactoring.app.chapter12.replaceTypeCodeWithSubclasses.indirect;

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
import static refactoring.app.chapter12.replaceTypeCodeWithSubclasses.indirect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Employee_toString_21055375932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;

    public Employee_toString_21055375932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("refactoring.app.chapter12.replaceTypeCodeWithSubclasses.indirect.Employee"));
        Object term80 = newInstance(Class.forName("refactoring.app.chapter12.replaceTypeCodeWithSubclasses.indirect.EmployeeType"));
        setField(term67, term67.getClass(), "name", "xxtlPwDYFs");
        setField(term67, term67.getClass(), "type", term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceTypeCodeWithSubclasses.indirect.Employee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term67, args);
    }

};


