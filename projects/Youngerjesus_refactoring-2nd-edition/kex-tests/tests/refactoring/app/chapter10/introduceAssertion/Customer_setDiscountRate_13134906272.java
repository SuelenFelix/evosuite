package refactoring.app.chapter10.introduceAssertion;

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
import static refactoring.app.chapter10.introduceAssertion.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class Customer_setDiscountRate_13134906272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term7;

    public Customer_setDiscountRate_13134906272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("refactoring.app.chapter10.introduceAssertion.Customer"));
        setDoubleField(term5, term5.getClass(), "discountRate", 0.3455959125047594);
        term7 = new Double(0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.introduceAssertion.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term7;
        callMethod(klass, "setDiscountRate", argTypes, term5, args);
    }

};


