package refactoring.app.chapter08.moveField;

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
import static refactoring.app.chapter08.moveField.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class CustomerContract_setDiscountRate_13068076225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term41;

    public CustomerContract_setDiscountRate_13068076225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("refactoring.app.chapter08.moveField.CustomerContract"));
        setField(term39, term39.getClass(), "startDate", null);
        setDoubleField(term39, term39.getClass(), "discountRate", 0.0);
        term41 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveField.CustomerContract");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term41;
        callMethod(klass, "setDiscountRate", argTypes, term39, args);
    }

};


