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

public class Department_getChargeCode_10818543886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387;

    public Department_getChargeCode_10818543886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term387 = newInstance(Class.forName("refactoring.app.chapter07.hideDelegate.Department"));
        setIntField(term387, term387.getClass(), "chargeCode", 0);
        setField(term387, term387.getClass(), "manager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.hideDelegate.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChargeCode", argTypes, term387, args);
    }

};


